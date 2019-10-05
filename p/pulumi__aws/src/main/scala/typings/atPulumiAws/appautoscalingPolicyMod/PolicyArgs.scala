package typings.atPulumiAws.appautoscalingPolicyMod

import typings.atPulumiAws.typesInputMod.appautoscaling.PolicyStepScalingPolicyConfiguration
import typings.atPulumiAws.typesInputMod.appautoscaling.PolicyTargetTrackingScalingPolicyConfiguration
import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PolicyArgs extends js.Object {
  val alarms: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
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
  val resourceId: Input[String]
  /**
    * The scalable dimension of the scalable target. Documentation can be found in the `ScalableDimension` parameter at: [AWS Application Auto Scaling API Reference](http://docs.aws.amazon.com/ApplicationAutoScaling/latest/APIReference/API_RegisterScalableTarget.html#API_RegisterScalableTarget_RequestParameters)
    */
  val scalableDimension: Input[String]
  /**
    * The AWS service namespace of the scalable target. Documentation can be found in the `ServiceNamespace` parameter at: [AWS Application Auto Scaling API Reference](http://docs.aws.amazon.com/ApplicationAutoScaling/latest/APIReference/API_RegisterScalableTarget.html#API_RegisterScalableTarget_RequestParameters)
    */
  val serviceNamespace: Input[String]
  /**
    * Step scaling policy configuration, requires `policyType = "StepScaling"` (default). See supported fields below.
    */
  val stepScalingPolicyConfiguration: js.UndefOr[Input[PolicyStepScalingPolicyConfiguration]] = js.undefined
  /**
    * A target tracking policy, requires `policyType = "TargetTrackingScaling"`. See supported fields below.
    */
  val targetTrackingScalingPolicyConfiguration: js.UndefOr[Input[PolicyTargetTrackingScalingPolicyConfiguration]] = js.undefined
}

object PolicyArgs {
  @scala.inline
  def apply(
    resourceId: Input[String],
    scalableDimension: Input[String],
    serviceNamespace: Input[String],
    alarms: Input[js.Array[Input[String]]] = null,
    name: Input[String] = null,
    policyType: Input[String] = null,
    stepScalingPolicyConfiguration: Input[PolicyStepScalingPolicyConfiguration] = null,
    targetTrackingScalingPolicyConfiguration: Input[PolicyTargetTrackingScalingPolicyConfiguration] = null
  ): PolicyArgs = {
    val __obj = js.Dynamic.literal(resourceId = resourceId.asInstanceOf[js.Any], scalableDimension = scalableDimension.asInstanceOf[js.Any], serviceNamespace = serviceNamespace.asInstanceOf[js.Any])
    if (alarms != null) __obj.updateDynamic("alarms")(alarms.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (policyType != null) __obj.updateDynamic("policyType")(policyType.asInstanceOf[js.Any])
    if (stepScalingPolicyConfiguration != null) __obj.updateDynamic("stepScalingPolicyConfiguration")(stepScalingPolicyConfiguration.asInstanceOf[js.Any])
    if (targetTrackingScalingPolicyConfiguration != null) __obj.updateDynamic("targetTrackingScalingPolicyConfiguration")(targetTrackingScalingPolicyConfiguration.asInstanceOf[js.Any])
    __obj.asInstanceOf[PolicyArgs]
  }
}

