package typings.reactTable

import typings.reactTable.mod.Cell
import typings.reactTable.mod.ColumnInstance
import typings.reactTable.mod.Row
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCellColumn[D /* <: js.Object */] extends js.Object {
  var cell: Cell[D]
  var column: ColumnInstance[D]
  var row: Row[D]
}

object AnonCellColumn {
  @scala.inline
  def apply[D /* <: js.Object */](cell: Cell[D], column: ColumnInstance[D], row: Row[D]): AnonCellColumn[D] = {
    val __obj = js.Dynamic.literal(cell = cell.asInstanceOf[js.Any], column = column.asInstanceOf[js.Any], row = row.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonCellColumn[D]]
  }
}

