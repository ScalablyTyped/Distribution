package typings
package rsvpLib.rsvpMod.RSVPNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ObjectWithEventMixins extends js.Object {
  def off(eventName: java.lang.String): scala.Unit = js.native
  def off(eventName: java.lang.String, callback: js.Function1[/* value */ js.Any, scala.Unit]): scala.Unit = js.native
  def on(eventName: java.lang.String, callback: js.Function1[/* value */ js.Any, scala.Unit]): scala.Unit = js.native
  @JSName("on")
  def on_chained(
    eventName: rsvpLib.rsvpLibStrings.chained,
    listener: js.Function1[/* event */ InstrumentEvent, scala.Unit]
  ): scala.Unit = js.native
  @JSName("on")
  def on_created(
    eventName: rsvpLib.rsvpLibStrings.created,
    listener: js.Function1[/* event */ InstrumentEvent, scala.Unit]
  ): scala.Unit = js.native
  @JSName("on")
  def on_error(
    eventName: rsvpLib.rsvpLibStrings.error,
    errorHandler: js.Function1[/* reason */ js.Any, scala.Unit]
  ): scala.Unit = js.native
  @JSName("on")
  def on_fulfilled(
    eventName: rsvpLib.rsvpLibStrings.fulfilled,
    listener: js.Function1[/* event */ InstrumentEvent, scala.Unit]
  ): scala.Unit = js.native
  @JSName("on")
  def on_rejected(
    eventName: rsvpLib.rsvpLibStrings.rejected,
    listener: js.Function1[/* event */ InstrumentEvent, scala.Unit]
  ): scala.Unit = js.native
  def trigger(eventName: java.lang.String): scala.Unit = js.native
  def trigger(eventName: java.lang.String, options: js.Any): scala.Unit = js.native
  def trigger(eventName: java.lang.String, options: js.Any, label: java.lang.String): scala.Unit = js.native
}

