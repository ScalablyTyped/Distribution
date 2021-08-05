package typings.reactNativeGestureHandler.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PanGestureHandlerGestureEvent
  extends StObject
     with GestureHandlerGestureEvent {
  
  @JSName("nativeEvent")
  var nativeEvent_PanGestureHandlerGestureEvent: GestureHandlerGestureEventNativeEvent & PanGestureHandlerEventExtra
}
object PanGestureHandlerGestureEvent {
  
  inline def apply(nativeEvent: GestureHandlerGestureEventNativeEvent & PanGestureHandlerEventExtra): PanGestureHandlerGestureEvent = {
    val __obj = js.Dynamic.literal(nativeEvent = nativeEvent.asInstanceOf[js.Any])
    __obj.asInstanceOf[PanGestureHandlerGestureEvent]
  }
  
  extension [Self <: PanGestureHandlerGestureEvent](x: Self) {
    
    inline def setNativeEvent(value: GestureHandlerGestureEventNativeEvent & PanGestureHandlerEventExtra): Self = StObject.set(x, "nativeEvent", value.asInstanceOf[js.Any])
  }
}
