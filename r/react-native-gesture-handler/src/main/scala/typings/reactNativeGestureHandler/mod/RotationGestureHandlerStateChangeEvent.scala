package typings.reactNativeGestureHandler.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RotationGestureHandlerStateChangeEvent
  extends StObject
     with GestureHandlerStateChangeEvent {
  
  @JSName("nativeEvent")
  var nativeEvent_RotationGestureHandlerStateChangeEvent: GestureHandlerStateChangeNativeEvent & RotationGestureHandlerEventExtra
}
object RotationGestureHandlerStateChangeEvent {
  
  @scala.inline
  def apply(nativeEvent: GestureHandlerStateChangeNativeEvent & RotationGestureHandlerEventExtra): RotationGestureHandlerStateChangeEvent = {
    val __obj = js.Dynamic.literal(nativeEvent = nativeEvent.asInstanceOf[js.Any])
    __obj.asInstanceOf[RotationGestureHandlerStateChangeEvent]
  }
  
  @scala.inline
  implicit class RotationGestureHandlerStateChangeEventMutableBuilder[Self <: RotationGestureHandlerStateChangeEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNativeEvent(value: GestureHandlerStateChangeNativeEvent & RotationGestureHandlerEventExtra): Self = StObject.set(x, "nativeEvent", value.asInstanceOf[js.Any])
  }
}
