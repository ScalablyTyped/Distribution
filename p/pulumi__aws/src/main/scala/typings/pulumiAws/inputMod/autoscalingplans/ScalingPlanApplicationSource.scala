package typings.pulumiAws.inputMod.autoscalingplans

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ScalingPlanApplicationSource extends js.Object {
  
  /**
    * The Amazon Resource Name (ARN) of a AWS CloudFormation stack.
    */
  var cloudformationStackArn: js.UndefOr[Input[String]] = js.native
  
  /**
    * A set of tags.
    */
  var tagFilters: js.UndefOr[Input[js.Array[Input[ScalingPlanApplicationSourceTagFilter]]]] = js.native
}
object ScalingPlanApplicationSource {
  
  @scala.inline
  def apply(): ScalingPlanApplicationSource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScalingPlanApplicationSource]
  }
  
  @scala.inline
  implicit class ScalingPlanApplicationSourceOps[Self <: ScalingPlanApplicationSource] (val x: Self) extends AnyVal {
    
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
    def setCloudformationStackArn(value: Input[String]): Self = this.set("cloudformationStackArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCloudformationStackArn: Self = this.set("cloudformationStackArn", js.undefined)
    
    @scala.inline
    def setTagFiltersVarargs(value: Input[ScalingPlanApplicationSourceTagFilter]*): Self = this.set("tagFilters", js.Array(value :_*))
    
    @scala.inline
    def setTagFilters(value: Input[js.Array[Input[ScalingPlanApplicationSourceTagFilter]]]): Self = this.set("tagFilters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTagFilters: Self = this.set("tagFilters", js.undefined)
  }
}
