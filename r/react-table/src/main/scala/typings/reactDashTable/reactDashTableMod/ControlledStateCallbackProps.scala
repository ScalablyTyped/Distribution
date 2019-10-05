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
    onExpandedChange: (/* column */ js.Any, /* event */ js.Any, /* isTouch */ Boolean) => Unit,
    onFilteredChange: (/* newFiltering */ js.Array[Filter], /* column */ js.Any, /* value */ js.Any) => Unit,
    onPageChange: /* page */ Double => Unit,
    onPageSizeChange: (/* newPageSize */ Double, /* newPage */ Double) => Unit,
    onResizedChange: (/* newResized */ js.Array[Resize], /* event */ js.Any) => Unit,
    onSortedChange: (/* newSorted */ js.Array[SortingRule], /* column */ js.Any, /* additive */ Boolean) => Unit
  ): ControlledStateCallbackProps = {
    val __obj = js.Dynamic.literal(onExpandedChange = js.Any.fromFunction3(onExpandedChange), onFilteredChange = js.Any.fromFunction3(onFilteredChange), onPageChange = js.Any.fromFunction1(onPageChange), onPageSizeChange = js.Any.fromFunction2(onPageSizeChange), onResizedChange = js.Any.fromFunction2(onResizedChange), onSortedChange = js.Any.fromFunction3(onSortedChange))
  
    __obj.asInstanceOf[ControlledStateCallbackProps]
  }
}

