package typings.reactTable.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<{  manualFilters  :boolean,   disableFilters  :boolean,   defaultCanFilter  :boolean,   filterTypes  :react-table.react-table.FilterTypes<D>,   autoResetFilters ? :boolean}> */
trait UseFiltersOptions[D /* <: js.Object */] extends js.Object {
  var autoResetFilters: js.UndefOr[Boolean] = js.undefined
  var defaultCanFilter: js.UndefOr[Boolean] = js.undefined
  var disableFilters: js.UndefOr[Boolean] = js.undefined
  var filterTypes: js.UndefOr[FilterTypes[D]] = js.undefined
  var manualFilters: js.UndefOr[Boolean] = js.undefined
}

object UseFiltersOptions {
  @scala.inline
  def apply[/* <: js.Object */ D](
    autoResetFilters: js.UndefOr[Boolean] = js.undefined,
    defaultCanFilter: js.UndefOr[Boolean] = js.undefined,
    disableFilters: js.UndefOr[Boolean] = js.undefined,
    filterTypes: FilterTypes[D] = null,
    manualFilters: js.UndefOr[Boolean] = js.undefined
  ): UseFiltersOptions[D] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoResetFilters)) __obj.updateDynamic("autoResetFilters")(autoResetFilters.get.asInstanceOf[js.Any])
    if (!js.isUndefined(defaultCanFilter)) __obj.updateDynamic("defaultCanFilter")(defaultCanFilter.get.asInstanceOf[js.Any])
    if (!js.isUndefined(disableFilters)) __obj.updateDynamic("disableFilters")(disableFilters.get.asInstanceOf[js.Any])
    if (filterTypes != null) __obj.updateDynamic("filterTypes")(filterTypes.asInstanceOf[js.Any])
    if (!js.isUndefined(manualFilters)) __obj.updateDynamic("manualFilters")(manualFilters.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[UseFiltersOptions[D]]
  }
}

