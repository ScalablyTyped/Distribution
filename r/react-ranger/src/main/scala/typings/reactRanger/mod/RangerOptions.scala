package typings.reactRanger.mod

import typings.reactRanger.anon.GetPercentageForValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RangerOptions extends js.Object {
  
  var interpolator: js.UndefOr[GetPercentageForValue] = js.native
  
  var max: Double = js.native
  
  var min: Double = js.native
  
  var onChange: js.UndefOr[js.Function1[/* values */ js.Array[Double], Unit]] = js.native
  
  var onDrag: js.UndefOr[js.Function1[/* values */ js.Array[Double], Unit]] = js.native
  
  var stepSize: Double = js.native
  
  var steps: js.UndefOr[js.Array[Double]] = js.native
  
  var tickSize: js.UndefOr[Double] = js.native
  
  var ticks: js.UndefOr[js.Array[Double]] = js.native
  
  var values: js.Array[Double] = js.native
}
object RangerOptions {
  
  @scala.inline
  def apply(max: Double, min: Double, stepSize: Double, values: js.Array[Double]): RangerOptions = {
    val __obj = js.Dynamic.literal(max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any], stepSize = stepSize.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[RangerOptions]
  }
  
  @scala.inline
  implicit class RangerOptionsOps[Self <: RangerOptions] (val x: Self) extends AnyVal {
    
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
    def setMax(value: Double): Self = this.set("max", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMin(value: Double): Self = this.set("min", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStepSize(value: Double): Self = this.set("stepSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValuesVarargs(value: Double*): Self = this.set("values", js.Array(value :_*))
    
    @scala.inline
    def setValues(value: js.Array[Double]): Self = this.set("values", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInterpolator(value: GetPercentageForValue): Self = this.set("interpolator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInterpolator: Self = this.set("interpolator", js.undefined)
    
    @scala.inline
    def setOnChange(value: /* values */ js.Array[Double] => Unit): Self = this.set("onChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnChange: Self = this.set("onChange", js.undefined)
    
    @scala.inline
    def setOnDrag(value: /* values */ js.Array[Double] => Unit): Self = this.set("onDrag", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnDrag: Self = this.set("onDrag", js.undefined)
    
    @scala.inline
    def setStepsVarargs(value: Double*): Self = this.set("steps", js.Array(value :_*))
    
    @scala.inline
    def setSteps(value: js.Array[Double]): Self = this.set("steps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSteps: Self = this.set("steps", js.undefined)
    
    @scala.inline
    def setTickSize(value: Double): Self = this.set("tickSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTickSize: Self = this.set("tickSize", js.undefined)
    
    @scala.inline
    def setTicksVarargs(value: Double*): Self = this.set("ticks", js.Array(value :_*))
    
    @scala.inline
    def setTicks(value: js.Array[Double]): Self = this.set("ticks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTicks: Self = this.set("ticks", js.undefined)
  }
}
