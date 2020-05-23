package typings.std.global

import typings.std.AddEventListenerOptions
import typings.std.Window
import typings.std.stdStrings.wheel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("addEventListener")
@js.native
object addEventListener_wheel extends js.Object {
  def apply(`type`: wheel, listener: js.ThisFunction1[/* this */ Window, /* ev */ typings.std.WheelEvent, _]): Unit = js.native
  def apply(
    `type`: wheel,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ typings.std.WheelEvent, _],
    options: scala.Boolean
  ): Unit = js.native
  def apply(
    `type`: wheel,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ typings.std.WheelEvent, _],
    options: AddEventListenerOptions
  ): Unit = js.native
}

