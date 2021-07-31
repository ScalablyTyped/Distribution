package typings.reactNativeGestureHandler.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PinchGestureHandlerStateChangeEvent
  extends StObject
     with GestureHandlerStateChangeEvent {
  
  @JSName("nativeEvent")
  var nativeEvent_PinchGestureHandlerStateChangeEvent: GestureHandlerStateChangeNativeEvent & PinchGestureHandlerEventExtra
}
object PinchGestureHandlerStateChangeEvent {
  
  @scala.inline
  def apply(nativeEvent: GestureHandlerStateChangeNativeEvent & PinchGestureHandlerEventExtra): PinchGestureHandlerStateChangeEvent = {
    val __obj = js.Dynamic.literal(nativeEvent = nativeEvent.asInstanceOf[js.Any])
    __obj.asInstanceOf[PinchGestureHandlerStateChangeEvent]
  }
  
  @scala.inline
  implicit class PinchGestureHandlerStateChangeEventMutableBuilder[Self <: PinchGestureHandlerStateChangeEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNativeEvent(value: GestureHandlerStateChangeNativeEvent & PinchGestureHandlerEventExtra): Self = StObject.set(x, "nativeEvent", value.asInstanceOf[js.Any])
  }
}
