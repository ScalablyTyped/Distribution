package typings.slickgrid.Slick

import typings.slickgrid.AnonSelectActiveRow
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Slick.RowSelectionModel")
@js.native
class RowSelectionModel[T /* <: SlickData */, E] () extends SelectionModel[T, E] {
  def this(options: AnonSelectActiveRow) = this()
  def getSelectedRanges(): js.Array[Double] = js.native
  def getSelectedRows(): js.Array[Double] = js.native
  def setSelectedRanges(ranges: js.Array[Double]): Unit = js.native
  def setSelectedRows(rows: js.Array[Double]): Unit = js.native
}

