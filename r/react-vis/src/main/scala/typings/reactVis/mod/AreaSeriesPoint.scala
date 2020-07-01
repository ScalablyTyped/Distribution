package typings.reactVis.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AreaSeriesPoint extends AbstractSeriesPoint {
  var x: Double
  var y: Double
  var y0: js.UndefOr[Double] = js.undefined
}

object AreaSeriesPoint {
  @scala.inline
  def apply(
    x: Double,
    y: Double,
    StringDictionary: StringDictionary[js.Any] = null,
    y0: js.UndefOr[Double] = js.undefined
  ): AreaSeriesPoint = {
    val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (!js.isUndefined(y0)) __obj.updateDynamic("y0")(y0.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[AreaSeriesPoint]
  }
}

