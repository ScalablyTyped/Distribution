package typings.std

import typings.std.stdStrings.mouseleave
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("addEventListener")
@js.native
object addEventListener_mouseleave extends js.Object {
  def apply(`type`: mouseleave, listener: js.ThisFunction1[/* this */ Window, /* ev */ MouseEvent, _]): Unit = js.native
  def apply(
    `type`: mouseleave,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ MouseEvent, _],
    options: scala.Boolean
  ): Unit = js.native
  def apply(
    `type`: mouseleave,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ MouseEvent, _],
    options: AddEventListenerOptions
  ): Unit = js.native
}

