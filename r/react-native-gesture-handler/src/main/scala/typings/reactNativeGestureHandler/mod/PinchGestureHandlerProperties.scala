package typings.reactNativeGestureHandler.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PinchGestureHandlerProperties extends GestureHandlerProperties {
  
  var onGestureEvent: js.UndefOr[js.Function1[/* event */ PinchGestureHandlerGestureEvent, Unit]] = js.native
  
  var onHandlerStateChange: js.UndefOr[js.Function1[/* event */ PinchGestureHandlerStateChangeEvent, Unit]] = js.native
}
object PinchGestureHandlerProperties {
  
  @scala.inline
  def apply(): PinchGestureHandlerProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PinchGestureHandlerProperties]
  }
  
  @scala.inline
  implicit class PinchGestureHandlerPropertiesMutableBuilder[Self <: PinchGestureHandlerProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOnGestureEvent(value: /* event */ PinchGestureHandlerGestureEvent => Unit): Self = StObject.set(x, "onGestureEvent", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnGestureEventUndefined: Self = StObject.set(x, "onGestureEvent", js.undefined)
    
    @scala.inline
    def setOnHandlerStateChange(value: /* event */ PinchGestureHandlerStateChangeEvent => Unit): Self = StObject.set(x, "onHandlerStateChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnHandlerStateChangeUndefined: Self = StObject.set(x, "onHandlerStateChange", js.undefined)
  }
}
