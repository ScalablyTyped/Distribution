package typings.reactSparklines.mod

import typings.react.mod.CSSProperties
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
    height: js.UndefOr[Double] = js.undefined,
    limit: js.UndefOr[Double] = js.undefined,
    margin: js.UndefOr[Double] = js.undefined,
    max: js.UndefOr[Double] = js.undefined,
    min: js.UndefOr[Double] = js.undefined,
    preserveAspectRatio: String = null,
    style: CSSProperties = null,
    svgHeight: Double | String = null,
    svgWidth: Double | String = null,
    width: js.UndefOr[Double] = js.undefined
  ): SparklinesProps = {
    val __obj = js.Dynamic.literal()
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (!js.isUndefined(height)) __obj.updateDynamic("height")(height.get.asInstanceOf[js.Any])
    if (!js.isUndefined(limit)) __obj.updateDynamic("limit")(limit.get.asInstanceOf[js.Any])
    if (!js.isUndefined(margin)) __obj.updateDynamic("margin")(margin.get.asInstanceOf[js.Any])
    if (!js.isUndefined(max)) __obj.updateDynamic("max")(max.get.asInstanceOf[js.Any])
    if (!js.isUndefined(min)) __obj.updateDynamic("min")(min.get.asInstanceOf[js.Any])
    if (preserveAspectRatio != null) __obj.updateDynamic("preserveAspectRatio")(preserveAspectRatio.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (svgHeight != null) __obj.updateDynamic("svgHeight")(svgHeight.asInstanceOf[js.Any])
    if (svgWidth != null) __obj.updateDynamic("svgWidth")(svgWidth.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SparklinesProps]
  }
}

