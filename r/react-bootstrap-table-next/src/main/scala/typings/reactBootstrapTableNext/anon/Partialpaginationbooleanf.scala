package typings.reactBootstrapTableNext.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<{  pagination  :boolean,   filter  :boolean,   sort  :boolean,   cellEdit  :boolean,   search  :boolean}> */
trait Partialpaginationbooleanf extends js.Object {
  var cellEdit: js.UndefOr[Boolean] = js.undefined
  var filter: js.UndefOr[Boolean] = js.undefined
  var pagination: js.UndefOr[Boolean] = js.undefined
  var search: js.UndefOr[Boolean] = js.undefined
  var sort: js.UndefOr[Boolean] = js.undefined
}

object Partialpaginationbooleanf {
  @scala.inline
  def apply(
    cellEdit: js.UndefOr[Boolean] = js.undefined,
    filter: js.UndefOr[Boolean] = js.undefined,
    pagination: js.UndefOr[Boolean] = js.undefined,
    search: js.UndefOr[Boolean] = js.undefined,
    sort: js.UndefOr[Boolean] = js.undefined
  ): Partialpaginationbooleanf = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cellEdit)) __obj.updateDynamic("cellEdit")(cellEdit.get.asInstanceOf[js.Any])
    if (!js.isUndefined(filter)) __obj.updateDynamic("filter")(filter.get.asInstanceOf[js.Any])
    if (!js.isUndefined(pagination)) __obj.updateDynamic("pagination")(pagination.get.asInstanceOf[js.Any])
    if (!js.isUndefined(search)) __obj.updateDynamic("search")(search.get.asInstanceOf[js.Any])
    if (!js.isUndefined(sort)) __obj.updateDynamic("sort")(sort.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Partialpaginationbooleanf]
  }
}

