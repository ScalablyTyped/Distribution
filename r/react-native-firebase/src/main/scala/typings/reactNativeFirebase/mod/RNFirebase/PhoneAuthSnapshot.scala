package typings.reactNativeFirebase.mod.RNFirebase

import typings.reactNativeFirebase.reactNativeFirebaseStrings.error_
import typings.reactNativeFirebase.reactNativeFirebaseStrings.sent
import typings.reactNativeFirebase.reactNativeFirebaseStrings.timeout
import typings.reactNativeFirebase.reactNativeFirebaseStrings.verified
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PhoneAuthSnapshot extends js.Object {
  var code: String | Null = js.native
  var error: NativeError | Null = js.native
  var state: sent | timeout | verified | error_ = js.native
  var verificationId: String = js.native
}

object PhoneAuthSnapshot {
  @scala.inline
  def apply(state: sent | timeout | verified | error_, verificationId: String): PhoneAuthSnapshot = {
    val __obj = js.Dynamic.literal(state = state.asInstanceOf[js.Any], verificationId = verificationId.asInstanceOf[js.Any])
    __obj.asInstanceOf[PhoneAuthSnapshot]
  }
  @scala.inline
  implicit class PhoneAuthSnapshotOps[Self <: PhoneAuthSnapshot] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setState(value: sent | timeout | verified | error_): Self = this.set("state", value.asInstanceOf[js.Any])
    @scala.inline
    def setVerificationId(value: String): Self = this.set("verificationId", value.asInstanceOf[js.Any])
    @scala.inline
    def setCode(value: String): Self = this.set("code", value.asInstanceOf[js.Any])
    @scala.inline
    def setCodeNull: Self = this.set("code", null)
    @scala.inline
    def setError(value: NativeError): Self = this.set("error", value.asInstanceOf[js.Any])
    @scala.inline
    def setErrorNull: Self = this.set("error", null)
  }
  
}

