package typings.reactDashTable

import typings.reactDashTable.reactDashTableMod.DefaultSortTypes
import typings.reactDashTable.reactDashTableMod.SortByFn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DefaultCanSort[D /* <: js.Object */] extends js.Object {
  var defaultCanSort: Boolean
  var disableSortBy: Boolean
  var sortDescFirst: Boolean
  var sortInverted: Boolean
  var sortType: SortByFn[D] | DefaultSortTypes | String
}

object Anon_DefaultCanSort {
  @scala.inline
  def apply[D /* <: js.Object */](
    defaultCanSort: Boolean,
    disableSortBy: Boolean,
    sortDescFirst: Boolean,
    sortInverted: Boolean,
    sortType: SortByFn[D] | DefaultSortTypes | String
  ): Anon_DefaultCanSort[D] = {
    val __obj = js.Dynamic.literal(defaultCanSort = defaultCanSort.asInstanceOf[js.Any], disableSortBy = disableSortBy.asInstanceOf[js.Any], sortDescFirst = sortDescFirst.asInstanceOf[js.Any], sortInverted = sortInverted.asInstanceOf[js.Any], sortType = sortType.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_DefaultCanSort[D]]
  }
}

