package typings.roll.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RollOutput extends js.Object {
  
  var calculations: js.Array[Double] = js.native
  
  var input: RollObject = js.native
  
  var result: Double = js.native
  
  var rolled: js.Array[Double] = js.native
}
object RollOutput {
  
  @scala.inline
  def apply(calculations: js.Array[Double], input: RollObject, result: Double, rolled: js.Array[Double]): RollOutput = {
    val __obj = js.Dynamic.literal(calculations = calculations.asInstanceOf[js.Any], input = input.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any], rolled = rolled.asInstanceOf[js.Any])
    __obj.asInstanceOf[RollOutput]
  }
  
  @scala.inline
  implicit class RollOutputOps[Self <: RollOutput] (val x: Self) extends AnyVal {
    
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
    def setCalculationsVarargs(value: Double*): Self = this.set("calculations", js.Array(value :_*))
    
    @scala.inline
    def setCalculations(value: js.Array[Double]): Self = this.set("calculations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInput(value: RollObject): Self = this.set("input", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResult(value: Double): Self = this.set("result", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRolledVarargs(value: Double*): Self = this.set("rolled", js.Array(value :_*))
    
    @scala.inline
    def setRolled(value: js.Array[Double]): Self = this.set("rolled", value.asInstanceOf[js.Any])
  }
}
