package typings.atPulumiAws.typesOutputMod.cloudwatch

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MetricAlarmMetricQueryMetric extends js.Object {
  /**
    * The dimensions for this metric.  For the list of available dimensions see the AWS documentation [here](http://docs.aws.amazon.com/AmazonCloudWatch/latest/DeveloperGuide/CW_Support_For_AWS.html).
    */
  var dimensions: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  /**
    * The name for this metric.
    * See docs for [supported metrics](https://docs.aws.amazon.com/AmazonCloudWatch/latest/DeveloperGuide/CW_Support_For_AWS.html).
    */
  var metricName: String
  /**
    * The namespace for this metric. See docs for the [list of namespaces](https://docs.aws.amazon.com/AmazonCloudWatch/latest/DeveloperGuide/aws-namespaces.html).
    * See docs for [supported metrics](https://docs.aws.amazon.com/AmazonCloudWatch/latest/DeveloperGuide/CW_Support_For_AWS.html).
    */
  var namespace: js.UndefOr[String] = js.undefined
  /**
    * The period in seconds over which the specified `stat` is applied.
    */
  var period: Double
  /**
    * The statistic to apply to this metric.
    * Either of the following is supported: `SampleCount`, `Average`, `Sum`, `Minimum`, `Maximum`
    */
  var stat: String
  /**
    * The unit for this metric.
    */
  var unit: js.UndefOr[String] = js.undefined
}

object MetricAlarmMetricQueryMetric {
  @scala.inline
  def apply(
    metricName: String,
    period: Double,
    stat: String,
    dimensions: StringDictionary[js.Any] = null,
    namespace: String = null,
    unit: String = null
  ): MetricAlarmMetricQueryMetric = {
    val __obj = js.Dynamic.literal(metricName = metricName, period = period, stat = stat)
    if (dimensions != null) __obj.updateDynamic("dimensions")(dimensions)
    if (namespace != null) __obj.updateDynamic("namespace")(namespace)
    if (unit != null) __obj.updateDynamic("unit")(unit)
    __obj.asInstanceOf[MetricAlarmMetricQueryMetric]
  }
}

