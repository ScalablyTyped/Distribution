package typings.raphael

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Color extends js.Object {
  var color: js.UndefOr[String] = js.undefined
  var fill: js.UndefOr[Boolean] = js.undefined
  var offsetx: js.UndefOr[Double] = js.undefined
  var offsety: js.UndefOr[Double] = js.undefined
  var opacity: js.UndefOr[Double] = js.undefined
  var width: js.UndefOr[Double] = js.undefined
}

object Anon_Color {
  @scala.inline
  def apply(
    color: String = null,
    fill: js.UndefOr[Boolean] = js.undefined,
    offsetx: Int | Double = null,
    offsety: Int | Double = null,
    opacity: Int | Double = null,
    width: Int | Double = null
  ): Anon_Color = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (!js.isUndefined(fill)) __obj.updateDynamic("fill")(fill.asInstanceOf[js.Any])
    if (offsetx != null) __obj.updateDynamic("offsetx")(offsetx.asInstanceOf[js.Any])
    if (offsety != null) __obj.updateDynamic("offsety")(offsety.asInstanceOf[js.Any])
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Color]
  }
}

