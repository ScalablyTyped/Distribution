package typings.reactNativeSvgCharts.mod

import typings.reactNativeSvgCharts.anon.CornerRadius
import typings.reactNativeSvgCharts.anon.PartialPathProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PieChartData extends js.Object {
  var arc: js.UndefOr[CornerRadius] = js.undefined
  var key: String | Double
  var svg: js.UndefOr[PartialPathProps] = js.undefined
  var value: js.UndefOr[Double] = js.undefined
}

object PieChartData {
  @scala.inline
  def apply(
    key: String | Double,
    arc: CornerRadius = null,
    svg: PartialPathProps = null,
    value: js.UndefOr[Double] = js.undefined
  ): PieChartData = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    if (arc != null) __obj.updateDynamic("arc")(arc.asInstanceOf[js.Any])
    if (svg != null) __obj.updateDynamic("svg")(svg.asInstanceOf[js.Any])
    if (!js.isUndefined(value)) __obj.updateDynamic("value")(value.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PieChartData]
  }
}

