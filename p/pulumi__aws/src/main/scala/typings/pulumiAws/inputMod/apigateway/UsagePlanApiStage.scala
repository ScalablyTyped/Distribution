package typings.pulumiAws.inputMod.apigateway

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UsagePlanApiStage extends js.Object {
  
  /**
    * API Id of the associated API stage in a usage plan.
    */
  var apiId: Input[String] = js.native
  
  /**
    * API stage name of the associated API stage in a usage plan.
    */
  var stage: Input[String] = js.native
}
object UsagePlanApiStage {
  
  @scala.inline
  def apply(apiId: Input[String], stage: Input[String]): UsagePlanApiStage = {
    val __obj = js.Dynamic.literal(apiId = apiId.asInstanceOf[js.Any], stage = stage.asInstanceOf[js.Any])
    __obj.asInstanceOf[UsagePlanApiStage]
  }
  
  @scala.inline
  implicit class UsagePlanApiStageOps[Self <: UsagePlanApiStage] (val x: Self) extends AnyVal {
    
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
    def setApiId(value: Input[String]): Self = this.set("apiId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStage(value: Input[String]): Self = this.set("stage", value.asInstanceOf[js.Any])
  }
}
