package typings.reactTable

import typings.reactTable.mod.DefaultFilterTypes
import typings.reactTable.mod.FilterProps
import typings.reactTable.mod.FilterType
import typings.reactTable.mod.Renderer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDefaultCanFilter[D /* <: js.Object */] extends js.Object {
  var Filter: Renderer[FilterProps[D]]
  var defaultCanFilter: Boolean
  var disableFilters: Boolean
  var filter: FilterType[D] | DefaultFilterTypes | String
}

object AnonDefaultCanFilter {
  @scala.inline
  def apply[D /* <: js.Object */](
    Filter: Renderer[FilterProps[D]],
    defaultCanFilter: Boolean,
    disableFilters: Boolean,
    filter: FilterType[D] | DefaultFilterTypes | String
  ): AnonDefaultCanFilter[D] = {
    val __obj = js.Dynamic.literal(Filter = Filter.asInstanceOf[js.Any], defaultCanFilter = defaultCanFilter.asInstanceOf[js.Any], disableFilters = disableFilters.asInstanceOf[js.Any], filter = filter.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonDefaultCanFilter[D]]
  }
}

