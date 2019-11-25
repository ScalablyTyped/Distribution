package typings.reactDashUltimateDashPagination.reactDashUltimateDashPaginationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PaginationComponentProps extends js.Object {
  /**
    * Show if `currentPage` if the same as `value` of an item (can be used to highlight a current page or disable first, previous, next or last page links when user is already on first/last page)
    */
  var isActive: Boolean
  /**
    * Show if button should be disabled
    */
  var isDisabled: Boolean
  /**
    * Number of pages that user should navigate to when item is activated (for items with type `PAGE` it also can be used as a label in UI)
    */
  var value: Double
  /**
    * Should be called when user interacted with a component and the current page should be changed to the page represented by item (no arguments should be used, can be used for all item types)
    */
  def onClick(): Unit
}

object PaginationComponentProps {
  @scala.inline
  def apply(isActive: Boolean, isDisabled: Boolean, onClick: () => Unit, value: Double): PaginationComponentProps = {
    val __obj = js.Dynamic.literal(isActive = isActive.asInstanceOf[js.Any], isDisabled = isDisabled.asInstanceOf[js.Any], onClick = js.Any.fromFunction0(onClick), value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PaginationComponentProps]
  }
}

