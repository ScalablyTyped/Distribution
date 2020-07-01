package typings.reactVis.mod

import org.scalablytyped.runtime.StringDictionary
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RectSeriesPoint extends AbstractSeriesPoint {
  var color: js.UndefOr[String | Double] = js.undefined
  var fill: js.UndefOr[String | Double] = js.undefined
  var opacity: js.UndefOr[String | Double] = js.undefined
  var stroke: js.UndefOr[String | Double] = js.undefined
  var x: String | Double | Date
  var x0: String | Double | Date
  var y: String | Double | Date
  var y0: String | Double | Date
}

object RectSeriesPoint {
  @scala.inline
  def apply(
    x: String | Double | Date,
    x0: String | Double | Date,
    y: String | Double | Date,
    y0: String | Double | Date,
    StringDictionary: StringDictionary[js.Any] = null,
    color: String | Double = null,
    fill: String | Double = null,
    opacity: String | Double = null,
    stroke: String | Double = null
  ): RectSeriesPoint = {
    val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], x0 = x0.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], y0 = y0.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (fill != null) __obj.updateDynamic("fill")(fill.asInstanceOf[js.Any])
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (stroke != null) __obj.updateDynamic("stroke")(stroke.asInstanceOf[js.Any])
    __obj.asInstanceOf[RectSeriesPoint]
  }
}

