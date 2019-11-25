package typings.std.Intl

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DateTimeFormatPart extends js.Object {
  var `type`: DateTimeFormatPartTypes
  var value: java.lang.String
}

object DateTimeFormatPart {
  @scala.inline
  def apply(`type`: DateTimeFormatPartTypes, value: java.lang.String): DateTimeFormatPart = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DateTimeFormatPart]
  }
}

