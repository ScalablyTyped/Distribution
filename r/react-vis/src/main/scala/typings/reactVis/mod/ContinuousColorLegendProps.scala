package typings.reactVis.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContinuousColorLegendProps extends js.Object {
  var className: js.UndefOr[String] = js.undefined
  var endColor: js.UndefOr[String] = js.undefined
   // default: '#FF9833'
  var endTitle: Double | String
   // default: ''
  var height: js.UndefOr[Double] = js.undefined
  var midColor: js.UndefOr[String] = js.undefined
  var midTitle: js.UndefOr[Double | String] = js.undefined
  var startColor: js.UndefOr[String] = js.undefined
   // default: '#EF5D28'
  var startTitle: Double | String
  var width: js.UndefOr[Double] = js.undefined
}

object ContinuousColorLegendProps {
  @scala.inline
  def apply(
    endTitle: Double | String,
    startTitle: Double | String,
    className: String = null,
    endColor: String = null,
    height: js.UndefOr[Double] = js.undefined,
    midColor: String = null,
    midTitle: Double | String = null,
    startColor: String = null,
    width: js.UndefOr[Double] = js.undefined
  ): ContinuousColorLegendProps = {
    val __obj = js.Dynamic.literal(endTitle = endTitle.asInstanceOf[js.Any], startTitle = startTitle.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (endColor != null) __obj.updateDynamic("endColor")(endColor.asInstanceOf[js.Any])
    if (!js.isUndefined(height)) __obj.updateDynamic("height")(height.get.asInstanceOf[js.Any])
    if (midColor != null) __obj.updateDynamic("midColor")(midColor.asInstanceOf[js.Any])
    if (midTitle != null) __obj.updateDynamic("midTitle")(midTitle.asInstanceOf[js.Any])
    if (startColor != null) __obj.updateDynamic("startColor")(startColor.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContinuousColorLegendProps]
  }
}

