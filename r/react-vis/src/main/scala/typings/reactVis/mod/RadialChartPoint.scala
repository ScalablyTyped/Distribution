package typings.reactVis.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RadialChartPoint extends AbstractSeriesPoint {
  var angle: Double
  var className: js.UndefOr[String] = js.undefined
  var color: js.UndefOr[String] = js.undefined
  var label: js.UndefOr[String] = js.undefined
  var radius: js.UndefOr[Double] = js.undefined
  var style: js.UndefOr[js.Object] = js.undefined
  var subLabel: js.UndefOr[String] = js.undefined
}

object RadialChartPoint {
  @scala.inline
  def apply(
    angle: Double,
    StringDictionary: StringDictionary[js.Any] = null,
    className: String = null,
    color: String = null,
    label: String = null,
    radius: js.UndefOr[Double] = js.undefined,
    style: js.Object = null,
    subLabel: String = null
  ): RadialChartPoint = {
    val __obj = js.Dynamic.literal(angle = angle.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (!js.isUndefined(radius)) __obj.updateDynamic("radius")(radius.get.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (subLabel != null) __obj.updateDynamic("subLabel")(subLabel.asInstanceOf[js.Any])
    __obj.asInstanceOf[RadialChartPoint]
  }
}

