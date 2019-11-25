package typings.reactDashNativeDashSvgDashCharts.reactDashNativeDashSvgDashChartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TooltipProps extends js.Object {
  var height: js.UndefOr[Double] = js.undefined
  var index: js.UndefOr[Double] = js.undefined
  var pointStroke: js.UndefOr[String] = js.undefined
  var stroke: js.UndefOr[String] = js.undefined
  var text: String
  var value: js.UndefOr[Double] = js.undefined
}

object TooltipProps {
  @scala.inline
  def apply(
    text: String,
    height: Int | Double = null,
    index: Int | Double = null,
    pointStroke: String = null,
    stroke: String = null,
    value: Int | Double = null
  ): TooltipProps = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (index != null) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    if (pointStroke != null) __obj.updateDynamic("pointStroke")(pointStroke.asInstanceOf[js.Any])
    if (stroke != null) __obj.updateDynamic("stroke")(stroke.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[TooltipProps]
  }
}

