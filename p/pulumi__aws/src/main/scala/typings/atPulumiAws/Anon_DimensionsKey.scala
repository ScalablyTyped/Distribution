package typings.atPulumiAws

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DimensionsKey extends js.Object {
  var dimensions: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  var metricName: String
  var namespace: js.UndefOr[String] = js.undefined
  var period: Double
  var stat: String
  var unit: js.UndefOr[String] = js.undefined
}

object Anon_DimensionsKey {
  @scala.inline
  def apply(
    metricName: String,
    period: Double,
    stat: String,
    dimensions: StringDictionary[js.Any] = null,
    namespace: String = null,
    unit: String = null
  ): Anon_DimensionsKey = {
    val __obj = js.Dynamic.literal(metricName = metricName, period = period, stat = stat)
    if (dimensions != null) __obj.updateDynamic("dimensions")(dimensions)
    if (namespace != null) __obj.updateDynamic("namespace")(namespace)
    if (unit != null) __obj.updateDynamic("unit")(unit)
    __obj.asInstanceOf[Anon_DimensionsKey]
  }
}

