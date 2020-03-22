package typings.reactTable.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<{  defaultCanSort  :boolean,   disableSortBy  :boolean,   sortDescFirst  :boolean,   sortInverted  :boolean,   sortType  :react-table.react-table.SortByFn<D> | react-table.react-table.DefaultSortTypes | string}> */
trait UseSortByColumnOptions[D /* <: js.Object */] extends js.Object {
  var defaultCanSort: js.UndefOr[Boolean] = js.undefined
  var disableSortBy: js.UndefOr[Boolean] = js.undefined
  var sortDescFirst: js.UndefOr[Boolean] = js.undefined
  var sortInverted: js.UndefOr[Boolean] = js.undefined
  var sortType: js.UndefOr[SortByFn[D] | DefaultSortTypes | String] = js.undefined
}

object UseSortByColumnOptions {
  @scala.inline
  def apply[D /* <: js.Object */](
    defaultCanSort: js.UndefOr[Boolean] = js.undefined,
    disableSortBy: js.UndefOr[Boolean] = js.undefined,
    sortDescFirst: js.UndefOr[Boolean] = js.undefined,
    sortInverted: js.UndefOr[Boolean] = js.undefined,
    sortType: SortByFn[D] | DefaultSortTypes | String = null
  ): UseSortByColumnOptions[D] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(defaultCanSort)) __obj.updateDynamic("defaultCanSort")(defaultCanSort.asInstanceOf[js.Any])
    if (!js.isUndefined(disableSortBy)) __obj.updateDynamic("disableSortBy")(disableSortBy.asInstanceOf[js.Any])
    if (!js.isUndefined(sortDescFirst)) __obj.updateDynamic("sortDescFirst")(sortDescFirst.asInstanceOf[js.Any])
    if (!js.isUndefined(sortInverted)) __obj.updateDynamic("sortInverted")(sortInverted.asInstanceOf[js.Any])
    if (sortType != null) __obj.updateDynamic("sortType")(sortType.asInstanceOf[js.Any])
    __obj.asInstanceOf[UseSortByColumnOptions[D]]
  }
}

