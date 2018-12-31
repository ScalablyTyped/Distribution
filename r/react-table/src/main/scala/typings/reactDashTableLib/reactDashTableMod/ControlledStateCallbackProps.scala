package typings
package reactDashTableLib.reactDashTableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ControlledStateCallbackProps extends js.Object {
  /** Called when an expander is clicked. Use this to manage `expanded` */
  @JSName("onExpandedChange")
  var onExpandedChange_Original: ExpandedChangeFunction = js.native
  /**
    * Called when a user enters a value into a filter input field or the value passed
    * to the onFiltersChange handler by the Filter option.
    */
  @JSName("onFilteredChange")
  var onFilteredChange_Original: FilteredChangeFunction = js.native
  /** Called when the page index is changed by the user */
  @JSName("onPageChange")
  var onPageChange_Original: PageChangeFunction = js.native
  /**
    * Called when the pageSize is changed by the user. The resolve page is also sent
    *  to maintain approximate position in the data
    */
  @JSName("onPageSizeChange")
  var onPageSizeChange_Original: PageSizeChangeFunction = js.native
  /** Called when a user clicks on a resizing component (the right edge of a column header) */
  @JSName("onResizedChange")
  var onResizedChange_Original: ResizedChangeFunction = js.native
  /**
    * Called when a sortable column header is clicked with the column itself and if
    * the shiftkey was held. If the column is a pivoted column, `column` will be an array of columns
    */
  @JSName("onSortedChange")
  var onSortedChange_Original: SortedChangeFunction = js.native
  /** Called when an expander is clicked. Use this to manage `expanded` */
  def onExpandedChange(column: js.Any, event: js.Any, isTouch: scala.Boolean): scala.Unit = js.native
  /**
    * Called when a user enters a value into a filter input field or the value passed
    * to the onFiltersChange handler by the Filter option.
    */
  def onFilteredChange(newFiltering: js.Array[Filter], column: js.Any, value: js.Any): scala.Unit = js.native
  /** Called when the page index is changed by the user */
  def onPageChange(page: scala.Double): scala.Unit = js.native
  /**
    * Called when the pageSize is changed by the user. The resolve page is also sent
    *  to maintain approximate position in the data
    */
  def onPageSizeChange(newPageSize: scala.Double, newPage: scala.Double): scala.Unit = js.native
  /** Called when a user clicks on a resizing component (the right edge of a column header) */
  def onResizedChange(newResized: js.Array[Resize], event: js.Any): scala.Unit = js.native
  /**
    * Called when a sortable column header is clicked with the column itself and if
    * the shiftkey was held. If the column is a pivoted column, `column` will be an array of columns
    */
  def onSortedChange(newSorted: js.Array[SortingRule], column: js.Any, additive: scala.Boolean): scala.Unit = js.native
}

