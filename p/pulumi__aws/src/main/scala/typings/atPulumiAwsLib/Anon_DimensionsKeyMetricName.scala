package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DimensionsKeyMetricName extends js.Object {
  var dimensions: js.UndefOr[atPulumiPulumiLib.outputMod.Input[org.scalablytyped.runtime.StringDictionary[_]]] = js.undefined
  var metricName: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  var namespace: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  var period: atPulumiPulumiLib.outputMod.Input[scala.Double]
  var stat: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  var unit: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
}

object Anon_DimensionsKeyMetricName {
  @scala.inline
  def apply(
    metricName: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    period: atPulumiPulumiLib.outputMod.Input[scala.Double],
    stat: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    dimensions: atPulumiPulumiLib.outputMod.Input[org.scalablytyped.runtime.StringDictionary[_]] = null,
    namespace: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    unit: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null
  ): Anon_DimensionsKeyMetricName = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("metricName")(metricName.asInstanceOf[js.Any])
    __obj.updateDynamic("period")(period.asInstanceOf[js.Any])
    __obj.updateDynamic("stat")(stat.asInstanceOf[js.Any])
    if (dimensions != null) __obj.updateDynamic("dimensions")(dimensions.asInstanceOf[js.Any])
    if (namespace != null) __obj.updateDynamic("namespace")(namespace.asInstanceOf[js.Any])
    if (unit != null) __obj.updateDynamic("unit")(unit.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_DimensionsKeyMetricName]
  }
}

