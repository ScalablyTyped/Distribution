package typings.std.global

import typings.std.EventListenerOptions
import typings.std.Window
import typings.std.stdStrings.click
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("removeEventListener")
@js.native
object removeEventListener_click extends js.Object {
  def apply(`type`: click, listener: js.ThisFunction1[/* this */ Window, /* ev */ typings.std.MouseEvent, _]): Unit = js.native
  def apply(
    `type`: click,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ typings.std.MouseEvent, _],
    options: scala.Boolean
  ): Unit = js.native
  def apply(
    `type`: click,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ typings.std.MouseEvent, _],
    options: EventListenerOptions
  ): Unit = js.native
}

