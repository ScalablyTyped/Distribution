package typings.reactNativeGestureHandler.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PinchGestureHandlerGestureEvent
  extends StObject
     with GestureHandlerGestureEvent {
  
  @JSName("nativeEvent")
  var nativeEvent_PinchGestureHandlerGestureEvent: GestureHandlerGestureEventNativeEvent & PinchGestureHandlerEventExtra
}
object PinchGestureHandlerGestureEvent {
  
  @scala.inline
  def apply(nativeEvent: GestureHandlerGestureEventNativeEvent & PinchGestureHandlerEventExtra): PinchGestureHandlerGestureEvent = {
    val __obj = js.Dynamic.literal(nativeEvent = nativeEvent.asInstanceOf[js.Any])
    __obj.asInstanceOf[PinchGestureHandlerGestureEvent]
  }
  
  @scala.inline
  implicit class PinchGestureHandlerGestureEventMutableBuilder[Self <: PinchGestureHandlerGestureEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNativeEvent(value: GestureHandlerGestureEventNativeEvent & PinchGestureHandlerEventExtra): Self = StObject.set(x, "nativeEvent", value.asInstanceOf[js.Any])
  }
}
