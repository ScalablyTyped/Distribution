package typings
package reactDashBootstrapDashTableLib.reactDashBootstrapDashTableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EditValidatorObject extends js.Object {
  /**
  	 * Boolean flag indicating whether the cell value is valid.
  	 */
  var isValid: scala.Boolean
  /**
  	 * Notification object providing details on the validation result.
  	 */
  var notification: reactDashBootstrapDashTableLib.Anon_Msg
}

object EditValidatorObject {
  @scala.inline
  def apply(isValid: scala.Boolean, notification: reactDashBootstrapDashTableLib.Anon_Msg): EditValidatorObject = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("isValid")(isValid)
    __obj.updateDynamic("notification")(notification)
    __obj.asInstanceOf[EditValidatorObject]
  }
}

