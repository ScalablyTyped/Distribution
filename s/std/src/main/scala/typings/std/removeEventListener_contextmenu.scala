package typings.std

import typings.std.stdStrings.contextmenu
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("removeEventListener")
@js.native
object removeEventListener_contextmenu extends js.Object {
  def apply(`type`: contextmenu, listener: js.ThisFunction1[/* this */ Window, /* ev */ MouseEvent, _]): Unit = js.native
  def apply(
    `type`: contextmenu,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ MouseEvent, _],
    options: scala.Boolean
  ): Unit = js.native
  def apply(
    `type`: contextmenu,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ MouseEvent, _],
    options: EventListenerOptions
  ): Unit = js.native
}

