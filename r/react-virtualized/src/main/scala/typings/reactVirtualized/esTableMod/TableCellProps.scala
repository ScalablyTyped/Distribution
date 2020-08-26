package typings.reactVirtualized.esTableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TableCellProps extends js.Object {
  var cellData: js.UndefOr[js.Any] = js.native
  var columnData: js.UndefOr[js.Any] = js.native
  var columnIndex: Double = js.native
  var dataKey: String = js.native
  var isScrolling: Boolean = js.native
  var parent: js.UndefOr[js.Any] = js.native
  var rowData: js.Any = js.native
  var rowIndex: Double = js.native
}

object TableCellProps {
  @scala.inline
  def apply(columnIndex: Double, dataKey: String, isScrolling: Boolean, rowData: js.Any, rowIndex: Double): TableCellProps = {
    val __obj = js.Dynamic.literal(columnIndex = columnIndex.asInstanceOf[js.Any], dataKey = dataKey.asInstanceOf[js.Any], isScrolling = isScrolling.asInstanceOf[js.Any], rowData = rowData.asInstanceOf[js.Any], rowIndex = rowIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableCellProps]
  }
  @scala.inline
  implicit class TableCellPropsOps[Self <: TableCellProps] (val x: Self) extends AnyVal {
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
    def setColumnIndex(value: Double): Self = this.set("columnIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def setDataKey(value: String): Self = this.set("dataKey", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsScrolling(value: Boolean): Self = this.set("isScrolling", value.asInstanceOf[js.Any])
    @scala.inline
    def setRowData(value: js.Any): Self = this.set("rowData", value.asInstanceOf[js.Any])
    @scala.inline
    def setRowIndex(value: Double): Self = this.set("rowIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def setCellData(value: js.Any): Self = this.set("cellData", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCellData: Self = this.set("cellData", js.undefined)
    @scala.inline
    def setColumnData(value: js.Any): Self = this.set("columnData", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColumnData: Self = this.set("columnData", js.undefined)
    @scala.inline
    def setParent(value: js.Any): Self = this.set("parent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParent: Self = this.set("parent", js.undefined)
  }
  
}

