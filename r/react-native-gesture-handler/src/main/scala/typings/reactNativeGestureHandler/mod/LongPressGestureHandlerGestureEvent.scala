package typings.reactNativeGestureHandler.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LongPressGestureHandlerGestureEvent extends GestureHandlerGestureEvent {
  
  @JSName("nativeEvent")
  var nativeEvent_LongPressGestureHandlerGestureEvent: GestureHandlerGestureEventNativeEvent with LongPressGestureHandlerEventExtra = js.native
}
object LongPressGestureHandlerGestureEvent {
  
  @scala.inline
  def apply(nativeEvent: GestureHandlerGestureEventNativeEvent with LongPressGestureHandlerEventExtra): LongPressGestureHandlerGestureEvent = {
    val __obj = js.Dynamic.literal(nativeEvent = nativeEvent.asInstanceOf[js.Any])
    __obj.asInstanceOf[LongPressGestureHandlerGestureEvent]
  }
  
  @scala.inline
  implicit class LongPressGestureHandlerGestureEventMutableBuilder[Self <: LongPressGestureHandlerGestureEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNativeEvent(value: GestureHandlerGestureEventNativeEvent with LongPressGestureHandlerEventExtra): Self = StObject.set(x, "nativeEvent", value.asInstanceOf[js.Any])
  }
}
