package typings
package atSindresorhusIsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IDBRequest[T] extends EventTarget {
  /**
    * When a request is completed, returns the error (a DOMException), or null if the request succeeded. Throws
    * a "InvalidStateError" DOMException if the request is still pending.
    */
  val error: DOMException | scala.Null = js.native
  var onerror: (js.ThisFunction1[/* this */ IDBRequest[T], /* ev */ Event, _]) | scala.Null = js.native
  var onsuccess: (js.ThisFunction1[/* this */ IDBRequest[T], /* ev */ Event, _]) | scala.Null = js.native
  /**
    * Returns "pending" until a request is complete,
    * then returns "done".
    */
  val readyState: IDBRequestReadyState = js.native
  /**
    * When a request is completed, returns the result,
    * or undefined if the request failed. Throws a
    * "InvalidStateError" DOMException if the request is still pending.
    */
  val result: T = js.native
  /**
    * Returns the IDBObjectStore, IDBIndex, or IDBCursor the request was made against, or null if is was an open
    * request.
    */
  val source: IDBObjectStore | IDBIndex | IDBCursor = js.native
  /**
    * Returns the IDBTransaction the request was made within.
    * If this as an open request, then it returns an upgrade transaction while it is running, or null otherwise.
    */
  val transaction: IDBTransaction | scala.Null = js.native
  @JSName("addEventListener")
  def addEventListener_error(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.error,
    listener: js.ThisFunction1[/* this */ IDBRequest[T], /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_error(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.error,
    listener: js.ThisFunction1[/* this */ IDBRequest[T], /* ev */ Event, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_error(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.error,
    listener: js.ThisFunction1[/* this */ IDBRequest[T], /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_success(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.success,
    listener: js.ThisFunction1[/* this */ IDBRequest[T], /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_success(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.success,
    listener: js.ThisFunction1[/* this */ IDBRequest[T], /* ev */ Event, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_success(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.success,
    listener: js.ThisFunction1[/* this */ IDBRequest[T], /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_error(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.error,
    listener: js.ThisFunction1[/* this */ IDBRequest[T], /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_error(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.error,
    listener: js.ThisFunction1[/* this */ IDBRequest[T], /* ev */ Event, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_error(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.error,
    listener: js.ThisFunction1[/* this */ IDBRequest[T], /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_success(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.success,
    listener: js.ThisFunction1[/* this */ IDBRequest[T], /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_success(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.success,
    listener: js.ThisFunction1[/* this */ IDBRequest[T], /* ev */ Event, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_success(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.success,
    listener: js.ThisFunction1[/* this */ IDBRequest[T], /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
}

@JSGlobal("IDBRequest")
@js.native
object IDBRequest
  extends org.scalablytyped.runtime.Instantiable0[IDBRequest[js.Any]]

