package typings.std

import typings.std.stdStrings.abort
import typings.std.stdStrings.complete
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** [MDN Reference](https://developer.mozilla.org/docs/Web/API/IDBTransaction) */
@js.native
trait IDBTransaction
  extends StObject
     with EventTarget {
  
  /**
    * Aborts the transaction. All pending requests will fail with a "AbortError" DOMException and all changes made to the database will be reverted.
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/IDBTransaction/abort)
    */
  /* standard dom */
  def abort(): Unit = js.native
  
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
  def addEventListener_complete(`type`: complete, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_complete(
    `type`: complete,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_complete(
    `type`: complete,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_error(
    `type`: typings.std.stdStrings.error,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_error(
    `type`: typings.std.stdStrings.error,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_error(
    `type`: typings.std.stdStrings.error,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/IDBTransaction/commit) */
  /* standard dom */
  def commit(): Unit = js.native
  
  /**
    * Returns the transaction's connection.
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/IDBTransaction/db)
    */
  /* standard dom */
  val db: IDBDatabase = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/IDBTransaction/durability) */
  /* standard dom */
  val durability: IDBTransactionDurability = js.native
  
  /**
    * If the transaction was aborted, returns the error (a DOMException) providing the reason.
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/IDBTransaction/error)
    */
  /* standard dom */
  val error: DOMException | Null = js.native
  
  /**
    * Returns the mode the transaction was created with ("readonly" or "readwrite"), or "versionchange" for an upgrade transaction.
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/IDBTransaction/mode)
    */
  /* standard dom */
  val mode: IDBTransactionMode = js.native
  
  /**
    * Returns an IDBObjectStore in the transaction's scope.
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/IDBTransaction/objectStore)
    */
  /* standard dom */
  def objectStore(name: java.lang.String): IDBObjectStore = js.native
  
  /**
    * Returns a list of the names of object stores in the transaction's scope. For an upgrade transaction this is all object stores in the database.
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/IDBTransaction/objectStoreNames)
    */
  /* standard dom */
  val objectStoreNames: DOMStringList = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/IDBTransaction/abort_event) */
  /* standard dom */
  var onabort: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]) | Null = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/IDBTransaction/complete_event) */
  /* standard dom */
  var oncomplete: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]) | Null = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/IDBTransaction/error_event) */
  /* standard dom */
  var onerror: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]) | Null = js.native
  
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
  def removeEventListener_complete(`type`: complete, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_complete(
    `type`: complete,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_complete(
    `type`: complete,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_error(
    `type`: typings.std.stdStrings.error,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_error(
    `type`: typings.std.stdStrings.error,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_error(
    `type`: typings.std.stdStrings.error,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
    options: EventListenerOptions
  ): Unit = js.native
}
