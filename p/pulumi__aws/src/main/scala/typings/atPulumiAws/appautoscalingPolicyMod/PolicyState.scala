package typings.atPulumiAws.appautoscalingPolicyMod

import typings.atPulumiAws.Anon_AdjustmentTypeCooldown
import typings.atPulumiAws.Anon_CustomizedMetricSpecificationDisableScaleIn
import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PolicyState extends js.Object {
  val alarms: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
  /**
    * The ARN assigned by AWS to the scaling policy.
    */
  val arn: js.UndefOr[Input[String]] = js.undefined
  /**
    * The name of the policy.
    */
  val name: js.UndefOr[Input[String]] = js.undefined
  /**
    * For DynamoDB, only `TargetTrackingScaling` is supported. For Amazon ECS, Spot Fleet, and Amazon RDS, both `StepScaling` and `TargetTrackingScaling` are supported. For any other service, only `StepScaling` is supported. Defaults to `StepScaling`.
    */
  val policyType: js.UndefOr[Input[String]] = js.undefined
  /**
    * The resource type and unique identifier string for the resource associated with the scaling policy. Documentation can be found in the `ResourceId` parameter at: [AWS Application Auto Scaling API Reference](http://docs.aws.amazon.com/ApplicationAutoScaling/latest/APIReference/API_RegisterScalableTarget.html#API_RegisterScalableTarget_RequestParameters)
    */
  val resourceId: js.UndefOr[Input[String]] = js.undefined
  /**
    * The scalable dimension of the scalable target. Documentation can be found in the `ScalableDimension` parameter at: [AWS Application Auto Scaling API Reference](http://docs.aws.amazon.com/ApplicationAutoScaling/latest/APIReference/API_RegisterScalableTarget.html#API_RegisterScalableTarget_RequestParameters)
    */
  val scalableDimension: js.UndefOr[Input[String]] = js.undefined
  /**
    * The AWS service namespace of the scalable target. Documentation can be found in the `ServiceNamespace` parameter at: [AWS Application Auto Scaling API Reference](http://docs.aws.amazon.com/ApplicationAutoScaling/latest/APIReference/API_RegisterScalableTarget.html#API_RegisterScalableTarget_RequestParameters)
    */
  val serviceNamespace: js.UndefOr[Input[String]] = js.undefined
  /**
    * Step scaling policy configuration, requires `policy_type = "StepScaling"` (default). See supported fields below.
    */
  val stepScalingPolicyConfiguration: js.UndefOr[Input[Anon_AdjustmentTypeCooldown]] = js.undefined
  /**
    * A target tracking policy, requires `policy_type = "TargetTrackingScaling"`. See supported fields below.
    */
  val targetTrackingScalingPolicyConfiguration: js.UndefOr[Input[Anon_CustomizedMetricSpecificationDisableScaleIn]] = js.undefined
}

object PolicyState {
  @scala.inline
  def apply(
    alarms: Input[js.Array[Input[String]]] = null,
    arn: Input[String] = null,
    name: Input[String] = null,
    policyType: Input[String] = null,
    resourceId: Input[String] = null,
    scalableDimension: Input[String] = null,
    serviceNamespace: Input[String] = null,
    stepScalingPolicyConfiguration: Input[Anon_AdjustmentTypeCooldown] = null,
    targetTrackingScalingPolicyConfiguration: Input[Anon_CustomizedMetricSpecificationDisableScaleIn] = null
  ): PolicyState = {
    val __obj = js.Dynamic.literal()
    if (alarms != null) __obj.updateDynamic("alarms")(alarms.asInstanceOf[js.Any])
    if (arn != null) __obj.updateDynamic("arn")(arn.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (policyType != null) __obj.updateDynamic("policyType")(policyType.asInstanceOf[js.Any])
    if (resourceId != null) __obj.updateDynamic("resourceId")(resourceId.asInstanceOf[js.Any])
    if (scalableDimension != null) __obj.updateDynamic("scalableDimension")(scalableDimension.asInstanceOf[js.Any])
    if (serviceNamespace != null) __obj.updateDynamic("serviceNamespace")(serviceNamespace.asInstanceOf[js.Any])
    if (stepScalingPolicyConfiguration != null) __obj.updateDynamic("stepScalingPolicyConfiguration")(stepScalingPolicyConfiguration.asInstanceOf[js.Any])
    if (targetTrackingScalingPolicyConfiguration != null) __obj.updateDynamic("targetTrackingScalingPolicyConfiguration")(targetTrackingScalingPolicyConfiguration.asInstanceOf[js.Any])
    __obj.asInstanceOf[PolicyState]
  }
}

