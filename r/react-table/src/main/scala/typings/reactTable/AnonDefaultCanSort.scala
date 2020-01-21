package typings.reactTable

import typings.reactTable.mod.DefaultSortTypes
import typings.reactTable.mod.SortByFn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDefaultCanSort[D /* <: js.Object */] extends js.Object {
  var defaultCanSort: Boolean
  var disableSortBy: Boolean
  var sortDescFirst: Boolean
  var sortInverted: Boolean
  var sortType: SortByFn[D] | DefaultSortTypes | String
}

object AnonDefaultCanSort {
  @scala.inline
  def apply[D /* <: js.Object */](
    defaultCanSort: Boolean,
    disableSortBy: Boolean,
    sortDescFirst: Boolean,
    sortInverted: Boolean,
    sortType: SortByFn[D] | DefaultSortTypes | String
  ): AnonDefaultCanSort[D] = {
    val __obj = js.Dynamic.literal(defaultCanSort = defaultCanSort.asInstanceOf[js.Any], disableSortBy = disableSortBy.asInstanceOf[js.Any], sortDescFirst = sortDescFirst.asInstanceOf[js.Any], sortInverted = sortInverted.asInstanceOf[js.Any], sortType = sortType.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonDefaultCanSort[D]]
  }
}

