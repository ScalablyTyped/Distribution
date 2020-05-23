package typings.std.global

import typings.std.AddEventListenerOptions
import typings.std.Window
import typings.std.stdStrings.dragstart
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("addEventListener")
@js.native
object addEventListener_dragstart extends js.Object {
  def apply(
    `type`: dragstart,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ typings.std.DragEvent, _]
  ): Unit = js.native
  def apply(
    `type`: dragstart,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ typings.std.DragEvent, _],
    options: scala.Boolean
  ): Unit = js.native
  def apply(
    `type`: dragstart,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ typings.std.DragEvent, _],
    options: AddEventListenerOptions
  ): Unit = js.native
}

