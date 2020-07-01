package typings.reactVis.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ArcSeriesPoint extends AbstractSeriesPoint {
  var angle: Double
  var angle0: Double
  var color: js.UndefOr[String | Double] = js.undefined
  var fill: js.UndefOr[String | Double] = js.undefined
  var opacity: js.UndefOr[String | Double] = js.undefined
  var radius: Double
  var radius0: Double
  var stroke: js.UndefOr[String | Double] = js.undefined
}

object ArcSeriesPoint {
  @scala.inline
  def apply(
    angle: Double,
    angle0: Double,
    radius: Double,
    radius0: Double,
    StringDictionary: StringDictionary[js.Any] = null,
    color: String | Double = null,
    fill: String | Double = null,
    opacity: String | Double = null,
    stroke: String | Double = null
  ): ArcSeriesPoint = {
    val __obj = js.Dynamic.literal(angle = angle.asInstanceOf[js.Any], angle0 = angle0.asInstanceOf[js.Any], radius = radius.asInstanceOf[js.Any], radius0 = radius0.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (fill != null) __obj.updateDynamic("fill")(fill.asInstanceOf[js.Any])
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (stroke != null) __obj.updateDynamic("stroke")(stroke.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArcSeriesPoint]
  }
}

