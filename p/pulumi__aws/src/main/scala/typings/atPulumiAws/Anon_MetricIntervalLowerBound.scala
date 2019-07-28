package typings.atPulumiAws

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_MetricIntervalLowerBound extends js.Object {
  var metricIntervalLowerBound: js.UndefOr[String] = js.undefined
  var metricIntervalUpperBound: js.UndefOr[String] = js.undefined
  var scalingAdjustment: Double
}

object Anon_MetricIntervalLowerBound {
  @scala.inline
  def apply(
    scalingAdjustment: Double,
    metricIntervalLowerBound: String = null,
    metricIntervalUpperBound: String = null
  ): Anon_MetricIntervalLowerBound = {
    val __obj = js.Dynamic.literal(scalingAdjustment = scalingAdjustment)
    if (metricIntervalLowerBound != null) __obj.updateDynamic("metricIntervalLowerBound")(metricIntervalLowerBound)
    if (metricIntervalUpperBound != null) __obj.updateDynamic("metricIntervalUpperBound")(metricIntervalUpperBound)
    __obj.asInstanceOf[Anon_MetricIntervalLowerBound]
  }
}

