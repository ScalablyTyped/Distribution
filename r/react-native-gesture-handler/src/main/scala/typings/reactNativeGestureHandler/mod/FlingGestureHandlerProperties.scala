package typings.reactNativeGestureHandler.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FlingGestureHandlerProperties extends GestureHandlerProperties {
  
  var direction: js.UndefOr[Double] = js.native
  
  var numberOfPointers: js.UndefOr[Double] = js.native
  
  var onGestureEvent: js.UndefOr[js.Function1[/* event */ FlingGestureHandlerGestureEvent, Unit]] = js.native
  
  var onHandlerStateChange: js.UndefOr[js.Function1[/* event */ FlingGestureHandlerStateChangeEvent, Unit]] = js.native
}
object FlingGestureHandlerProperties {
  
  @scala.inline
  def apply(): FlingGestureHandlerProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FlingGestureHandlerProperties]
  }
  
  @scala.inline
  implicit class FlingGestureHandlerPropertiesMutableBuilder[Self <: FlingGestureHandlerProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDirection(value: Double): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
    
    @scala.inline
    def setNumberOfPointers(value: Double): Self = StObject.set(x, "numberOfPointers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumberOfPointersUndefined: Self = StObject.set(x, "numberOfPointers", js.undefined)
    
    @scala.inline
    def setOnGestureEvent(value: /* event */ FlingGestureHandlerGestureEvent => Unit): Self = StObject.set(x, "onGestureEvent", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnGestureEventUndefined: Self = StObject.set(x, "onGestureEvent", js.undefined)
    
    @scala.inline
    def setOnHandlerStateChange(value: /* event */ FlingGestureHandlerStateChangeEvent => Unit): Self = StObject.set(x, "onHandlerStateChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnHandlerStateChangeUndefined: Self = StObject.set(x, "onHandlerStateChange", js.undefined)
  }
}
