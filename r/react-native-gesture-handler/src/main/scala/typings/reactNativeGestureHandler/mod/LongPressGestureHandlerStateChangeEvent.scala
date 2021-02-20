package typings.reactNativeGestureHandler.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LongPressGestureHandlerStateChangeEvent extends GestureHandlerStateChangeEvent {
  
  @JSName("nativeEvent")
  var nativeEvent_LongPressGestureHandlerStateChangeEvent: GestureHandlerStateChangeNativeEvent with LongPressGestureHandlerEventExtra = js.native
}
object LongPressGestureHandlerStateChangeEvent {
  
  @scala.inline
  def apply(nativeEvent: GestureHandlerStateChangeNativeEvent with LongPressGestureHandlerEventExtra): LongPressGestureHandlerStateChangeEvent = {
    val __obj = js.Dynamic.literal(nativeEvent = nativeEvent.asInstanceOf[js.Any])
    __obj.asInstanceOf[LongPressGestureHandlerStateChangeEvent]
  }
  
  @scala.inline
  implicit class LongPressGestureHandlerStateChangeEventMutableBuilder[Self <: LongPressGestureHandlerStateChangeEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNativeEvent(value: GestureHandlerStateChangeNativeEvent with LongPressGestureHandlerEventExtra): Self = StObject.set(x, "nativeEvent", value.asInstanceOf[js.Any])
  }
}
