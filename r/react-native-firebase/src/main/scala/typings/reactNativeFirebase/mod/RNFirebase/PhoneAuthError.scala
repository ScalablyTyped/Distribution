package typings.reactNativeFirebase.mod.RNFirebase

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PhoneAuthError extends js.Object {
  var code: String | Null
  var message: String | Null
  var stack: String | Null
  var verificationId: String
}

object PhoneAuthError {
  @scala.inline
  def apply(verificationId: String, code: String = null, message: String = null, stack: String = null): PhoneAuthError = {
    val __obj = js.Dynamic.literal(verificationId = verificationId.asInstanceOf[js.Any], code = code.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], stack = stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[PhoneAuthError]
  }
}

