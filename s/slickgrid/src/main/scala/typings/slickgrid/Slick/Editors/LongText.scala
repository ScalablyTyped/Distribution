package typings.slickgrid.Slick.Editors

import typings.slickgrid.DOMEvent
import typings.slickgrid.Slick.Position
import typings.slickgrid.Slick.SlickData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Slick.Editors.LongText")
@js.native
class LongText[T /* <: SlickData */] protected () extends Editor[T] {
  def this(args: EditorOptions[T]) = this()
  def cancel(): Unit = js.native
  def handleKeyDown(e: DOMEvent): Unit = js.native
  def hide(): Unit = js.native
  def position(position: Position): Unit = js.native
  def save(): Unit = js.native
  def show(): Unit = js.native
}

