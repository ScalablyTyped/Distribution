package typings
package screepsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CircleStyle extends PolyStyle {
  /**
    * Circle radius, default is 0.15.
    */
  var radius: js.UndefOr[scala.Double] = js.undefined
}

object CircleStyle {
  @scala.inline
  def apply(
    fill: java.lang.String = null,
    lineStyle: screepsLib.screepsLibStrings.dashed | screepsLib.screepsLibStrings.dotted | screepsLib.screepsLibStrings.solid = null,
    opacity: scala.Int | scala.Double = null,
    radius: scala.Int | scala.Double = null,
    stroke: java.lang.String = null,
    strokeWidth: scala.Int | scala.Double = null
  ): CircleStyle = {
    val __obj = js.Dynamic.literal()
    if (fill != null) __obj.updateDynamic("fill")(fill)
    if (lineStyle != null) __obj.updateDynamic("lineStyle")(lineStyle.asInstanceOf[js.Any])
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (radius != null) __obj.updateDynamic("radius")(radius.asInstanceOf[js.Any])
    if (stroke != null) __obj.updateDynamic("stroke")(stroke)
    if (strokeWidth != null) __obj.updateDynamic("strokeWidth")(strokeWidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[CircleStyle]
  }
}

