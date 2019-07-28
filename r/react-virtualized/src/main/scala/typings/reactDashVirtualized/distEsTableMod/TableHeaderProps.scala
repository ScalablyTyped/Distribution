package typings.reactDashVirtualized.distEsTableMod

import typings.react.reactMod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TableHeaderProps extends js.Object {
  var columnData: js.UndefOr[js.Any] = js.undefined
  var dataKey: String
  var disableSort: js.UndefOr[Boolean] = js.undefined
  var label: js.UndefOr[ReactNode] = js.undefined
  var sortBy: js.UndefOr[String] = js.undefined
  var sortDirection: js.UndefOr[SortDirectionType] = js.undefined
}

object TableHeaderProps {
  @scala.inline
  def apply(
    dataKey: String,
    columnData: js.Any = null,
    disableSort: js.UndefOr[Boolean] = js.undefined,
    label: ReactNode = null,
    sortBy: String = null,
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

