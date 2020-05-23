package typings.reactBootstrapTable.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Filter extends js.Object {
  var filter: js.UndefOr[Boolean] = js.undefined
  var search: js.UndefOr[Boolean] = js.undefined
  var sort: js.UndefOr[Boolean] = js.undefined
}

object Filter {
  @scala.inline
  def apply(
    filter: js.UndefOr[Boolean] = js.undefined,
    search: js.UndefOr[Boolean] = js.undefined,
    sort: js.UndefOr[Boolean] = js.undefined
  ): Filter = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(filter)) __obj.updateDynamic("filter")(filter.get.asInstanceOf[js.Any])
    if (!js.isUndefined(search)) __obj.updateDynamic("search")(search.get.asInstanceOf[js.Any])
    if (!js.isUndefined(sort)) __obj.updateDynamic("sort")(sort.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Filter]
  }
}

