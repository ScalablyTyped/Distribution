package typings.rsvp.mod

import org.scalablytyped.runtime.Instantiable0
import typings.rsvp.mod.RSVP.InstrumentEvent
import typings.rsvp.mod.RSVP.ObjectWithEventMixins
import typings.rsvp.rsvpStrings.chained
import typings.rsvp.rsvpStrings.created
import typings.rsvp.rsvpStrings.error
import typings.rsvp.rsvpStrings.fulfilled
import typings.rsvp.rsvpStrings.rejected
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("rsvp", "EventTarget")
@js.native
object EventTarget
  extends Instantiable0[typings.rsvp.mod.RSVP.EventTarget] {
  
  /** `RSVP.EventTarget.mixin` extends an object with EventTarget methods. */
  def mixin(`object`: js.Object): ObjectWithEventMixins = js.native
  
  /**
    * You can use `off` to stop firing a particular callback for an event.
    *
    * If you don't pass a `callback` argument to `off`, ALL callbacks for the
    * event will not be executed when the event fires.
    */
  def off(eventName: String): Unit = js.native
  def off(eventName: String, callback: js.Function1[/* value */ js.Any, Unit]): Unit = js.native
  
  def on(eventName: String, callback: js.Function1[/* value */ js.Any, Unit]): Unit = js.native
  @JSName("on")
  def on_chained(eventName: chained, listener: js.Function1[/* event */ InstrumentEvent, Unit]): Unit = js.native
  /** Registers a callback to be executed when `eventName` is triggered */
  @JSName("on")
  def on_created(eventName: created, listener: js.Function1[/* event */ InstrumentEvent, Unit]): Unit = js.native
  @JSName("on")
  def on_error(eventName: error, errorHandler: js.Function1[/* reason */ js.Any, Unit]): Unit = js.native
  @JSName("on")
  def on_fulfilled(eventName: fulfilled, listener: js.Function1[/* event */ InstrumentEvent, Unit]): Unit = js.native
  @JSName("on")
  def on_rejected(eventName: rejected, listener: js.Function1[/* event */ InstrumentEvent, Unit]): Unit = js.native
  
  /**
    * Use `trigger` to fire custom events.
    *
    * You can also pass a value as a second argument to `trigger` that will be
    * passed as an argument to all event listeners for the event
    */
  def trigger(eventName: String): Unit = js.native
  def trigger(eventName: String, options: js.UndefOr[scala.Nothing], label: String): Unit = js.native
  def trigger(eventName: String, options: js.Any): Unit = js.native
  def trigger(eventName: String, options: js.Any, label: String): Unit = js.native
}
