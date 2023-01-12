package typings.reactNativeGestureHandler.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined react-native-gesture-handler.react-native-gesture-handler/lib/typescript/web_hammer/GestureHandler.Config & {  shouldCancelWhenOutside :boolean} */
trait ConfigshouldCancelWhenOut extends StObject {
  
  var activeOffsetXEnd: js.UndefOr[Double] = js.undefined
  
  var activeOffsetXStart: js.UndefOr[Double] = js.undefined
  
  var activeOffsetYEnd: js.UndefOr[Double] = js.undefined
  
  var activeOffsetYStart: js.UndefOr[Double] = js.undefined
  
  var enabled: js.UndefOr[Boolean] = js.undefined
  
  var failOffsetXEnd: js.UndefOr[Double] = js.undefined
  
  var failOffsetXStart: js.UndefOr[Double] = js.undefined
  
  var failOffsetYEnd: js.UndefOr[Double] = js.undefined
  
  var failOffsetYStart: js.UndefOr[Double] = js.undefined
  
  var maxDist: js.UndefOr[Double] = js.undefined
  
  var maxDistSq: js.UndefOr[Double] = js.undefined
  
  var maxPointers: js.UndefOr[Double] = js.undefined
  
  var minDist: js.UndefOr[Double] = js.undefined
  
  var minDistSq: js.UndefOr[Double] = js.undefined
  
  var minPointers: js.UndefOr[Double] = js.undefined
  
  var minVelocity: js.UndefOr[Double] = js.undefined
  
  var minVelocitySq: js.UndefOr[Double] = js.undefined
  
  var shouldCancelWhenOutside: Boolean
  
  var simultaneousHandlers: js.UndefOr[js.Array[Any] | Null] = js.undefined
  
  var waitFor: js.UndefOr[js.Array[Any] | Null] = js.undefined
}
object ConfigshouldCancelWhenOut {
  
  inline def apply(shouldCancelWhenOutside: Boolean): ConfigshouldCancelWhenOut = {
    val __obj = js.Dynamic.literal(shouldCancelWhenOutside = shouldCancelWhenOutside.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConfigshouldCancelWhenOut]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ConfigshouldCancelWhenOut] (val x: Self) extends AnyVal {
    
    inline def setActiveOffsetXEnd(value: Double): Self = StObject.set(x, "activeOffsetXEnd", value.asInstanceOf[js.Any])
    
    inline def setActiveOffsetXEndUndefined: Self = StObject.set(x, "activeOffsetXEnd", js.undefined)
    
    inline def setActiveOffsetXStart(value: Double): Self = StObject.set(x, "activeOffsetXStart", value.asInstanceOf[js.Any])
    
    inline def setActiveOffsetXStartUndefined: Self = StObject.set(x, "activeOffsetXStart", js.undefined)
    
    inline def setActiveOffsetYEnd(value: Double): Self = StObject.set(x, "activeOffsetYEnd", value.asInstanceOf[js.Any])
    
    inline def setActiveOffsetYEndUndefined: Self = StObject.set(x, "activeOffsetYEnd", js.undefined)
    
    inline def setActiveOffsetYStart(value: Double): Self = StObject.set(x, "activeOffsetYStart", value.asInstanceOf[js.Any])
    
    inline def setActiveOffsetYStartUndefined: Self = StObject.set(x, "activeOffsetYStart", js.undefined)
    
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
    
    inline def setMaxDist(value: Double): Self = StObject.set(x, "maxDist", value.asInstanceOf[js.Any])
    
    inline def setMaxDistSq(value: Double): Self = StObject.set(x, "maxDistSq", value.asInstanceOf[js.Any])
    
    inline def setMaxDistSqUndefined: Self = StObject.set(x, "maxDistSq", js.undefined)
    
    inline def setMaxDistUndefined: Self = StObject.set(x, "maxDist", js.undefined)
    
    inline def setMaxPointers(value: Double): Self = StObject.set(x, "maxPointers", value.asInstanceOf[js.Any])
    
    inline def setMaxPointersUndefined: Self = StObject.set(x, "maxPointers", js.undefined)
    
    inline def setMinDist(value: Double): Self = StObject.set(x, "minDist", value.asInstanceOf[js.Any])
    
    inline def setMinDistSq(value: Double): Self = StObject.set(x, "minDistSq", value.asInstanceOf[js.Any])
    
    inline def setMinDistSqUndefined: Self = StObject.set(x, "minDistSq", js.undefined)
    
    inline def setMinDistUndefined: Self = StObject.set(x, "minDist", js.undefined)
    
    inline def setMinPointers(value: Double): Self = StObject.set(x, "minPointers", value.asInstanceOf[js.Any])
    
    inline def setMinPointersUndefined: Self = StObject.set(x, "minPointers", js.undefined)
    
    inline def setMinVelocity(value: Double): Self = StObject.set(x, "minVelocity", value.asInstanceOf[js.Any])
    
    inline def setMinVelocitySq(value: Double): Self = StObject.set(x, "minVelocitySq", value.asInstanceOf[js.Any])
    
    inline def setMinVelocitySqUndefined: Self = StObject.set(x, "minVelocitySq", js.undefined)
    
    inline def setMinVelocityUndefined: Self = StObject.set(x, "minVelocity", js.undefined)
    
    inline def setShouldCancelWhenOutside(value: Boolean): Self = StObject.set(x, "shouldCancelWhenOutside", value.asInstanceOf[js.Any])
    
    inline def setSimultaneousHandlers(value: js.Array[Any]): Self = StObject.set(x, "simultaneousHandlers", value.asInstanceOf[js.Any])
    
    inline def setSimultaneousHandlersNull: Self = StObject.set(x, "simultaneousHandlers", null)
    
    inline def setSimultaneousHandlersUndefined: Self = StObject.set(x, "simultaneousHandlers", js.undefined)
    
    inline def setSimultaneousHandlersVarargs(value: Any*): Self = StObject.set(x, "simultaneousHandlers", js.Array(value*))
    
    inline def setWaitFor(value: js.Array[Any]): Self = StObject.set(x, "waitFor", value.asInstanceOf[js.Any])
    
    inline def setWaitForNull: Self = StObject.set(x, "waitFor", null)
    
    inline def setWaitForUndefined: Self = StObject.set(x, "waitFor", js.undefined)
    
    inline def setWaitForVarargs(value: Any*): Self = StObject.set(x, "waitFor", js.Array(value*))
  }
}
