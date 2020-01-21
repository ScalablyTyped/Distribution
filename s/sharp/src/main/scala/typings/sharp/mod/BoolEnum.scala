package typings.sharp.mod

import typings.sharp.sharpStrings.and
import typings.sharp.sharpStrings.eor
import typings.sharp.sharpStrings.or
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BoolEnum extends js.Object {
  var and: typings.sharp.sharpStrings.and
  var eor: typings.sharp.sharpStrings.eor
  var or: typings.sharp.sharpStrings.or
}

object BoolEnum {
  @scala.inline
  def apply(and: and, eor: eor, or: or): BoolEnum = {
    val __obj = js.Dynamic.literal(and = and.asInstanceOf[js.Any], eor = eor.asInstanceOf[js.Any], or = or.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[BoolEnum]
  }
}

