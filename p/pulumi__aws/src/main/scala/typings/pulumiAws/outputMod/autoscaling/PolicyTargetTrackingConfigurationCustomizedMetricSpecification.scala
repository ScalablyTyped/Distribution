package typings.pulumiAws.outputMod.autoscaling

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PolicyTargetTrackingConfigurationCustomizedMetricSpecification extends js.Object {
  /**
    * The dimensions of the metric.
    */
  var metricDimensions: js.UndefOr[
    js.Array[PolicyTargetTrackingConfigurationCustomizedMetricSpecificationMetricDimension]
  ] = js.native
  /**
    * The name of the metric.
    */
  var metricName: String = js.native
  /**
    * The namespace of the metric.
    */
  var namespace: String = js.native
  /**
    * The statistic of the metric.
    */
  var statistic: String = js.native
  /**
    * The unit of the metric.
    */
  var unit: js.UndefOr[String] = js.native
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
    val __obj = js.Dynamic.literal(metricName = metricName.asInstanceOf[js.Any], namespace = namespace.asInstanceOf[js.Any], statistic = statistic.asInstanceOf[js.Any])
    if (metricDimensions != null) __obj.updateDynamic("metricDimensions")(metricDimensions.asInstanceOf[js.Any])
    if (unit != null) __obj.updateDynamic("unit")(unit.asInstanceOf[js.Any])
    __obj.asInstanceOf[PolicyTargetTrackingConfigurationCustomizedMetricSpecification]
  }
}

