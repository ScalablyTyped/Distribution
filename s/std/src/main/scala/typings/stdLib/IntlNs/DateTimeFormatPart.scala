package typings
package stdLib.IntlNs

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
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[DateTimeFormatPart]
  }
}

