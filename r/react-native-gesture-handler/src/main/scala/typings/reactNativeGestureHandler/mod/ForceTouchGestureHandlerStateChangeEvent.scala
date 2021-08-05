package typings.reactNativeGestureHandler.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ForceTouchGestureHandlerStateChangeEvent
  extends StObject
     with GestureHandlerStateChangeEvent {
  
  @JSName("nativeEvent")
  var nativeEvent_ForceTouchGestureHandlerStateChangeEvent: GestureHandlerStateChangeNativeEvent & ForceTouchGestureHandlerEventExtra
}
object ForceTouchGestureHandlerStateChangeEvent {
  
  inline def apply(nativeEvent: GestureHandlerStateChangeNativeEvent & ForceTouchGestureHandlerEventExtra): ForceTouchGestureHandlerStateChangeEvent = {
    val __obj = js.Dynamic.literal(nativeEvent = nativeEvent.asInstanceOf[js.Any])
    __obj.asInstanceOf[ForceTouchGestureHandlerStateChangeEvent]
  }
  
  extension [Self <: ForceTouchGestureHandlerStateChangeEvent](x: Self) {
    
    inline def setNativeEvent(value: GestureHandlerStateChangeNativeEvent & ForceTouchGestureHandlerEventExtra): Self = StObject.set(x, "nativeEvent", value.asInstanceOf[js.Any])
  }
}
