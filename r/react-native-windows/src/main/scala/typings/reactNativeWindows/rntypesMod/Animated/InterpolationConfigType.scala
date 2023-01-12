package typings.reactNativeWindows.rntypesMod.Animated

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InterpolationConfigType extends StObject {
  
  var easing: js.UndefOr[js.Function1[/* input */ Double, Double]] = js.undefined
  
  var extrapolate: js.UndefOr[ExtrapolateType] = js.undefined
  
  var extrapolateLeft: js.UndefOr[ExtrapolateType] = js.undefined
  
  var extrapolateRight: js.UndefOr[ExtrapolateType] = js.undefined
  
  var inputRange: js.Array[Double]
  
  var outputRange: js.Array[Double | String]
}
object InterpolationConfigType {
  
  inline def apply(inputRange: js.Array[Double], outputRange: js.Array[Double | String]): InterpolationConfigType = {
    val __obj = js.Dynamic.literal(inputRange = inputRange.asInstanceOf[js.Any], outputRange = outputRange.asInstanceOf[js.Any])
    __obj.asInstanceOf[InterpolationConfigType]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InterpolationConfigType] (val x: Self) extends AnyVal {
    
    inline def setEasing(value: /* input */ Double => Double): Self = StObject.set(x, "easing", js.Any.fromFunction1(value))
    
    inline def setEasingUndefined: Self = StObject.set(x, "easing", js.undefined)
    
    inline def setExtrapolate(value: ExtrapolateType): Self = StObject.set(x, "extrapolate", value.asInstanceOf[js.Any])
    
    inline def setExtrapolateLeft(value: ExtrapolateType): Self = StObject.set(x, "extrapolateLeft", value.asInstanceOf[js.Any])
    
    inline def setExtrapolateLeftUndefined: Self = StObject.set(x, "extrapolateLeft", js.undefined)
    
    inline def setExtrapolateRight(value: ExtrapolateType): Self = StObject.set(x, "extrapolateRight", value.asInstanceOf[js.Any])
    
    inline def setExtrapolateRightUndefined: Self = StObject.set(x, "extrapolateRight", js.undefined)
    
    inline def setExtrapolateUndefined: Self = StObject.set(x, "extrapolate", js.undefined)
    
    inline def setInputRange(value: js.Array[Double]): Self = StObject.set(x, "inputRange", value.asInstanceOf[js.Any])
    
    inline def setInputRangeVarargs(value: Double*): Self = StObject.set(x, "inputRange", js.Array(value*))
    
    inline def setOutputRange(value: js.Array[Double | String]): Self = StObject.set(x, "outputRange", value.asInstanceOf[js.Any])
    
    inline def setOutputRangeVarargs(value: (Double | String)*): Self = StObject.set(x, "outputRange", js.Array(value*))
  }
}
