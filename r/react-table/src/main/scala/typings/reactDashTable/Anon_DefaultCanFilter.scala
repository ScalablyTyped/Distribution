package typings.reactDashTable

import typings.reactDashTable.reactDashTableMod.DefaultFilterTypes
import typings.reactDashTable.reactDashTableMod.FilterProps
import typings.reactDashTable.reactDashTableMod.FilterType
import typings.reactDashTable.reactDashTableMod.Renderer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DefaultCanFilter[D /* <: js.Object */] extends js.Object {
  var Filter: Renderer[FilterProps[D]]
  var defaultCanFilter: Boolean
  var disableFilters: Boolean
  var filter: FilterType[D] | DefaultFilterTypes | String
}

object Anon_DefaultCanFilter {
  @scala.inline
  def apply[D /* <: js.Object */](
    Filter: Renderer[FilterProps[D]],
    defaultCanFilter: Boolean,
    disableFilters: Boolean,
    filter: FilterType[D] | DefaultFilterTypes | String
  ): Anon_DefaultCanFilter[D] = {
    val __obj = js.Dynamic.literal(Filter = Filter.asInstanceOf[js.Any], defaultCanFilter = defaultCanFilter.asInstanceOf[js.Any], disableFilters = disableFilters.asInstanceOf[js.Any], filter = filter.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_DefaultCanFilter[D]]
  }
}

