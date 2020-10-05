package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RTCOAuthCredential extends js.Object {
  var accessToken: java.lang.String = js.native
  var macKey: java.lang.String = js.native
}

object RTCOAuthCredential {
  @scala.inline
  def apply(accessToken: java.lang.String, macKey: java.lang.String): RTCOAuthCredential = {
    val __obj = js.Dynamic.literal(accessToken = accessToken.asInstanceOf[js.Any], macKey = macKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[RTCOAuthCredential]
  }
  @scala.inline
  implicit class RTCOAuthCredentialOps[Self <: RTCOAuthCredential] (val x: Self) extends AnyVal {
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
    def setAccessToken(value: java.lang.String): Self = this.set("accessToken", value.asInstanceOf[js.Any])
    @scala.inline
    def setMacKey(value: java.lang.String): Self = this.set("macKey", value.asInstanceOf[js.Any])
  }
  
}

