package typings.atPulumiAws.typesInputMod.autoscalingNs

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PolicyTargetTrackingConfigurationPredefinedMetricSpecification extends js.Object {
  /**
    * The metric type.
    */
  var predefinedMetricType: Input[String]
  /**
    * Identifies the resource associated with the metric type.
    */
  var resourceLabel: js.UndefOr[Input[String]] = js.undefined
}

object PolicyTargetTrackingConfigurationPredefinedMetricSpecification {
  @scala.inline
  def apply(predefinedMetricType: Input[String], resourceLabel: Input[String] = null): PolicyTargetTrackingConfigurationPredefinedMetricSpecification = {
    val __obj = js.Dynamic.literal(predefinedMetricType = predefinedMetricType.asInstanceOf[js.Any])
    if (resourceLabel != null) __obj.updateDynamic("resourceLabel")(resourceLabel.asInstanceOf[js.Any])
    __obj.asInstanceOf[PolicyTargetTrackingConfigurationPredefinedMetricSpecification]
  }
}

