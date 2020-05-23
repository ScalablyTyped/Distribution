package typings.std.global

import typings.std.AddEventListenerOptions
import typings.std.Window
import typings.std.stdStrings.focusin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("addEventListener")
@js.native
object addEventListener_focusin extends js.Object {
  def apply(`type`: focusin, listener: js.ThisFunction1[/* this */ Window, /* ev */ typings.std.FocusEvent, _]): Unit = js.native
  def apply(
    `type`: focusin,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ typings.std.FocusEvent, _],
    options: scala.Boolean
  ): Unit = js.native
  def apply(
    `type`: focusin,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ typings.std.FocusEvent, _],
    options: AddEventListenerOptions
  ): Unit = js.native
}

