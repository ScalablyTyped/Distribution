package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_MetricIntervalLowerBound extends js.Object {
  var metricIntervalLowerBound: js.UndefOr[java.lang.String] = js.undefined
  var metricIntervalUpperBound: js.UndefOr[java.lang.String] = js.undefined
  var scalingAdjustment: scala.Double
}

object Anon_MetricIntervalLowerBound {
  @scala.inline
  def apply(
    scalingAdjustment: scala.Double,
    metricIntervalLowerBound: java.lang.String = null,
    metricIntervalUpperBound: java.lang.String = null
  ): Anon_MetricIntervalLowerBound = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("scalingAdjustment")(scalingAdjustment)
    if (metricIntervalLowerBound != null) __obj.updateDynamic("metricIntervalLowerBound")(metricIntervalLowerBound)
    if (metricIntervalUpperBound != null) __obj.updateDynamic("metricIntervalUpperBound")(metricIntervalUpperBound)
    __obj.asInstanceOf[Anon_MetricIntervalLowerBound]
  }
}

