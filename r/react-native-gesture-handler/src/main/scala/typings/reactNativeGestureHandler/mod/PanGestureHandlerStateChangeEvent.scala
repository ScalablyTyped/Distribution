package typings.reactNativeGestureHandler.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PanGestureHandlerStateChangeEvent extends GestureHandlerStateChangeEvent {
  
  @JSName("nativeEvent")
  var nativeEvent_PanGestureHandlerStateChangeEvent: GestureHandlerStateChangeNativeEvent with PanGestureHandlerEventExtra = js.native
}
object PanGestureHandlerStateChangeEvent {
  
  @scala.inline
  def apply(nativeEvent: GestureHandlerStateChangeNativeEvent with PanGestureHandlerEventExtra): PanGestureHandlerStateChangeEvent = {
    val __obj = js.Dynamic.literal(nativeEvent = nativeEvent.asInstanceOf[js.Any])
    __obj.asInstanceOf[PanGestureHandlerStateChangeEvent]
  }
  
  @scala.inline
  implicit class PanGestureHandlerStateChangeEventMutableBuilder[Self <: PanGestureHandlerStateChangeEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNativeEvent(value: GestureHandlerStateChangeNativeEvent with PanGestureHandlerEventExtra): Self = StObject.set(x, "nativeEvent", value.asInstanceOf[js.Any])
  }
}
