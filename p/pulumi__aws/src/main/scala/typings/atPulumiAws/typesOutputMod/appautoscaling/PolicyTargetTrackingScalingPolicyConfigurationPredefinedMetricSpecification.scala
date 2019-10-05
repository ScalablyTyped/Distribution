package typings.atPulumiAws.typesOutputMod.appautoscaling

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PolicyTargetTrackingScalingPolicyConfigurationPredefinedMetricSpecification extends js.Object {
  var predefinedMetricType: String
  var resourceLabel: js.UndefOr[String] = js.undefined
}

object PolicyTargetTrackingScalingPolicyConfigurationPredefinedMetricSpecification {
  @scala.inline
  def apply(predefinedMetricType: String, resourceLabel: String = null): PolicyTargetTrackingScalingPolicyConfigurationPredefinedMetricSpecification = {
    val __obj = js.Dynamic.literal(predefinedMetricType = predefinedMetricType)
    if (resourceLabel != null) __obj.updateDynamic("resourceLabel")(resourceLabel)
    __obj.asInstanceOf[PolicyTargetTrackingScalingPolicyConfigurationPredefinedMetricSpecification]
  }
}

