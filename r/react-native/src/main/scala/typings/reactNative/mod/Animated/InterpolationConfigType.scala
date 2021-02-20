package typings.reactNative.mod.Animated

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InterpolationConfigType extends StObject {
  
  var easing: js.UndefOr[js.Function1[/* input */ Double, Double]] = js.native
  
  var extrapolate: js.UndefOr[ExtrapolateType] = js.native
  
  var extrapolateLeft: js.UndefOr[ExtrapolateType] = js.native
  
  var extrapolateRight: js.UndefOr[ExtrapolateType] = js.native
  
  var inputRange: js.Array[Double] = js.native
  
  var outputRange: js.Array[Double | String] = js.native
}
object InterpolationConfigType {
  
  @scala.inline
  def apply(inputRange: js.Array[Double], outputRange: js.Array[Double | String]): InterpolationConfigType = {
    val __obj = js.Dynamic.literal(inputRange = inputRange.asInstanceOf[js.Any], outputRange = outputRange.asInstanceOf[js.Any])
    __obj.asInstanceOf[InterpolationConfigType]
  }
  
  @scala.inline
  implicit class InterpolationConfigTypeMutableBuilder[Self <: InterpolationConfigType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEasing(value: /* input */ Double => Double): Self = StObject.set(x, "easing", js.Any.fromFunction1(value))
    
    @scala.inline
    def setEasingUndefined: Self = StObject.set(x, "easing", js.undefined)
    
    @scala.inline
    def setExtrapolate(value: ExtrapolateType): Self = StObject.set(x, "extrapolate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtrapolateLeft(value: ExtrapolateType): Self = StObject.set(x, "extrapolateLeft", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtrapolateLeftUndefined: Self = StObject.set(x, "extrapolateLeft", js.undefined)
    
    @scala.inline
    def setExtrapolateRight(value: ExtrapolateType): Self = StObject.set(x, "extrapolateRight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtrapolateRightUndefined: Self = StObject.set(x, "extrapolateRight", js.undefined)
    
    @scala.inline
    def setExtrapolateUndefined: Self = StObject.set(x, "extrapolate", js.undefined)
    
    @scala.inline
    def setInputRange(value: js.Array[Double]): Self = StObject.set(x, "inputRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputRangeVarargs(value: Double*): Self = StObject.set(x, "inputRange", js.Array(value :_*))
    
    @scala.inline
    def setOutputRange(value: js.Array[Double | String]): Self = StObject.set(x, "outputRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutputRangeVarargs(value: (Double | String)*): Self = StObject.set(x, "outputRange", js.Array(value :_*))
  }
}
