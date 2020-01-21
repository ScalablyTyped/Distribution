package typings.std

import typings.std.stdStrings.dragstart
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("addEventListener")
@js.native
object addEventListener_dragstart extends js.Object {
  def apply(`type`: dragstart, listener: js.ThisFunction1[/* this */ Window_, /* ev */ DragEvent, _]): Unit = js.native
  def apply(
    `type`: dragstart,
    listener: js.ThisFunction1[/* this */ Window_, /* ev */ DragEvent, _],
    options: scala.Boolean
  ): Unit = js.native
  def apply(
    `type`: dragstart,
    listener: js.ThisFunction1[/* this */ Window_, /* ev */ DragEvent, _],
    options: AddEventListenerOptions
  ): Unit = js.native
}

