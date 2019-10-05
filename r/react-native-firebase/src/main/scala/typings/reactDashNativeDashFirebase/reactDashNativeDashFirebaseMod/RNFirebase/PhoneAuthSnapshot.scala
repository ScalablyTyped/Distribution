package typings.reactDashNativeDashFirebase.reactDashNativeDashFirebaseMod.RNFirebase

import typings.reactDashNativeDashFirebase.reactDashNativeDashFirebaseStrings.error
import typings.reactDashNativeDashFirebase.reactDashNativeDashFirebaseStrings.sent
import typings.reactDashNativeDashFirebase.reactDashNativeDashFirebaseStrings.timeout
import typings.reactDashNativeDashFirebase.reactDashNativeDashFirebaseStrings.verified
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PhoneAuthSnapshot extends js.Object {
  var code: String | Null
  var error: NativeError | Null
  var state: sent | timeout | verified | error
  var verificationId: String
}

object PhoneAuthSnapshot {
  @scala.inline
  def apply(
    state: sent | timeout | verified | error,
    verificationId: String,
    code: String = null,
    error: NativeError = null
  ): PhoneAuthSnapshot = {
    val __obj = js.Dynamic.literal(state = state.asInstanceOf[js.Any], verificationId = verificationId)
    if (code != null) __obj.updateDynamic("code")(code)
    if (error != null) __obj.updateDynamic("error")(error)
    __obj.asInstanceOf[PhoneAuthSnapshot]
  }
}

