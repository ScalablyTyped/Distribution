package typings.std

import typings.std.stdStrings.pointerout
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("addEventListener")
@js.native
object addEventListener_pointerout extends js.Object {
  def apply(`type`: pointerout, listener: js.ThisFunction1[/* this */ Window, /* ev */ PointerEvent, _]): Unit = js.native
  def apply(
    `type`: pointerout,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ PointerEvent, _],
    options: scala.Boolean
  ): Unit = js.native
  def apply(
    `type`: pointerout,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ PointerEvent, _],
    options: AddEventListenerOptions
  ): Unit = js.native
}

