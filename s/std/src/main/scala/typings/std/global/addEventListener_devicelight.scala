package typings.std.global

import typings.std.AddEventListenerOptions
import typings.std.Window
import typings.std.stdStrings.devicelight
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("addEventListener")
@js.native
object addEventListener_devicelight extends js.Object {
  def apply(
    `type`: devicelight,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ typings.std.DeviceLightEvent, _]
  ): Unit = js.native
  def apply(
    `type`: devicelight,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ typings.std.DeviceLightEvent, _],
    options: scala.Boolean
  ): Unit = js.native
  def apply(
    `type`: devicelight,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ typings.std.DeviceLightEvent, _],
    options: AddEventListenerOptions
  ): Unit = js.native
}

