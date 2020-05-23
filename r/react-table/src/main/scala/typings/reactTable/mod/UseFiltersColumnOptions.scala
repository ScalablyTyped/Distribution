package typings.reactTable.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<{  Filter  :react-table.react-table.Renderer<react-table.react-table.FilterProps<D>>,   disableFilters  :boolean,   defaultCanFilter  :boolean,   filter  :react-table.react-table.FilterType<D> | react-table.react-table.DefaultFilterTypes | string}> */
trait UseFiltersColumnOptions[D /* <: js.Object */] extends js.Object {
  var Filter: js.UndefOr[Renderer[FilterProps[D]]] = js.undefined
  var defaultCanFilter: js.UndefOr[Boolean] = js.undefined
  var disableFilters: js.UndefOr[Boolean] = js.undefined
  var filter: js.UndefOr[FilterType[D] | DefaultFilterTypes | String] = js.undefined
}

object UseFiltersColumnOptions {
  @scala.inline
  def apply[D](
    Filter: Renderer[FilterProps[D]] = null,
    defaultCanFilter: js.UndefOr[Boolean] = js.undefined,
    disableFilters: js.UndefOr[Boolean] = js.undefined,
    filter: FilterType[D] | DefaultFilterTypes | String = null
  ): UseFiltersColumnOptions[D] = {
    val __obj = js.Dynamic.literal()
    if (Filter != null) __obj.updateDynamic("Filter")(Filter.asInstanceOf[js.Any])
    if (!js.isUndefined(defaultCanFilter)) __obj.updateDynamic("defaultCanFilter")(defaultCanFilter.get.asInstanceOf[js.Any])
    if (!js.isUndefined(disableFilters)) __obj.updateDynamic("disableFilters")(disableFilters.get.asInstanceOf[js.Any])
    if (filter != null) __obj.updateDynamic("filter")(filter.asInstanceOf[js.Any])
    __obj.asInstanceOf[UseFiltersColumnOptions[D]]
  }
}

