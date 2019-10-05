package typings.slickgrid.Slick.Editors

import typings.slickgrid.Slick.SlickData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Slick.Editors.Text")
@js.native
class Text[T /* <: SlickData */] protected () extends Editor[T] {
  def this(args: EditorOptions[T]) = this()
  def getValue(): String = js.native
  def setValue(`val`: String): Unit = js.native
}

