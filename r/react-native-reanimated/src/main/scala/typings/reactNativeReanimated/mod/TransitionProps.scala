package typings.reactNativeReanimated.mod

import typings.reactNativeReanimated.reactNativeReanimatedStrings.bottom
import typings.reactNativeReanimated.reactNativeReanimatedStrings.easeIn
import typings.reactNativeReanimated.reactNativeReanimatedStrings.easeInOut
import typings.reactNativeReanimated.reactNativeReanimatedStrings.easeOut
import typings.reactNativeReanimated.reactNativeReanimatedStrings.left
import typings.reactNativeReanimated.reactNativeReanimatedStrings.linear
import typings.reactNativeReanimated.reactNativeReanimatedStrings.right
import typings.reactNativeReanimated.reactNativeReanimatedStrings.top
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TransitionProps extends StObject {
  
  var delayMs: js.UndefOr[Double] = js.undefined
  
  var durationMs: js.UndefOr[Double] = js.undefined
  
  var interpolation: js.UndefOr[linear | easeIn | easeOut | easeInOut] = js.undefined
  
  var propagation: js.UndefOr[top | bottom | left | right] = js.undefined
}
object TransitionProps {
  
  inline def apply(): TransitionProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TransitionProps]
  }
  
  extension [Self <: TransitionProps](x: Self) {
    
    inline def setDelayMs(value: Double): Self = StObject.set(x, "delayMs", value.asInstanceOf[js.Any])
    
    inline def setDelayMsUndefined: Self = StObject.set(x, "delayMs", js.undefined)
    
    inline def setDurationMs(value: Double): Self = StObject.set(x, "durationMs", value.asInstanceOf[js.Any])
    
    inline def setDurationMsUndefined: Self = StObject.set(x, "durationMs", js.undefined)
    
    inline def setInterpolation(value: linear | easeIn | easeOut | easeInOut): Self = StObject.set(x, "interpolation", value.asInstanceOf[js.Any])
    
    inline def setInterpolationUndefined: Self = StObject.set(x, "interpolation", js.undefined)
    
    inline def setPropagation(value: top | bottom | left | right): Self = StObject.set(x, "propagation", value.asInstanceOf[js.Any])
    
    inline def setPropagationUndefined: Self = StObject.set(x, "propagation", js.undefined)
  }
}
