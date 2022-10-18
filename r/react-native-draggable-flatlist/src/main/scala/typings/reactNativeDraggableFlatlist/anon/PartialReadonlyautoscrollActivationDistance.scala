package typings.reactNativeDraggableFlatlist.anon

import typings.reactNativeGestureHandler.libTypescriptHandlersGestureHandlerCommonMod.HitSlop
import typings.reactNativeReanimated.mod.WithSpringConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<std.Readonly<{  autoscrollThreshold :number,   autoscrollSpeed :number,   animationConfig :react-native-reanimated.react-native-reanimated.WithSpringConfig,   scrollEnabled :boolean,   dragHitSlop :react-native-gesture-handler.react-native-gesture-handler/lib/typescript/handlers/gestureHandlerCommon.HitSlop | undefined,   activationDistance :number,   dragItemOverflow :boolean}>> */
trait PartialReadonlyautoscrollActivationDistance extends StObject {
  
  var activationDistance: js.UndefOr[Double] = js.undefined
  
  var animationConfig: js.UndefOr[WithSpringConfig] = js.undefined
  
  var autoscrollSpeed: js.UndefOr[Double] = js.undefined
  
  var autoscrollThreshold: js.UndefOr[Double] = js.undefined
  
  var dragHitSlop: js.UndefOr[HitSlop] = js.undefined
  
  var dragItemOverflow: js.UndefOr[Boolean] = js.undefined
  
  var scrollEnabled: js.UndefOr[Boolean] = js.undefined
}
object PartialReadonlyautoscrollActivationDistance {
  
  inline def apply(): PartialReadonlyautoscrollActivationDistance = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialReadonlyautoscrollActivationDistance]
  }
  
  extension [Self <: PartialReadonlyautoscrollActivationDistance](x: Self) {
    
    inline def setActivationDistance(value: Double): Self = StObject.set(x, "activationDistance", value.asInstanceOf[js.Any])
    
    inline def setActivationDistanceUndefined: Self = StObject.set(x, "activationDistance", js.undefined)
    
    inline def setAnimationConfig(value: WithSpringConfig): Self = StObject.set(x, "animationConfig", value.asInstanceOf[js.Any])
    
    inline def setAnimationConfigUndefined: Self = StObject.set(x, "animationConfig", js.undefined)
    
    inline def setAutoscrollSpeed(value: Double): Self = StObject.set(x, "autoscrollSpeed", value.asInstanceOf[js.Any])
    
    inline def setAutoscrollSpeedUndefined: Self = StObject.set(x, "autoscrollSpeed", js.undefined)
    
    inline def setAutoscrollThreshold(value: Double): Self = StObject.set(x, "autoscrollThreshold", value.asInstanceOf[js.Any])
    
    inline def setAutoscrollThresholdUndefined: Self = StObject.set(x, "autoscrollThreshold", js.undefined)
    
    inline def setDragHitSlop(value: HitSlop): Self = StObject.set(x, "dragHitSlop", value.asInstanceOf[js.Any])
    
    inline def setDragHitSlopUndefined: Self = StObject.set(x, "dragHitSlop", js.undefined)
    
    inline def setDragItemOverflow(value: Boolean): Self = StObject.set(x, "dragItemOverflow", value.asInstanceOf[js.Any])
    
    inline def setDragItemOverflowUndefined: Self = StObject.set(x, "dragItemOverflow", js.undefined)
    
    inline def setScrollEnabled(value: Boolean): Self = StObject.set(x, "scrollEnabled", value.asInstanceOf[js.Any])
    
    inline def setScrollEnabledUndefined: Self = StObject.set(x, "scrollEnabled", js.undefined)
  }
}
