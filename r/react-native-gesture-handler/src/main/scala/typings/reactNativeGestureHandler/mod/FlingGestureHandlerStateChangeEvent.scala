package typings.reactNativeGestureHandler.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FlingGestureHandlerStateChangeEvent extends GestureHandlerStateChangeEvent {
  
  @JSName("nativeEvent")
  var nativeEvent_FlingGestureHandlerStateChangeEvent: GestureHandlerStateChangeNativeEvent with FlingGestureHandlerEventExtra = js.native
}
object FlingGestureHandlerStateChangeEvent {
  
  @scala.inline
  def apply(nativeEvent: GestureHandlerStateChangeNativeEvent with FlingGestureHandlerEventExtra): FlingGestureHandlerStateChangeEvent = {
    val __obj = js.Dynamic.literal(nativeEvent = nativeEvent.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlingGestureHandlerStateChangeEvent]
  }
  
  @scala.inline
  implicit class FlingGestureHandlerStateChangeEventMutableBuilder[Self <: FlingGestureHandlerStateChangeEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNativeEvent(value: GestureHandlerStateChangeNativeEvent with FlingGestureHandlerEventExtra): Self = StObject.set(x, "nativeEvent", value.asInstanceOf[js.Any])
  }
}
