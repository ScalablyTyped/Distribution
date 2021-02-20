package typings.reactNativeGestureHandler.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NativeViewGestureHandlerStateChangeEvent extends GestureHandlerStateChangeEvent {
  
  @JSName("nativeEvent")
  var nativeEvent_NativeViewGestureHandlerStateChangeEvent: GestureHandlerStateChangeNativeEvent with NativeViewGestureHandlerEventExtra = js.native
}
object NativeViewGestureHandlerStateChangeEvent {
  
  @scala.inline
  def apply(nativeEvent: GestureHandlerStateChangeNativeEvent with NativeViewGestureHandlerEventExtra): NativeViewGestureHandlerStateChangeEvent = {
    val __obj = js.Dynamic.literal(nativeEvent = nativeEvent.asInstanceOf[js.Any])
    __obj.asInstanceOf[NativeViewGestureHandlerStateChangeEvent]
  }
  
  @scala.inline
  implicit class NativeViewGestureHandlerStateChangeEventMutableBuilder[Self <: NativeViewGestureHandlerStateChangeEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNativeEvent(value: GestureHandlerStateChangeNativeEvent with NativeViewGestureHandlerEventExtra): Self = StObject.set(x, "nativeEvent", value.asInstanceOf[js.Any])
  }
}
