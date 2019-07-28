package typings.atPulumiAws

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_MetricDimensionsMetricName extends js.Object {
  var metricDimensions: js.UndefOr[Input[js.Array[Input[Anon_NameValue]]]] = js.undefined
  var metricName: Input[String]
  var namespace: Input[String]
  var statistic: Input[String]
  var unit: js.UndefOr[Input[String]] = js.undefined
}

object Anon_MetricDimensionsMetricName {
  @scala.inline
  def apply(
    metricName: Input[String],
    namespace: Input[String],
    statistic: Input[String],
    metricDimensions: Input[js.Array[Input[Anon_NameValue]]] = null,
    unit: Input[String] = null
  ): Anon_MetricDimensionsMetricName = {
    val __obj = js.Dynamic.literal(metricName = metricName.asInstanceOf[js.Any], namespace = namespace.asInstanceOf[js.Any], statistic = statistic.asInstanceOf[js.Any])
    if (metricDimensions != null) __obj.updateDynamic("metricDimensions")(metricDimensions.asInstanceOf[js.Any])
    if (unit != null) __obj.updateDynamic("unit")(unit.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_MetricDimensionsMetricName]
  }
}

