package typings
package atPulumiAwsLib.appautoscalingPolicyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PolicyState extends js.Object {
  /**
    * The scaling policy's adjustment type.
    */
  val adjustmentType: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  val alarms: js.UndefOr[
    atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[java.lang.String]]]
  ] = js.undefined
  /**
    * The ARN assigned by AWS to the scaling policy.
    */
  val arn: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  val cooldown: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Double]] = js.undefined
  val metricAggregationType: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  val minAdjustmentMagnitude: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Double]] = js.undefined
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
  val stepAdjustments: js.UndefOr[
    atPulumiPulumiLib.outputMod.Input[
      js.Array[
        atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_MetricIntervalLowerBoundMetricIntervalUpperBound]
      ]
    ]
  ] = js.undefined
  /**
    * Step scaling policy configuration, requires `policy_type = "StepScaling"` (default). See supported fields below.
    */
  val stepScalingPolicyConfigurations: js.UndefOr[
    atPulumiPulumiLib.outputMod.Input[
      js.Array[atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_AdjustmentTypeCooldown]]
    ]
  ] = js.undefined
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
    adjustmentType: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    alarms: atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[java.lang.String]]] = null,
    arn: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    cooldown: atPulumiPulumiLib.outputMod.Input[scala.Double] = null,
    metricAggregationType: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    minAdjustmentMagnitude: atPulumiPulumiLib.outputMod.Input[scala.Double] = null,
    name: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    policyType: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    resourceId: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    scalableDimension: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    serviceNamespace: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    stepAdjustments: atPulumiPulumiLib.outputMod.Input[
      js.Array[
        atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_MetricIntervalLowerBoundMetricIntervalUpperBound]
      ]
    ] = null,
    stepScalingPolicyConfigurations: atPulumiPulumiLib.outputMod.Input[
      js.Array[atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_AdjustmentTypeCooldown]]
    ] = null,
    targetTrackingScalingPolicyConfiguration: atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_CustomizedMetricSpecificationDisableScaleIn] = null
  ): PolicyState = {
    val __obj = js.Dynamic.literal()
    if (adjustmentType != null) __obj.updateDynamic("adjustmentType")(adjustmentType.asInstanceOf[js.Any])
    if (alarms != null) __obj.updateDynamic("alarms")(alarms.asInstanceOf[js.Any])
    if (arn != null) __obj.updateDynamic("arn")(arn.asInstanceOf[js.Any])
    if (cooldown != null) __obj.updateDynamic("cooldown")(cooldown.asInstanceOf[js.Any])
    if (metricAggregationType != null) __obj.updateDynamic("metricAggregationType")(metricAggregationType.asInstanceOf[js.Any])
    if (minAdjustmentMagnitude != null) __obj.updateDynamic("minAdjustmentMagnitude")(minAdjustmentMagnitude.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (policyType != null) __obj.updateDynamic("policyType")(policyType.asInstanceOf[js.Any])
    if (resourceId != null) __obj.updateDynamic("resourceId")(resourceId.asInstanceOf[js.Any])
    if (scalableDimension != null) __obj.updateDynamic("scalableDimension")(scalableDimension.asInstanceOf[js.Any])
    if (serviceNamespace != null) __obj.updateDynamic("serviceNamespace")(serviceNamespace.asInstanceOf[js.Any])
    if (stepAdjustments != null) __obj.updateDynamic("stepAdjustments")(stepAdjustments.asInstanceOf[js.Any])
    if (stepScalingPolicyConfigurations != null) __obj.updateDynamic("stepScalingPolicyConfigurations")(stepScalingPolicyConfigurations.asInstanceOf[js.Any])
    if (targetTrackingScalingPolicyConfiguration != null) __obj.updateDynamic("targetTrackingScalingPolicyConfiguration")(targetTrackingScalingPolicyConfiguration.asInstanceOf[js.Any])
    __obj.asInstanceOf[PolicyState]
  }
}

