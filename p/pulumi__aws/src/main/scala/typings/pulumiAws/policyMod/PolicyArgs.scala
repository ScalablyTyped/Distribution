package typings.pulumiAws.policyMod

import typings.pulumiAws.inputMod.appautoscaling.PolicyStepScalingPolicyConfiguration
import typings.pulumiAws.inputMod.appautoscaling.PolicyTargetTrackingScalingPolicyConfiguration
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PolicyArgs extends js.Object {
  /**
    * The name of the policy.
    */
  val name: js.UndefOr[Input[String]] = js.native
  /**
    * For DynamoDB, only `TargetTrackingScaling` is supported. For Amazon ECS, Spot Fleet, and Amazon RDS, both `StepScaling` and `TargetTrackingScaling` are supported. For any other service, only `StepScaling` is supported. Defaults to `StepScaling`.
    */
  val policyType: js.UndefOr[Input[String]] = js.native
  /**
    * The resource type and unique identifier string for the resource associated with the scaling policy. Documentation can be found in the `ResourceId` parameter at: [AWS Application Auto Scaling API Reference](http://docs.aws.amazon.com/ApplicationAutoScaling/latest/APIReference/API_RegisterScalableTarget.html#API_RegisterScalableTarget_RequestParameters)
    */
  val resourceId: Input[String] = js.native
  /**
    * The scalable dimension of the scalable target. Documentation can be found in the `ScalableDimension` parameter at: [AWS Application Auto Scaling API Reference](http://docs.aws.amazon.com/ApplicationAutoScaling/latest/APIReference/API_RegisterScalableTarget.html#API_RegisterScalableTarget_RequestParameters)
    */
  val scalableDimension: Input[String] = js.native
  /**
    * The AWS service namespace of the scalable target. Documentation can be found in the `ServiceNamespace` parameter at: [AWS Application Auto Scaling API Reference](http://docs.aws.amazon.com/ApplicationAutoScaling/latest/APIReference/API_RegisterScalableTarget.html#API_RegisterScalableTarget_RequestParameters)
    */
  val serviceNamespace: Input[String] = js.native
  /**
    * Step scaling policy configuration, requires `policyType = "StepScaling"` (default). See supported fields below.
    */
  val stepScalingPolicyConfiguration: js.UndefOr[Input[PolicyStepScalingPolicyConfiguration]] = js.native
  /**
    * A target tracking policy, requires `policyType = "TargetTrackingScaling"`. See supported fields below.
    */
  val targetTrackingScalingPolicyConfiguration: js.UndefOr[Input[PolicyTargetTrackingScalingPolicyConfiguration]] = js.native
}

object PolicyArgs {
  @scala.inline
  def apply(
    resourceId: Input[String],
    scalableDimension: Input[String],
    serviceNamespace: Input[String],
    name: Input[String] = null,
    policyType: Input[String] = null,
    stepScalingPolicyConfiguration: Input[PolicyStepScalingPolicyConfiguration] = null,
    targetTrackingScalingPolicyConfiguration: Input[PolicyTargetTrackingScalingPolicyConfiguration] = null
  ): PolicyArgs = {
    val __obj = js.Dynamic.literal(resourceId = resourceId.asInstanceOf[js.Any], scalableDimension = scalableDimension.asInstanceOf[js.Any], serviceNamespace = serviceNamespace.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (policyType != null) __obj.updateDynamic("policyType")(policyType.asInstanceOf[js.Any])
    if (stepScalingPolicyConfiguration != null) __obj.updateDynamic("stepScalingPolicyConfiguration")(stepScalingPolicyConfiguration.asInstanceOf[js.Any])
    if (targetTrackingScalingPolicyConfiguration != null) __obj.updateDynamic("targetTrackingScalingPolicyConfiguration")(targetTrackingScalingPolicyConfiguration.asInstanceOf[js.Any])
    __obj.asInstanceOf[PolicyArgs]
  }
}

