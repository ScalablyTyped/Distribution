package typings.reactabularTable.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RowIndex extends js.Object {
  var column: typings.reactabularTable.mod.Column
  var columnIndex: Double
  var rowData: js.Any
  var rowIndex: Double
}

object RowIndex {
  @scala.inline
  def apply(
    column: typings.reactabularTable.mod.Column,
    columnIndex: Double,
    rowData: js.Any,
    rowIndex: Double
  ): RowIndex = {
    val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], columnIndex = columnIndex.asInstanceOf[js.Any], rowData = rowData.asInstanceOf[js.Any], rowIndex = rowIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[RowIndex]
  }
}

