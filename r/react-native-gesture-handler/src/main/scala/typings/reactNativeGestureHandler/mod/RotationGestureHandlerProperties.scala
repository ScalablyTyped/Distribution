package typings.reactNativeGestureHandler.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RotationGestureHandlerProperties
  extends StObject
     with GestureHandlerProperties {
  
  var onGestureEvent: js.UndefOr[js.Function1[/* event */ RotationGestureHandlerGestureEvent, Unit]] = js.undefined
  
  var onHandlerStateChange: js.UndefOr[js.Function1[/* event */ RotationGestureHandlerStateChangeEvent, Unit]] = js.undefined
}
object RotationGestureHandlerProperties {
  
  @scala.inline
  def apply(): RotationGestureHandlerProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RotationGestureHandlerProperties]
  }
  
  @scala.inline
  implicit class RotationGestureHandlerPropertiesMutableBuilder[Self <: RotationGestureHandlerProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOnGestureEvent(value: /* event */ RotationGestureHandlerGestureEvent => Unit): Self = StObject.set(x, "onGestureEvent", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnGestureEventUndefined: Self = StObject.set(x, "onGestureEvent", js.undefined)
    
    @scala.inline
    def setOnHandlerStateChange(value: /* event */ RotationGestureHandlerStateChangeEvent => Unit): Self = StObject.set(x, "onHandlerStateChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnHandlerStateChangeUndefined: Self = StObject.set(x, "onHandlerStateChange", js.undefined)
  }
}
