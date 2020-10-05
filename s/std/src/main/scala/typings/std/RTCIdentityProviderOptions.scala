package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RTCIdentityProviderOptions extends js.Object {
  var peerIdentity: js.UndefOr[java.lang.String] = js.native
  var protocol: js.UndefOr[java.lang.String] = js.native
  var usernameHint: js.UndefOr[java.lang.String] = js.native
}

object RTCIdentityProviderOptions {
  @scala.inline
  def apply(): RTCIdentityProviderOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RTCIdentityProviderOptions]
  }
  @scala.inline
  implicit class RTCIdentityProviderOptionsOps[Self <: RTCIdentityProviderOptions] (val x: Self) extends AnyVal {
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
    def setPeerIdentity(value: java.lang.String): Self = this.set("peerIdentity", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePeerIdentity: Self = this.set("peerIdentity", js.undefined)
    @scala.inline
    def setProtocol(value: java.lang.String): Self = this.set("protocol", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProtocol: Self = this.set("protocol", js.undefined)
    @scala.inline
    def setUsernameHint(value: java.lang.String): Self = this.set("usernameHint", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUsernameHint: Self = this.set("usernameHint", js.undefined)
  }
  
}

