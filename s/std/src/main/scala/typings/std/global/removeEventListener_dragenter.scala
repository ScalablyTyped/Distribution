package typings.std.global

import typings.std.EventListenerOptions
import typings.std.Window
import typings.std.stdStrings.dragenter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("removeEventListener")
@js.native
object removeEventListener_dragenter extends js.Object {
  def apply(
    `type`: dragenter,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ typings.std.DragEvent, _]
  ): Unit = js.native
  def apply(
    `type`: dragenter,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ typings.std.DragEvent, _],
    options: scala.Boolean
  ): Unit = js.native
  def apply(
    `type`: dragenter,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ typings.std.DragEvent, _],
    options: EventListenerOptions
  ): Unit = js.native
}

