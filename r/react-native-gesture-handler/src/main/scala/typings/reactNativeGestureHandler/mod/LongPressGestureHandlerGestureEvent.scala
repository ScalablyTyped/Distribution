package typings.reactNativeGestureHandler.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LongPressGestureHandlerGestureEvent
  extends StObject
     with GestureHandlerGestureEvent {
  
  @JSName("nativeEvent")
  var nativeEvent_LongPressGestureHandlerGestureEvent: GestureHandlerGestureEventNativeEvent & LongPressGestureHandlerEventExtra
}
object LongPressGestureHandlerGestureEvent {
  
  @scala.inline
  def apply(nativeEvent: GestureHandlerGestureEventNativeEvent & LongPressGestureHandlerEventExtra): LongPressGestureHandlerGestureEvent = {
    val __obj = js.Dynamic.literal(nativeEvent = nativeEvent.asInstanceOf[js.Any])
    __obj.asInstanceOf[LongPressGestureHandlerGestureEvent]
  }
  
  @scala.inline
  implicit class LongPressGestureHandlerGestureEventMutableBuilder[Self <: LongPressGestureHandlerGestureEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNativeEvent(value: GestureHandlerGestureEventNativeEvent & LongPressGestureHandlerEventExtra): Self = StObject.set(x, "nativeEvent", value.asInstanceOf[js.Any])
  }
}
