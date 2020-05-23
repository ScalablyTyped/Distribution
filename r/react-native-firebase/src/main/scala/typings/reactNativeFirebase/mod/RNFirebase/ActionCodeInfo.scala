package typings.reactNativeFirebase.mod.RNFirebase

import typings.reactNativeFirebase.anon.Email
import typings.reactNativeFirebase.reactNativeFirebaseStrings.EMAIL_SIGNIN
import typings.reactNativeFirebase.reactNativeFirebaseStrings.ERROR
import typings.reactNativeFirebase.reactNativeFirebaseStrings.PASSWORD_RESET
import typings.reactNativeFirebase.reactNativeFirebaseStrings.RECOVER_EMAIL
import typings.reactNativeFirebase.reactNativeFirebaseStrings.VERIFY_EMAIL
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActionCodeInfo extends js.Object {
  var data: Email
  var operation: PASSWORD_RESET | VERIFY_EMAIL | RECOVER_EMAIL | EMAIL_SIGNIN | ERROR
}

object ActionCodeInfo {
  @scala.inline
  def apply(data: Email, operation: PASSWORD_RESET | VERIFY_EMAIL | RECOVER_EMAIL | EMAIL_SIGNIN | ERROR): ActionCodeInfo = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], operation = operation.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActionCodeInfo]
  }
}

