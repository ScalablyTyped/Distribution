package typings.reactNative.mod.Animated

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InterpolationConfigType extends js.Object {
  
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
  implicit class InterpolationConfigTypeOps[Self <: InterpolationConfigType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setInputRangeVarargs(value: Double*): Self = this.set("inputRange", js.Array(value :_*))
    
    @scala.inline
    def setInputRange(value: js.Array[Double]): Self = this.set("inputRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutputRangeVarargs(value: (Double | String)*): Self = this.set("outputRange", js.Array(value :_*))
    
    @scala.inline
    def setOutputRange(value: js.Array[Double | String]): Self = this.set("outputRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEasing(value: /* input */ Double => Double): Self = this.set("easing", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteEasing: Self = this.set("easing", js.undefined)
    
    @scala.inline
    def setExtrapolate(value: ExtrapolateType): Self = this.set("extrapolate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExtrapolate: Self = this.set("extrapolate", js.undefined)
    
    @scala.inline
    def setExtrapolateLeft(value: ExtrapolateType): Self = this.set("extrapolateLeft", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExtrapolateLeft: Self = this.set("extrapolateLeft", js.undefined)
    
    @scala.inline
    def setExtrapolateRight(value: ExtrapolateType): Self = this.set("extrapolateRight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExtrapolateRight: Self = this.set("extrapolateRight", js.undefined)
  }
}
