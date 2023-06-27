package typings.std

import typings.std.stdStrings.abort
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A signal object that allows you to communicate with a DOM request (such as a Fetch) and abort it if required via an AbortController object.
  *
  * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AbortSignal)
  */
@js.native
trait AbortSignal
  extends StObject
     with EventTarget {
  
  /**
    * Returns true if this AbortSignal's AbortController has signaled to abort, and false otherwise.
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AbortSignal/aborted)
    */
  /* standard dom */
  val aborted: scala.Boolean = js.native
  
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
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/AbortSignal/abort_event) */
  /* standard dom */
  var onabort: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]) | Null = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/AbortSignal/reason) */
  /* standard dom */
  val reason: Any = js.native
  
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
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/AbortSignal/throwIfAborted) */
  /* standard dom */
  def throwIfAborted(): Unit = js.native
}
