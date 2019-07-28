package typings.reactDashTable.reactDashTableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ControlledStateCallbackProps extends js.Object {
  /** Called when an expander is clicked. Use this to manage `expanded` */
  var onExpandedChange: ExpandedChangeFunction
  /**
    * Called when a user enters a value into a filter input field or the value passed
    * to the onFiltersChange handler by the Filter option.
    */
  var onFilteredChange: FilteredChangeFunction
  /** Called when the page index is changed by the user */
  var onPageChange: PageChangeFunction
  /**
    * Called when the pageSize is changed by the user. The resolve page is also sent
    *  to maintain approximate position in the data
    */
  var onPageSizeChange: PageSizeChangeFunction
  /** Called when a user clicks on a resizing component (the right edge of a column header) */
  var onResizedChange: ResizedChangeFunction
  /**
    * Called when a sortable column header is clicked with the column itself and if
    * the shiftkey was held. If the column is a pivoted column, `column` will be an array of columns
    */
  var onSortedChange: SortedChangeFunction
}

object ControlledStateCallbackProps {
  @scala.inline
  def apply(
    onExpandedChange: ExpandedChangeFunction,
    onFilteredChange: FilteredChangeFunction,
    onPageChange: PageChangeFunction,
    onPageSizeChange: PageSizeChangeFunction,
    onResizedChange: ResizedChangeFunction,
    onSortedChange: SortedChangeFunction
  ): ControlledStateCallbackProps = {
    val __obj = js.Dynamic.literal(onExpandedChange = onExpandedChange, onFilteredChange = onFilteredChange, onPageChange = onPageChange, onPageSizeChange = onPageSizeChange, onResizedChange = onResizedChange, onSortedChange = onSortedChange)
  
    __obj.asInstanceOf[ControlledStateCallbackProps]
  }
}

