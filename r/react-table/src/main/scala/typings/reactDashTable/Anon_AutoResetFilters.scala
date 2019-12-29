package typings.reactDashTable

import typings.reactDashTable.reactDashTableMod.FilterTypes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AutoResetFilters[D /* <: js.Object */] extends js.Object {
  var autoResetFilters: js.UndefOr[Boolean] = js.undefined
  var defaultCanFilter: Boolean
  var disableFilters: Boolean
  var filterTypes: FilterTypes[D]
  var manualFilters: Boolean
}

object Anon_AutoResetFilters {
  @scala.inline
  def apply[D /* <: js.Object */](
    defaultCanFilter: Boolean,
    disableFilters: Boolean,
    filterTypes: FilterTypes[D],
    manualFilters: Boolean,
    autoResetFilters: js.UndefOr[Boolean] = js.undefined
  ): Anon_AutoResetFilters[D] = {
    val __obj = js.Dynamic.literal(defaultCanFilter = defaultCanFilter.asInstanceOf[js.Any], disableFilters = disableFilters.asInstanceOf[js.Any], filterTypes = filterTypes.asInstanceOf[js.Any], manualFilters = manualFilters.asInstanceOf[js.Any])
    if (!js.isUndefined(autoResetFilters)) __obj.updateDynamic("autoResetFilters")(autoResetFilters.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_AutoResetFilters[D]]
  }
}

