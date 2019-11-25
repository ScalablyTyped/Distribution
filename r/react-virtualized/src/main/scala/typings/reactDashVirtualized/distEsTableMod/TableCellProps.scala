package typings.reactDashVirtualized.distEsTableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TableCellProps extends js.Object {
  var cellData: js.UndefOr[js.Any] = js.undefined
  var columnData: js.UndefOr[js.Any] = js.undefined
  var columnIndex: Double
  var dataKey: String
  var isScrolling: Boolean
  var parent: js.UndefOr[js.Any] = js.undefined
  var rowData: js.Any
  var rowIndex: Double
}

object TableCellProps {
  @scala.inline
  def apply(
    columnIndex: Double,
    dataKey: String,
    isScrolling: Boolean,
    rowData: js.Any,
    rowIndex: Double,
    cellData: js.Any = null,
    columnData: js.Any = null,
    parent: js.Any = null
  ): TableCellProps = {
    val __obj = js.Dynamic.literal(columnIndex = columnIndex.asInstanceOf[js.Any], dataKey = dataKey.asInstanceOf[js.Any], isScrolling = isScrolling.asInstanceOf[js.Any], rowData = rowData.asInstanceOf[js.Any], rowIndex = rowIndex.asInstanceOf[js.Any])
    if (cellData != null) __obj.updateDynamic("cellData")(cellData.asInstanceOf[js.Any])
    if (columnData != null) __obj.updateDynamic("columnData")(columnData.asInstanceOf[js.Any])
    if (parent != null) __obj.updateDynamic("parent")(parent.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableCellProps]
  }
}

