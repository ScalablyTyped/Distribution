package typings.atPulumiAws.typesOutputMod.autoscalingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PolicyTargetTrackingConfigurationPredefinedMetricSpecification extends js.Object {
  /**
    * The metric type.
    */
  var predefinedMetricType: String
  /**
    * Identifies the resource associated with the metric type.
    */
  var resourceLabel: js.UndefOr[String] = js.undefined
}

object PolicyTargetTrackingConfigurationPredefinedMetricSpecification {
  @scala.inline
  def apply(predefinedMetricType: String, resourceLabel: String = null): PolicyTargetTrackingConfigurationPredefinedMetricSpecification = {
    val __obj = js.Dynamic.literal(predefinedMetricType = predefinedMetricType)
    if (resourceLabel != null) __obj.updateDynamic("resourceLabel")(resourceLabel)
    __obj.asInstanceOf[PolicyTargetTrackingConfigurationPredefinedMetricSpecification]
  }
}

