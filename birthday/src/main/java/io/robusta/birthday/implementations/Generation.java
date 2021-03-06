package io.robusta.birthday.implementations;

import io.robusta.birthday.interfaces.IGeneration;
import io.robusta.birthday.interfaces.IPeopleCollection;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Nicolas Zozol on 04/10/2016.
 */
public class Generation implements IGeneration{

    List<PeopleCollection> collections;

    public Generation(){

    }

    public Generation(int n, int collectionSize) {
        this.collections = createAllRandom(n, collectionSize);
    }

    @Override
    public PeopleCollection createRandom(int size) {
        return null;
    }

    @Override
    public List<PeopleCollection> createAllRandom(int n, int size) {
        // call n times createRandom(size)
        return null;
    }

    @Override
    public List<PeopleCollection> getPeopleCollections() {
        return null;
    }

    @Override
    public int getNumberOfCollectionsThatHasTwoPeopleWithSameBirthday() {
        return 0;
    }

    @Override
    public boolean isLessThan50() {
        return false;
    }


}
