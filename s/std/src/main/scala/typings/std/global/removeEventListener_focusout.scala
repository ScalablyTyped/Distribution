package typings.std.global

import typings.std.EventListenerOptions
import typings.std.Window
import typings.std.stdStrings.focusout
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("removeEventListener")
@js.native
object removeEventListener_focusout extends js.Object {
  def apply(
    `type`: focusout,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ typings.std.FocusEvent, _]
  ): Unit = js.native
  def apply(
    `type`: focusout,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ typings.std.FocusEvent, _],
    options: scala.Boolean
  ): Unit = js.native
  def apply(
    `type`: focusout,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ typings.std.FocusEvent, _],
    options: EventListenerOptions
  ): Unit = js.native
}

