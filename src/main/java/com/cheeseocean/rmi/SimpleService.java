package com.cheeseocean.rmi;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface SimpleService extends Remote {
    String getUsername() throws RemoteException;
}
