package typings.std.global

import typings.std.AddEventListenerOptions
import typings.std.Window
import typings.std.stdStrings.devicemotion
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("addEventListener")
@js.native
object addEventListener_devicemotion extends js.Object {
  def apply(
    `type`: devicemotion,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ typings.std.DeviceMotionEvent, _]
  ): Unit = js.native
  def apply(
    `type`: devicemotion,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ typings.std.DeviceMotionEvent, _],
    options: scala.Boolean
  ): Unit = js.native
  def apply(
    `type`: devicemotion,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ typings.std.DeviceMotionEvent, _],
    options: AddEventListenerOptions
  ): Unit = js.native
}

