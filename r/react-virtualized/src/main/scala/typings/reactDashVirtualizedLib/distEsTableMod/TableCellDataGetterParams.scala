package typings
package reactDashVirtualizedLib.distEsTableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TableCellDataGetterParams extends js.Object {
  var columnData: js.UndefOr[js.Any] = js.undefined
  var dataKey: java.lang.String
  var rowData: js.Any
}

object TableCellDataGetterParams {
  @scala.inline
  def apply(dataKey: java.lang.String, rowData: js.Any, columnData: js.Any = null): TableCellDataGetterParams = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("dataKey")(dataKey)
    __obj.updateDynamic("rowData")(rowData)
    if (columnData != null) __obj.updateDynamic("columnData")(columnData)
    __obj.asInstanceOf[TableCellDataGetterParams]
  }
}

