package typings.std

import typings.std.stdStrings.wheel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("removeEventListener")
@js.native
object removeEventListener_wheel extends js.Object {
  def apply(`type`: wheel, listener: js.ThisFunction1[/* this */ Window_, /* ev */ WheelEvent, _]): Unit = js.native
  def apply(
    `type`: wheel,
    listener: js.ThisFunction1[/* this */ Window_, /* ev */ WheelEvent, _],
    options: scala.Boolean
  ): Unit = js.native
  def apply(
    `type`: wheel,
    listener: js.ThisFunction1[/* this */ Window_, /* ev */ WheelEvent, _],
    options: EventListenerOptions
  ): Unit = js.native
}

