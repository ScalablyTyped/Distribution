package typings.atPulumiAws.typesOutputMod.appautoscalingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PolicyTargetTrackingScalingPolicyConfigurationCustomizedMetricSpecification extends js.Object {
  var dimensions: js.UndefOr[
    js.Array[
      PolicyTargetTrackingScalingPolicyConfigurationCustomizedMetricSpecificationDimension
    ]
  ] = js.undefined
  var metricName: String
  var namespace: String
  var statistic: String
  var unit: js.UndefOr[String] = js.undefined
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
    val __obj = js.Dynamic.literal(metricName = metricName, namespace = namespace, statistic = statistic)
    if (dimensions != null) __obj.updateDynamic("dimensions")(dimensions)
    if (unit != null) __obj.updateDynamic("unit")(unit)
    __obj.asInstanceOf[PolicyTargetTrackingScalingPolicyConfigurationCustomizedMetricSpecification]
  }
}

