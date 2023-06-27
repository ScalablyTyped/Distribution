package typings.std

import typings.std.stdStrings.abort
import typings.std.stdStrings.close
import typings.std.stdStrings.error
import typings.std.stdStrings.versionchange
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This IndexedDB API interface provides a connection to a database; you can use an IDBDatabase object to open a transaction on your database then create, manipulate, and delete objects (data) in that database. The interface provides the only way to get and manage versions of the database.
  *
  * [MDN Reference](https://developer.mozilla.org/docs/Web/API/IDBDatabase)
  */
@js.native
trait IDBDatabase
  extends StObject
     with EventTarget {
  
  /* standard dom */
  @JSName("addEventListener")
  def addEventListener_abort(`type`: abort, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_abort(
    `type`: abort,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_abort(
    `type`: abort,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_close(`type`: close, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_close(
    `type`: close,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_close(
    `type`: close,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_error(`type`: error, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_error(
    `type`: error,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_error(
    `type`: error,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_versionchange(
    `type`: versionchange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ IDBVersionChangeEvent, Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_versionchange(
    `type`: versionchange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ IDBVersionChangeEvent, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_versionchange(
    `type`: versionchange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ IDBVersionChangeEvent, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  
  /**
    * Closes the connection once all running transactions have finished.
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/IDBDatabase/close)
    */
  /* standard dom */
  def close(): Unit = js.native
  
  /**
    * Creates a new object store with the given name and options and returns a new IDBObjectStore.
    *
    * Throws a "InvalidStateError" DOMException if not called within an upgrade transaction.
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/IDBDatabase/createObjectStore)
    */
  /* standard dom */
  def createObjectStore(name: java.lang.String): IDBObjectStore = js.native
  def createObjectStore(name: java.lang.String, options: IDBObjectStoreParameters): IDBObjectStore = js.native
  
  /**
    * Deletes the object store with the given name.
    *
    * Throws a "InvalidStateError" DOMException if not called within an upgrade transaction.
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/IDBDatabase/deleteObjectStore)
    */
  /* standard dom */
  def deleteObjectStore(name: java.lang.String): Unit = js.native
  
  /**
    * Returns the name of the database.
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/IDBDatabase/name)
    */
  /* standard dom */
  val name: java.lang.String = js.native
  
  /**
    * Returns a list of the names of object stores in the database.
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/IDBDatabase/objectStoreNames)
    */
  /* standard dom */
  val objectStoreNames: DOMStringList = js.native
  
  /* standard dom */
  var onabort: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]) | Null = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/IDBDatabase/close_event) */
  /* standard dom */
  var onclose: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]) | Null = js.native
  
  /* standard dom */
  var onerror: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]) | Null = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/IDBDatabase/versionchange_event) */
  /* standard dom */
  var onversionchange: (js.ThisFunction1[/* this */ this.type, /* ev */ IDBVersionChangeEvent, Any]) | Null = js.native
  
  /* standard dom */
  @JSName("removeEventListener")
  def removeEventListener_abort(`type`: abort, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_abort(
    `type`: abort,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_abort(
    `type`: abort,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_close(`type`: close, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_close(
    `type`: close,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_close(
    `type`: close,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_error(`type`: error, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_error(
    `type`: error,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_error(
    `type`: error,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_versionchange(
    `type`: versionchange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ IDBVersionChangeEvent, Any]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_versionchange(
    `type`: versionchange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ IDBVersionChangeEvent, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_versionchange(
    `type`: versionchange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ IDBVersionChangeEvent, Any],
    options: EventListenerOptions
  ): Unit = js.native
  
  /**
    * Returns a new transaction with the given mode ("readonly" or "readwrite") and scope which can be a single object store name or an array of names.
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/IDBDatabase/transaction)
    */
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
  
  /**
    * Returns the version of the database.
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/IDBDatabase/version)
    */
  /* standard dom */
  val version: Double = js.native
}
