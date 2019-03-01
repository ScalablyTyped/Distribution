package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Dimensions extends js.Object {
  var dimensions: js.UndefOr[js.Array[Anon_Name]] = js.undefined
  var metricName: java.lang.String
  var namespace: java.lang.String
  var statistic: java.lang.String
  var unit: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_Dimensions {
  @scala.inline
  def apply(
    metricName: java.lang.String,
    namespace: java.lang.String,
    statistic: java.lang.String,
    dimensions: js.Array[Anon_Name] = null,
    unit: java.lang.String = null
  ): Anon_Dimensions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("metricName")(metricName)
    __obj.updateDynamic("namespace")(namespace)
    __obj.updateDynamic("statistic")(statistic)
    if (dimensions != null) __obj.updateDynamic("dimensions")(dimensions)
    if (unit != null) __obj.updateDynamic("unit")(unit)
    __obj.asInstanceOf[Anon_Dimensions]
  }
}

