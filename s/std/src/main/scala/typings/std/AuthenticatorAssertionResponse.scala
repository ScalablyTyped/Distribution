package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AuthenticatorAssertionResponse extends AuthenticatorResponse {
  val authenticatorData: ArrayBuffer = js.native
  val signature: ArrayBuffer = js.native
  val userHandle: ArrayBuffer | Null = js.native
}

object AuthenticatorAssertionResponse {
  @scala.inline
  def apply(authenticatorData: ArrayBuffer, clientDataJSON: ArrayBuffer, signature: ArrayBuffer): AuthenticatorAssertionResponse = {
    val __obj = js.Dynamic.literal(authenticatorData = authenticatorData.asInstanceOf[js.Any], clientDataJSON = clientDataJSON.asInstanceOf[js.Any], signature = signature.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuthenticatorAssertionResponse]
  }
  @scala.inline
  implicit class AuthenticatorAssertionResponseOps[Self <: AuthenticatorAssertionResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAuthenticatorData(value: ArrayBuffer): Self = this.set("authenticatorData", value.asInstanceOf[js.Any])
    @scala.inline
    def setSignature(value: ArrayBuffer): Self = this.set("signature", value.asInstanceOf[js.Any])
    @scala.inline
    def setUserHandle(value: ArrayBuffer): Self = this.set("userHandle", value.asInstanceOf[js.Any])
    @scala.inline
    def setUserHandleNull: Self = this.set("userHandle", null)
  }
  
}

