package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IDBTransaction
  extends StObject
     with EventTarget {
  
  /** Aborts the transaction. All pending requests will fail with a "AbortError" DOMException and all changes made to the database will be reverted. */
  /* standard dom */
  def abort(): Unit = js.native
  
  @JSName("addEventListener")
  @scala.annotation.targetName("addEventListener_error")
  def addEventListener(`type`: "error", listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]): Unit = js.native
  /* standard dom */
  @JSName("addEventListener")
  @scala.annotation.targetName("addEventListener_abort")
  def addEventListener(`type`: "abort", listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]): Unit = js.native
  @JSName("addEventListener")
  @scala.annotation.targetName("addEventListener_complete")
  def addEventListener(`type`: "complete", listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]): Unit = js.native
  @JSName("addEventListener")
  @scala.annotation.targetName("addEventListener_error")
  def addEventListener(
    `type`: "error",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  @scala.annotation.targetName("addEventListener_complete")
  def addEventListener(
    `type`: "complete",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
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
  @scala.annotation.targetName("addEventListener_error")
  def addEventListener(
    `type`: "error",
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
  @JSName("addEventListener")
  @scala.annotation.targetName("addEventListener_complete")
  def addEventListener(
    `type`: "complete",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  
  /* standard dom */
  def commit(): Unit = js.native
  
  /** Returns the transaction's connection. */
  /* standard dom */
  val db: IDBDatabase = js.native
  
  /* standard dom */
  val durability: IDBTransactionDurability = js.native
  
  /** If the transaction was aborted, returns the error (a DOMException) providing the reason. */
  /* standard dom */
  val error: DOMException | Null = js.native
  
  /** Returns the mode the transaction was created with ("readonly" or "readwrite"), or "versionchange" for an upgrade transaction. */
  /* standard dom */
  val mode: IDBTransactionMode = js.native
  
  /** Returns an IDBObjectStore in the transaction's scope. */
  /* standard dom */
  def objectStore(name: java.lang.String): IDBObjectStore = js.native
  
  /** Returns a list of the names of object stores in the transaction's scope. For an upgrade transaction this is all object stores in the database. */
  /* standard dom */
  val objectStoreNames: DOMStringList = js.native
  
  /* standard dom */
  var onabort: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]) | Null = js.native
  
  /* standard dom */
  var oncomplete: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]) | Null = js.native
  
  /* standard dom */
  var onerror: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]) | Null = js.native
  
  /* standard dom */
  @JSName("removeEventListener")
  @scala.annotation.targetName("removeEventListener_abort")
  def removeEventListener(`type`: "abort", listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]): Unit = js.native
  @JSName("removeEventListener")
  @scala.annotation.targetName("removeEventListener_complete")
  def removeEventListener(`type`: "complete", listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]): Unit = js.native
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
  @scala.annotation.targetName("removeEventListener_complete")
  def removeEventListener(
    `type`: "complete",
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
  @scala.annotation.targetName("removeEventListener_abort")
  def removeEventListener(
    `type`: "abort",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  @scala.annotation.targetName("removeEventListener_complete")
  def removeEventListener(
    `type`: "complete",
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
}
