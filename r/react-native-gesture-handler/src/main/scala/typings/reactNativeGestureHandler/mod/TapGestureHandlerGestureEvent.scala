package typings.reactNativeGestureHandler.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TapGestureHandlerGestureEvent
  extends StObject
     with GestureHandlerGestureEvent {
  
  @JSName("nativeEvent")
  var nativeEvent_TapGestureHandlerGestureEvent: GestureHandlerGestureEventNativeEvent & TapGestureHandlerEventExtra
}
object TapGestureHandlerGestureEvent {
  
  @scala.inline
  def apply(nativeEvent: GestureHandlerGestureEventNativeEvent & TapGestureHandlerEventExtra): TapGestureHandlerGestureEvent = {
    val __obj = js.Dynamic.literal(nativeEvent = nativeEvent.asInstanceOf[js.Any])
    __obj.asInstanceOf[TapGestureHandlerGestureEvent]
  }
  
  @scala.inline
  implicit class TapGestureHandlerGestureEventMutableBuilder[Self <: TapGestureHandlerGestureEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNativeEvent(value: GestureHandlerGestureEventNativeEvent & TapGestureHandlerEventExtra): Self = StObject.set(x, "nativeEvent", value.asInstanceOf[js.Any])
  }
}
