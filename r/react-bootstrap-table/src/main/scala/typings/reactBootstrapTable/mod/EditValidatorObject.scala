package typings.reactBootstrapTable.mod

import typings.reactBootstrapTable.AnonMsg
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
  var notification: AnonMsg
}

object EditValidatorObject {
  @scala.inline
  def apply(isValid: Boolean, notification: AnonMsg): EditValidatorObject = {
    val __obj = js.Dynamic.literal(isValid = isValid.asInstanceOf[js.Any], notification = notification.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[EditValidatorObject]
  }
}

