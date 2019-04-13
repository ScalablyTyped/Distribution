package typings
package reactDashVirtualizedLib.distEsTableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TableHeaderProps extends js.Object {
  var columnData: js.UndefOr[js.Any] = js.undefined
  var dataKey: java.lang.String
  var disableSort: js.UndefOr[scala.Boolean] = js.undefined
  var label: js.UndefOr[reactLib.reactMod.ReactNode] = js.undefined
  var sortBy: js.UndefOr[java.lang.String] = js.undefined
  var sortDirection: js.UndefOr[SortDirectionType] = js.undefined
}

object TableHeaderProps {
  @scala.inline
  def apply(
    dataKey: java.lang.String,
    columnData: js.Any = null,
    disableSort: js.UndefOr[scala.Boolean] = js.undefined,
    label: reactLib.reactMod.ReactNode = null,
    sortBy: java.lang.String = null,
    sortDirection: SortDirectionType = null
  ): TableHeaderProps = {
    val __obj = js.Dynamic.literal(dataKey = dataKey)
    if (columnData != null) __obj.updateDynamic("columnData")(columnData)
    if (!js.isUndefined(disableSort)) __obj.updateDynamic("disableSort")(disableSort)
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (sortBy != null) __obj.updateDynamic("sortBy")(sortBy)
    if (sortDirection != null) __obj.updateDynamic("sortDirection")(sortDirection)
    __obj.asInstanceOf[TableHeaderProps]
  }
}

