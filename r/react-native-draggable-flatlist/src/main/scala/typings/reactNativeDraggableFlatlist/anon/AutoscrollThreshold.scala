package typings.reactNativeDraggableFlatlist.anon

import typings.reactNativeGestureHandler.stateMod.State
import typings.reactNativeReanimated.mod.Animated.SharedValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AutoscrollThreshold extends StObject {
  
  var activeCellSize: js.UndefOr[SharedValue[Double]] = js.undefined
  
  var autoscrollSpeed: js.UndefOr[Double] = js.undefined
  
  var autoscrollThreshold: js.UndefOr[Double] = js.undefined
  
  var hoverOffset: js.UndefOr[SharedValue[Double]] = js.undefined
  
  var isDraggingCell: js.UndefOr[SharedValue[Double]] = js.undefined
  
  var isTouchActiveNative: js.UndefOr[SharedValue[Double]] = js.undefined
  
  var panGestureState: js.UndefOr[SharedValue[State | Double]] = js.undefined
}
object AutoscrollThreshold {
  
  inline def apply(): AutoscrollThreshold = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AutoscrollThreshold]
  }
  
  extension [Self <: AutoscrollThreshold](x: Self) {
    
    inline def setActiveCellSize(value: SharedValue[Double]): Self = StObject.set(x, "activeCellSize", value.asInstanceOf[js.Any])
    
    inline def setActiveCellSizeUndefined: Self = StObject.set(x, "activeCellSize", js.undefined)
    
    inline def setAutoscrollSpeed(value: Double): Self = StObject.set(x, "autoscrollSpeed", value.asInstanceOf[js.Any])
    
    inline def setAutoscrollSpeedUndefined: Self = StObject.set(x, "autoscrollSpeed", js.undefined)
    
    inline def setAutoscrollThreshold(value: Double): Self = StObject.set(x, "autoscrollThreshold", value.asInstanceOf[js.Any])
    
    inline def setAutoscrollThresholdUndefined: Self = StObject.set(x, "autoscrollThreshold", js.undefined)
    
    inline def setHoverOffset(value: SharedValue[Double]): Self = StObject.set(x, "hoverOffset", value.asInstanceOf[js.Any])
    
    inline def setHoverOffsetUndefined: Self = StObject.set(x, "hoverOffset", js.undefined)
    
    inline def setIsDraggingCell(value: SharedValue[Double]): Self = StObject.set(x, "isDraggingCell", value.asInstanceOf[js.Any])
    
    inline def setIsDraggingCellUndefined: Self = StObject.set(x, "isDraggingCell", js.undefined)
    
    inline def setIsTouchActiveNative(value: SharedValue[Double]): Self = StObject.set(x, "isTouchActiveNative", value.asInstanceOf[js.Any])
    
    inline def setIsTouchActiveNativeUndefined: Self = StObject.set(x, "isTouchActiveNative", js.undefined)
    
    inline def setPanGestureState(value: SharedValue[State | Double]): Self = StObject.set(x, "panGestureState", value.asInstanceOf[js.Any])
    
    inline def setPanGestureStateUndefined: Self = StObject.set(x, "panGestureState", js.undefined)
  }
}
