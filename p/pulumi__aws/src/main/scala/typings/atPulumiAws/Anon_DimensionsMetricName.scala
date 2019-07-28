package typings.atPulumiAws

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DimensionsMetricName extends js.Object {
  var dimensions: js.UndefOr[Input[js.Array[Input[Anon_NameValue]]]] = js.undefined
  var metricName: Input[String]
  var namespace: Input[String]
  var statistic: Input[String]
  var unit: js.UndefOr[Input[String]] = js.undefined
}

object Anon_DimensionsMetricName {
  @scala.inline
  def apply(
    metricName: Input[String],
    namespace: Input[String],
    statistic: Input[String],
    dimensions: Input[js.Array[Input[Anon_NameValue]]] = null,
    unit: Input[String] = null
  ): Anon_DimensionsMetricName = {
    val __obj = js.Dynamic.literal(metricName = metricName.asInstanceOf[js.Any], namespace = namespace.asInstanceOf[js.Any], statistic = statistic.asInstanceOf[js.Any])
    if (dimensions != null) __obj.updateDynamic("dimensions")(dimensions.asInstanceOf[js.Any])
    if (unit != null) __obj.updateDynamic("unit")(unit.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_DimensionsMetricName]
  }
}

