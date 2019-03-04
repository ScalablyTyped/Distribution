package typings
package sharepointLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DataValue extends js.Object {
  var dataValue: js.Any
  var isValid: scala.Boolean
  var normalizedLocValue: java.lang.String
}

object Anon_DataValue {
  @scala.inline
  def apply(dataValue: js.Any, isValid: scala.Boolean, normalizedLocValue: java.lang.String): Anon_DataValue = {
    val __obj = js.Dynamic.literal(dataValue = dataValue, isValid = isValid, normalizedLocValue = normalizedLocValue)
  
    __obj.asInstanceOf[Anon_DataValue]
  }
}

