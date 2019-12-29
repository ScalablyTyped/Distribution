package typings.reactDashTable.reactDashTableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UseFiltersInstanceProps[D /* <: js.Object */] extends js.Object {
  var preFilteredRows: js.Array[Row[D]] = js.native
  var rows: js.Array[Row[D]] = js.native
  def setAllFilters(updater: js.Function1[/* filters */ Filters[D], Filters[D]]): Unit = js.native
  def setAllFilters(updater: Filters[D]): Unit = js.native
  def setFilter(columnId: IdType[D], updater: js.Function1[/* filterValue */ FilterValue, FilterValue]): Unit = js.native
  def setFilter(columnId: IdType[D], updater: FilterValue): Unit = js.native
}

