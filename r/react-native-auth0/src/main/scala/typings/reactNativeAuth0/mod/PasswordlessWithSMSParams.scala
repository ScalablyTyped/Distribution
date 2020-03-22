package typings.reactNativeAuth0.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PasswordlessWithSMSParams extends js.Object {
  var phoneNumber: String
}

object PasswordlessWithSMSParams {
  @scala.inline
  def apply(phoneNumber: String): PasswordlessWithSMSParams = {
    val __obj = js.Dynamic.literal(phoneNumber = phoneNumber.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PasswordlessWithSMSParams]
  }
}

