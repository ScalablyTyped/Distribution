package typings.screeps

import typings.screeps.screepsStrings.dashed
import typings.screeps.screepsStrings.dotted
import typings.screeps.screepsStrings.solid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LineStyle extends js.Object {
  /**
    * Line color in any web format, default is #ffffff(white).
    */
  var color: js.UndefOr[String] = js.undefined
  /**
    * Either undefined (solid line), dashed, or dotted.Default is undefined.
    */
  var lineStyle: js.UndefOr[dashed | dotted | solid] = js.undefined
  /**
    * Opacity value, default is 0.5.
    */
  var opacity: js.UndefOr[Double] = js.undefined
  /**
    * Line width, default is 0.1.
    */
  var width: js.UndefOr[Double] = js.undefined
}

object LineStyle {
  @scala.inline
  def apply(
    color: String = null,
    lineStyle: dashed | dotted | solid = null,
    opacity: js.UndefOr[Double] = js.undefined,
    width: js.UndefOr[Double] = js.undefined
  ): LineStyle = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (lineStyle != null) __obj.updateDynamic("lineStyle")(lineStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(opacity)) __obj.updateDynamic("opacity")(opacity.get.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[LineStyle]
  }
}

