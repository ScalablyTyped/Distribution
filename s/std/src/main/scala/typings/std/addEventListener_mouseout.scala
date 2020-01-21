package typings.std

import typings.std.stdStrings.mouseout
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("addEventListener")
@js.native
object addEventListener_mouseout extends js.Object {
  def apply(`type`: mouseout, listener: js.ThisFunction1[/* this */ Window_, /* ev */ MouseEvent, _]): Unit = js.native
  def apply(
    `type`: mouseout,
    listener: js.ThisFunction1[/* this */ Window_, /* ev */ MouseEvent, _],
    options: scala.Boolean
  ): Unit = js.native
  def apply(
    `type`: mouseout,
    listener: js.ThisFunction1[/* this */ Window_, /* ev */ MouseEvent, _],
    options: AddEventListenerOptions
  ): Unit = js.native
}

