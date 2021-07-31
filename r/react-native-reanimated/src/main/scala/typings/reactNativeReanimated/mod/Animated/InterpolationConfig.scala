package typings.reactNativeReanimated.mod.Animated

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InterpolationConfig extends StObject {
  
  var extrapolate: js.UndefOr[Extrapolate] = js.undefined
  
  var extrapolateLeft: js.UndefOr[Extrapolate] = js.undefined
  
  var extrapolateRight: js.UndefOr[Extrapolate] = js.undefined
  
  var inputRange: js.Array[Adaptable[Double]]
  
  var outputRange: js.Array[Adaptable[Double | String]]
}
object InterpolationConfig {
  
  @scala.inline
  def apply(inputRange: js.Array[Adaptable[Double]], outputRange: js.Array[Adaptable[Double | String]]): InterpolationConfig = {
    val __obj = js.Dynamic.literal(inputRange = inputRange.asInstanceOf[js.Any], outputRange = outputRange.asInstanceOf[js.Any])
    __obj.asInstanceOf[InterpolationConfig]
  }
  
  @scala.inline
  implicit class InterpolationConfigMutableBuilder[Self <: InterpolationConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExtrapolate(value: Extrapolate): Self = StObject.set(x, "extrapolate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtrapolateLeft(value: Extrapolate): Self = StObject.set(x, "extrapolateLeft", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtrapolateLeftUndefined: Self = StObject.set(x, "extrapolateLeft", js.undefined)
    
    @scala.inline
    def setExtrapolateRight(value: Extrapolate): Self = StObject.set(x, "extrapolateRight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtrapolateRightUndefined: Self = StObject.set(x, "extrapolateRight", js.undefined)
    
    @scala.inline
    def setExtrapolateUndefined: Self = StObject.set(x, "extrapolate", js.undefined)
    
    @scala.inline
    def setInputRange(value: js.Array[Adaptable[Double]]): Self = StObject.set(x, "inputRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputRangeVarargs(value: Adaptable[Double]*): Self = StObject.set(x, "inputRange", js.Array(value :_*))
    
    @scala.inline
    def setOutputRange(value: js.Array[Adaptable[Double | String]]): Self = StObject.set(x, "outputRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutputRangeVarargs(value: (Adaptable[Double | String])*): Self = StObject.set(x, "outputRange", js.Array(value :_*))
  }
}
