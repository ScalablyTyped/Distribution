package typings.atPulumiAws

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Dimensions extends js.Object {
  var dimensions: js.UndefOr[js.Array[Anon_Name]] = js.undefined
  var metricName: String
  var namespace: String
  var statistic: String
  var unit: js.UndefOr[String] = js.undefined
}

object Anon_Dimensions {
  @scala.inline
  def apply(
    metricName: String,
    namespace: String,
    statistic: String,
    dimensions: js.Array[Anon_Name] = null,
    unit: String = null
  ): Anon_Dimensions = {
    val __obj = js.Dynamic.literal(metricName = metricName, namespace = namespace, statistic = statistic)
    if (dimensions != null) __obj.updateDynamic("dimensions")(dimensions)
    if (unit != null) __obj.updateDynamic("unit")(unit)
    __obj.asInstanceOf[Anon_Dimensions]
  }
}

