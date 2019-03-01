package typings
package raphaelLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Color extends js.Object {
  var color: js.UndefOr[java.lang.String] = js.undefined
  var fill: js.UndefOr[scala.Boolean] = js.undefined
  var offsetx: js.UndefOr[scala.Double] = js.undefined
  var offsety: js.UndefOr[scala.Double] = js.undefined
  var opacity: js.UndefOr[scala.Double] = js.undefined
  var width: js.UndefOr[scala.Double] = js.undefined
}

object Anon_Color {
  @scala.inline
  def apply(
    color: java.lang.String = null,
    fill: js.UndefOr[scala.Boolean] = js.undefined,
    offsetx: scala.Int | scala.Double = null,
    offsety: scala.Int | scala.Double = null,
    opacity: scala.Int | scala.Double = null,
    width: scala.Int | scala.Double = null
  ): Anon_Color = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color)
    if (!js.isUndefined(fill)) __obj.updateDynamic("fill")(fill)
    if (offsetx != null) __obj.updateDynamic("offsetx")(offsetx.asInstanceOf[js.Any])
    if (offsety != null) __obj.updateDynamic("offsety")(offsety.asInstanceOf[js.Any])
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Color]
  }
}

