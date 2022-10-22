package typings.reactNativeGestureHandler.libTypescriptWebInterfacesMod

import typings.reactNativeGestureHandler.libTypescriptDirectionsMod.Directions
import typings.reactNativeGestureHandler.libTypescriptHandlersGestureHandlerCommonMod.UserSelect
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in string ]: react-native-gesture-handler.react-native-gesture-handler/lib/typescript/web/interfaces.ConfigArgs} */ trait Config extends StObject {
  
  var activateAfterLongPress: js.UndefOr[Double] = js.undefined
  
  var activeOffsetXEnd: js.UndefOr[Double] = js.undefined
  
  var activeOffsetXStart: js.UndefOr[Double] = js.undefined
  
  var activeOffsetYEnd: js.UndefOr[Double] = js.undefined
  
  var activeOffsetYStart: js.UndefOr[Double] = js.undefined
  
  var direction: js.UndefOr[Directions] = js.undefined
  
  var disallowInterruption: js.UndefOr[Boolean] = js.undefined
  
  var enabled: js.UndefOr[Boolean] = js.undefined
  
  var failOffsetXEnd: js.UndefOr[Double] = js.undefined
  
  var failOffsetXStart: js.UndefOr[Double] = js.undefined
  
  var failOffsetYEnd: js.UndefOr[Double] = js.undefined
  
  var failOffsetYStart: js.UndefOr[Double] = js.undefined
  
  var hitSlop: js.UndefOr[HitSlop] = js.undefined
  
  var maxDelayMs: js.UndefOr[Double] = js.undefined
  
  var maxDeltaX: js.UndefOr[Double] = js.undefined
  
  var maxDeltaY: js.UndefOr[Double] = js.undefined
  
  var maxDist: js.UndefOr[Double] = js.undefined
  
  var maxDistSq: js.UndefOr[Double] = js.undefined
  
  var maxDurationMs: js.UndefOr[Double] = js.undefined
  
  var maxPointers: js.UndefOr[Double] = js.undefined
  
  var minDist: js.UndefOr[Double] = js.undefined
  
  var minDistSq: js.UndefOr[Double] = js.undefined
  
  var minDurationMs: js.UndefOr[Double] = js.undefined
  
  var minPointers: js.UndefOr[Double] = js.undefined
  
  var minVelocity: js.UndefOr[Double] = js.undefined
  
  var minVelocitySq: js.UndefOr[Double] = js.undefined
  
  var minVelocityX: js.UndefOr[Double] = js.undefined
  
  var minVelocityY: js.UndefOr[Double] = js.undefined
  
  var numberOfPointers: js.UndefOr[Double] = js.undefined
  
  var numberOfTaps: js.UndefOr[Double] = js.undefined
  
  var shouldActivateOnStart: js.UndefOr[Boolean] = js.undefined
  
  var shouldCancelWhenOutside: js.UndefOr[Boolean] = js.undefined
  
  var simultaneousHandlers: js.UndefOr[js.Array[Handler] | Null] = js.undefined
  
  var userSelect: js.UndefOr[UserSelect] = js.undefined
  
  var waitFor: js.UndefOr[js.Array[Handler] | Null] = js.undefined
}
object Config {
  
