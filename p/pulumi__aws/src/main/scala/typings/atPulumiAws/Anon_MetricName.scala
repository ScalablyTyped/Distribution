package typings.atPulumiAws

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_MetricName extends js.Object {
  var metricName: String
  var metricNamespace: String
  var metricTimestamp: js.UndefOr[String] = js.undefined
  var metricUnit: String
  var metricValue: String
  var roleArn: String
}

object Anon_MetricName {
  @scala.inline
  def apply(
    metricName: String,
    metricNamespace: String,
    metricUnit: String,
    metricValue: String,
    roleArn: String,
    metricTimestamp: String = null
  ): Anon_MetricName = {
    val __obj = js.Dynamic.literal(metricName = metricName, metricNamespace = metricNamespace, metricUnit = metricUnit, metricValue = metricValue, roleArn = roleArn)
    if (metricTimestamp != null) __obj.updateDynamic("metricTimestamp")(metricTimestamp)
    __obj.asInstanceOf[Anon_MetricName]
  }
}

