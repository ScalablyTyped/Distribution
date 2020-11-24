package typings.reactSpringShared.typesMod

import typings.reactSpringShared.typesUtilMod.Constrain
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InterpolatorConfig[Out] extends js.Object {
  
  /**
    * Custom easing to apply in interpolator.
    */
  var easing: js.UndefOr[EasingFunction] = js.native
  
  /**
    * What happens when the spring exceeds its target value.
    * Shortcut to set `extrapolateLeft` and `extrapolateRight`.
    *
    *  - `extend` continues the interpolation past the target value
    *  - `clamp` limits the interpolation at the max value
    *  - `identity` sets the value to the interpolation input as soon as it hits the boundary
    *
    * @default 'extend'
    */
  var extrapolate: js.UndefOr[ExtrapolateType] = js.native
  
  /**
    * What happens when the spring goes below its target value.
    *
    *  - `extend` continues the interpolation past the target value
    *  - `clamp` limits the interpolation at the max value
    *  - `identity` sets the value to the interpolation input as soon as it hits the boundary
    *
    * @default 'extend'
    */
  var extrapolateLeft: js.UndefOr[ExtrapolateType] = js.native
  
  /**
    * What happens when the spring exceeds its target value.
    *
    *  - `extend` continues the interpolation past the target value
    *  - `clamp` limits the interpolation at the max value
    *  - `identity` sets the value to the interpolation input as soon as it hits the boundary
    *
    * @default 'extend'
    */
  var extrapolateRight: js.UndefOr[ExtrapolateType] = js.native
  
  /**
    * Transformation to apply to the value before interpolation.
    */
  var map: js.UndefOr[js.Function1[/* value */ Double, Double]] = js.native
  
  /**
    * Output values from the interpolation function. Should match the length of the `range` array.
    */
  var output: js.Array[Constrain[Out, Animatable[_]]] = js.native
  
  /**
    * Input ranges mapping the interpolation to the output values.
    *
    * @example
    *
    *   range: [0, 0.5, 1], output: ['yellow', 'orange', 'red']
    *
    * @default [0,1]
    */
  var range: js.UndefOr[js.Array[Double]] = js.native
}
object InterpolatorConfig {
  
  @scala.inline
  def apply[Out](output: js.Array[Constrain[Out, Animatable[_]]]): InterpolatorConfig[Out] = {
    val __obj = js.Dynamic.literal(output = output.asInstanceOf[js.Any])
    __obj.asInstanceOf[InterpolatorConfig[Out]]
  }
  
  @scala.inline
  implicit class InterpolatorConfigOps[Self <: InterpolatorConfig[_], Out] (val x: Self with InterpolatorConfig[Out]) extends AnyVal {
    
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
    def setOutputVarargs(value: (Constrain[Out, Animatable[js.Any]])*): Self = this.set("output", js.Array(value :_*))
    
    @scala.inline
    def setOutput(value: js.Array[Constrain[Out, Animatable[_]]]): Self = this.set("output", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEasing(value: /* t */ Double => Double): Self = this.set("easing", js.Any.fromFunction1(value))
    
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
    
    @scala.inline
    def setMap(value: /* value */ Double => Double): Self = this.set("map", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteMap: Self = this.set("map", js.undefined)
    
    @scala.inline
    def setRangeVarargs(value: Double*): Self = this.set("range", js.Array(value :_*))
    
    @scala.inline
    def setRange(value: js.Array[Double]): Self = this.set("range", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRange: Self = this.set("range", js.undefined)
  }
}
