package typings.std

import typings.std.stdStrings.pointerdown
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("removeEventListener")
@js.native
object removeEventListener_pointerdown extends js.Object {
  def apply(`type`: pointerdown, listener: js.ThisFunction1[/* this */ Window, /* ev */ PointerEvent, _]): Unit = js.native
  def apply(
    `type`: pointerdown,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ PointerEvent, _],
    options: scala.Boolean
  ): Unit = js.native
  def apply(
    `type`: pointerdown,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ PointerEvent, _],
    options: EventListenerOptions
  ): Unit = js.native
}

