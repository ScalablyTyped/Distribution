package typings.reactNativeGestureHandler.interfacesMod

import typings.std.TouchList
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AdaptedEvent extends StObject {
  
  var allTouches: js.UndefOr[TouchList] = js.undefined
  
  var buttons: Double
  
  var changedTouches: js.UndefOr[TouchList] = js.undefined
  
  var eventType: EventTypes
  
  var offsetX: Double
  
  var offsetY: Double
  
  var pointerId: Double
  
  var pointerType: PointerType
  
  var time: Double
  
  var touchEventType: js.UndefOr[TouchEventType] = js.undefined
  
  var x: Double
  
  var y: Double
}
object AdaptedEvent {
  
  inline def apply(
    buttons: Double,
    eventType: EventTypes,
    offsetX: Double,
    offsetY: Double,
    pointerId: Double,
    pointerType: PointerType,
    time: Double,
    x: Double,
    y: Double
  ): AdaptedEvent = {
    val __obj = js.Dynamic.literal(buttons = buttons.asInstanceOf[js.Any], eventType = eventType.asInstanceOf[js.Any], offsetX = offsetX.asInstanceOf[js.Any], offsetY = offsetY.asInstanceOf[js.Any], pointerId = pointerId.asInstanceOf[js.Any], pointerType = pointerType.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[AdaptedEvent]
  }
  
  extension [Self <: AdaptedEvent](x: Self) {
    
    inline def setAllTouches(value: TouchList): Self = StObject.set(x, "allTouches", value.asInstanceOf[js.Any])
    
    inline def setAllTouchesUndefined: Self = StObject.set(x, "allTouches", js.undefined)
    
    inline def setButtons(value: Double): Self = StObject.set(x, "buttons", value.asInstanceOf[js.Any])
    
    inline def setChangedTouches(value: TouchList): Self = StObject.set(x, "changedTouches", value.asInstanceOf[js.Any])
    
    inline def setChangedTouchesUndefined: Self = StObject.set(x, "changedTouches", js.undefined)
    
    inline def setEventType(value: EventTypes): Self = StObject.set(x, "eventType", value.asInstanceOf[js.Any])
    
    inline def setOffsetX(value: Double): Self = StObject.set(x, "offsetX", value.asInstanceOf[js.Any])
    
    inline def setOffsetY(value: Double): Self = StObject.set(x, "offsetY", value.asInstanceOf[js.Any])
    
    inline def setPointerId(value: Double): Self = StObject.set(x, "pointerId", value.asInstanceOf[js.Any])
    
    inline def setPointerType(value: PointerType): Self = StObject.set(x, "pointerType", value.asInstanceOf[js.Any])
    
    inline def setTime(value: Double): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
    
    inline def setTouchEventType(value: TouchEventType): Self = StObject.set(x, "touchEventType", value.asInstanceOf[js.Any])
    
    inline def setTouchEventTypeUndefined: Self = StObject.set(x, "touchEventType", js.undefined)
    
    inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
  }
}
