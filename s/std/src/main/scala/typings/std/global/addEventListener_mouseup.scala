package typings.std.global

import typings.std.AddEventListenerOptions
import typings.std.Window
import typings.std.stdStrings.mouseup
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("addEventListener")
@js.native
object addEventListener_mouseup extends js.Object {
  def apply(`type`: mouseup, listener: js.ThisFunction1[/* this */ Window, /* ev */ typings.std.MouseEvent, _]): Unit = js.native
  def apply(
    `type`: mouseup,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ typings.std.MouseEvent, _],
    options: scala.Boolean
  ): Unit = js.native
  def apply(
    `type`: mouseup,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ typings.std.MouseEvent, _],
    options: AddEventListenerOptions
  ): Unit = js.native
}

