package typings.std.global

import typings.std.Event
import typings.std.EventListenerOptions
import typings.std.Window
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("removeEventListener")
@js.native
object removeEventListener_close extends js.Object {
  def apply(
    `type`: typings.std.stdStrings.close,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _]
  ): Unit = js.native
  def apply(
    `type`: typings.std.stdStrings.close,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: scala.Boolean
  ): Unit = js.native
  def apply(
    `type`: typings.std.stdStrings.close,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: EventListenerOptions
  ): Unit = js.native
}

