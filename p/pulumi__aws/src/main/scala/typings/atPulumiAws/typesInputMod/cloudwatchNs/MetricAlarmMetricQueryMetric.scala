package typings.atPulumiAws.typesInputMod.cloudwatchNs

import org.scalablytyped.runtime.StringDictionary
import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MetricAlarmMetricQueryMetric extends js.Object {
  /**
    * The dimensions for this metric.  For the list of available dimensions see the AWS documentation [here](http://docs.aws.amazon.com/AmazonCloudWatch/latest/DeveloperGuide/CW_Support_For_AWS.html).
    */
  var dimensions: js.UndefOr[Input[StringDictionary[_]]] = js.undefined
  /**
    * The name for this metric.
    * See docs for [supported metrics](https://docs.aws.amazon.com/AmazonCloudWatch/latest/DeveloperGuide/CW_Support_For_AWS.html).
    */
  var metricName: Input[String]
  /**
    * The namespace for this metric. See docs for the [list of namespaces](https://docs.aws.amazon.com/AmazonCloudWatch/latest/DeveloperGuide/aws-namespaces.html).
    * See docs for [supported metrics](https://docs.aws.amazon.com/AmazonCloudWatch/latest/DeveloperGuide/CW_Support_For_AWS.html).
    */
  var namespace: js.UndefOr[Input[String]] = js.undefined
  /**
    * The period in seconds over which the specified `stat` is applied.
    */
  var period: Input[Double]
  /**
    * The statistic to apply to this metric.
    * Either of the following is supported: `SampleCount`, `Average`, `Sum`, `Minimum`, `Maximum`
    */
  var stat: Input[String]
  /**
    * The unit for this metric.
    */
  var unit: js.UndefOr[Input[String]] = js.undefined
}

object MetricAlarmMetricQueryMetric {
  @scala.inline
  def apply(
    metricName: Input[String],
    period: Input[Double],
    stat: Input[String],
    dimensions: Input[StringDictionary[_]] = null,
    namespace: Input[String] = null,
    unit: Input[String] = null
  ): MetricAlarmMetricQueryMetric = {
    val __obj = js.Dynamic.literal(metricName = metricName.asInstanceOf[js.Any], period = period.asInstanceOf[js.Any], stat = stat.asInstanceOf[js.Any])
    if (dimensions != null) __obj.updateDynamic("dimensions")(dimensions.asInstanceOf[js.Any])
    if (namespace != null) __obj.updateDynamic("namespace")(namespace.asInstanceOf[js.Any])
    if (unit != null) __obj.updateDynamic("unit")(unit.asInstanceOf[js.Any])
    __obj.asInstanceOf[MetricAlarmMetricQueryMetric]
  }
}

