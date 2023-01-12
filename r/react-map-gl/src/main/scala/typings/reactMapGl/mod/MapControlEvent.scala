package typings.reactMapGl.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MapControlEvent extends StObject {
  
  var center: Center
  
  var delta: js.UndefOr[Double] = js.undefined
  
  var key: js.UndefOr[Double] = js.undefined
  
  var leftButton: js.UndefOr[Boolean] = js.undefined
  
  var middleButton: js.UndefOr[Boolean] = js.undefined
  
  var offsetCenter: Center
  
  var pointerType: js.UndefOr[String] = js.undefined
  
  var rightButton: js.UndefOr[Boolean] = js.undefined
  
  var srcEvent: Any
  
  var target: Any
  
  var `type`: String
}
object MapControlEvent {
  
  inline def apply(center: Center, offsetCenter: Center, srcEvent: Any, target: Any, `type`: String): MapControlEvent = {
    val __obj = js.Dynamic.literal(center = center.asInstanceOf[js.Any], offsetCenter = offsetCenter.asInstanceOf[js.Any], srcEvent = srcEvent.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MapControlEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MapControlEvent] (val x: Self) extends AnyVal {
    
    inline def setCenter(value: Center): Self = StObject.set(x, "center", value.asInstanceOf[js.Any])
    
    inline def setDelta(value: Double): Self = StObject.set(x, "delta", value.asInstanceOf[js.Any])
    
    inline def setDeltaUndefined: Self = StObject.set(x, "delta", js.undefined)
    
    inline def setKey(value: Double): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    inline def setLeftButton(value: Boolean): Self = StObject.set(x, "leftButton", value.asInstanceOf[js.Any])
    
    inline def setLeftButtonUndefined: Self = StObject.set(x, "leftButton", js.undefined)
    
    inline def setMiddleButton(value: Boolean): Self = StObject.set(x, "middleButton", value.asInstanceOf[js.Any])
    
    inline def setMiddleButtonUndefined: Self = StObject.set(x, "middleButton", js.undefined)
    
    inline def setOffsetCenter(value: Center): Self = StObject.set(x, "offsetCenter", value.asInstanceOf[js.Any])
    
    inline def setPointerType(value: String): Self = StObject.set(x, "pointerType", value.asInstanceOf[js.Any])
    
    inline def setPointerTypeUndefined: Self = StObject.set(x, "pointerType", js.undefined)
    
    inline def setRightButton(value: Boolean): Self = StObject.set(x, "rightButton", value.asInstanceOf[js.Any])
    
    inline def setRightButtonUndefined: Self = StObject.set(x, "rightButton", js.undefined)
    
    inline def setSrcEvent(value: Any): Self = StObject.set(x, "srcEvent", value.asInstanceOf[js.Any])
    
    inline def setTarget(value: Any): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
