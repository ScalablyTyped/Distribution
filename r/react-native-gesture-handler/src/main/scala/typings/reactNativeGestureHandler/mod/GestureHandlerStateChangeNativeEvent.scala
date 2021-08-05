package typings.reactNativeGestureHandler.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GestureHandlerStateChangeNativeEvent extends StObject {
  
  var handlerTag: Double
  
  var numberOfPointers: Double
  
  var oldState: State
  
  var state: State
}
object GestureHandlerStateChangeNativeEvent {
  
  inline def apply(handlerTag: Double, numberOfPointers: Double, oldState: State, state: State): GestureHandlerStateChangeNativeEvent = {
    val __obj = js.Dynamic.literal(handlerTag = handlerTag.asInstanceOf[js.Any], numberOfPointers = numberOfPointers.asInstanceOf[js.Any], oldState = oldState.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[GestureHandlerStateChangeNativeEvent]
  }
  
  extension [Self <: GestureHandlerStateChangeNativeEvent](x: Self) {
    
    inline def setHandlerTag(value: Double): Self = StObject.set(x, "handlerTag", value.asInstanceOf[js.Any])
    
    inline def setNumberOfPointers(value: Double): Self = StObject.set(x, "numberOfPointers", value.asInstanceOf[js.Any])
    
    inline def setOldState(value: State): Self = StObject.set(x, "oldState", value.asInstanceOf[js.Any])
    
    inline def setState(value: State): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
  }
}
