package typings
package rsvpLib.rsvpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rsvp", "EventTarget")
@js.native
class EventTarget ()
  extends rsvpLib.rsvpMod.RSVPNs.EventTarget

@JSImport("rsvp", "EventTarget")
@js.native
object EventTarget
  extends org.scalablytyped.runtime.Instantiable0[rsvpLib.rsvpMod.RSVPNs.EventTarget] {
  /** `RSVP.EventTarget.mixin` extends an object with EventTarget methods. */
  def mixin(`object`: js.Object): rsvpLib.rsvpMod.RSVPNs.ObjectWithEventMixins = js.native
  /**
    * You can use `off` to stop firing a particular callback for an event.
    *
    * If you don't pass a `callback` argument to `off`, ALL callbacks for the
    * event will not be executed when the event fires.
    */
  def off(eventName: java.lang.String): scala.Unit = js.native
  def off(eventName: java.lang.String, callback: js.Function1[/* value */ js.Any, scala.Unit]): scala.Unit = js.native
  def on(eventName: java.lang.String, callback: js.Function1[/* value */ js.Any, scala.Unit]): scala.Unit = js.native
  @JSName("on")
  def on_chained(
    eventName: rsvpLib.rsvpLibStrings.chained,
    listener: js.Function1[/* event */ rsvpLib.rsvpMod.RSVPNs.InstrumentEvent, scala.Unit]
  ): scala.Unit = js.native
  /** Registers a callback to be executed when `eventName` is triggered */
  @JSName("on")
  def on_created(
    eventName: rsvpLib.rsvpLibStrings.created,
    listener: js.Function1[/* event */ rsvpLib.rsvpMod.RSVPNs.InstrumentEvent, scala.Unit]
  ): scala.Unit = js.native
  @JSName("on")
  def on_error(
    eventName: rsvpLib.rsvpLibStrings.error,
    errorHandler: js.Function1[/* reason */ js.Any, scala.Unit]
  ): scala.Unit = js.native
  @JSName("on")
  def on_fulfilled(
    eventName: rsvpLib.rsvpLibStrings.fulfilled,
    listener: js.Function1[/* event */ rsvpLib.rsvpMod.RSVPNs.InstrumentEvent, scala.Unit]
  ): scala.Unit = js.native
  @JSName("on")
  def on_rejected(
    eventName: rsvpLib.rsvpLibStrings.rejected,
    listener: js.Function1[/* event */ rsvpLib.rsvpMod.RSVPNs.InstrumentEvent, scala.Unit]
  ): scala.Unit = js.native
  /**
    * Use `trigger` to fire custom events.
    *
    * You can also pass a value as a second argument to `trigger` that will be
    * passed as an argument to all event listeners for the event
    */
  def trigger(eventName: java.lang.String): scala.Unit = js.native
  def trigger(eventName: java.lang.String, options: js.Any): scala.Unit = js.native
  def trigger(eventName: java.lang.String, options: js.Any, label: java.lang.String): scala.Unit = js.native
}

