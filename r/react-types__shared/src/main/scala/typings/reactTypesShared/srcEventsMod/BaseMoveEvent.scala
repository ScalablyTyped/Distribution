package typings.reactTypesShared.srcEventsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BaseMoveEvent extends StObject {
  
  /** Whether the alt keyboard modifier was held during the move event. */
  var altKey: Boolean
  
  /** Whether the ctrl keyboard modifier was held during the move event. */
  var ctrlKey: Boolean
  
  /** Whether the meta keyboard modifier was held during the move event. */
  var metaKey: Boolean
  
  /** The pointer type that triggered the move event. */
  var pointerType: PointerType
  
  /** Whether the shift keyboard modifier was held during the move event. */
  var shiftKey: Boolean
}
object BaseMoveEvent {
  
  inline def apply(altKey: Boolean, ctrlKey: Boolean, metaKey: Boolean, pointerType: PointerType, shiftKey: Boolean): BaseMoveEvent = {
    val __obj = js.Dynamic.literal(altKey = altKey.asInstanceOf[js.Any], ctrlKey = ctrlKey.asInstanceOf[js.Any], metaKey = metaKey.asInstanceOf[js.Any], pointerType = pointerType.asInstanceOf[js.Any], shiftKey = shiftKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseMoveEvent]
  }
  
  extension [Self <: BaseMoveEvent](x: Self) {
    
    inline def setAltKey(value: Boolean): Self = StObject.set(x, "altKey", value.asInstanceOf[js.Any])
    
    inline def setCtrlKey(value: Boolean): Self = StObject.set(x, "ctrlKey", value.asInstanceOf[js.Any])
    
    inline def setMetaKey(value: Boolean): Self = StObject.set(x, "metaKey", value.asInstanceOf[js.Any])
    
    inline def setPointerType(value: PointerType): Self = StObject.set(x, "pointerType", value.asInstanceOf[js.Any])
    
    inline def setShiftKey(value: Boolean): Self = StObject.set(x, "shiftKey", value.asInstanceOf[js.Any])
  }
}
