package typings.reactNativeGestureHandler.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RotationGestureHandlerGestureEvent
  extends StObject
     with GestureHandlerGestureEvent {
  
  @JSName("nativeEvent")
  var nativeEvent_RotationGestureHandlerGestureEvent: GestureHandlerGestureEventNativeEvent & RotationGestureHandlerEventExtra
}
object RotationGestureHandlerGestureEvent {
  
  inline def apply(nativeEvent: GestureHandlerGestureEventNativeEvent & RotationGestureHandlerEventExtra): RotationGestureHandlerGestureEvent = {
    val __obj = js.Dynamic.literal(nativeEvent = nativeEvent.asInstanceOf[js.Any])
    __obj.asInstanceOf[RotationGestureHandlerGestureEvent]
  }
  
  extension [Self <: RotationGestureHandlerGestureEvent](x: Self) {
    
    inline def setNativeEvent(value: GestureHandlerGestureEventNativeEvent & RotationGestureHandlerEventExtra): Self = StObject.set(x, "nativeEvent", value.asInstanceOf[js.Any])
  }
}
