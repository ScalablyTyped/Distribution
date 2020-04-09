package typings.raphael

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<raphael.raphael.RaphaelFontFace> */
trait PartialRaphaelFontFace extends js.Object {
  var ascent: js.UndefOr[Double | String] = js.undefined
  var bbox: js.UndefOr[String] = js.undefined
  var descent: js.UndefOr[Double | String] = js.undefined
  var `font-family`: js.UndefOr[String] = js.undefined
  var `font-stretch`: js.UndefOr[String] = js.undefined
  var `font-style`: js.UndefOr[String] = js.undefined
  var `font-weight`: js.UndefOr[Double | String] = js.undefined
  var `panose-1`: js.UndefOr[String] = js.undefined
  var `underline-position`: js.UndefOr[Double | String] = js.undefined
  var `underline-thickness`: js.UndefOr[Double | String] = js.undefined
  var `unicode-range`: js.UndefOr[String] = js.undefined
  var `units-per-em`: js.UndefOr[Double | String] = js.undefined
  var `x-height`: js.UndefOr[Double | String] = js.undefined
}

object PartialRaphaelFontFace {
  @scala.inline
  def apply(
    ascent: Double | String = null,
    bbox: String = null,
    descent: Double | String = null,
    `font-family`: String = null,
    `font-stretch`: String = null,
    `font-style`: String = null,
    `font-weight`: Double | String = null,
    `panose-1`: String = null,
    `underline-position`: Double | String = null,
    `underline-thickness`: Double | String = null,
    `unicode-range`: String = null,
    `units-per-em`: Double | String = null,
    `x-height`: Double | String = null
  ): PartialRaphaelFontFace = {
    val __obj = js.Dynamic.literal()
    if (ascent != null) __obj.updateDynamic("ascent")(ascent.asInstanceOf[js.Any])
    if (bbox != null) __obj.updateDynamic("bbox")(bbox.asInstanceOf[js.Any])
    if (descent != null) __obj.updateDynamic("descent")(descent.asInstanceOf[js.Any])
    if (`font-family` != null) __obj.updateDynamic("font-family")(`font-family`.asInstanceOf[js.Any])
    if (`font-stretch` != null) __obj.updateDynamic("font-stretch")(`font-stretch`.asInstanceOf[js.Any])
    if (`font-style` != null) __obj.updateDynamic("font-style")(`font-style`.asInstanceOf[js.Any])
    if (`font-weight` != null) __obj.updateDynamic("font-weight")(`font-weight`.asInstanceOf[js.Any])
    if (`panose-1` != null) __obj.updateDynamic("panose-1")(`panose-1`.asInstanceOf[js.Any])
    if (`underline-position` != null) __obj.updateDynamic("underline-position")(`underline-position`.asInstanceOf[js.Any])
    if (`underline-thickness` != null) __obj.updateDynamic("underline-thickness")(`underline-thickness`.asInstanceOf[js.Any])
    if (`unicode-range` != null) __obj.updateDynamic("unicode-range")(`unicode-range`.asInstanceOf[js.Any])
    if (`units-per-em` != null) __obj.updateDynamic("units-per-em")(`units-per-em`.asInstanceOf[js.Any])
    if (`x-height` != null) __obj.updateDynamic("x-height")(`x-height`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialRaphaelFontFace]
  }
}

