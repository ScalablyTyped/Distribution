package typings
package reactDashNativeDashSvgDashChartsLib.reactDashNativeDashSvgDashChartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GridProps[T] extends js.Object {
  var belowChart: js.UndefOr[scala.Boolean] = js.undefined
  var direction: js.UndefOr[GridDirection] = js.undefined
  var svg: js.UndefOr[stdLib.Partial[reactDashNativeDashSvgLib.reactDashNativeDashSvgMod.LineProps]] = js.undefined
  var ticks: js.UndefOr[js.Array[T]] = js.undefined
  var x: js.UndefOr[js.Function1[/* t */ T, scala.Double]] = js.undefined
  var y: js.UndefOr[js.Function1[/* t */ T, scala.Double]] = js.undefined
}

object GridProps {
  @scala.inline
  def apply[T](
    belowChart: js.UndefOr[scala.Boolean] = js.undefined,
    direction: GridDirection = null,
    svg: stdLib.Partial[reactDashNativeDashSvgLib.reactDashNativeDashSvgMod.LineProps] = null,
    ticks: js.Array[T] = null,
    x: js.Function1[/* t */ T, scala.Double] = null,
    y: js.Function1[/* t */ T, scala.Double] = null
  ): GridProps[T] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(belowChart)) __obj.updateDynamic("belowChart")(belowChart)
    if (direction != null) __obj.updateDynamic("direction")(direction)
    if (svg != null) __obj.updateDynamic("svg")(svg)
    if (ticks != null) __obj.updateDynamic("ticks")(ticks)
    if (x != null) __obj.updateDynamic("x")(x)
    if (y != null) __obj.updateDynamic("y")(y)
    __obj.asInstanceOf[GridProps[T]]
  }
}

