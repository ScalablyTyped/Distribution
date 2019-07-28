package typings.atPulumiAws

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_MetricDimensions extends js.Object {
  var metricDimensions: js.UndefOr[js.Array[Anon_Name]] = js.undefined
  var metricName: String
  var namespace: String
  var statistic: String
  var unit: js.UndefOr[String] = js.undefined
}

object Anon_MetricDimensions {
  @scala.inline
  def apply(
    metricName: String,
    namespace: String,
    statistic: String,
    metricDimensions: js.Array[Anon_Name] = null,
    unit: String = null
  ): Anon_MetricDimensions = {
    val __obj = js.Dynamic.literal(metricName = metricName, namespace = namespace, statistic = statistic)
    if (metricDimensions != null) __obj.updateDynamic("metricDimensions")(metricDimensions)
    if (unit != null) __obj.updateDynamic("unit")(unit)
    __obj.asInstanceOf[Anon_MetricDimensions]
  }
}

