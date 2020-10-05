package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AuthenticatorResponse extends js.Object {
  val clientDataJSON: ArrayBuffer = js.native
}

object AuthenticatorResponse {
  @scala.inline
  def apply(clientDataJSON: ArrayBuffer): AuthenticatorResponse = {
    val __obj = js.Dynamic.literal(clientDataJSON = clientDataJSON.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuthenticatorResponse]
  }
  @scala.inline
  implicit class AuthenticatorResponseOps[Self <: AuthenticatorResponse] (val x: Self) extends AnyVal {
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
    def setClientDataJSON(value: ArrayBuffer): Self = this.set("clientDataJSON", value.asInstanceOf[js.Any])
  }
  
}

