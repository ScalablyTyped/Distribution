package typings.pulumiAws.scalingPlanMod

import typings.pulumiAws.inputMod.autoscalingplans.ScalingPlanApplicationSource
import typings.pulumiAws.inputMod.autoscalingplans.ScalingPlanScalingInstruction
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ScalingPlanArgs extends js.Object {
  
  /**
    * A CloudFormation stack or set of tags. You can create one scaling plan per application source.
    */
  val applicationSource: Input[ScalingPlanApplicationSource] = js.native
  
  /**
    * The name of the scaling plan. Names cannot contain vertical bars, colons, or forward slashes.
    */
  val name: js.UndefOr[Input[String]] = js.native
  
  /**
    * The scaling instructions. More details can be found in the [AWS Auto Scaling API Reference](https://docs.aws.amazon.com/autoscaling/plans/APIReference/API_ScalingInstruction.html).
    */
  val scalingInstructions: Input[js.Array[Input[ScalingPlanScalingInstruction]]] = js.native
}
object ScalingPlanArgs {
  
  @scala.inline
  def apply(
    applicationSource: Input[ScalingPlanApplicationSource],
    scalingInstructions: Input[js.Array[Input[ScalingPlanScalingInstruction]]]
  ): ScalingPlanArgs = {
    val __obj = js.Dynamic.literal(applicationSource = applicationSource.asInstanceOf[js.Any], scalingInstructions = scalingInstructions.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScalingPlanArgs]
  }
  
  @scala.inline
  implicit class ScalingPlanArgsOps[Self <: ScalingPlanArgs] (val x: Self) extends AnyVal {
    
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
    def setApplicationSource(value: Input[ScalingPlanApplicationSource]): Self = this.set("applicationSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScalingInstructionsVarargs(value: Input[ScalingPlanScalingInstruction]*): Self = this.set("scalingInstructions", js.Array(value :_*))
    
    @scala.inline
    def setScalingInstructions(value: Input[js.Array[Input[ScalingPlanScalingInstruction]]]): Self = this.set("scalingInstructions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: Input[String]): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
  }
}
