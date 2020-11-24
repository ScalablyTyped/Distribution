package typings.reactUltimatePagination.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PaginationComponentProps extends js.Object {
  
  /**
    * Show if `currentPage` if the same as `value` of an item (can be used to highlight a current page or disable first, previous, next or last page links when user is already on first/last page)
    */
  var isActive: Boolean = js.native
  
  /**
    * Show if button should be disabled
    */
  var isDisabled: Boolean = js.native
  
  /**
    * Should be called when user interacted with a component and the current page should be changed to the page represented by item (no arguments should be used, can be used for all item types)
    */
  def onClick(): Unit = js.native
  
  /**
    * Number of pages that user should navigate to when item is activated (for items with type `PAGE` it also can be used as a label in UI)
    */
  var value: Double = js.native
}
object PaginationComponentProps {
  
  @scala.inline
  def apply(isActive: Boolean, isDisabled: Boolean, onClick: () => Unit, value: Double): PaginationComponentProps = {
    val __obj = js.Dynamic.literal(isActive = isActive.asInstanceOf[js.Any], isDisabled = isDisabled.asInstanceOf[js.Any], onClick = js.Any.fromFunction0(onClick), value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaginationComponentProps]
  }
  
  @scala.inline
  implicit class PaginationComponentPropsOps[Self <: PaginationComponentProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setIsActive(value: Boolean): Self = this.set("isActive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsDisabled(value: Boolean): Self = this.set("isDisabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnClick(value: () => Unit): Self = this.set("onClick", js.Any.fromFunction0(value))
    
    @scala.inline
    def setValue(value: Double): Self = this.set("value", value.asInstanceOf[js.Any])
  }
}
