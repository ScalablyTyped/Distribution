package typings.reactBootstrapTableNext

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<{  pagination  :boolean,   filter  :boolean,   sort  :boolean,   cellEdit  :boolean}> */
trait Partialpaginationbooleanf extends js.Object {
  var cellEdit: js.UndefOr[Boolean] = js.undefined
  var filter: js.UndefOr[Boolean] = js.undefined
  var pagination: js.UndefOr[Boolean] = js.undefined
  var sort: js.UndefOr[Boolean] = js.undefined
}

object Partialpaginationbooleanf {
  @scala.inline
  def apply(
    cellEdit: js.UndefOr[Boolean] = js.undefined,
    filter: js.UndefOr[Boolean] = js.undefined,
    pagination: js.UndefOr[Boolean] = js.undefined,
    sort: js.UndefOr[Boolean] = js.undefined
  ): Partialpaginationbooleanf = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cellEdit)) __obj.updateDynamic("cellEdit")(cellEdit.asInstanceOf[js.Any])
    if (!js.isUndefined(filter)) __obj.updateDynamic("filter")(filter.asInstanceOf[js.Any])
    if (!js.isUndefined(pagination)) __obj.updateDynamic("pagination")(pagination.asInstanceOf[js.Any])
    if (!js.isUndefined(sort)) __obj.updateDynamic("sort")(sort.asInstanceOf[js.Any])
    __obj.asInstanceOf[Partialpaginationbooleanf]
  }
}

