package typings.reactabularTable.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColumnIndex extends js.Object {
  var column: typings.reactabularTable.mod.Column
  var columnIndex: Double
  var property: String
  var rowData: js.Any
  var rowIndex: Double
}

object ColumnIndex {
  @scala.inline
  def apply(
    column: typings.reactabularTable.mod.Column,
    columnIndex: Double,
    property: String,
    rowData: js.Any,
    rowIndex: Double
  ): ColumnIndex = {
    val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], columnIndex = columnIndex.asInstanceOf[js.Any], property = property.asInstanceOf[js.Any], rowData = rowData.asInstanceOf[js.Any], rowIndex = rowIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColumnIndex]
  }
}

