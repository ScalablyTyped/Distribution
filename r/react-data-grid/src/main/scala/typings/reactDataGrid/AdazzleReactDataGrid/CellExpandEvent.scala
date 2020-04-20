package typings.reactDataGrid.AdazzleReactDataGrid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *   Information about a cell expanded.
  */
trait CellExpandEvent[T] extends js.Object {
  /**
    * Expand data.
    */
  var expandArgs: js.Any
  /**
    * The column index where the cell is being expanded.
    */
  var idx: Double
  /**
    * The values of the row.
    */
  var rowData: T
  /**
    * The row index where the cell is being expanded.
    */
  var rowIdx: Double
}

object CellExpandEvent {
  @scala.inline
  def apply[T](expandArgs: js.Any, idx: Double, rowData: T, rowIdx: Double): CellExpandEvent[T] = {
    val __obj = js.Dynamic.literal(expandArgs = expandArgs.asInstanceOf[js.Any], idx = idx.asInstanceOf[js.Any], rowData = rowData.asInstanceOf[js.Any], rowIdx = rowIdx.asInstanceOf[js.Any])
    __obj.asInstanceOf[CellExpandEvent[T]]
  }
}

