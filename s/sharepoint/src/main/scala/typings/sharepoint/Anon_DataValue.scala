package typings.sharepoint

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DataValue extends js.Object {
  var dataValue: js.Any
  var isValid: Boolean
  var normalizedLocValue: String
}

object Anon_DataValue {
  @scala.inline
  def apply(dataValue: js.Any, isValid: Boolean, normalizedLocValue: String): Anon_DataValue = {
    val __obj = js.Dynamic.literal(dataValue = dataValue, isValid = isValid, normalizedLocValue = normalizedLocValue)
  
    __obj.asInstanceOf[Anon_DataValue]
  }
}

