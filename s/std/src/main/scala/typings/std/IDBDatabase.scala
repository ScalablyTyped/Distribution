package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** This IndexedDB API interface provides a connection to a database; you can use an IDBDatabase object to open a transaction on your database then create, manipulate, and delete objects (data) in that database. The interface provides the only way to get and manage versions of the database. */
@js.native
trait IDBDatabase
  extends StObject
     with EventTarget {
  
  @JSName("addEventListener")
  @scala.annotation.targetName("addEventListener_close")
  def addEventListener(`type`: "close", listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]): Unit = js.native
  @JSName("addEventListener")
  @scala.annotation.targetName("addEventListener_error")
  def addEventListener(`type`: "error", listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]): Unit = js.native
  /* standard dom */
  @JSName("addEventListener")
  @scala.annotation.targetName("addEventListener_abort")
  def addEventListener(`type`: "abort", listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]): Unit = js.native
  @JSName("addEventListener")
  @scala.annotation.targetName("addEventListener_versionchange")
  def addEventListener(
    `type`: "versionchange",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ IDBVersionChangeEvent, Any]
  ): Unit = js.native
  @JSName("addEventListener")
  @scala.annotation.targetName("addEventListener_error")
  def addEventListener(
    `type`: "error",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  @scala.annotation.targetName("addEventListener_versionchange")
  def addEventListener(
    `type`: "versionchange",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ IDBVersionChangeEvent, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  @scala.annotation.targetName("addEventListener_abort")
  def addEventListener(
    `type`: "abort",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  @scala.annotation.targetName("addEventListener_close")
  def addEventListener(
    `type`: "close",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  @scala.annotation.targetName("addEventListener_error")
  def addEventListener(
    `type`: "error",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  @scala.annotation.targetName("addEventListener_versionchange")
  def addEventListener(
    `type`: "versionchange",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ IDBVersionChangeEvent, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  @scala.annotation.targetName("addEventListener_close")
  def addEventListener(
    `type`: "close",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  @scala.annotation.targetName("addEventListener_abort")
  def addEventListener(
    `type`: "abort",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  
  /** Closes the connection once all running transactions have finished. */
  /* standard dom */
  def close(): Unit = js.native
  
  /**
    * Creates a new object store with the given name and options and returns a new IDBObjectStore.
    *
    * Throws a "InvalidStateError" DOMException if not called within an upgrade transaction.
    */
  /* standard dom */
  def createObjectStore(name: java.lang.String): IDBObjectStore = js.native
  def createObjectStore(name: java.lang.String, options: IDBObjectStoreParameters): IDBObjectStore = js.native
  
  /**
    * Deletes the object store with the given name.
    *
    * Throws a "InvalidStateError" DOMException if not called within an upgrade transaction.
    */
  /* standard dom */
  def deleteObjectStore(name: java.lang.String): Unit = js.native
  
  /** Returns the name of the database. */
  /* standard dom */
  val name: java.lang.String = js.native
  
  /** Returns a list of the names of object stores in the database. */
  /* standard dom */
  val objectStoreNames: DOMStringList = js.native
  
  /* standard dom */
  var onabort: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]) | Null = js.native
  
  /* standard dom */
  var onclose: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]) | Null = js.native
  
  /* standard dom */
  var onerror: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]) | Null = js.native
  
  /* standard dom */
  var onversionchange: (js.ThisFunction1[/* this */ this.type, /* ev */ IDBVersionChangeEvent, Any]) | Null = js.native
  
  /* standard dom */
  @JSName("removeEventListener")
  @scala.annotation.targetName("removeEventListener_abort")
  def removeEventListener(`type`: "abort", listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]): Unit = js.native
  @JSName("removeEventListener")
  @scala.annotation.targetName("removeEventListener_versionchange")
  def removeEventListener(
    `type`: "versionchange",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ IDBVersionChangeEvent, Any]
  ): Unit = js.native
  @JSName("removeEventListener")
  @scala.annotation.targetName("removeEventListener_close")
  def removeEventListener(`type`: "close", listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]): Unit = js.native
  @JSName("removeEventListener")
  @scala.annotation.targetName("removeEventListener_error")
  def removeEventListener(`type`: "error", listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]): Unit = js.native
  @JSName("removeEventListener")
  @scala.annotation.targetName("removeEventListener_abort")
  def removeEventListener(
    `type`: "abort",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  @scala.annotation.targetName("removeEventListener_close")
  def removeEventListener(
    `type`: "close",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  @scala.annotation.targetName("removeEventListener_error")
  def removeEventListener(
    `type`: "error",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  @scala.annotation.targetName("removeEventListener_versionchange")
  def removeEventListener(
    `type`: "versionchange",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ IDBVersionChangeEvent, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  @scala.annotation.targetName("removeEventListener_abort")
  def removeEventListener(
    `type`: "abort",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  @scala.annotation.targetName("removeEventListener_versionchange")
  def removeEventListener(
    `type`: "versionchange",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ IDBVersionChangeEvent, Any],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  @scala.annotation.targetName("removeEventListener_close")
  def removeEventListener(
    `type`: "close",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  @scala.annotation.targetName("removeEventListener_error")
  def removeEventListener(
    `type`: "error",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
    options: EventListenerOptions
  ): Unit = js.native
  
  /** Returns a new transaction with the given mode ("readonly" or "readwrite") and scope which can be a single object store name or an array of names. */
  /* standard dom */
  def transaction(storeNames: java.lang.String): IDBTransaction = js.native
  def transaction(storeNames: java.lang.String, mode: Unit, options: IDBTransactionOptions): IDBTransaction = js.native
  def transaction(storeNames: java.lang.String, mode: IDBTransactionMode): IDBTransaction = js.native
  def transaction(storeNames: java.lang.String, mode: IDBTransactionMode, options: IDBTransactionOptions): IDBTransaction = js.native
  def transaction(storeNames: js.Array[java.lang.String]): IDBTransaction = js.native
  def transaction(storeNames: js.Array[java.lang.String], mode: Unit, options: IDBTransactionOptions): IDBTransaction = js.native
  def transaction(storeNames: js.Array[java.lang.String], mode: IDBTransactionMode): IDBTransaction = js.native
  def transaction(storeNames: js.Array[java.lang.String], mode: IDBTransactionMode, options: IDBTransactionOptions): IDBTransaction = js.native
  def transaction(storeNames: js.Iterable[java.lang.String]): IDBTransaction = js.native
  def transaction(storeNames: js.Iterable[java.lang.String], mode: Unit, options: IDBTransactionOptions): IDBTransaction = js.native
  def transaction(storeNames: js.Iterable[java.lang.String], mode: IDBTransactionMode): IDBTransaction = js.native
  def transaction(
    storeNames: js.Iterable[java.lang.String],
    mode: IDBTransactionMode,
    options: IDBTransactionOptions
  ): IDBTransaction = js.native
  
  /** Returns the version of the database. */
  /* standard dom */
  val version: Double = js.native
}
