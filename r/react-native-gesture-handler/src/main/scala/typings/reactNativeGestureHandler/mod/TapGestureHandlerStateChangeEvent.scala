package typings.reactNativeGestureHandler.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TapGestureHandlerStateChangeEvent
  extends StObject
     with GestureHandlerStateChangeEvent {
  
  @JSName("nativeEvent")
  var nativeEvent_TapGestureHandlerStateChangeEvent: GestureHandlerStateChangeNativeEvent & TapGestureHandlerEventExtra
}
object TapGestureHandlerStateChangeEvent {
  
  @scala.inline
  def apply(nativeEvent: GestureHandlerStateChangeNativeEvent & TapGestureHandlerEventExtra): TapGestureHandlerStateChangeEvent = {
    val __obj = js.Dynamic.literal(nativeEvent = nativeEvent.asInstanceOf[js.Any])
    __obj.asInstanceOf[TapGestureHandlerStateChangeEvent]
  }
  
  @scala.inline
  implicit class TapGestureHandlerStateChangeEventMutableBuilder[Self <: TapGestureHandlerStateChangeEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNativeEvent(value: GestureHandlerStateChangeNativeEvent & TapGestureHandlerEventExtra): Self = StObject.set(x, "nativeEvent", value.asInstanceOf[js.Any])
  }
}
