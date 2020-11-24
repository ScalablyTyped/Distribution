package typings.pulumiAws.autoscalingPolicyMod

import typings.pulumiAws.outputMod.autoscaling.PolicyStepAdjustment
import typings.pulumiAws.outputMod.autoscaling.PolicyTargetTrackingConfiguration
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pulumi/aws/autoscaling/policy", "Policy")
@js.native
class Policy protected () extends CustomResource {
  /**
    * Create a Policy resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: PolicyArgs) = this()
  def this(name: String, args: PolicyArgs, opts: CustomResourceOptions) = this()
  
  /**
    * Specifies whether the adjustment is an absolute number or a percentage of the current capacity. Valid values are `ChangeInCapacity`, `ExactCapacity`, and `PercentChangeInCapacity`.
    */
  val adjustmentType: Output_[js.UndefOr[String]] = js.native
  
  /**
    * The ARN assigned by AWS to the scaling policy.
    */
  val arn: Output_[String] = js.native
  
  /**
    * The name of the autoscaling group.
    */
  val autoscalingGroupName: Output_[String] = js.native
  
  /**
    * The amount of time, in seconds, after a scaling activity completes and before the next scaling activity can start.
    */
  val cooldown: Output_[js.UndefOr[Double]] = js.native
  
  /**
    * The estimated time, in seconds, until a newly launched instance will contribute CloudWatch metrics. Without a value, AWS will default to the group's specified cooldown period.
    */
  val estimatedInstanceWarmup: Output_[js.UndefOr[Double]] = js.native
  
  /**
    * The aggregation type for the policy's metrics. Valid values are "Minimum", "Maximum", and "Average". Without a value, AWS will treat the aggregation type as "Average".
    */
  val metricAggregationType: Output_[String] = js.native
  
  /**
    * Minimum value to scale by when `adjustmentType` is set to `PercentChangeInCapacity`.
    */
  val minAdjustmentMagnitude: Output_[js.UndefOr[Double]] = js.native
  
  /**
    * The name of the dimension.
    */
  val name: Output_[String] = js.native
  
  /**
    * The policy type, either "SimpleScaling", "StepScaling" or "TargetTrackingScaling". If this value isn't provided, AWS will default to "SimpleScaling."
    */
  val policyType: Output_[js.UndefOr[String]] = js.native
  
  /**
    * The number of members by which to
    * scale, when the adjustment bounds are breached. A positive value scales
    * up. A negative value scales down.
    */
  val scalingAdjustment: Output_[js.UndefOr[Double]] = js.native
  
  /**
    * A set of adjustments that manage
    * group scaling. These have the following structure:
    */
  val stepAdjustments: Output_[js.UndefOr[js.Array[PolicyStepAdjustment]]] = js.native
  
  /**
    * A target tracking policy. These have the following structure:
    */
  val targetTrackingConfiguration: Output_[js.UndefOr[PolicyTargetTrackingConfiguration]] = js.native
}
/* static members */
@JSImport("@pulumi/aws/autoscaling/policy", "Policy")
@js.native
object Policy extends js.Object {
  
  /**
    * Get an existing Policy resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    * @param opts Optional settings to control the behavior of the CustomResource.
    */
  def get(name: String, id: Input[ID]): Policy = js.native
  def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): Policy = js.native
  def get(name: String, id: Input[ID], state: PolicyState): Policy = js.native
  def get(name: String, id: Input[ID], state: PolicyState, opts: CustomResourceOptions): Policy = js.native
  
  /**
    * Returns true if the given object is an instance of Policy.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/autoscaling/policy.Policy */ Boolean = js.native
}
