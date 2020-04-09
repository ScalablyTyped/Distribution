package typings.raphael.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RaphaelFontFace extends js.Object {
  /**
    * The ascent property of this font, such as `270`.
    *
    * The ascent is the recommended distance above the baseline for singled spaced text.
    */
  var ascent: Double | String
  /**
    * The axis aligned bounding box of all glyphs, such as `-11 -274 322 94` (top left corner and width and height).
    */
  var bbox: String
  /**
    * The descent property of this font, such as `-90`.
    *
    * The ascent is the recommended distance below the baseline for singled spaced text
    */
  var descent: Double | String
  /**
    * The font family property of this font.
    */
  var `font-family`: String
  /**
    * The font stretch property of this font, such as `normal`.
    */
  var `font-stretch`: String
  /**
    * The font style property of this font.
    */
  var `font-style`: String
  /**
    * The weight of this font, such as `200`.
    */
  var `font-weight`: Double | String
  /**
    * The panose-1 classification of this font.
    *
    * Panose-1 is a system for describing characteristics of Latin fonts that is based on calculable quantities:
    * dimensions, angles, shapes, etc. It is based on a set of 10 numbers, which take values between 0 and 15. A font
    * thus becomes a vector in a 10-dimensional space, and one can calculate the distance between two fonts as a
    * Cartesian distance.
    */
  var `panose-1`: String
  /**
    * When an underline is drawn below a glyph, the vertical offset of that underline. Usually negative, such as `36`.
    */
  var `underline-position`: Double | String
  /**
    * The thickness of the underline, when a glyph is underlined, such as `18`.
    */
  var `underline-thickness`: Double | String
  /**
    * The range of characters this font contains, such as `U+0020-U+00F3`.
    */
  var `unicode-range`: String
  /**
    * The units-per-em property of this font.
    *
    * The units-per-em attribute specifies the number of coordinate units on the "em square", an abstract square whose
    * height is the intended distance between lines of type in the same type size.
    */
  var `units-per-em`: Double | String
  /**
    * The x-height property of this font.
    *
    * The x-height, or corpus size, is the distance between the baseline and the mean line of lower-case letters.
    */
  var `x-height`: Double | String
}

object RaphaelFontFace {
  @scala.inline
  def apply(
    ascent: Double | String,
    bbox: String,
    descent: Double | String,
    `font-family`: String,
    `font-stretch`: String,
    `font-style`: String,
    `font-weight`: Double | String,
    `panose-1`: String,
    `underline-position`: Double | String,
    `underline-thickness`: Double | String,
    `unicode-range`: String,
    `units-per-em`: Double | String,
    `x-height`: Double | String
  ): RaphaelFontFace = {
    val __obj = js.Dynamic.literal(ascent = ascent.asInstanceOf[js.Any], bbox = bbox.asInstanceOf[js.Any], descent = descent.asInstanceOf[js.Any])
    __obj.updateDynamic("font-family")(`font-family`.asInstanceOf[js.Any])
    __obj.updateDynamic("font-stretch")(`font-stretch`.asInstanceOf[js.Any])
    __obj.updateDynamic("font-style")(`font-style`.asInstanceOf[js.Any])
    __obj.updateDynamic("font-weight")(`font-weight`.asInstanceOf[js.Any])
    __obj.updateDynamic("panose-1")(`panose-1`.asInstanceOf[js.Any])
    __obj.updateDynamic("underline-position")(`underline-position`.asInstanceOf[js.Any])
    __obj.updateDynamic("underline-thickness")(`underline-thickness`.asInstanceOf[js.Any])
    __obj.updateDynamic("unicode-range")(`unicode-range`.asInstanceOf[js.Any])
    __obj.updateDynamic("units-per-em")(`units-per-em`.asInstanceOf[js.Any])
    __obj.updateDynamic("x-height")(`x-height`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RaphaelFontFace]
  }
}

