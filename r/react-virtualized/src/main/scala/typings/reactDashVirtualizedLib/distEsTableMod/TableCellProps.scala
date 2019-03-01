package typings
package reactDashVirtualizedLib.distEsTableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TableCellProps extends js.Object {
  var cellData: js.UndefOr[js.Any] = js.undefined
  var columnData: js.UndefOr[js.Any] = js.undefined
  var columnIndex: scala.Double
  var dataKey: java.lang.String
  var isScrolling: scala.Boolean
  var parent: js.UndefOr[js.Any] = js.undefined
  var rowData: js.Any
  var rowIndex: scala.Double
}

object TableCellProps {
  @scala.inline
  def apply(
    columnIndex: scala.Double,
    dataKey: java.lang.String,
    isScrolling: scala.Boolean,
    rowData: js.Any,
    rowIndex: scala.Double,
    cellData: js.Any = null,
    columnData: js.Any = null,
    parent: js.Any = null
  ): TableCellProps = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("columnIndex")(columnIndex)
    __obj.updateDynamic("dataKey")(dataKey)
    __obj.updateDynamic("isScrolling")(isScrolling)
    __obj.updateDynamic("rowData")(rowData)
    __obj.updateDynamic("rowIndex")(rowIndex)
    if (cellData != null) __obj.updateDynamic("cellData")(cellData)
    if (columnData != null) __obj.updateDynamic("columnData")(columnData)
    if (parent != null) __obj.updateDynamic("parent")(parent)
    __obj.asInstanceOf[TableCellProps]
  }
}

