package typings.atPulumiAws.autoscalingPolicyMod

import typings.atPulumiAws.typesOutputMod.autoscalingNs.PolicyStepAdjustment
import typings.atPulumiAws.typesOutputMod.autoscalingNs.PolicyTargetTrackingConfiguration
import typings.atPulumiPulumi.atPulumiPulumiMod.CustomResource
import typings.atPulumiPulumi.outputMod.Input
import typings.atPulumiPulumi.outputMod.Output
import typings.atPulumiPulumi.resourceMod.CustomResourceOptions
import typings.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  val adjustmentType: Output[js.UndefOr[String]] = js.native
  /**
    * The ARN assigned by AWS to the scaling policy.
    */
  val arn: Output[String] = js.native
  /**
    * The name of the autoscaling group.
    */
  val autoscalingGroupName: Output[String] = js.native
  /**
    * The amount of time, in seconds, after a scaling activity completes and before the next scaling activity can start.
    */
  val cooldown: Output[js.UndefOr[Double]] = js.native
  /**
    * The estimated time, in seconds, until a newly launched instance will contribute CloudWatch metrics. Without a value, AWS will default to the group's specified cooldown period.
    */
  val estimatedInstanceWarmup: Output[js.UndefOr[Double]] = js.native
  /**
    * The aggregation type for the policy's metrics. Valid values are "Minimum", "Maximum", and "Average". Without a value, AWS will treat the aggregation type as "Average".
    */
  val metricAggregationType: Output[String] = js.native
  val minAdjustmentMagnitude: Output[js.UndefOr[Double]] = js.native
  /**
    * The name of the dimension.
    */
  val name: Output[String] = js.native
  /**
    * The policy type, either "SimpleScaling", "StepScaling" or "TargetTrackingScaling". If this value isn't provided, AWS will default to "SimpleScaling."
    */
  val policyType: Output[js.UndefOr[String]] = js.native
  /**
    * The number of members by which to
    * scale, when the adjustment bounds are breached. A positive value scales
    * up. A negative value scales down.
    */
  val scalingAdjustment: Output[js.UndefOr[Double]] = js.native
  val stepAdjustments: Output[js.UndefOr[js.Array[PolicyStepAdjustment]]] = js.native
  /**
    * A target tracking policy. These have the following structure:
    */
  val targetTrackingConfiguration: Output[js.UndefOr[PolicyTargetTrackingConfiguration]] = js.native
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
    */
  def get(name: String, id: Input[ID]): Policy = js.native
  def get(name: String, id: Input[ID], state: PolicyState): Policy = js.native
  def get(name: String, id: Input[ID], state: PolicyState, opts: CustomResourceOptions): Policy = js.native
  /**
    * Returns true if the given object is an instance of Policy.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/autoscaling/policy.Policy */ Boolean = js.native
}

