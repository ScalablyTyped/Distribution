package typings.reactTable.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UseFiltersColumnProps[D /* <: js.Object */] extends js.Object {
  var canFilter: Boolean = js.native
  var filterValue: FilterValue = js.native
  var filteredRows: js.Array[Row[D]] = js.native
  var preFilteredRows: js.Array[Row[D]] = js.native
  def setFilter(updater: js.Function1[/* filterValue */ FilterValue, FilterValue]): Unit = js.native
  def setFilter(updater: FilterValue): Unit = js.native
}

