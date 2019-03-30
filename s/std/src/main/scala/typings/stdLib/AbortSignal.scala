package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The AbortSignal interface represents a signal object that allows you to communicate with a DOM request (such as a Fetch) and abort it if required via an AbortController object. */
@js.native
trait AbortSignal extends EventTarget {
  /**
    * Returns true if this AbortSignal's AbortController has signaled to abort, and false
    * otherwise.
    */
  val aborted: scala.Boolean = js.native
  var onabort: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | scala.Null = js.native
  @JSName("addEventListener")
  def addEventListener_abort(
    `type`: stdLib.stdLibStrings.abort,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_abort(
    `type`: stdLib.stdLibStrings.abort,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_abort(
    `type`: stdLib.stdLibStrings.abort,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_abort(
    `type`: stdLib.stdLibStrings.abort,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_abort(
    `type`: stdLib.stdLibStrings.abort,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_abort(
    `type`: stdLib.stdLibStrings.abort,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
}

@JSGlobal("AbortSignal")
@js.native
class AbortSignalCls () extends AbortSignal

@JSGlobal("AbortSignal")
@js.native
object AbortSignal
  extends org.scalablytyped.runtime.Instantiable0[AbortSignal]

