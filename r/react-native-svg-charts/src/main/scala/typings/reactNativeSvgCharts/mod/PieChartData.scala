package typings.reactNativeSvgCharts.mod

import typings.reactNativeSvgCharts.AnonCornerRadius
import typings.reactNativeSvgCharts.PartialPathProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PieChartData extends js.Object {
  var arc: js.UndefOr[AnonCornerRadius] = js.undefined
  var key: String | Double
  var svg: js.UndefOr[PartialPathProps] = js.undefined
  var value: js.UndefOr[Double] = js.undefined
}

object PieChartData {
  @scala.inline
  def apply(
    key: String | Double,
    arc: AnonCornerRadius = null,
    svg: PartialPathProps = null,
    value: Int | Double = null
  ): PieChartData = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    if (arc != null) __obj.updateDynamic("arc")(arc.asInstanceOf[js.Any])
    if (svg != null) __obj.updateDynamic("svg")(svg.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[PieChartData]
  }
}

