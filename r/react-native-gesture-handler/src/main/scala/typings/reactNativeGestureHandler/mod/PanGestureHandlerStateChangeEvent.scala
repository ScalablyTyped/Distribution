package typings.reactNativeGestureHandler.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PanGestureHandlerStateChangeEvent
  extends StObject
     with GestureHandlerStateChangeEvent {
  
  @JSName("nativeEvent")
  var nativeEvent_PanGestureHandlerStateChangeEvent: GestureHandlerStateChangeNativeEvent & PanGestureHandlerEventExtra
}
object PanGestureHandlerStateChangeEvent {
  
  inline def apply(nativeEvent: GestureHandlerStateChangeNativeEvent & PanGestureHandlerEventExtra): PanGestureHandlerStateChangeEvent = {
    val __obj = js.Dynamic.literal(nativeEvent = nativeEvent.asInstanceOf[js.Any])
    __obj.asInstanceOf[PanGestureHandlerStateChangeEvent]
  }
  
  extension [Self <: PanGestureHandlerStateChangeEvent](x: Self) {
    
    inline def setNativeEvent(value: GestureHandlerStateChangeNativeEvent & PanGestureHandlerEventExtra): Self = StObject.set(x, "nativeEvent", value.asInstanceOf[js.Any])
  }
}
