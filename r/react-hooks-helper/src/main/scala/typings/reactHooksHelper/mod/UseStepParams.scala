package typings.reactHooksHelper.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UseStepParams extends js.Object {
  
  var autoAdvanceDuration: js.UndefOr[Double] = js.native
  
  var initialStep: js.UndefOr[Double] = js.native
  
  var steps: js.Array[String] | Double = js.native
}
object UseStepParams {
  
  @scala.inline
  def apply(steps: js.Array[String] | Double): UseStepParams = {
    val __obj = js.Dynamic.literal(steps = steps.asInstanceOf[js.Any])
    __obj.asInstanceOf[UseStepParams]
  }
  
  @scala.inline
  implicit class UseStepParamsOps[Self <: UseStepParams] (val x: Self) extends AnyVal {
    
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
    def setStepsVarargs(value: String*): Self = this.set("steps", js.Array(value :_*))
    
    @scala.inline
    def setSteps(value: js.Array[String] | Double): Self = this.set("steps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoAdvanceDuration(value: Double): Self = this.set("autoAdvanceDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoAdvanceDuration: Self = this.set("autoAdvanceDuration", js.undefined)
    
    @scala.inline
    def setInitialStep(value: Double): Self = this.set("initialStep", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInitialStep: Self = this.set("initialStep", js.undefined)
  }
}
