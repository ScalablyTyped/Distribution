package typings.std.global

import typings.std.EventListenerOptions
import typings.std.Window
import typings.std.stdStrings.deviceorientationabsolute
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("removeEventListener")
@js.native
object removeEventListener_deviceorientationabsolute extends js.Object {
  def apply(
    `type`: deviceorientationabsolute,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ typings.std.DeviceOrientationEvent, _]
  ): Unit = js.native
  def apply(
    `type`: deviceorientationabsolute,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ typings.std.DeviceOrientationEvent, _],
    options: scala.Boolean
  ): Unit = js.native
  def apply(
    `type`: deviceorientationabsolute,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ typings.std.DeviceOrientationEvent, _],
    options: EventListenerOptions
  ): Unit = js.native
}

