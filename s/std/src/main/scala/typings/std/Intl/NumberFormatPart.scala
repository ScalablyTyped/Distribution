package typings.std.Intl

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NumberFormatPart extends js.Object {
  var `type`: NumberFormatPartTypes
  var value: String
}

object NumberFormatPart {
  @scala.inline
  def apply(`type`: NumberFormatPartTypes, value: String): NumberFormatPart = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[NumberFormatPart]
  }
}

