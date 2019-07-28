package typings.atPulumiAws

import org.scalablytyped.runtime.StringDictionary
import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DimensionsKeyMetricName extends js.Object {
  var dimensions: js.UndefOr[Input[StringDictionary[_]]] = js.undefined
  var metricName: Input[String]
  var namespace: js.UndefOr[Input[String]] = js.undefined
  var period: Input[Double]
  var stat: Input[String]
  var unit: js.UndefOr[Input[String]] = js.undefined
}

object Anon_DimensionsKeyMetricName {
  @scala.inline
  def apply(
    metricName: Input[String],
    period: Input[Double],
    stat: Input[String],
    dimensions: Input[StringDictionary[_]] = null,
    namespace: Input[String] = null,
    unit: Input[String] = null
  ): Anon_DimensionsKeyMetricName = {
    val __obj = js.Dynamic.literal(metricName = metricName.asInstanceOf[js.Any], period = period.asInstanceOf[js.Any], stat = stat.asInstanceOf[js.Any])
    if (dimensions != null) __obj.updateDynamic("dimensions")(dimensions.asInstanceOf[js.Any])
    if (namespace != null) __obj.updateDynamic("namespace")(namespace.asInstanceOf[js.Any])
    if (unit != null) __obj.updateDynamic("unit")(unit.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_DimensionsKeyMetricName]
  }
}

