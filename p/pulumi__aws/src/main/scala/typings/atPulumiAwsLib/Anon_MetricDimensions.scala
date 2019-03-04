package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_MetricDimensions extends js.Object {
  var metricDimensions: js.UndefOr[js.Array[Anon_Name]] = js.undefined
  var metricName: java.lang.String
  var namespace: java.lang.String
  var statistic: java.lang.String
  var unit: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_MetricDimensions {
  @scala.inline
  def apply(
    metricName: java.lang.String,
    namespace: java.lang.String,
    statistic: java.lang.String,
    metricDimensions: js.Array[Anon_Name] = null,
    unit: java.lang.String = null
  ): Anon_MetricDimensions = {
    val __obj = js.Dynamic.literal(metricName = metricName, namespace = namespace, statistic = statistic)
    if (metricDimensions != null) __obj.updateDynamic("metricDimensions")(metricDimensions)
    if (unit != null) __obj.updateDynamic("unit")(unit)
    __obj.asInstanceOf[Anon_MetricDimensions]
  }
}

