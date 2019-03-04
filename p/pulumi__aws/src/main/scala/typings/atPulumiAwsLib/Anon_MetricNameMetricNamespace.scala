package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_MetricNameMetricNamespace extends js.Object {
  var metricName: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  var metricNamespace: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  var metricTimestamp: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  var metricUnit: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  var metricValue: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  var roleArn: atPulumiPulumiLib.outputMod.Input[java.lang.String]
}

object Anon_MetricNameMetricNamespace {
  @scala.inline
  def apply(
    metricName: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    metricNamespace: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    metricUnit: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    metricValue: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    roleArn: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    metricTimestamp: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null
  ): Anon_MetricNameMetricNamespace = {
    val __obj = js.Dynamic.literal(metricName = metricName.asInstanceOf[js.Any], metricNamespace = metricNamespace.asInstanceOf[js.Any], metricUnit = metricUnit.asInstanceOf[js.Any], metricValue = metricValue.asInstanceOf[js.Any], roleArn = roleArn.asInstanceOf[js.Any])
    if (metricTimestamp != null) __obj.updateDynamic("metricTimestamp")(metricTimestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_MetricNameMetricNamespace]
  }
}

