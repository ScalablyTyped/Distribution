package typings.screeps

import typings.screeps.screepsStrings.dashed
import typings.screeps.screepsStrings.dotted
import typings.screeps.screepsStrings.solid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CircleStyle extends PolyStyle {
  /**
    * Circle radius, default is 0.15.
    */
  var radius: js.UndefOr[Double] = js.undefined
}

object CircleStyle {
  @scala.inline
  def apply(
    fill: String = null,
    lineStyle: dashed | dotted | solid = null,
    opacity: js.UndefOr[Double] = js.undefined,
    radius: js.UndefOr[Double] = js.undefined,
    stroke: String = null,
    strokeWidth: js.UndefOr[Double] = js.undefined
  ): CircleStyle = {
    val __obj = js.Dynamic.literal()
    if (fill != null) __obj.updateDynamic("fill")(fill.asInstanceOf[js.Any])
    if (lineStyle != null) __obj.updateDynamic("lineStyle")(lineStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(opacity)) __obj.updateDynamic("opacity")(opacity.get.asInstanceOf[js.Any])
    if (!js.isUndefined(radius)) __obj.updateDynamic("radius")(radius.get.asInstanceOf[js.Any])
    if (stroke != null) __obj.updateDynamic("stroke")(stroke.asInstanceOf[js.Any])
    if (!js.isUndefined(strokeWidth)) __obj.updateDynamic("strokeWidth")(strokeWidth.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[CircleStyle]
  }
}

