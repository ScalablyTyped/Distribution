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
    opacity: Int | Double = null,
    radius: Int | Double = null,
    stroke: String = null,
    strokeWidth: Int | Double = null
  ): CircleStyle = {
    val __obj = js.Dynamic.literal()
    if (fill != null) __obj.updateDynamic("fill")(fill.asInstanceOf[js.Any])
    if (lineStyle != null) __obj.updateDynamic("lineStyle")(lineStyle.asInstanceOf[js.Any])
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (radius != null) __obj.updateDynamic("radius")(radius.asInstanceOf[js.Any])
    if (stroke != null) __obj.updateDynamic("stroke")(stroke.asInstanceOf[js.Any])
    if (strokeWidth != null) __obj.updateDynamic("strokeWidth")(strokeWidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[CircleStyle]
  }
}

