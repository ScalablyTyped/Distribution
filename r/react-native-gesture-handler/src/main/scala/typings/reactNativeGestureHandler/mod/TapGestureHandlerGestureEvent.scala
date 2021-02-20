package typings.reactNativeGestureHandler.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TapGestureHandlerGestureEvent extends GestureHandlerGestureEvent {
  
  @JSName("nativeEvent")
  var nativeEvent_TapGestureHandlerGestureEvent: GestureHandlerGestureEventNativeEvent with TapGestureHandlerEventExtra = js.native
}
object TapGestureHandlerGestureEvent {
  
  @scala.inline
  def apply(nativeEvent: GestureHandlerGestureEventNativeEvent with TapGestureHandlerEventExtra): TapGestureHandlerGestureEvent = {
    val __obj = js.Dynamic.literal(nativeEvent = nativeEvent.asInstanceOf[js.Any])
    __obj.asInstanceOf[TapGestureHandlerGestureEvent]
  }
  
  @scala.inline
  implicit class TapGestureHandlerGestureEventMutableBuilder[Self <: TapGestureHandlerGestureEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNativeEvent(value: GestureHandlerGestureEventNativeEvent with TapGestureHandlerEventExtra): Self = StObject.set(x, "nativeEvent", value.asInstanceOf[js.Any])
  }
}
