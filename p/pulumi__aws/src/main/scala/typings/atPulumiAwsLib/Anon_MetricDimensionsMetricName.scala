package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_MetricDimensionsMetricName extends js.Object {
  var metricDimensions: js.UndefOr[
    atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[Anon_NameValue]]]
  ] = js.undefined
  var metricName: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  var namespace: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  var statistic: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  var unit: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
}

object Anon_MetricDimensionsMetricName {
  @scala.inline
  def apply(
    metricName: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    namespace: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    statistic: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    metricDimensions: atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[Anon_NameValue]]] = null,
    unit: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null
  ): Anon_MetricDimensionsMetricName = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("metricName")(metricName.asInstanceOf[js.Any])
    __obj.updateDynamic("namespace")(namespace.asInstanceOf[js.Any])
    __obj.updateDynamic("statistic")(statistic.asInstanceOf[js.Any])
    if (metricDimensions != null) __obj.updateDynamic("metricDimensions")(metricDimensions.asInstanceOf[js.Any])
    if (unit != null) __obj.updateDynamic("unit")(unit.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_MetricDimensionsMetricName]
  }
}

