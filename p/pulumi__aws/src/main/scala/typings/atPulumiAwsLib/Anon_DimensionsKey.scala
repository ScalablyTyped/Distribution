package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DimensionsKey extends js.Object {
  var dimensions: js.UndefOr[org.scalablytyped.runtime.StringDictionary[js.Any]] = js.undefined
  var metricName: java.lang.String
  var namespace: js.UndefOr[java.lang.String] = js.undefined
  var period: scala.Double
  var stat: java.lang.String
  var unit: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_DimensionsKey {
  @scala.inline
  def apply(
    metricName: java.lang.String,
    period: scala.Double,
    stat: java.lang.String,
    dimensions: org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    namespace: java.lang.String = null,
    unit: java.lang.String = null
  ): Anon_DimensionsKey = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("metricName")(metricName)
    __obj.updateDynamic("period")(period)
    __obj.updateDynamic("stat")(stat)
    if (dimensions != null) __obj.updateDynamic("dimensions")(dimensions)
    if (namespace != null) __obj.updateDynamic("namespace")(namespace)
    if (unit != null) __obj.updateDynamic("unit")(unit)
    __obj.asInstanceOf[Anon_DimensionsKey]
  }
}

