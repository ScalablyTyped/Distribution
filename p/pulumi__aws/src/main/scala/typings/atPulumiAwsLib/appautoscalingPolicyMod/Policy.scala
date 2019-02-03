package typings
package atPulumiAwsLib.appautoscalingPolicyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/appautoscaling/policy", "Policy")
@js.native
class Policy protected ()
  extends atPulumiPulumiLib.atPulumiPulumiMod.CustomResource {
  /**
    * Create a Policy resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: java.lang.String, args: PolicyArgs) = this()
  def this(name: java.lang.String, args: PolicyArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  /**
    * The scaling policy's adjustment type.
    */
  val adjustmentType: atPulumiPulumiLib.atPulumiPulumiMod.Output[js.UndefOr[java.lang.String]] = js.native
  val alarms: atPulumiPulumiLib.atPulumiPulumiMod.Output[js.UndefOr[js.Array[java.lang.String]]] = js.native
  /**
    * The ARN assigned by AWS to the scaling policy.
    */
  val arn: atPulumiPulumiLib.atPulumiPulumiMod.Output[java.lang.String] = js.native
  val cooldown: atPulumiPulumiLib.atPulumiPulumiMod.Output[js.UndefOr[scala.Double]] = js.native
  val metricAggregationType: atPulumiPulumiLib.atPulumiPulumiMod.Output[js.UndefOr[java.lang.String]] = js.native
  val minAdjustmentMagnitude: atPulumiPulumiLib.atPulumiPulumiMod.Output[js.UndefOr[scala.Double]] = js.native
  /**
    * The name of the policy.
    */
  val name: atPulumiPulumiLib.atPulumiPulumiMod.Output[java.lang.String] = js.native
  /**
    * For DynamoDB, only `TargetTrackingScaling` is supported. For Amazon ECS, Spot Fleet, and Amazon RDS, both `StepScaling` and `TargetTrackingScaling` are supported. For any other service, only `StepScaling` is supported. Defaults to `StepScaling`.
    */
  val policyType: atPulumiPulumiLib.atPulumiPulumiMod.Output[js.UndefOr[java.lang.String]] = js.native
  /**
    * The resource type and unique identifier string for the resource associated with the scaling policy. Documentation can be found in the `ResourceId` parameter at: [AWS Application Auto Scaling API Reference](http://docs.aws.amazon.com/ApplicationAutoScaling/latest/APIReference/API_RegisterScalableTarget.html#API_RegisterScalableTarget_RequestParameters)
    */
  val resourceId: atPulumiPulumiLib.atPulumiPulumiMod.Output[java.lang.String] = js.native
  /**
    * The scalable dimension of the scalable target. Documentation can be found in the `ScalableDimension` parameter at: [AWS Application Auto Scaling API Reference](http://docs.aws.amazon.com/ApplicationAutoScaling/latest/APIReference/API_RegisterScalableTarget.html#API_RegisterScalableTarget_RequestParameters)
    */
  val scalableDimension: atPulumiPulumiLib.atPulumiPulumiMod.Output[java.lang.String] = js.native
  /**
    * The AWS service namespace of the scalable target. Documentation can be found in the `ServiceNamespace` parameter at: [AWS Application Auto Scaling API Reference](http://docs.aws.amazon.com/ApplicationAutoScaling/latest/APIReference/API_RegisterScalableTarget.html#API_RegisterScalableTarget_RequestParameters)
    */
  val serviceNamespace: atPulumiPulumiLib.atPulumiPulumiMod.Output[java.lang.String] = js.native
  val stepAdjustments: atPulumiPulumiLib.atPulumiPulumiMod.Output[js.UndefOr[js.Array[atPulumiAwsLib.Anon_MetricIntervalLowerBound]]] = js.native
  /**
    * Step scaling policy configuration, requires `policy_type = "StepScaling"` (default). See supported fields below.
    */
  val stepScalingPolicyConfigurations: atPulumiPulumiLib.atPulumiPulumiMod.Output[js.UndefOr[js.Array[atPulumiAwsLib.Anon_AdjustmentType]]] = js.native
  /**
    * A target tracking policy, requires `policy_type = "TargetTrackingScaling"`. See supported fields below.
    */
  val targetTrackingScalingPolicyConfiguration: atPulumiPulumiLib.atPulumiPulumiMod.Output[js.UndefOr[atPulumiAwsLib.Anon_CustomizedMetricSpecification]] = js.native
}

/* static members */
@JSImport("@pulumi/aws/appautoscaling/policy", "Policy")
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
  def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.appautoscalingPolicyMod.Policy = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.appautoscalingPolicyMod.PolicyState
  ): atPulumiAwsLib.appautoscalingPolicyMod.Policy = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.appautoscalingPolicyMod.PolicyState,
    opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
  ): atPulumiAwsLib.appautoscalingPolicyMod.Policy = js.native
}

