package typings.raphael.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<raphael.raphael.RaphaelGlowSettings> */
trait PartialRaphaelGlowSetting extends js.Object {
  var color: js.UndefOr[String] = js.undefined
  var fill: js.UndefOr[Boolean] = js.undefined
  var offsetx: js.UndefOr[Double] = js.undefined
  var offsety: js.UndefOr[Double] = js.undefined
  var opacity: js.UndefOr[Double] = js.undefined
  var width: js.UndefOr[Double] = js.undefined
}

object PartialRaphaelGlowSetting {
  @scala.inline
  def apply(
    color: String = null,
    fill: js.UndefOr[Boolean] = js.undefined,
    offsetx: js.UndefOr[Double] = js.undefined,
    offsety: js.UndefOr[Double] = js.undefined,
    opacity: js.UndefOr[Double] = js.undefined,
    width: js.UndefOr[Double] = js.undefined
  ): PartialRaphaelGlowSetting = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (!js.isUndefined(fill)) __obj.updateDynamic("fill")(fill.get.asInstanceOf[js.Any])
    if (!js.isUndefined(offsetx)) __obj.updateDynamic("offsetx")(offsetx.get.asInstanceOf[js.Any])
    if (!js.isUndefined(offsety)) __obj.updateDynamic("offsety")(offsety.get.asInstanceOf[js.Any])
    if (!js.isUndefined(opacity)) __obj.updateDynamic("opacity")(opacity.get.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialRaphaelGlowSetting]
  }
}

