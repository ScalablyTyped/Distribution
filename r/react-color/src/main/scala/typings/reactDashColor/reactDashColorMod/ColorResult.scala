package typings.reactDashColor.reactDashColorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColorResult extends js.Object {
  var hex: String
  var hsl: HSLColor
  var rgb: RGBColor
}

object ColorResult {
  @scala.inline
  def apply(hex: String, hsl: HSLColor, rgb: RGBColor): ColorResult = {
    val __obj = js.Dynamic.literal(hex = hex, hsl = hsl, rgb = rgb)
  
    __obj.asInstanceOf[ColorResult]
  }
}

