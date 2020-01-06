package typings.atPulumiAws.typesInputMod.appautoscaling

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PolicyTargetTrackingScalingPolicyConfiguration extends js.Object {
  var customizedMetricSpecification: js.UndefOr[
    Input[PolicyTargetTrackingScalingPolicyConfigurationCustomizedMetricSpecification]
  ] = js.native
  var disableScaleIn: js.UndefOr[Input[Boolean]] = js.native
  var predefinedMetricSpecification: js.UndefOr[
    Input[PolicyTargetTrackingScalingPolicyConfigurationPredefinedMetricSpecification]
  ] = js.native
  var scaleInCooldown: js.UndefOr[Input[Double]] = js.native
  var scaleOutCooldown: js.UndefOr[Input[Double]] = js.native
  var targetValue: Input[Double] = js.native
}

object PolicyTargetTrackingScalingPolicyConfiguration {
  @scala.inline
  def apply(
    targetValue: Input[Double],
    customizedMetricSpecification: Input[PolicyTargetTrackingScalingPolicyConfigurationCustomizedMetricSpecification] = null,
    disableScaleIn: Input[Boolean] = null,
    predefinedMetricSpecification: Input[PolicyTargetTrackingScalingPolicyConfigurationPredefinedMetricSpecification] = null,
    scaleInCooldown: Input[Double] = null,
    scaleOutCooldown: Input[Double] = null
  ): PolicyTargetTrackingScalingPolicyConfiguration = {
    val __obj = js.Dynamic.literal(targetValue = targetValue.asInstanceOf[js.Any])
    if (customizedMetricSpecification != null) __obj.updateDynamic("customizedMetricSpecification")(customizedMetricSpecification.asInstanceOf[js.Any])
    if (disableScaleIn != null) __obj.updateDynamic("disableScaleIn")(disableScaleIn.asInstanceOf[js.Any])
    if (predefinedMetricSpecification != null) __obj.updateDynamic("predefinedMetricSpecification")(predefinedMetricSpecification.asInstanceOf[js.Any])
    if (scaleInCooldown != null) __obj.updateDynamic("scaleInCooldown")(scaleInCooldown.asInstanceOf[js.Any])
    if (scaleOutCooldown != null) __obj.updateDynamic("scaleOutCooldown")(scaleOutCooldown.asInstanceOf[js.Any])
    __obj.asInstanceOf[PolicyTargetTrackingScalingPolicyConfiguration]
  }
}

