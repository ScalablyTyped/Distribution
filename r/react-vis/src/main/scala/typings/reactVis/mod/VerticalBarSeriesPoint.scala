package typings.reactVis.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VerticalBarSeriesPoint extends AbstractSeriesPoint {
  var color: js.UndefOr[String | Double] = js.undefined
  var fill: js.UndefOr[String | Double] = js.undefined
  var opacity: js.UndefOr[String | Double] = js.undefined
  var stroke: js.UndefOr[String | Double] = js.undefined
  var x: String | Double
  var y: Double
}

object VerticalBarSeriesPoint {
  @scala.inline
  def apply(
    x: String | Double,
    y: Double,
    StringDictionary: StringDictionary[js.Any] = null,
    color: String | Double = null,
    fill: String | Double = null,
    opacity: String | Double = null,
    stroke: String | Double = null
  ): VerticalBarSeriesPoint = {
    val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (fill != null) __obj.updateDynamic("fill")(fill.asInstanceOf[js.Any])
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (stroke != null) __obj.updateDynamic("stroke")(stroke.asInstanceOf[js.Any])
    __obj.asInstanceOf[VerticalBarSeriesPoint]
  }
}

