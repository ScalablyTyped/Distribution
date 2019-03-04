package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DimensionsMetricName extends js.Object {
  var dimensions: js.UndefOr[
    atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[Anon_NameValue]]]
  ] = js.undefined
  var metricName: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  var namespace: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  var statistic: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  var unit: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
}

object Anon_DimensionsMetricName {
  @scala.inline
  def apply(
    metricName: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    namespace: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    statistic: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    dimensions: atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[Anon_NameValue]]] = null,
    unit: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null
  ): Anon_DimensionsMetricName = {
    val __obj = js.Dynamic.literal(metricName = metricName.asInstanceOf[js.Any], namespace = namespace.asInstanceOf[js.Any], statistic = statistic.asInstanceOf[js.Any])
    if (dimensions != null) __obj.updateDynamic("dimensions")(dimensions.asInstanceOf[js.Any])
    if (unit != null) __obj.updateDynamic("unit")(unit.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_DimensionsMetricName]
  }
}

