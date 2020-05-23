package typings.reactNativeSvgCharts.mod

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
    index: js.UndefOr[Double] = js.undefined,
    radius: js.UndefOr[Double] = js.undefined,
    value: js.UndefOr[Double] = js.undefined
  ): PointProps = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (!js.isUndefined(index)) __obj.updateDynamic("index")(index.get.asInstanceOf[js.Any])
    if (!js.isUndefined(radius)) __obj.updateDynamic("radius")(radius.get.asInstanceOf[js.Any])
    if (!js.isUndefined(value)) __obj.updateDynamic("value")(value.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PointProps]
  }
}

