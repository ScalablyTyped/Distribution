package typings.atPulumiAws.typesOutputMod.appautoscaling

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PolicyTargetTrackingScalingPolicyConfigurationCustomizedMetricSpecification extends js.Object {
  var dimensions: js.UndefOr[
    js.Array[
      PolicyTargetTrackingScalingPolicyConfigurationCustomizedMetricSpecificationDimension
    ]
  ] = js.native
  var metricName: String = js.native
  var namespace: String = js.native
  var statistic: String = js.native
  var unit: js.UndefOr[String] = js.native
}

object PolicyTargetTrackingScalingPolicyConfigurationCustomizedMetricSpecification {
  @scala.inline
  def apply(
    metricName: String,
    namespace: String,
    statistic: String,
    dimensions: js.Array[
      PolicyTargetTrackingScalingPolicyConfigurationCustomizedMetricSpecificationDimension
    ] = null,
    unit: String = null
  ): PolicyTargetTrackingScalingPolicyConfigurationCustomizedMetricSpecification = {
    val __obj = js.Dynamic.literal(metricName = metricName.asInstanceOf[js.Any], namespace = namespace.asInstanceOf[js.Any], statistic = statistic.asInstanceOf[js.Any])
    if (dimensions != null) __obj.updateDynamic("dimensions")(dimensions.asInstanceOf[js.Any])
    if (unit != null) __obj.updateDynamic("unit")(unit.asInstanceOf[js.Any])
    __obj.asInstanceOf[PolicyTargetTrackingScalingPolicyConfigurationCustomizedMetricSpecification]
  }
}

