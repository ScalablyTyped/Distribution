package typings
package reactDashNativeDashSvgDashChartsLib.reactDashNativeDashSvgDashChartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TooltipProps extends js.Object {
  var height: js.UndefOr[scala.Double] = js.undefined
  var index: js.UndefOr[scala.Double] = js.undefined
  var pointStroke: js.UndefOr[java.lang.String] = js.undefined
  var stroke: js.UndefOr[java.lang.String] = js.undefined
  var text: java.lang.String
  var value: js.UndefOr[scala.Double] = js.undefined
}

object TooltipProps {
  @scala.inline
  def apply(
    text: java.lang.String,
    height: scala.Int | scala.Double = null,
    index: scala.Int | scala.Double = null,
    pointStroke: java.lang.String = null,
    stroke: java.lang.String = null,
    value: scala.Int | scala.Double = null
  ): TooltipProps = {
    val __obj = js.Dynamic.literal(text = text)
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (index != null) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    if (pointStroke != null) __obj.updateDynamic("pointStroke")(pointStroke)
    if (stroke != null) __obj.updateDynamic("stroke")(stroke)
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[TooltipProps]
  }
}

