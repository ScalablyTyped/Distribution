package typings.std.Intl

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NumberFormatPart extends js.Object {
  var `type`: NumberFormatPartTypes
  var value: java.lang.String
}

object NumberFormatPart {
  @scala.inline
  def apply(`type`: NumberFormatPartTypes, value: java.lang.String): NumberFormatPart = {
    val __obj = js.Dynamic.literal(value = value)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[NumberFormatPart]
  }
}

