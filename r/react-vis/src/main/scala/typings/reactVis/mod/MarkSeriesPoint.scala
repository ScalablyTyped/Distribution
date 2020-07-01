package typings.reactVis.mod

import org.scalablytyped.runtime.StringDictionary
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MarkSeriesPoint extends AbstractSeriesPoint {
  var color: js.UndefOr[String | Double] = js.undefined
  var fill: js.UndefOr[String | Double] = js.undefined
  var opacity: js.UndefOr[String | Double] = js.undefined
  var size: js.UndefOr[String | Double] = js.undefined
  var stroke: js.UndefOr[String | Double] = js.undefined
  var x: String | Double | Date
  var y: String | Double | Date
}

object MarkSeriesPoint {
  @scala.inline
  def apply(
    x: String | Double | Date,
    y: String | Double | Date,
    StringDictionary: StringDictionary[js.Any] = null,
    color: String | Double = null,
    fill: String | Double = null,
    opacity: String | Double = null,
    size: String | Double = null,
    stroke: String | Double = null
  ): MarkSeriesPoint = {
    val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (fill != null) __obj.updateDynamic("fill")(fill.asInstanceOf[js.Any])
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (stroke != null) __obj.updateDynamic("stroke")(stroke.asInstanceOf[js.Any])
    __obj.asInstanceOf[MarkSeriesPoint]
  }
}

