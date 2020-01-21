package typings.pulumiAws.inputMod.autoscaling

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PolicyTargetTrackingConfigurationPredefinedMetricSpecification extends js.Object {
  /**
    * The metric type.
    */
  var predefinedMetricType: Input[String] = js.native
  /**
    * Identifies the resource associated with the metric type.
    */
  var resourceLabel: js.UndefOr[Input[String]] = js.native
}

object PolicyTargetTrackingConfigurationPredefinedMetricSpecification {
  @scala.inline
  def apply(predefinedMetricType: Input[String], resourceLabel: Input[String] = null): PolicyTargetTrackingConfigurationPredefinedMetricSpecification = {
    val __obj = js.Dynamic.literal(predefinedMetricType = predefinedMetricType.asInstanceOf[js.Any])
    if (resourceLabel != null) __obj.updateDynamic("resourceLabel")(resourceLabel.asInstanceOf[js.Any])
    __obj.asInstanceOf[PolicyTargetTrackingConfigurationPredefinedMetricSpecification]
  }
}

