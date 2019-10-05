package typings.atPulumiAws.typesOutputMod.autoscaling

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PolicyTargetTrackingConfigurationCustomizedMetricSpecification extends js.Object {
  /**
    * The dimensions of the metric.
    */
  var metricDimensions: js.UndefOr[
    js.Array[PolicyTargetTrackingConfigurationCustomizedMetricSpecificationMetricDimension]
  ] = js.undefined
  /**
    * The name of the metric.
    */
  var metricName: String
  /**
    * The namespace of the metric.
    */
  var namespace: String
  /**
    * The statistic of the metric.
    */
  var statistic: String
  /**
    * The unit of the metric.
    */
  var unit: js.UndefOr[String] = js.undefined
}

object PolicyTargetTrackingConfigurationCustomizedMetricSpecification {
  @scala.inline
  def apply(
    metricName: String,
    namespace: String,
    statistic: String,
    metricDimensions: js.Array[PolicyTargetTrackingConfigurationCustomizedMetricSpecificationMetricDimension] = null,
    unit: String = null
  ): PolicyTargetTrackingConfigurationCustomizedMetricSpecification = {
    val __obj = js.Dynamic.literal(metricName = metricName, namespace = namespace, statistic = statistic)
    if (metricDimensions != null) __obj.updateDynamic("metricDimensions")(metricDimensions)
    if (unit != null) __obj.updateDynamic("unit")(unit)
    __obj.asInstanceOf[PolicyTargetTrackingConfigurationCustomizedMetricSpecification]
  }
}

