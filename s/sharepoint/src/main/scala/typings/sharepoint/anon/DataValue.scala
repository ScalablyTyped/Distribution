package typings.sharepoint.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataValue extends js.Object {
  var dataValue: js.Any
  var isValid: Boolean
  var normalizedLocValue: String
}

object DataValue {
  @scala.inline
  def apply(dataValue: js.Any, isValid: Boolean, normalizedLocValue: String): DataValue = {
    val __obj = js.Dynamic.literal(dataValue = dataValue.asInstanceOf[js.Any], isValid = isValid.asInstanceOf[js.Any], normalizedLocValue = normalizedLocValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataValue]
  }
}

