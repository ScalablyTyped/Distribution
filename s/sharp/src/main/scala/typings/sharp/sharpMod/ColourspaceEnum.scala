package typings.sharp.sharpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColourspaceEnum extends js.Object {
  var `b-w`: String
  var bw: String
  var cmyk: String
  var multiband: String
  var srgb: String
}

object ColourspaceEnum {
  @scala.inline
  def apply(`b-w`: String, bw: String, cmyk: String, multiband: String, srgb: String): ColourspaceEnum = {
    val __obj = js.Dynamic.literal(bw = bw, cmyk = cmyk, multiband = multiband, srgb = srgb)
    __obj.updateDynamic("b-w")(`b-w`)
    __obj.asInstanceOf[ColourspaceEnum]
  }
}

