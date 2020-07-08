package com.company;

class NeteruState extends DogState{
    private static NeteruState n = new NeteruState();
    private NeteruState() {}
    public static DogState getInstance() {
        return n;
    }
    public void tukareta(Dog moto) {
        moto.changeState(FutsuuState.getInstance());
    }
    public void tabeta(Dog moto) {
        moto.changeState(TanoshiiState.getInstance());
    }
    public String toString() {
        return "寝てる状態";
    }
}
