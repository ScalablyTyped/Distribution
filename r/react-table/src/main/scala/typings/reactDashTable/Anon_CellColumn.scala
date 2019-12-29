package typings.reactDashTable

import typings.reactDashTable.reactDashTableMod.Cell
import typings.reactDashTable.reactDashTableMod.ColumnInstance
import typings.reactDashTable.reactDashTableMod.Row
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CellColumn[D /* <: js.Object */] extends js.Object {
  var cell: Cell[D]
  var column: ColumnInstance[D]
  var row: Row[D]
}

object Anon_CellColumn {
  @scala.inline
  def apply[D /* <: js.Object */](cell: Cell[D], column: ColumnInstance[D], row: Row[D]): Anon_CellColumn[D] = {
    val __obj = js.Dynamic.literal(cell = cell.asInstanceOf[js.Any], column = column.asInstanceOf[js.Any], row = row.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_CellColumn[D]]
  }
}

