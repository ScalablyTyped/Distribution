package typings.atPulumiAws.typesInputMod.appautoscalingNs

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PolicyTargetTrackingScalingPolicyConfigurationPredefinedMetricSpecification extends js.Object {
  var predefinedMetricType: Input[String]
  var resourceLabel: js.UndefOr[Input[String]] = js.undefined
}

object PolicyTargetTrackingScalingPolicyConfigurationPredefinedMetricSpecification {
  @scala.inline
  def apply(predefinedMetricType: Input[String], resourceLabel: Input[String] = null): PolicyTargetTrackingScalingPolicyConfigurationPredefinedMetricSpecification = {
    val __obj = js.Dynamic.literal(predefinedMetricType = predefinedMetricType.asInstanceOf[js.Any])
    if (resourceLabel != null) __obj.updateDynamic("resourceLabel")(resourceLabel.asInstanceOf[js.Any])
    __obj.asInstanceOf[PolicyTargetTrackingScalingPolicyConfigurationPredefinedMetricSpecification]
  }
}

