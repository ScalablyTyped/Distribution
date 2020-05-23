package typings.std.global

import typings.std.Event
import typings.std.EventListenerOptions
import typings.std.Window
import typings.std.stdStrings.vrdisplaypointerrestricted
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("removeEventListener")
@js.native
object removeEventListener_vrdisplaypointerrestricted extends js.Object {
  def apply(
    `type`: vrdisplaypointerrestricted,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _]
  ): Unit = js.native
  def apply(
    `type`: vrdisplaypointerrestricted,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: scala.Boolean
  ): Unit = js.native
  def apply(
    `type`: vrdisplaypointerrestricted,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: EventListenerOptions
  ): Unit = js.native
}

