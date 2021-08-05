package typings.reactNativeGestureHandler.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ForceTouchGestureHandlerGestureEvent
  extends StObject
     with GestureHandlerGestureEvent {
  
  @JSName("nativeEvent")
  var nativeEvent_ForceTouchGestureHandlerGestureEvent: GestureHandlerGestureEventNativeEvent & ForceTouchGestureHandlerEventExtra
}
object ForceTouchGestureHandlerGestureEvent {
  
  inline def apply(nativeEvent: GestureHandlerGestureEventNativeEvent & ForceTouchGestureHandlerEventExtra): ForceTouchGestureHandlerGestureEvent = {
    val __obj = js.Dynamic.literal(nativeEvent = nativeEvent.asInstanceOf[js.Any])
    __obj.asInstanceOf[ForceTouchGestureHandlerGestureEvent]
  }
  
  extension [Self <: ForceTouchGestureHandlerGestureEvent](x: Self) {
    
    inline def setNativeEvent(value: GestureHandlerGestureEventNativeEvent & ForceTouchGestureHandlerEventExtra): Self = StObject.set(x, "nativeEvent", value.asInstanceOf[js.Any])
  }
}
