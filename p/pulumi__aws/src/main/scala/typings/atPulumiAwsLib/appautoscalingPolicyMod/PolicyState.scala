package typings
package atPulumiAwsLib.appautoscalingPolicyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PolicyState extends js.Object {
  val alarms: js.UndefOr[
    atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[java.lang.String]]]
  ] = js.undefined
  /**
    * The ARN assigned by AWS to the scaling policy.
    */
  val arn: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The name of the policy.
    */
  val name: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * For DynamoDB, only `TargetTrackingScaling` is supported. For Amazon ECS, Spot Fleet, and Amazon RDS, both `StepScaling` and `TargetTrackingScaling` are supported. For any other service, only `StepScaling` is supported. Defaults to `StepScaling`.
    */
  val policyType: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The resource type and unique identifier string for the resource associated with the scaling policy. Documentation can be found in the `ResourceId` parameter at: [AWS Application Auto Scaling API Reference](http://docs.aws.amazon.com/ApplicationAutoScaling/latest/APIReference/API_RegisterScalableTarget.html#API_RegisterScalableTarget_RequestParameters)
    */
  val resourceId: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The scalable dimension of the scalable target. Documentation can be found in the `ScalableDimension` parameter at: [AWS Application Auto Scaling API Reference](http://docs.aws.amazon.com/ApplicationAutoScaling/latest/APIReference/API_RegisterScalableTarget.html#API_RegisterScalableTarget_RequestParameters)
    */
  val scalableDimension: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The AWS service namespace of the scalable target. Documentation can be found in the `ServiceNamespace` parameter at: [AWS Application Auto Scaling API Reference](http://docs.aws.amazon.com/ApplicationAutoScaling/latest/APIReference/API_RegisterScalableTarget.html#API_RegisterScalableTarget_RequestParameters)
    */
  val serviceNamespace: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * Step scaling policy configuration, requires `policy_type = "StepScaling"` (default). See supported fields below.
    */
  val stepScalingPolicyConfiguration: js.UndefOr[atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_AdjustmentTypeCooldown]] = js.undefined
  /**
    * A target tracking policy, requires `policy_type = "TargetTrackingScaling"`. See supported fields below.
    */
  val targetTrackingScalingPolicyConfiguration: js.UndefOr[
    atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_CustomizedMetricSpecificationDisableScaleIn]
  ] = js.undefined
}

object PolicyState {
  @scala.inline
  def apply(
    alarms: atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[java.lang.String]]] = null,
    arn: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    name: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    policyType: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    resourceId: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    scalableDimension: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    serviceNamespace: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    stepScalingPolicyConfiguration: atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_AdjustmentTypeCooldown] = null,
    targetTrackingScalingPolicyConfiguration: atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_CustomizedMetricSpecificationDisableScaleIn] = null
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

