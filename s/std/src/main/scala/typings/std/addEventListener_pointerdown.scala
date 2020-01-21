package typings.std

import typings.std.stdStrings.pointerdown
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("addEventListener")
@js.native
object addEventListener_pointerdown extends js.Object {
  def apply(`type`: pointerdown, listener: js.ThisFunction1[/* this */ Window_, /* ev */ PointerEvent, _]): Unit = js.native
  def apply(
    `type`: pointerdown,
    listener: js.ThisFunction1[/* this */ Window_, /* ev */ PointerEvent, _],
    options: scala.Boolean
  ): Unit = js.native
  def apply(
    `type`: pointerdown,
    listener: js.ThisFunction1[/* this */ Window_, /* ev */ PointerEvent, _],
    options: AddEventListenerOptions
  ): Unit = js.native
}

