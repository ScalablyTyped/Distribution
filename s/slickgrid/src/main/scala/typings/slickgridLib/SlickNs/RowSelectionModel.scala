package typings
package slickgridLib.SlickNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Slick.RowSelectionModel")
@js.native
class RowSelectionModel[T /* <: SlickData */, E] () extends SelectionModel[T, E] {
  def this(options: slickgridLib.Anon_SelectActiveRow) = this()
  def getSelectedRanges(): js.Array[scala.Double] = js.native
  def getSelectedRows(): js.Array[scala.Double] = js.native
  def setSelectedRanges(ranges: js.Array[scala.Double]): scala.Unit = js.native
  def setSelectedRows(rows: js.Array[scala.Double]): scala.Unit = js.native
}

