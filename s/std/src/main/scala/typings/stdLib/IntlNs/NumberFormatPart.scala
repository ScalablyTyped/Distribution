package typings
package stdLib.IntlNs

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
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[NumberFormatPart]
  }
}

