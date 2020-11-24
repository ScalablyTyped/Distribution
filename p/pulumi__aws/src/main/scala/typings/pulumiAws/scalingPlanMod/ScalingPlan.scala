package typings.pulumiAws.scalingPlanMod

import typings.pulumiAws.outputMod.autoscalingplans.ScalingPlanApplicationSource
import typings.pulumiAws.outputMod.autoscalingplans.ScalingPlanScalingInstruction
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pulumi/aws/autoscalingplans/scalingPlan", "ScalingPlan")
@js.native
class ScalingPlan protected () extends CustomResource {
  /**
    * Create a ScalingPlan resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: ScalingPlanArgs) = this()
  def this(name: String, args: ScalingPlanArgs, opts: CustomResourceOptions) = this()
  
  /**
    * A CloudFormation stack or set of tags. You can create one scaling plan per application source.
    */
  val applicationSource: Output_[ScalingPlanApplicationSource] = js.native
  
  /**
    * The name of the scaling plan. Names cannot contain vertical bars, colons, or forward slashes.
    */
  val name: Output_[String] = js.native
  
  /**
    * The scaling instructions. More details can be found in the [AWS Auto Scaling API Reference](https://docs.aws.amazon.com/autoscaling/plans/APIReference/API_ScalingInstruction.html).
    */
  val scalingInstructions: Output_[js.Array[ScalingPlanScalingInstruction]] = js.native
  
  /**
    * The version number of the scaling plan. This value is always 1.
    */
  val scalingPlanVersion: Output_[Double] = js.native
}
/* static members */
@JSImport("@pulumi/aws/autoscalingplans/scalingPlan", "ScalingPlan")
@js.native
object ScalingPlan extends js.Object {
  
  /**
    * Get an existing ScalingPlan resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    * @param opts Optional settings to control the behavior of the CustomResource.
    */
  def get(name: String, id: Input[ID]): ScalingPlan = js.native
  def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): ScalingPlan = js.native
  def get(name: String, id: Input[ID], state: ScalingPlanState): ScalingPlan = js.native
  def get(name: String, id: Input[ID], state: ScalingPlanState, opts: CustomResourceOptions): ScalingPlan = js.native
  
  /**
    * Returns true if the given object is an instance of ScalingPlan.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/autoscalingplans/scalingPlan.ScalingPlan */ Boolean = js.native
}
