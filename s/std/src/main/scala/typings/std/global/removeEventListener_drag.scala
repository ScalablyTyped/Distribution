package typings.std.global

import typings.std.EventListenerOptions
import typings.std.Window
import typings.std.stdStrings.drag
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("removeEventListener")
@js.native
object removeEventListener_drag extends js.Object {
  def apply(`type`: drag, listener: js.ThisFunction1[/* this */ Window, /* ev */ typings.std.DragEvent, _]): Unit = js.native
  def apply(
    `type`: drag,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ typings.std.DragEvent, _],
    options: scala.Boolean
  ): Unit = js.native
  def apply(
    `type`: drag,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ typings.std.DragEvent, _],
    options: EventListenerOptions
  ): Unit = js.native
}

