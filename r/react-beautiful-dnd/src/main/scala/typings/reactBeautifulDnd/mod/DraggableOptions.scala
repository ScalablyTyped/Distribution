package typings.reactBeautifulDnd.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DraggableOptions extends StObject {
  
  var canDragInteractiveElements: Boolean
  
  var isEnabled: Boolean
  
  var shouldRespectForcePress: Boolean
}
object DraggableOptions {
  
  inline def apply(canDragInteractiveElements: Boolean, isEnabled: Boolean, shouldRespectForcePress: Boolean): DraggableOptions = {
    val __obj = js.Dynamic.literal(canDragInteractiveElements = canDragInteractiveElements.asInstanceOf[js.Any], isEnabled = isEnabled.asInstanceOf[js.Any], shouldRespectForcePress = shouldRespectForcePress.asInstanceOf[js.Any])
    __obj.asInstanceOf[DraggableOptions]
  }
  
  extension [Self <: DraggableOptions](x: Self) {
    
    inline def setCanDragInteractiveElements(value: Boolean): Self = StObject.set(x, "canDragInteractiveElements", value.asInstanceOf[js.Any])
    
    inline def setIsEnabled(value: Boolean): Self = StObject.set(x, "isEnabled", value.asInstanceOf[js.Any])
    
    inline def setShouldRespectForcePress(value: Boolean): Self = StObject.set(x, "shouldRespectForcePress", value.asInstanceOf[js.Any])
  }
}
