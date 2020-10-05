package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RTCIceServer extends js.Object {
  var credential: js.UndefOr[java.lang.String | RTCOAuthCredential] = js.native
  var credentialType: js.UndefOr[RTCIceCredentialType] = js.native
  var urls: java.lang.String | js.Array[java.lang.String] = js.native
  var username: js.UndefOr[java.lang.String] = js.native
}

object RTCIceServer {
  @scala.inline
  def apply(urls: java.lang.String | js.Array[java.lang.String]): RTCIceServer = {
    val __obj = js.Dynamic.literal(urls = urls.asInstanceOf[js.Any])
    __obj.asInstanceOf[RTCIceServer]
  }
  @scala.inline
  implicit class RTCIceServerOps[Self <: RTCIceServer] (val x: Self) extends AnyVal {
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
    def setUrlsVarargs(value: java.lang.String*): Self = this.set("urls", js.Array(value :_*))
    @scala.inline
    def setUrls(value: java.lang.String | js.Array[java.lang.String]): Self = this.set("urls", value.asInstanceOf[js.Any])
    @scala.inline
    def setCredential(value: java.lang.String | RTCOAuthCredential): Self = this.set("credential", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCredential: Self = this.set("credential", js.undefined)
    @scala.inline
    def setCredentialType(value: RTCIceCredentialType): Self = this.set("credentialType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCredentialType: Self = this.set("credentialType", js.undefined)
    @scala.inline
    def setUsername(value: java.lang.String): Self = this.set("username", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUsername: Self = this.set("username", js.undefined)
  }
  
}

