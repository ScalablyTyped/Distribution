package typings.reactTable

import typings.reactTable.mod.FilterTypes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAutoResetFilters[D /* <: js.Object */] extends js.Object {
  var autoResetFilters: js.UndefOr[Boolean] = js.undefined
  var defaultCanFilter: Boolean
  var disableFilters: Boolean
  var filterTypes: FilterTypes[D]
  var manualFilters: Boolean
}

object AnonAutoResetFilters {
  @scala.inline
  def apply[D /* <: js.Object */](
    defaultCanFilter: Boolean,
    disableFilters: Boolean,
    filterTypes: FilterTypes[D],
    manualFilters: Boolean,
    autoResetFilters: js.UndefOr[Boolean] = js.undefined
  ): AnonAutoResetFilters[D] = {
    val __obj = js.Dynamic.literal(defaultCanFilter = defaultCanFilter.asInstanceOf[js.Any], disableFilters = disableFilters.asInstanceOf[js.Any], filterTypes = filterTypes.asInstanceOf[js.Any], manualFilters = manualFilters.asInstanceOf[js.Any])
    if (!js.isUndefined(autoResetFilters)) __obj.updateDynamic("autoResetFilters")(autoResetFilters.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAutoResetFilters[D]]
  }
}

