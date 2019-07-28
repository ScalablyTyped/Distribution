package typings.atPulumiAws

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_MetricNameMetricNamespace extends js.Object {
  var metricName: Input[String]
  var metricNamespace: Input[String]
  var metricTimestamp: js.UndefOr[Input[String]] = js.undefined
  var metricUnit: Input[String]
  var metricValue: Input[String]
  var roleArn: Input[String]
}

object Anon_MetricNameMetricNamespace {
  @scala.inline
  def apply(
    metricName: Input[String],
    metricNamespace: Input[String],
    metricUnit: Input[String],
    metricValue: Input[String],
    roleArn: Input[String],
    metricTimestamp: Input[String] = null
  ): Anon_MetricNameMetricNamespace = {
    val __obj = js.Dynamic.literal(metricName = metricName.asInstanceOf[js.Any], metricNamespace = metricNamespace.asInstanceOf[js.Any], metricUnit = metricUnit.asInstanceOf[js.Any], metricValue = metricValue.asInstanceOf[js.Any], roleArn = roleArn.asInstanceOf[js.Any])
    if (metricTimestamp != null) __obj.updateDynamic("metricTimestamp")(metricTimestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_MetricNameMetricNamespace]
  }
}

