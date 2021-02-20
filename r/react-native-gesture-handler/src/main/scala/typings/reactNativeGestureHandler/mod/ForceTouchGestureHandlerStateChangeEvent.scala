package typings.reactNativeGestureHandler.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ForceTouchGestureHandlerStateChangeEvent extends GestureHandlerStateChangeEvent {
  
  @JSName("nativeEvent")
  var nativeEvent_ForceTouchGestureHandlerStateChangeEvent: GestureHandlerStateChangeNativeEvent with ForceTouchGestureHandlerEventExtra = js.native
}
object ForceTouchGestureHandlerStateChangeEvent {
  
  @scala.inline
  def apply(nativeEvent: GestureHandlerStateChangeNativeEvent with ForceTouchGestureHandlerEventExtra): ForceTouchGestureHandlerStateChangeEvent = {
    val __obj = js.Dynamic.literal(nativeEvent = nativeEvent.asInstanceOf[js.Any])
    __obj.asInstanceOf[ForceTouchGestureHandlerStateChangeEvent]
  }
  
  @scala.inline
  implicit class ForceTouchGestureHandlerStateChangeEventMutableBuilder[Self <: ForceTouchGestureHandlerStateChangeEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNativeEvent(value: GestureHandlerStateChangeNativeEvent with ForceTouchGestureHandlerEventExtra): Self = StObject.set(x, "nativeEvent", value.asInstanceOf[js.Any])
  }
}
