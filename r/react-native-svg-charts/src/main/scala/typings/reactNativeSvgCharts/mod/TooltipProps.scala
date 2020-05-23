package typings.reactNativeSvgCharts.mod

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
    height: js.UndefOr[Double] = js.undefined,
    index: js.UndefOr[Double] = js.undefined,
    pointStroke: String = null,
    stroke: String = null,
    value: js.UndefOr[Double] = js.undefined
  ): TooltipProps = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
    if (!js.isUndefined(height)) __obj.updateDynamic("height")(height.get.asInstanceOf[js.Any])
    if (!js.isUndefined(index)) __obj.updateDynamic("index")(index.get.asInstanceOf[js.Any])
    if (pointStroke != null) __obj.updateDynamic("pointStroke")(pointStroke.asInstanceOf[js.Any])
    if (stroke != null) __obj.updateDynamic("stroke")(stroke.asInstanceOf[js.Any])
    if (!js.isUndefined(value)) __obj.updateDynamic("value")(value.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[TooltipProps]
  }
}

