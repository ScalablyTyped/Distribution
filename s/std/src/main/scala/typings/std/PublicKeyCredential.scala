package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PublicKeyCredential extends Credential {
  val rawId: ArrayBuffer = js.native
  val response: AuthenticatorResponse = js.native
  def getClientExtensionResults(): AuthenticationExtensionsClientOutputs = js.native
}

object PublicKeyCredential {
  @scala.inline
  def apply(
    getClientExtensionResults: () => AuthenticationExtensionsClientOutputs,
    id: java.lang.String,
    rawId: ArrayBuffer,
    response: AuthenticatorResponse,
    `type`: java.lang.String
  ): PublicKeyCredential = {
    val __obj = js.Dynamic.literal(getClientExtensionResults = js.Any.fromFunction0(getClientExtensionResults), id = id.asInstanceOf[js.Any], rawId = rawId.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PublicKeyCredential]
  }
  @scala.inline
  implicit class PublicKeyCredentialOps[Self <: PublicKeyCredential] (val x: Self) extends AnyVal {
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
    def setGetClientExtensionResults(value: () => AuthenticationExtensionsClientOutputs): Self = this.set("getClientExtensionResults", js.Any.fromFunction0(value))
    @scala.inline
    def setRawId(value: ArrayBuffer): Self = this.set("rawId", value.asInstanceOf[js.Any])
    @scala.inline
    def setResponse(value: AuthenticatorResponse): Self = this.set("response", value.asInstanceOf[js.Any])
  }
  
}

