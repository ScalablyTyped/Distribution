package typings
package reactDashUltimateDashPaginationLib.reactDashUltimateDashPaginationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PaginationComponentProps extends js.Object {
  /**
    * Show if `currentPage` if the same as `value` of an item (can be used to highlight a current page or disable first, previous, next or last page links when user is already on first/last page)
    */
  var isActive: scala.Boolean
  /**
    * Show if button should be disabled
    */
  var isDisabled: scala.Boolean
  /**
    * Number of pages that user should navigate to when item is activated (for items with type `PAGE` it also can be used as a label in UI)
    */
  var value: scala.Double
  /**
    * Should be called when user interacted with a component and the current page should be changed to the page represented by item (no arguments should be used, can be used for all item types)
    */
  def onClick(): scala.Unit
}

object PaginationComponentProps {
  @scala.inline
  def apply(isActive: scala.Boolean, isDisabled: scala.Boolean, onClick: () => scala.Unit, value: scala.Double): PaginationComponentProps = {
    val __obj = js.Dynamic.literal(isActive = isActive, isDisabled = isDisabled, onClick = js.Any.fromFunction0(onClick), value = value)
  
    __obj.asInstanceOf[PaginationComponentProps]
  }
}

