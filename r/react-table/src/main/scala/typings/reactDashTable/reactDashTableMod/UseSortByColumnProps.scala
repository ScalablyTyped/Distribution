package typings.reactDashTable.reactDashTableMod

import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UseSortByColumnProps[D /* <: js.Object */] extends js.Object {
  var canSort: Boolean = js.native
  var isSorted: Boolean = js.native
  var isSortedDesc: js.UndefOr[Boolean] = js.native
  var sortedIndex: Double = js.native
  def clearSorting(): Unit = js.native
  def getSortByToggleProps(): TableSortByToggleProps = js.native
  def getSortByToggleProps(props: Partial[TableSortByToggleProps]): TableSortByToggleProps = js.native
  def toggleSortBy(descending: Boolean, multi: Boolean): Unit = js.native
}

