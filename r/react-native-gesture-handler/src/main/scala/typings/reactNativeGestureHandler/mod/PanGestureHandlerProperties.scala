package typings.reactNativeGestureHandler.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PanGestureHandlerProperties extends GestureHandlerProperties {
  
  var activeOffsetX: js.UndefOr[Double | js.Array[Double]] = js.native
  
  var activeOffsetY: js.UndefOr[Double | js.Array[Double]] = js.native
  
  var avgTouches: js.UndefOr[Boolean] = js.native
  
  var failOffsetX: js.UndefOr[Double | js.Array[Double]] = js.native
  
  var failOffsetY: js.UndefOr[Double | js.Array[Double]] = js.native
  
  /** @deprecated  use failOffsetX*/
  var maxDeltaX: js.UndefOr[Double] = js.native
  
  /** @deprecated  use failOffsetY*/
  var maxDeltaY: js.UndefOr[Double] = js.native
  
  var maxPointers: js.UndefOr[Double] = js.native
  
  /** @deprecated  use activeOffsetX*/
  var minDeltaX: js.UndefOr[Double] = js.native
  
  /** @deprecated  use activeOffsetY*/
  var minDeltaY: js.UndefOr[Double] = js.native
  
  var minDist: js.UndefOr[Double] = js.native
  
  /** @deprecated  use activeOffsetX*/
  var minOffsetX: js.UndefOr[Double] = js.native
  
  /** @deprecated  use failOffsetY*/
  var minOffsetY: js.UndefOr[Double] = js.native
  
  var minPointers: js.UndefOr[Double] = js.native
  
  var minVelocity: js.UndefOr[Double] = js.native
  
  var minVelocityX: js.UndefOr[Double] = js.native
  
  var minVelocityY: js.UndefOr[Double] = js.native
  
  var onGestureEvent: js.UndefOr[js.Function1[/* event */ PanGestureHandlerGestureEvent, Unit]] = js.native
  
  var onHandlerStateChange: js.UndefOr[js.Function1[/* event */ PanGestureHandlerStateChangeEvent, Unit]] = js.native
}
object PanGestureHandlerProperties {
  
  @scala.inline
  def apply(): PanGestureHandlerProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PanGestureHandlerProperties]
  }
  
  @scala.inline
  implicit class PanGestureHandlerPropertiesMutableBuilder[Self <: PanGestureHandlerProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActiveOffsetX(value: Double | js.Array[Double]): Self = StObject.set(x, "activeOffsetX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActiveOffsetXUndefined: Self = StObject.set(x, "activeOffsetX", js.undefined)
    
    @scala.inline
    def setActiveOffsetXVarargs(value: Double*): Self = StObject.set(x, "activeOffsetX", js.Array(value :_*))
    
    @scala.inline
    def setActiveOffsetY(value: Double | js.Array[Double]): Self = StObject.set(x, "activeOffsetY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActiveOffsetYUndefined: Self = StObject.set(x, "activeOffsetY", js.undefined)
    
    @scala.inline
    def setActiveOffsetYVarargs(value: Double*): Self = StObject.set(x, "activeOffsetY", js.Array(value :_*))
    
    @scala.inline
    def setAvgTouches(value: Boolean): Self = StObject.set(x, "avgTouches", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAvgTouchesUndefined: Self = StObject.set(x, "avgTouches", js.undefined)
    
    @scala.inline
    def setFailOffsetX(value: Double | js.Array[Double]): Self = StObject.set(x, "failOffsetX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFailOffsetXUndefined: Self = StObject.set(x, "failOffsetX", js.undefined)
    
    @scala.inline
    def setFailOffsetXVarargs(value: Double*): Self = StObject.set(x, "failOffsetX", js.Array(value :_*))
    
    @scala.inline
    def setFailOffsetY(value: Double | js.Array[Double]): Self = StObject.set(x, "failOffsetY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFailOffsetYUndefined: Self = StObject.set(x, "failOffsetY", js.undefined)
    
    @scala.inline
    def setFailOffsetYVarargs(value: Double*): Self = StObject.set(x, "failOffsetY", js.Array(value :_*))
    
    @scala.inline
    def setMaxDeltaX(value: Double): Self = StObject.set(x, "maxDeltaX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxDeltaXUndefined: Self = StObject.set(x, "maxDeltaX", js.undefined)
    
    @scala.inline
    def setMaxDeltaY(value: Double): Self = StObject.set(x, "maxDeltaY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxDeltaYUndefined: Self = StObject.set(x, "maxDeltaY", js.undefined)
    
    @scala.inline
    def setMaxPointers(value: Double): Self = StObject.set(x, "maxPointers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxPointersUndefined: Self = StObject.set(x, "maxPointers", js.undefined)
    
    @scala.inline
    def setMinDeltaX(value: Double): Self = StObject.set(x, "minDeltaX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinDeltaXUndefined: Self = StObject.set(x, "minDeltaX", js.undefined)
    
    @scala.inline
    def setMinDeltaY(value: Double): Self = StObject.set(x, "minDeltaY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinDeltaYUndefined: Self = StObject.set(x, "minDeltaY", js.undefined)
    
    @scala.inline
    def setMinDist(value: Double): Self = StObject.set(x, "minDist", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinDistUndefined: Self = StObject.set(x, "minDist", js.undefined)
    
    @scala.inline
    def setMinOffsetX(value: Double): Self = StObject.set(x, "minOffsetX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinOffsetXUndefined: Self = StObject.set(x, "minOffsetX", js.undefined)
    
    @scala.inline
    def setMinOffsetY(value: Double): Self = StObject.set(x, "minOffsetY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinOffsetYUndefined: Self = StObject.set(x, "minOffsetY", js.undefined)
    
    @scala.inline
    def setMinPointers(value: Double): Self = StObject.set(x, "minPointers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinPointersUndefined: Self = StObject.set(x, "minPointers", js.undefined)
    
    @scala.inline
    def setMinVelocity(value: Double): Self = StObject.set(x, "minVelocity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinVelocityUndefined: Self = StObject.set(x, "minVelocity", js.undefined)
    
    @scala.inline
    def setMinVelocityX(value: Double): Self = StObject.set(x, "minVelocityX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinVelocityXUndefined: Self = StObject.set(x, "minVelocityX", js.undefined)
    
    @scala.inline
    def setMinVelocityY(value: Double): Self = StObject.set(x, "minVelocityY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinVelocityYUndefined: Self = StObject.set(x, "minVelocityY", js.undefined)
    
    @scala.inline
    def setOnGestureEvent(value: /* event */ PanGestureHandlerGestureEvent => Unit): Self = StObject.set(x, "onGestureEvent", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnGestureEventUndefined: Self = StObject.set(x, "onGestureEvent", js.undefined)
    
    @scala.inline
    def setOnHandlerStateChange(value: /* event */ PanGestureHandlerStateChangeEvent => Unit): Self = StObject.set(x, "onHandlerStateChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnHandlerStateChangeUndefined: Self = StObject.set(x, "onHandlerStateChange", js.undefined)
  }
}
