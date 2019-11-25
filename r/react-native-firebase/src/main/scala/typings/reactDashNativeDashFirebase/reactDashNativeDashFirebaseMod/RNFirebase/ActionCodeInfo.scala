package typings.reactDashNativeDashFirebase.reactDashNativeDashFirebaseMod.RNFirebase

import typings.reactDashNativeDashFirebase.Anon_Email
import typings.reactDashNativeDashFirebase.reactDashNativeDashFirebaseStrings.EMAIL_SIGNIN
import typings.reactDashNativeDashFirebase.reactDashNativeDashFirebaseStrings.ERROR
import typings.reactDashNativeDashFirebase.reactDashNativeDashFirebaseStrings.PASSWORD_RESET
import typings.reactDashNativeDashFirebase.reactDashNativeDashFirebaseStrings.RECOVER_EMAIL
import typings.reactDashNativeDashFirebase.reactDashNativeDashFirebaseStrings.VERIFY_EMAIL
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActionCodeInfo extends js.Object {
  var data: Anon_Email
  var operation: PASSWORD_RESET | VERIFY_EMAIL | RECOVER_EMAIL | EMAIL_SIGNIN | ERROR
}

object ActionCodeInfo {
  @scala.inline
  def apply(data: Anon_Email, operation: PASSWORD_RESET | VERIFY_EMAIL | RECOVER_EMAIL | EMAIL_SIGNIN | ERROR): ActionCodeInfo = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], operation = operation.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ActionCodeInfo]
  }
}

