package typings.reactabularTable.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RowData extends js.Object {
  var column: typings.reactabularTable.mod.Column
  var columnIndex: Double
  var rowData: js.Any
}

object RowData {
  @scala.inline
  def apply(column: typings.reactabularTable.mod.Column, columnIndex: Double, rowData: js.Any): RowData = {
    val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], columnIndex = columnIndex.asInstanceOf[js.Any], rowData = rowData.asInstanceOf[js.Any])
    __obj.asInstanceOf[RowData]
  }
}

