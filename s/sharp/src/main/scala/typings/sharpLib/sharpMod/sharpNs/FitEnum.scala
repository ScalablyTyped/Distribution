package typings
package sharpLib.sharpMod.sharpNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FitEnum extends js.Object {
  var contain: sharpLib.sharpLibStrings.contain
  var cover: sharpLib.sharpLibStrings.cover
  var fill: sharpLib.sharpLibStrings.fill
  var inside: sharpLib.sharpLibStrings.inside
  var outside: sharpLib.sharpLibStrings.outside
}

object FitEnum {
  @scala.inline
  def apply(
    contain: sharpLib.sharpLibStrings.contain,
    cover: sharpLib.sharpLibStrings.cover,
    fill: sharpLib.sharpLibStrings.fill,
    inside: sharpLib.sharpLibStrings.inside,
    outside: sharpLib.sharpLibStrings.outside
  ): FitEnum = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("contain")(contain)
    __obj.updateDynamic("cover")(cover)
    __obj.updateDynamic("fill")(fill)
    __obj.updateDynamic("inside")(inside)
    __obj.updateDynamic("outside")(outside)
    __obj.asInstanceOf[FitEnum]
  }
}

