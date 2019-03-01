package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_MetricName extends js.Object {
  var metricName: java.lang.String
  var metricNamespace: java.lang.String
  var metricTimestamp: js.UndefOr[java.lang.String] = js.undefined
  var metricUnit: java.lang.String
  var metricValue: java.lang.String
  var roleArn: java.lang.String
}

object Anon_MetricName {
  @scala.inline
  def apply(
    metricName: java.lang.String,
    metricNamespace: java.lang.String,
    metricUnit: java.lang.String,
    metricValue: java.lang.String,
    roleArn: java.lang.String,
    metricTimestamp: java.lang.String = null
  ): Anon_MetricName = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("metricName")(metricName)
    __obj.updateDynamic("metricNamespace")(metricNamespace)
    __obj.updateDynamic("metricUnit")(metricUnit)
    __obj.updateDynamic("metricValue")(metricValue)
    __obj.updateDynamic("roleArn")(roleArn)
    if (metricTimestamp != null) __obj.updateDynamic("metricTimestamp")(metricTimestamp)
    __obj.asInstanceOf[Anon_MetricName]
  }
}

