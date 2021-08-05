package typings.reactNativeGestureHandler.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ForceTouchGestureHandlerProperties
  extends StObject
     with GestureHandlerProperties {
  
  var feedbackOnActivation: js.UndefOr[Boolean] = js.undefined
  
  var maxForce: js.UndefOr[Double] = js.undefined
  
  var minForce: js.UndefOr[Double] = js.undefined
  
  var onGestureEvent: js.UndefOr[js.Function1[/* event */ ForceTouchGestureHandlerGestureEvent, Unit]] = js.undefined
  
  var onHandlerStateChange: js.UndefOr[js.Function1[/* event */ ForceTouchGestureHandlerStateChangeEvent, Unit]] = js.undefined
}
object ForceTouchGestureHandlerProperties {
  
  inline def apply(): ForceTouchGestureHandlerProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ForceTouchGestureHandlerProperties]
  }
  
  extension [Self <: ForceTouchGestureHandlerProperties](x: Self) {
    
    inline def setFeedbackOnActivation(value: Boolean): Self = StObject.set(x, "feedbackOnActivation", value.asInstanceOf[js.Any])
    
    inline def setFeedbackOnActivationUndefined: Self = StObject.set(x, "feedbackOnActivation", js.undefined)
    
    inline def setMaxForce(value: Double): Self = StObject.set(x, "maxForce", value.asInstanceOf[js.Any])
    
    inline def setMaxForceUndefined: Self = StObject.set(x, "maxForce", js.undefined)
    
    inline def setMinForce(value: Double): Self = StObject.set(x, "minForce", value.asInstanceOf[js.Any])
    
    inline def setMinForceUndefined: Self = StObject.set(x, "minForce", js.undefined)
    
    inline def setOnGestureEvent(value: /* event */ ForceTouchGestureHandlerGestureEvent => Unit): Self = StObject.set(x, "onGestureEvent", js.Any.fromFunction1(value))
    
    inline def setOnGestureEventUndefined: Self = StObject.set(x, "onGestureEvent", js.undefined)
    
    inline def setOnHandlerStateChange(value: /* event */ ForceTouchGestureHandlerStateChangeEvent => Unit): Self = StObject.set(x, "onHandlerStateChange", js.Any.fromFunction1(value))
    
    inline def setOnHandlerStateChangeUndefined: Self = StObject.set(x, "onHandlerStateChange", js.undefined)
  }
}
