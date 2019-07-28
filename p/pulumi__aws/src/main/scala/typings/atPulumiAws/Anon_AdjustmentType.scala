package typings.atPulumiAws

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AdjustmentType extends js.Object {
  var adjustmentType: js.UndefOr[String] = js.undefined
  var cooldown: js.UndefOr[Double] = js.undefined
  var metricAggregationType: js.UndefOr[String] = js.undefined
  var minAdjustmentMagnitude: js.UndefOr[Double] = js.undefined
  var stepAdjustments: js.UndefOr[js.Array[Anon_MetricIntervalLowerBound]] = js.undefined
}

object Anon_AdjustmentType {
  @scala.inline
  def apply(
    adjustmentType: String = null,
    cooldown: Int | Double = null,
    metricAggregationType: String = null,
    minAdjustmentMagnitude: Int | Double = null,
    stepAdjustments: js.Array[Anon_MetricIntervalLowerBound] = null
  ): Anon_AdjustmentType = {
    val __obj = js.Dynamic.literal()
    if (adjustmentType != null) __obj.updateDynamic("adjustmentType")(adjustmentType)
    if (cooldown != null) __obj.updateDynamic("cooldown")(cooldown.asInstanceOf[js.Any])
    if (metricAggregationType != null) __obj.updateDynamic("metricAggregationType")(metricAggregationType)
    if (minAdjustmentMagnitude != null) __obj.updateDynamic("minAdjustmentMagnitude")(minAdjustmentMagnitude.asInstanceOf[js.Any])
    if (stepAdjustments != null) __obj.updateDynamic("stepAdjustments")(stepAdjustments)
    __obj.asInstanceOf[Anon_AdjustmentType]
  }
}

