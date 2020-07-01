package typings.reactVis.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContinuousSizeLegendProps extends js.Object {
   // default: ''
  var circlesTotal: js.UndefOr[Double] = js.undefined
  var className: js.UndefOr[String] = js.undefined
   // default: 10
  var endSize: js.UndefOr[Double] = js.undefined
   // default: 20
  var endTitle: Double | String
  var height: js.UndefOr[Double] = js.undefined
  var startSize: js.UndefOr[Double] = js.undefined
   // default: 2
  var startTitle: Double | String
  var width: js.UndefOr[Double] = js.undefined
}

object ContinuousSizeLegendProps {
  @scala.inline
  def apply(
    endTitle: Double | String,
    startTitle: Double | String,
    circlesTotal: js.UndefOr[Double] = js.undefined,
    className: String = null,
    endSize: js.UndefOr[Double] = js.undefined,
    height: js.UndefOr[Double] = js.undefined,
    startSize: js.UndefOr[Double] = js.undefined,
    width: js.UndefOr[Double] = js.undefined
  ): ContinuousSizeLegendProps = {
    val __obj = js.Dynamic.literal(endTitle = endTitle.asInstanceOf[js.Any], startTitle = startTitle.asInstanceOf[js.Any])
    if (!js.isUndefined(circlesTotal)) __obj.updateDynamic("circlesTotal")(circlesTotal.get.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(endSize)) __obj.updateDynamic("endSize")(endSize.get.asInstanceOf[js.Any])
    if (!js.isUndefined(height)) __obj.updateDynamic("height")(height.get.asInstanceOf[js.Any])
    if (!js.isUndefined(startSize)) __obj.updateDynamic("startSize")(startSize.get.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContinuousSizeLegendProps]
  }
}

