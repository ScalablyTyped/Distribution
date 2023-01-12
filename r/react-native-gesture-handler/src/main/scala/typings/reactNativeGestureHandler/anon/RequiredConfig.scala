package typings.reactNativeGestureHandler.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Required<react-native-gesture-handler.react-native-gesture-handler/lib/typescript/web_hammer/GestureHandler.Config> */
trait RequiredConfig extends StObject {
  
  var activeOffsetXEnd: Double
  
  var activeOffsetXStart: Double
  
  var activeOffsetYEnd: Double
  
  var activeOffsetYStart: Double
  
  var enabled: Boolean
  
  var failOffsetXEnd: Double
  
  var failOffsetXStart: Double
  
  var failOffsetYEnd: Double
  
  var failOffsetYStart: Double
  
  var maxDist: Double
  
  var maxDistSq: Double
  
  var maxPointers: Double
  
  var minDist: Double
  
  var minDistSq: Double
  
  var minPointers: Double
  
  var minVelocity: Double
  
  var minVelocitySq: Double
  
  var simultaneousHandlers: js.Array[Any]
  
  var waitFor: js.Array[Any]
}
object RequiredConfig {
  
  inline def apply(
    activeOffsetXEnd: Double,
    activeOffsetXStart: Double,
    activeOffsetYEnd: Double,
    activeOffsetYStart: Double,
    enabled: Boolean,
    failOffsetXEnd: Double,
    failOffsetXStart: Double,
    failOffsetYEnd: Double,
    failOffsetYStart: Double,
    maxDist: Double,
    maxDistSq: Double,
    maxPointers: Double,
    minDist: Double,
    minDistSq: Double,
    minPointers: Double,
    minVelocity: Double,
    minVelocitySq: Double,
    simultaneousHandlers: js.Array[Any],
    waitFor: js.Array[Any]
  ): RequiredConfig = {
    val __obj = js.Dynamic.literal(activeOffsetXEnd = activeOffsetXEnd.asInstanceOf[js.Any], activeOffsetXStart = activeOffsetXStart.asInstanceOf[js.Any], activeOffsetYEnd = activeOffsetYEnd.asInstanceOf[js.Any], activeOffsetYStart = activeOffsetYStart.asInstanceOf[js.Any], enabled = enabled.asInstanceOf[js.Any], failOffsetXEnd = failOffsetXEnd.asInstanceOf[js.Any], failOffsetXStart = failOffsetXStart.asInstanceOf[js.Any], failOffsetYEnd = failOffsetYEnd.asInstanceOf[js.Any], failOffsetYStart = failOffsetYStart.asInstanceOf[js.Any], maxDist = maxDist.asInstanceOf[js.Any], maxDistSq = maxDistSq.asInstanceOf[js.Any], maxPointers = maxPointers.asInstanceOf[js.Any], minDist = minDist.asInstanceOf[js.Any], minDistSq = minDistSq.asInstanceOf[js.Any], minPointers = minPointers.asInstanceOf[js.Any], minVelocity = minVelocity.asInstanceOf[js.Any], minVelocitySq = minVelocitySq.asInstanceOf[js.Any], simultaneousHandlers = simultaneousHandlers.asInstanceOf[js.Any], waitFor = waitFor.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequiredConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RequiredConfig] (val x: Self) extends AnyVal {
    
    inline def setActiveOffsetXEnd(value: Double): Self = StObject.set(x, "activeOffsetXEnd", value.asInstanceOf[js.Any])
    
    inline def setActiveOffsetXStart(value: Double): Self = StObject.set(x, "activeOffsetXStart", value.asInstanceOf[js.Any])
    
    inline def setActiveOffsetYEnd(value: Double): Self = StObject.set(x, "activeOffsetYEnd", value.asInstanceOf[js.Any])
    
    inline def setActiveOffsetYStart(value: Double): Self = StObject.set(x, "activeOffsetYStart", value.asInstanceOf[js.Any])
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setFailOffsetXEnd(value: Double): Self = StObject.set(x, "failOffsetXEnd", value.asInstanceOf[js.Any])
    
    inline def setFailOffsetXStart(value: Double): Self = StObject.set(x, "failOffsetXStart", value.asInstanceOf[js.Any])
    
    inline def setFailOffsetYEnd(value: Double): Self = StObject.set(x, "failOffsetYEnd", value.asInstanceOf[js.Any])
    
    inline def setFailOffsetYStart(value: Double): Self = StObject.set(x, "failOffsetYStart", value.asInstanceOf[js.Any])
    
    inline def setMaxDist(value: Double): Self = StObject.set(x, "maxDist", value.asInstanceOf[js.Any])
    
    inline def setMaxDistSq(value: Double): Self = StObject.set(x, "maxDistSq", value.asInstanceOf[js.Any])
    
    inline def setMaxPointers(value: Double): Self = StObject.set(x, "maxPointers", value.asInstanceOf[js.Any])
    
    inline def setMinDist(value: Double): Self = StObject.set(x, "minDist", value.asInstanceOf[js.Any])
    
    inline def setMinDistSq(value: Double): Self = StObject.set(x, "minDistSq", value.asInstanceOf[js.Any])
    
    inline def setMinPointers(value: Double): Self = StObject.set(x, "minPointers", value.asInstanceOf[js.Any])
    
    inline def setMinVelocity(value: Double): Self = StObject.set(x, "minVelocity", value.asInstanceOf[js.Any])
    
    inline def setMinVelocitySq(value: Double): Self = StObject.set(x, "minVelocitySq", value.asInstanceOf[js.Any])
    
    inline def setSimultaneousHandlers(value: js.Array[Any]): Self = StObject.set(x, "simultaneousHandlers", value.asInstanceOf[js.Any])
    
    inline def setSimultaneousHandlersVarargs(value: Any*): Self = StObject.set(x, "simultaneousHandlers", js.Array(value*))
    
    inline def setWaitFor(value: js.Array[Any]): Self = StObject.set(x, "waitFor", value.asInstanceOf[js.Any])
    
    inline def setWaitForVarargs(value: Any*): Self = StObject.set(x, "waitFor", js.Array(value*))
  }
}
