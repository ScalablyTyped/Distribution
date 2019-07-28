package typings.reactDashNativeDashSvgDashCharts.reactDashNativeDashSvgDashChartsMod

import typings.reactDashNativeDashSvg.reactDashNativeDashSvgMod.PathProps
import typings.reactDashNativeDashSvgDashCharts.Anon_CornerRadius
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PieChartData extends js.Object {
  var arc: js.UndefOr[Anon_CornerRadius] = js.undefined
  var key: String | Double
  var svg: js.UndefOr[Partial[PathProps]] = js.undefined
  var value: js.UndefOr[Double] = js.undefined
}

object PieChartData {
  @scala.inline
  def apply(
    key: String | Double,
    arc: Anon_CornerRadius = null,
    svg: Partial[PathProps] = null,
    value: Int | Double = null
  ): PieChartData = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    if (arc != null) __obj.updateDynamic("arc")(arc)
    if (svg != null) __obj.updateDynamic("svg")(svg)
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[PieChartData]
  }
}

