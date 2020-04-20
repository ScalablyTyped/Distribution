package typings.reactColor.mod

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
    val __obj = js.Dynamic.literal(hex = hex.asInstanceOf[js.Any], hsl = hsl.asInstanceOf[js.Any], rgb = rgb.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColorResult]
  }
}

