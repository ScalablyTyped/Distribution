package typings
package screepsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LineStyle extends js.Object {
  /**
    * Line color in any web format, default is #ffffff(white).
    */
  var color: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Either undefined (solid line), dashed, or dotted.Default is undefined.
    */
  var lineStyle: js.UndefOr[
    screepsLib.screepsLibStrings.dashed | screepsLib.screepsLibStrings.dotted | screepsLib.screepsLibStrings.solid
  ] = js.undefined
  /**
    * Opacity value, default is 0.5.
    */
  var opacity: js.UndefOr[scala.Double] = js.undefined
  /**
    * Line width, default is 0.1.
    */
  var width: js.UndefOr[scala.Double] = js.undefined
}

object LineStyle {
  @scala.inline
  def apply(
    color: java.lang.String = null,
    lineStyle: screepsLib.screepsLibStrings.dashed | screepsLib.screepsLibStrings.dotted | screepsLib.screepsLibStrings.solid = null,
    opacity: scala.Int | scala.Double = null,
    width: scala.Int | scala.Double = null
  ): LineStyle = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color)
    if (lineStyle != null) __obj.updateDynamic("lineStyle")(lineStyle.asInstanceOf[js.Any])
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[LineStyle]
  }
}

