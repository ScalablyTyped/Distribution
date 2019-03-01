package typings
package reactDashBootstrapDashTableLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Filter extends js.Object {
  var filter: js.UndefOr[scala.Boolean] = js.undefined
  var search: js.UndefOr[scala.Boolean] = js.undefined
  var sort: js.UndefOr[scala.Boolean] = js.undefined
}

object Anon_Filter {
  @scala.inline
  def apply(
    filter: js.UndefOr[scala.Boolean] = js.undefined,
    search: js.UndefOr[scala.Boolean] = js.undefined,
    sort: js.UndefOr[scala.Boolean] = js.undefined
  ): Anon_Filter = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(filter)) __obj.updateDynamic("filter")(filter)
    if (!js.isUndefined(search)) __obj.updateDynamic("search")(search)
    if (!js.isUndefined(sort)) __obj.updateDynamic("sort")(sort)
    __obj.asInstanceOf[Anon_Filter]
  }
}

