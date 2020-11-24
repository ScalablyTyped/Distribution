package typings.reactBeautifulDnd.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DraggableOptions extends js.Object {
  
  var canDragInteractiveElements: Boolean = js.native
  
  var isEnabled: Boolean = js.native
  
  var shouldRespectForcePress: Boolean = js.native
}
object DraggableOptions {
  
  @scala.inline
  def apply(canDragInteractiveElements: Boolean, isEnabled: Boolean, shouldRespectForcePress: Boolean): DraggableOptions = {
    val __obj = js.Dynamic.literal(canDragInteractiveElements = canDragInteractiveElements.asInstanceOf[js.Any], isEnabled = isEnabled.asInstanceOf[js.Any], shouldRespectForcePress = shouldRespectForcePress.asInstanceOf[js.Any])
    __obj.asInstanceOf[DraggableOptions]
  }
  
  @scala.inline
  implicit class DraggableOptionsOps[Self <: DraggableOptions] (val x: Self) extends AnyVal {
    
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
    def setCanDragInteractiveElements(value: Boolean): Self = this.set("canDragInteractiveElements", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsEnabled(value: Boolean): Self = this.set("isEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShouldRespectForcePress(value: Boolean): Self = this.set("shouldRespectForcePress", value.asInstanceOf[js.Any])
  }
}
