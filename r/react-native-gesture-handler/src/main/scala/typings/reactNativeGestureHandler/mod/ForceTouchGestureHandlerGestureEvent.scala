package typings.reactNativeGestureHandler.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ForceTouchGestureHandlerGestureEvent extends GestureHandlerGestureEvent {
  
  @JSName("nativeEvent")
  var nativeEvent_ForceTouchGestureHandlerGestureEvent: GestureHandlerGestureEventNativeEvent with ForceTouchGestureHandlerEventExtra = js.native
}
object ForceTouchGestureHandlerGestureEvent {
  
  @scala.inline
  def apply(nativeEvent: GestureHandlerGestureEventNativeEvent with ForceTouchGestureHandlerEventExtra): ForceTouchGestureHandlerGestureEvent = {
    val __obj = js.Dynamic.literal(nativeEvent = nativeEvent.asInstanceOf[js.Any])
    __obj.asInstanceOf[ForceTouchGestureHandlerGestureEvent]
  }
  
  @scala.inline
  implicit class ForceTouchGestureHandlerGestureEventMutableBuilder[Self <: ForceTouchGestureHandlerGestureEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNativeEvent(value: GestureHandlerGestureEventNativeEvent with ForceTouchGestureHandlerEventExtra): Self = StObject.set(x, "nativeEvent", value.asInstanceOf[js.Any])
  }
}
