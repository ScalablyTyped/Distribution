package typings
package reactDashSimpleDashMapsLib.reactDashSimpleDashMapsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GraticuleProps extends js.Object {
  var Globe: js.UndefOr[scala.Boolean] = js.undefined
  var disableOptimization: js.UndefOr[scala.Boolean] = js.undefined
  var fill: js.UndefOr[java.lang.String] = js.undefined
  var outline: js.UndefOr[scala.Boolean] = js.undefined
  var precision: js.UndefOr[scala.Double] = js.undefined
  var round: js.UndefOr[scala.Boolean] = js.undefined
  var step: js.UndefOr[Point] = js.undefined
  var stroke: js.UndefOr[java.lang.String] = js.undefined
  var style: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
}

object GraticuleProps {
  @scala.inline
  def apply(
    Globe: js.UndefOr[scala.Boolean] = js.undefined,
    disableOptimization: js.UndefOr[scala.Boolean] = js.undefined,
    fill: java.lang.String = null,
    outline: js.UndefOr[scala.Boolean] = js.undefined,
    precision: scala.Int | scala.Double = null,
    round: js.UndefOr[scala.Boolean] = js.undefined,
    step: Point = null,
    stroke: java.lang.String = null,
    style: reactLib.reactMod.ReactNs.CSSProperties = null
  ): GraticuleProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(Globe)) __obj.updateDynamic("Globe")(Globe)
    if (!js.isUndefined(disableOptimization)) __obj.updateDynamic("disableOptimization")(disableOptimization)
    if (fill != null) __obj.updateDynamic("fill")(fill)
    if (!js.isUndefined(outline)) __obj.updateDynamic("outline")(outline)
    if (precision != null) __obj.updateDynamic("precision")(precision.asInstanceOf[js.Any])
    if (!js.isUndefined(round)) __obj.updateDynamic("round")(round)
    if (step != null) __obj.updateDynamic("step")(step)
    if (stroke != null) __obj.updateDynamic("stroke")(stroke)
    if (style != null) __obj.updateDynamic("style")(style)
    __obj.asInstanceOf[GraticuleProps]
  }
}