  inline def apply(): Config = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Config]
  }
  
  extension [Self <: Config](x: Self) {
    
    inline def setActivateAfterLongPress(value: Double): Self = StObject.set(x, "activateAfterLongPress", value.asInstanceOf[js.Any])
    
    inline def setActivateAfterLongPressUndefined: Self = StObject.set(x, "activateAfterLongPress", js.undefined)
    
    inline def setActiveOffsetXEnd(value: Double): Self = StObject.set(x, "activeOffsetXEnd", value.asInstanceOf[js.Any])
    
    inline def setActiveOffsetXEndUndefined: Self = StObject.set(x, "activeOffsetXEnd", js.undefined)
    
    inline def setActiveOffsetXStart(value: Double): Self = StObject.set(x, "activeOffsetXStart", value.asInstanceOf[js.Any])
    
    inline def setActiveOffsetXStartUndefined: Self = StObject.set(x, "activeOffsetXStart", js.undefined)
    
    inline def setActiveOffsetYEnd(value: Double): Self = StObject.set(x, "activeOffsetYEnd", value.asInstanceOf[js.Any])
    
    inline def setActiveOffsetYEndUndefined: Self = StObject.set(x, "activeOffsetYEnd", js.undefined)
    
    inline def setActiveOffsetYStart(value: Double): Self = StObject.set(x, "activeOffsetYStart", value.asInstanceOf[js.Any])
    
    inline def setActiveOffsetYStartUndefined: Self = StObject.set(x, "activeOffsetYStart", js.undefined)
    
    inline def setDirection(value: Directions): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
    
    inline def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
    
    inline def setDisallowInterruption(value: Boolean): Self = StObject.set(x, "disallowInterruption", value.asInstanceOf[js.Any])
    
    inline def setDisallowInterruptionUndefined: Self = StObject.set(x, "disallowInterruption", js.undefined)
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    inline def setFailOffsetXEnd(value: Double): Self = StObject.set(x, "failOffsetXEnd", value.asInstanceOf[js.Any])
    
    inline def setFailOffsetXEndUndefined: Self = StObject.set(x, "failOffsetXEnd", js.undefined)
    
    inline def setFailOffsetXStart(value: Double): Self = StObject.set(x, "failOffsetXStart", value.asInstanceOf[js.Any])
    
    inline def setFailOffsetXStartUndefined: Self = StObject.set(x, "failOffsetXStart", js.undefined)
    
    inline def setFailOffsetYEnd(value: Double): Self = StObject.set(x, "failOffsetYEnd", value.asInstanceOf[js.Any])
    
    inline def setFailOffsetYEndUndefined: Self = StObject.set(x, "failOffsetYEnd", js.undefined)
    
    inline def setFailOffsetYStart(value: Double): Self = StObject.set(x, "failOffsetYStart", value.asInstanceOf[js.Any])
    
    inline def setFailOffsetYStartUndefined: Self = StObject.set(x, "failOffsetYStart", js.undefined)
    
    inline def setHitSlop(value: HitSlop): Self = StObject.set(x, "hitSlop", value.asInstanceOf[js.Any])
    
    inline def setHitSlopUndefined: Self = StObject.set(x, "hitSlop", js.undefined)
    
    inline def setMaxDelayMs(value: Double): Self = StObject.set(x, "maxDelayMs", value.asInstanceOf[js.Any])
    
    inline def setMaxDelayMsUndefined: Self = StObject.set(x, "maxDelayMs", js.undefined)
    
    inline def setMaxDeltaX(value: Double): Self = StObject.set(x, "maxDeltaX", value.asInstanceOf[js.Any])
    
    inline def setMaxDeltaXUndefined: Self = StObject.set(x, "maxDeltaX", js.undefined)
    
    inline def setMaxDeltaY(value: Double): Self = StObject.set(x, "maxDeltaY", value.asInstanceOf[js.Any])
    
    inline def setMaxDeltaYUndefined: Self = StObject.set(x, "maxDeltaY", js.undefined)
    
    inline def setMaxDist(value: Double): Self = StObject.set(x, "maxDist", value.asInstanceOf[js.Any])
    
    inline def setMaxDistSq(value: Double): Self = StObject.set(x, "maxDistSq", value.asInstanceOf[js.Any])
    
    inline def setMaxDistSqUndefined: Self = StObject.set(x, "maxDistSq", js.undefined)
    
    inline def setMaxDistUndefined: Self = StObject.set(x, "maxDist", js.undefined)
    
    inline def setMaxDurationMs(value: Double): Self = StObject.set(x, "maxDurationMs", value.asInstanceOf[js.Any])
    
    inline def setMaxDurationMsUndefined: Self = StObject.set(x, "maxDurationMs", js.undefined)
    
    inline def setMaxPointers(value: Double): Self = StObject.set(x, "maxPointers", value.asInstanceOf[js.Any])
    
    inline def setMaxPointersUndefined: Self = StObject.set(x, "maxPointers", js.undefined)
    
    inline def setMinDist(value: Double): Self = StObject.set(x, "minDist", value.asInstanceOf[js.Any])
    
    inline def setMinDistSq(value: Double): Self = StObject.set(x, "minDistSq", value.asInstanceOf[js.Any])
    
    inline def setMinDistSqUndefined: Self = StObject.set(x, "minDistSq", js.undefined)
    
    inline def setMinDistUndefined: Self = StObject.set(x, "minDist", js.undefined)
    
    inline def setMinDurationMs(value: Double): Self = StObject.set(x, "minDurationMs", value.asInstanceOf[js.Any])
    
    inline def setMinDurationMsUndefined: Self = StObject.set(x, "minDurationMs", js.undefined)
    
    inline def setMinPointers(value: Double): Self = StObject.set(x, "minPointers", value.asInstanceOf[js.Any])
    
    inline def setMinPointersUndefined: Self = StObject.set(x, "minPointers", js.undefined)
    
    inline def setMinVelocity(value: Double): Self = StObject.set(x, "minVelocity", value.asInstanceOf[js.Any])
    
    inline def setMinVelocitySq(value: Double): Self = StObject.set(x, "minVelocitySq", value.asInstanceOf[js.Any])
    
    inline def setMinVelocitySqUndefined: Self = StObject.set(x, "minVelocitySq", js.undefined)
    
    inline def setMinVelocityUndefined: Self = StObject.set(x, "minVelocity", js.undefined)
    
    inline def setMinVelocityX(value: Double): Self = StObject.set(x, "minVelocityX", value.asInstanceOf[js.Any])
    
    inline def setMinVelocityXUndefined: Self = StObject.set(x, "minVelocityX", js.undefined)
    
    inline def setMinVelocityY(value: Double): Self = StObject.set(x, "minVelocityY", value.asInstanceOf[js.Any])
    
    inline def setMinVelocityYUndefined: Self = StObject.set(x, "minVelocityY", js.undefined)
    
    inline def setNumberOfPointers(value: Double): Self = StObject.set(x, "numberOfPointers", value.asInstanceOf[js.Any])
    
    inline def setNumberOfPointersUndefined: Self = StObject.set(x, "numberOfPointers", js.undefined)
    
    inline def setNumberOfTaps(value: Double): Self = StObject.set(x, "numberOfTaps", value.asInstanceOf[js.Any])
    
    inline def setNumberOfTapsUndefined: Self = StObject.set(x, "numberOfTaps", js.undefined)
    
    inline def setShouldActivateOnStart(value: Boolean): Self = StObject.set(x, "shouldActivateOnStart", value.asInstanceOf[js.Any])
    
    inline def setShouldActivateOnStartUndefined: Self = StObject.set(x, "shouldActivateOnStart", js.undefined)
    
    inline def setShouldCancelWhenOutside(value: Boolean): Self = StObject.set(x, "shouldCancelWhenOutside", value.asInstanceOf[js.Any])
    
    inline def setShouldCancelWhenOutsideUndefined: Self = StObject.set(x, "shouldCancelWhenOutside", js.undefined)
    
    inline def setSimultaneousHandlers(value: js.Array[Handler]): Self = StObject.set(x, "simultaneousHandlers", value.asInstanceOf[js.Any])
    
    inline def setSimultaneousHandlersNull: Self = StObject.set(x, "simultaneousHandlers", null)
    
    inline def setSimultaneousHandlersUndefined: Self = StObject.set(x, "simultaneousHandlers", js.undefined)
    
    inline def setSimultaneousHandlersVarargs(value: Handler*): Self = StObject.set(x, "simultaneousHandlers", js.Array(value*))
    
    inline def setUserSelect(value: UserSelect): Self = StObject.set(x, "userSelect", value.asInstanceOf[js.Any])
    
    inline def setUserSelectUndefined: Self = StObject.set(x, "userSelect", js.undefined)
    
    inline def setWaitFor(value: js.Array[Handler]): Self = StObject.set(x, "waitFor", value.asInstanceOf[js.Any])
    
    inline def setWaitForNull: Self = StObject.set(x, "waitFor", null)
    
    inline def setWaitForUndefined: Self = StObject.set(x, "waitFor", js.undefined)
    
    inline def setWaitForVarargs(value: Handler*): Self = StObject.set(x, "waitFor", js.Array(value*))
  }
}
