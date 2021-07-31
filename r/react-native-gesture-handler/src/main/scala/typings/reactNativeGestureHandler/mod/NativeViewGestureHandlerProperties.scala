package typings.reactNativeGestureHandler.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NativeViewGestureHandlerProperties
  extends StObject
     with GestureHandlerProperties {
  
  var disallowInterruption: js.UndefOr[Boolean] = js.undefined
  
  var onGestureEvent: js.UndefOr[js.Function1[/* event */ NativeViewGestureHandlerGestureEvent, Unit]] = js.undefined
  
  var onHandlerStateChange: js.UndefOr[js.Function1[/* event */ NativeViewGestureHandlerStateChangeEvent, Unit]] = js.undefined
  
  var shouldActivateOnStart: js.UndefOr[Boolean] = js.undefined
}
object NativeViewGestureHandlerProperties {
  
  @scala.inline
  def apply(): NativeViewGestureHandlerProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NativeViewGestureHandlerProperties]
  }
  
  @scala.inline
  implicit class NativeViewGestureHandlerPropertiesMutableBuilder[Self <: NativeViewGestureHandlerProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDisallowInterruption(value: Boolean): Self = StObject.set(x, "disallowInterruption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisallowInterruptionUndefined: Self = StObject.set(x, "disallowInterruption", js.undefined)
    
    @scala.inline
    def setOnGestureEvent(value: /* event */ NativeViewGestureHandlerGestureEvent => Unit): Self = StObject.set(x, "onGestureEvent", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnGestureEventUndefined: Self = StObject.set(x, "onGestureEvent", js.undefined)
    
    @scala.inline
    def setOnHandlerStateChange(value: /* event */ NativeViewGestureHandlerStateChangeEvent => Unit): Self = StObject.set(x, "onHandlerStateChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnHandlerStateChangeUndefined: Self = StObject.set(x, "onHandlerStateChange", js.undefined)
    
    @scala.inline
    def setShouldActivateOnStart(value: Boolean): Self = StObject.set(x, "shouldActivateOnStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShouldActivateOnStartUndefined: Self = StObject.set(x, "shouldActivateOnStart", js.undefined)
  }
}
