package typings.reactNativeFirebase.mod.RNFirebase

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PhoneAuthError extends js.Object {
  var code: String | Null = js.native
  var message: String | Null = js.native
  var stack: String | Null = js.native
  var verificationId: String = js.native
}

object PhoneAuthError {
  @scala.inline
  def apply(verificationId: String): PhoneAuthError = {
    val __obj = js.Dynamic.literal(verificationId = verificationId.asInstanceOf[js.Any])
    __obj.asInstanceOf[PhoneAuthError]
  }
  @scala.inline
  implicit class PhoneAuthErrorOps[Self <: PhoneAuthError] (val x: Self) extends AnyVal {
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
    def setVerificationId(value: String): Self = this.set("verificationId", value.asInstanceOf[js.Any])
    @scala.inline
    def setCode(value: String): Self = this.set("code", value.asInstanceOf[js.Any])
    @scala.inline
    def setCodeNull: Self = this.set("code", null)
    @scala.inline
    def setMessage(value: String): Self = this.set("message", value.asInstanceOf[js.Any])
    @scala.inline
    def setMessageNull: Self = this.set("message", null)
    @scala.inline
    def setStack(value: String): Self = this.set("stack", value.asInstanceOf[js.Any])
    @scala.inline
    def setStackNull: Self = this.set("stack", null)
  }
  
}

