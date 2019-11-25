package typings.reactDashSparklines.reactDashSparklinesMod

import typings.react.reactMod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SparklinesProps extends js.Object {
  var data: js.UndefOr[js.Array[Double]] = js.undefined
  var height: js.UndefOr[Double] = js.undefined
  var limit: js.UndefOr[Double] = js.undefined
  var margin: js.UndefOr[Double] = js.undefined
  var max: js.UndefOr[Double] = js.undefined
  var min: js.UndefOr[Double] = js.undefined
  var preserveAspectRatio: js.UndefOr[String] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
  var svgHeight: js.UndefOr[Double | String] = js.undefined
  var svgWidth: js.UndefOr[Double | String] = js.undefined
  var width: js.UndefOr[Double] = js.undefined
}

object SparklinesProps {
  @scala.inline
  def apply(
    data: js.Array[Double] = null,
    height: Int | Double = null,
    limit: Int | Double = null,
    margin: Int | Double = null,
    max: Int | Double = null,
    min: Int | Double = null,
    preserveAspectRatio: String = null,
    style: CSSProperties = null,
    svgHeight: Double | String = null,
    svgWidth: Double | String = null,
    width: Int | Double = null
  ): SparklinesProps = {
    val __obj = js.Dynamic.literal()
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (limit != null) __obj.updateDynamic("limit")(limit.asInstanceOf[js.Any])
    if (margin != null) __obj.updateDynamic("margin")(margin.asInstanceOf[js.Any])
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    if (preserveAspectRatio != null) __obj.updateDynamic("preserveAspectRatio")(preserveAspectRatio.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (svgHeight != null) __obj.updateDynamic("svgHeight")(svgHeight.asInstanceOf[js.Any])
    if (svgWidth != null) __obj.updateDynamic("svgWidth")(svgWidth.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[SparklinesProps]
  }
}

