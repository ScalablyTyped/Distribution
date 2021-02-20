package typings.reactBeautifulDnd.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DraggableOptions extends StObject {
  
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
  implicit class DraggableOptionsMutableBuilder[Self <: DraggableOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCanDragInteractiveElements(value: Boolean): Self = StObject.set(x, "canDragInteractiveElements", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsEnabled(value: Boolean): Self = StObject.set(x, "isEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShouldRespectForcePress(value: Boolean): Self = StObject.set(x, "shouldRespectForcePress", value.asInstanceOf[js.Any])
  }
}
