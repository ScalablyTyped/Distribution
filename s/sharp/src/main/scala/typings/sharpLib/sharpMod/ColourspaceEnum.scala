package typings
package sharpLib.sharpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColourspaceEnum extends js.Object {
  var `b-w`: java.lang.String
  var bw: java.lang.String
  var cmyk: java.lang.String
  var multiband: java.lang.String
  var srgb: java.lang.String
}

object ColourspaceEnum {
  @scala.inline
  def apply(
    `b-w`: java.lang.String,
    bw: java.lang.String,
    cmyk: java.lang.String,
    multiband: java.lang.String,
    srgb: java.lang.String
  ): ColourspaceEnum = {
    val __obj = js.Dynamic.literal(bw = bw, cmyk = cmyk, multiband = multiband, srgb = srgb)
    __obj.updateDynamic("b-w")(`b-w`)
    __obj.asInstanceOf[ColourspaceEnum]
  }
}

