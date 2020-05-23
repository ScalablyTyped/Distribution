package typings.std.global

import typings.std.AddEventListenerOptions
import typings.std.Window
import typings.std.stdStrings.dragenter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("addEventListener")
@js.native
object addEventListener_dragenter extends js.Object {
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
    options: AddEventListenerOptions
  ): Unit = js.native
}

