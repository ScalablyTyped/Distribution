package typings.reactNativeGestureHandler.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GestureHandlerGestureEventNativeEvent extends StObject {
  
  var handlerTag: Double
  
  var numberOfPointers: Double
  
  var state: State
}
object GestureHandlerGestureEventNativeEvent {
  
  inline def apply(handlerTag: Double, numberOfPointers: Double, state: State): GestureHandlerGestureEventNativeEvent = {
    val __obj = js.Dynamic.literal(handlerTag = handlerTag.asInstanceOf[js.Any], numberOfPointers = numberOfPointers.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[GestureHandlerGestureEventNativeEvent]
  }
  
  extension [Self <: GestureHandlerGestureEventNativeEvent](x: Self) {
    
    inline def setHandlerTag(value: Double): Self = StObject.set(x, "handlerTag", value.asInstanceOf[js.Any])
    
    inline def setNumberOfPointers(value: Double): Self = StObject.set(x, "numberOfPointers", value.asInstanceOf[js.Any])
    
    inline def setState(value: State): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
  }
}
