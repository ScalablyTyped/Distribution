package typings.sharepoint

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDataValue extends js.Object {
  var dataValue: js.Any
  var isValid: Boolean
  var normalizedLocValue: String
}

object AnonDataValue {
  @scala.inline
  def apply(dataValue: js.Any, isValid: Boolean, normalizedLocValue: String): AnonDataValue = {
    val __obj = js.Dynamic.literal(dataValue = dataValue.asInstanceOf[js.Any], isValid = isValid.asInstanceOf[js.Any], normalizedLocValue = normalizedLocValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDataValue]
  }
}

