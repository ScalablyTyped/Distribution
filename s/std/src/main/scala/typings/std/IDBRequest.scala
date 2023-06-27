package typings.std

import typings.std.stdStrings.success
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The request object does not initially contain any information about the result of the operation, but once information becomes available, an event is fired on the request, and the information becomes available through the properties of the IDBRequest instance.
  *
  * [MDN Reference](https://developer.mozilla.org/docs/Web/API/IDBRequest)
  */
@js.native
trait IDBRequest[T]
  extends StObject
     with EventTarget {
  
  /* standard dom */
  @JSName("addEventListener")
  def addEventListener_error(
    `type`: typings.std.stdStrings.error,
    listener: js.ThisFunction1[/* this */ IDBRequest[T], /* ev */ Event, Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_error(
    `type`: typings.std.stdStrings.error,
    listener: js.ThisFunction1[/* this */ IDBRequest[T], /* ev */ Event, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_error(
    `type`: typings.std.stdStrings.error,
    listener: js.ThisFunction1[/* this */ IDBRequest[T], /* ev */ Event, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_success(`type`: success, listener: js.ThisFunction1[/* this */ IDBRequest[T], /* ev */ Event, Any]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_success(
    `type`: success,
    listener: js.ThisFunction1[/* this */ IDBRequest[T], /* ev */ Event, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_success(
    `type`: success,
    listener: js.ThisFunction1[/* this */ IDBRequest[T], /* ev */ Event, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  
  /**
    * When a request is completed, returns the error (a DOMException), or null if the request succeeded. Throws a "InvalidStateError" DOMException if the request is still pending.
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/IDBRequest/error)
    */
  /* standard dom */
  val error: DOMException | Null = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/IDBRequest/error_event) */
  /* standard dom */
  var onerror: (js.ThisFunction1[/* this */ IDBRequest[T], /* ev */ Event, Any]) | Null = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/IDBRequest/success_event) */
  /* standard dom */
  var onsuccess: (js.ThisFunction1[/* this */ IDBRequest[T], /* ev */ Event, Any]) | Null = js.native
  
  /**
    * Returns "pending" until a request is complete, then returns "done".
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/IDBRequest/readyState)
    */
  /* standard dom */
  val readyState: IDBRequestReadyState = js.native
  
  /* standard dom */
  @JSName("removeEventListener")
  def removeEventListener_error(
    `type`: typings.std.stdStrings.error,
    listener: js.ThisFunction1[/* this */ IDBRequest[T], /* ev */ Event, Any]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_error(
    `type`: typings.std.stdStrings.error,
    listener: js.ThisFunction1[/* this */ IDBRequest[T], /* ev */ Event, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_error(
    `type`: typings.std.stdStrings.error,
    listener: js.ThisFunction1[/* this */ IDBRequest[T], /* ev */ Event, Any],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_success(`type`: success, listener: js.ThisFunction1[/* this */ IDBRequest[T], /* ev */ Event, Any]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_success(
    `type`: success,
    listener: js.ThisFunction1[/* this */ IDBRequest[T], /* ev */ Event, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_success(
    `type`: success,
    listener: js.ThisFunction1[/* this */ IDBRequest[T], /* ev */ Event, Any],
    options: EventListenerOptions
  ): Unit = js.native
  
  /**
    * When a request is completed, returns the result, or undefined if the request failed. Throws a "InvalidStateError" DOMException if the request is still pending.
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/IDBRequest/result)
    */
  /* standard dom */
  val result: T = js.native
  
  /**
    * Returns the IDBObjectStore, IDBIndex, or IDBCursor the request was made against, or null if is was an open request.
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/IDBRequest/source)
    */
  /* standard dom */
  val source: IDBObjectStore | IDBIndex | IDBCursor = js.native
  
  /**
    * Returns the IDBTransaction the request was made within. If this as an open request, then it returns an upgrade transaction while it is running, or null otherwise.
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/IDBRequest/transaction)
    */
  /* standard dom */
  val transaction: IDBTransaction | Null = js.native
}
