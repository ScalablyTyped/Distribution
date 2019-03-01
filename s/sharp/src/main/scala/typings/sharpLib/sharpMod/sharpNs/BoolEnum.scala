package typings
package sharpLib.sharpMod.sharpNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BoolEnum extends js.Object {
  var and: sharpLib.sharpLibStrings.and
  var eor: sharpLib.sharpLibStrings.eor
  var or: sharpLib.sharpLibStrings.or
}

object BoolEnum {
  @scala.inline
  def apply(
    and: sharpLib.sharpLibStrings.and,
    eor: sharpLib.sharpLibStrings.eor,
    or: sharpLib.sharpLibStrings.or
  ): BoolEnum = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("and")(and)
    __obj.updateDynamic("eor")(eor)
    __obj.updateDynamic("or")(or)
    __obj.asInstanceOf[BoolEnum]
  }
}

