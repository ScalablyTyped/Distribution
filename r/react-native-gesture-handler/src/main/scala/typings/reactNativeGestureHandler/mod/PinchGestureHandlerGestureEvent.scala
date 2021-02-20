package typings.reactNativeGestureHandler.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PinchGestureHandlerGestureEvent extends GestureHandlerGestureEvent {
  
  @JSName("nativeEvent")
  var nativeEvent_PinchGestureHandlerGestureEvent: GestureHandlerGestureEventNativeEvent with PinchGestureHandlerEventExtra = js.native
}
object PinchGestureHandlerGestureEvent {
  
  @scala.inline
  def apply(nativeEvent: GestureHandlerGestureEventNativeEvent with PinchGestureHandlerEventExtra): PinchGestureHandlerGestureEvent = {
    val __obj = js.Dynamic.literal(nativeEvent = nativeEvent.asInstanceOf[js.Any])
    __obj.asInstanceOf[PinchGestureHandlerGestureEvent]
  }
  
  @scala.inline
  implicit class PinchGestureHandlerGestureEventMutableBuilder[Self <: PinchGestureHandlerGestureEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNativeEvent(value: GestureHandlerGestureEventNativeEvent with PinchGestureHandlerEventExtra): Self = StObject.set(x, "nativeEvent", value.asInstanceOf[js.Any])
  }
}
