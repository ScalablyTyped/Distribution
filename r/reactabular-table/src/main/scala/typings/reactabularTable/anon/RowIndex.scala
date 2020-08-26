package typings.reactabularTable.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RowIndex extends js.Object {
  var column: typings.reactabularTable.mod.Column = js.native
  var columnIndex: Double = js.native
  var rowData: js.Any = js.native
  var rowIndex: Double = js.native
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
  @scala.inline
  implicit class RowIndexOps[Self <: RowIndex] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setColumn(value: typings.reactabularTable.mod.Column): Self = this.set("column", value.asInstanceOf[js.Any])
    @scala.inline
    def setColumnIndex(value: Double): Self = this.set("columnIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def setRowData(value: js.Any): Self = this.set("rowData", value.asInstanceOf[js.Any])
    @scala.inline
    def setRowIndex(value: Double): Self = this.set("rowIndex", value.asInstanceOf[js.Any])
  }
  
}

