package typings.reactDashNativeDashSvgDashCharts.reactDashNativeDashSvgDashChartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PointProps extends js.Object {
  var color: js.UndefOr[String] = js.undefined
  var index: js.UndefOr[Double] = js.undefined
  var radius: js.UndefOr[Double] = js.undefined
  var value: js.UndefOr[Double] = js.undefined
}

object PointProps {
  @scala.inline
  def apply(
    color: String = null,
    index: Int | Double = null,
    radius: Int | Double = null,
    value: Int | Double = null
  ): PointProps = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (index != null) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    if (radius != null) __obj.updateDynamic("radius")(radius.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[PointProps]
  }
}

