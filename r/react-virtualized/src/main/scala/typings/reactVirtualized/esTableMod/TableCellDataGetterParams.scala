package typings.reactVirtualized.esTableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TableCellDataGetterParams extends js.Object {
  var columnData: js.UndefOr[js.Any] = js.undefined
  var dataKey: String
  var rowData: js.Any
}

object TableCellDataGetterParams {
  @scala.inline
  def apply(dataKey: String, rowData: js.Any, columnData: js.Any = null): TableCellDataGetterParams = {
    val __obj = js.Dynamic.literal(dataKey = dataKey.asInstanceOf[js.Any], rowData = rowData.asInstanceOf[js.Any])
    if (columnData != null) __obj.updateDynamic("columnData")(columnData.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableCellDataGetterParams]
  }
}

