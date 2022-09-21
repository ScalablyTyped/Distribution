package typings.reactNativeGestureHandler.interfacesMod

import typings.reactNativeGestureHandler.stateMod.State
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in string ]: react-native-gesture-handler.react-native-gesture-handler/lib/typescript/web/interfaces.TouchNativeArgs} */ trait NativeTouchEvent extends StObject {
  
  var allTouches: js.Array[PointerData]
  
  var changedTouches: js.Array[PointerData]
  
  var eventType: TouchEventType
  
  var handlerTag: Double
  
  var numberOfTouches: Double
  
  var state: State
}
object NativeTouchEvent {
  
  inline def apply(
    allTouches: js.Array[PointerData],
    changedTouches: js.Array[PointerData],
    eventType: TouchEventType,
    handlerTag: Double,
    numberOfTouches: Double,
    state: State
  ): NativeTouchEvent = {
    val __obj = js.Dynamic.literal(allTouches = allTouches.asInstanceOf[js.Any], changedTouches = changedTouches.asInstanceOf[js.Any], eventType = eventType.asInstanceOf[js.Any], handlerTag = handlerTag.asInstanceOf[js.Any], numberOfTouches = numberOfTouches.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[NativeTouchEvent]
  }
  
  extension [Self <: NativeTouchEvent](x: Self) {
    
    inline def setAllTouches(value: js.Array[PointerData]): Self = StObject.set(x, "allTouches", value.asInstanceOf[js.Any])
    
    inline def setAllTouchesVarargs(value: PointerData*): Self = StObject.set(x, "allTouches", js.Array(value*))
    
    inline def setChangedTouches(value: js.Array[PointerData]): Self = StObject.set(x, "changedTouches", value.asInstanceOf[js.Any])
    
    inline def setChangedTouchesVarargs(value: PointerData*): Self = StObject.set(x, "changedTouches", js.Array(value*))
    
    inline def setEventType(value: TouchEventType): Self = StObject.set(x, "eventType", value.asInstanceOf[js.Any])
    
    inline def setHandlerTag(value: Double): Self = StObject.set(x, "handlerTag", value.asInstanceOf[js.Any])
    
    inline def setNumberOfTouches(value: Double): Self = StObject.set(x, "numberOfTouches", value.asInstanceOf[js.Any])
    
    inline def setState(value: State): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
  }
}
