package typings.reactDashBootstrapDashTable.reactDashBootstrapDashTableMod

import typings.reactDashBootstrapDashTable.Anon_Msg
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EditValidatorObject extends js.Object {
  /**
  	 * Boolean flag indicating whether the cell value is valid.
  	 */
  var isValid: Boolean
  /**
  	 * Notification object providing details on the validation result.
  	 */
  var notification: Anon_Msg
}

object EditValidatorObject {
  @scala.inline
  def apply(isValid: Boolean, notification: Anon_Msg): EditValidatorObject = {
    val __obj = js.Dynamic.literal(isValid = isValid, notification = notification)
  
    __obj.asInstanceOf[EditValidatorObject]
  }
}

