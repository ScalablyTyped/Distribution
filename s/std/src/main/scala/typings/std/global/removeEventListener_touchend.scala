package typings.std.global

import typings.std.EventListenerOptions
import typings.std.Window
import typings.std.stdStrings.touchend
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("removeEventListener")
@js.native
object removeEventListener_touchend extends js.Object {
  def apply(
    `type`: touchend,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ typings.std.TouchEvent, _]
  ): Unit = js.native
  def apply(
    `type`: touchend,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ typings.std.TouchEvent, _],
    options: scala.Boolean
  ): Unit = js.native
  def apply(
    `type`: touchend,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ typings.std.TouchEvent, _],
    options: EventListenerOptions
  ): Unit = js.native
}

