package typings.raphael.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RaphaelFontFace extends js.Object {
  
  /**
    * The ascent property of this font, such as `270`.
    *
    * The ascent is the recommended distance above the baseline for singled spaced text.
    */
  var ascent: Double | String = js.native
  
  /**
    * The axis aligned bounding box of all glyphs, such as `-11 -274 322 94` (top left corner and width and height).
    */
  var bbox: String = js.native
  
  /**
    * The descent property of this font, such as `-90`.
    *
    * The ascent is the recommended distance below the baseline for singled spaced text
    */
  var descent: Double | String = js.native
  
  /**
    * The font family property of this font.
    */
  var `font-family`: String = js.native
  
  /**
    * The font stretch property of this font, such as `normal`.
    */
  var `font-stretch`: String = js.native
  
  /**
    * The font style property of this font.
    */
  var `font-style`: String = js.native
  
  /**
    * The weight of this font, such as `200`.
    */
  var `font-weight`: Double | String = js.native
  
  /**
    * The panose-1 classification of this font.
    *
    * Panose-1 is a system for describing characteristics of Latin fonts that is based on calculable quantities:
    * dimensions, angles, shapes, etc. It is based on a set of 10 numbers, which take values between 0 and 15. A font
    * thus becomes a vector in a 10-dimensional space, and one can calculate the distance between two fonts as a
    * Cartesian distance.
    */
  var `panose-1`: String = js.native
  
  /**
    * When an underline is drawn below a glyph, the vertical offset of that underline. Usually negative, such as `36`.
    */
  var `underline-position`: Double | String = js.native
  
  /**
    * The thickness of the underline, when a glyph is underlined, such as `18`.
    */
  var `underline-thickness`: Double | String = js.native
  
  /**
    * The range of characters this font contains, such as `U+0020-U+00F3`.
    */
  var `unicode-range`: String = js.native
  
  /**
    * The units-per-em property of this font.
    *
    * The units-per-em attribute specifies the number of coordinate units on the "em square", an abstract square whose
    * height is the intended distance between lines of type in the same type size.
    */
  var `units-per-em`: Double | String = js.native
  
  /**
    * The x-height property of this font.
    *
    * The x-height, or corpus size, is the distance between the baseline and the mean line of lower-case letters.
    */
  var `x-height`: Double | String = js.native
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
  
  @scala.inline
  implicit class RaphaelFontFaceOps[Self <: RaphaelFontFace] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAscent(value: Double | String): Self = this.set("ascent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBbox(value: String): Self = this.set("bbox", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescent(value: Double | String): Self = this.set("descent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setFont-family`(value: String): Self = this.set("font-family", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setFont-stretch`(value: String): Self = this.set("font-stretch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setFont-style`(value: String): Self = this.set("font-style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setFont-weight`(value: Double | String): Self = this.set("font-weight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setPanose-1`(value: String): Self = this.set("panose-1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setUnderline-position`(value: Double | String): Self = this.set("underline-position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setUnderline-thickness`(value: Double | String): Self = this.set("underline-thickness", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setUnicode-range`(value: String): Self = this.set("unicode-range", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setUnits-per-em`(value: Double | String): Self = this.set("units-per-em", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setX-height`(value: Double | String): Self = this.set("x-height", value.asInstanceOf[js.Any])
  }
}
