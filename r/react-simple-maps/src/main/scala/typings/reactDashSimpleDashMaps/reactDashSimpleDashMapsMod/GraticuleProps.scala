package typings.reactDashSimpleDashMaps.reactDashSimpleDashMapsMod

import typings.react.reactMod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GraticuleProps extends js.Object {
  var Globe: js.UndefOr[Boolean] = js.undefined
  var disableOptimization: js.UndefOr[Boolean] = js.undefined
  var fill: js.UndefOr[String] = js.undefined
  var outline: js.UndefOr[Boolean] = js.undefined
  var precision: js.UndefOr[Double] = js.undefined
  var round: js.UndefOr[Boolean] = js.undefined
  var step: js.UndefOr[Point] = js.undefined
  var stroke: js.UndefOr[String] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
}

object GraticuleProps {
  @scala.inline
  def apply(
    Globe: js.UndefOr[Boolean] = js.undefined,
    disableOptimization: js.UndefOr[Boolean] = js.undefined,
    fill: String = null,
    outline: js.UndefOr[Boolean] = js.undefined,
    precision: Int | Double = null,
    round: js.UndefOr[Boolean] = js.undefined,
    step: Point = null,
    stroke: String = null,
    style: CSSProperties = null
  ): GraticuleProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(Globe)) __obj.updateDynamic("Globe")(Globe.asInstanceOf[js.Any])
    if (!js.isUndefined(disableOptimization)) __obj.updateDynamic("disableOptimization")(disableOptimization.asInstanceOf[js.Any])
    if (fill != null) __obj.updateDynamic("fill")(fill.asInstanceOf[js.Any])
    if (!js.isUndefined(outline)) __obj.updateDynamic("outline")(outline.asInstanceOf[js.Any])
    if (precision != null) __obj.updateDynamic("precision")(precision.asInstanceOf[js.Any])
    if (!js.isUndefined(round)) __obj.updateDynamic("round")(round.asInstanceOf[js.Any])
    if (step != null) __obj.updateDynamic("step")(step.asInstanceOf[js.Any])
    if (stroke != null) __obj.updateDynamic("stroke")(stroke.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[GraticuleProps]
  }
}

