package typings.slickgrid.Slick.Controls

import typings.slickgrid.Slick.Column
import typings.slickgrid.Slick.Grid
import typings.slickgrid.Slick.SlickData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Slick.Controls.ColumnPicker")
@js.native
class ColumnPicker[T /* <: SlickData */] protected () extends js.Object {
  def this(columns: js.Array[Column[T]], grid: Grid[T], options: SlickColumnPickerOptions) = this()
  def destroy(): Unit = js.native
  def getAllColumns(): js.Array[Column[T]] = js.native
}

