package typings
package reactDashNativeDashSvgDashChartsLib.reactDashNativeDashSvgDashChartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PieChartData extends js.Object {
  var arc: js.UndefOr[reactDashNativeDashSvgDashChartsLib.Anon_CornerRadius] = js.undefined
  var key: java.lang.String | scala.Double
  var svg: js.UndefOr[stdLib.Partial[reactDashNativeDashSvgLib.reactDashNativeDashSvgMod.PathProps]] = js.undefined
  var value: js.UndefOr[scala.Double] = js.undefined
}

object PieChartData {
  @scala.inline
  def apply(
    key: java.lang.String | scala.Double,
    arc: reactDashNativeDashSvgDashChartsLib.Anon_CornerRadius = null,
    svg: stdLib.Partial[reactDashNativeDashSvgLib.reactDashNativeDashSvgMod.PathProps] = null,
    value: scala.Int | scala.Double = null
  ): PieChartData = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    if (arc != null) __obj.updateDynamic("arc")(arc)
    if (svg != null) __obj.updateDynamic("svg")(svg)
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[PieChartData]
  }
}

