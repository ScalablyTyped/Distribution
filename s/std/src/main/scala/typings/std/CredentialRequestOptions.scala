package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CredentialRequestOptions extends js.Object {
  var mediation: js.UndefOr[CredentialMediationRequirement] = js.native
  var publicKey: js.UndefOr[PublicKeyCredentialRequestOptions] = js.native
  var signal: js.UndefOr[AbortSignal] = js.native
}

object CredentialRequestOptions {
  @scala.inline
  def apply(): CredentialRequestOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CredentialRequestOptions]
  }
  @scala.inline
  implicit class CredentialRequestOptionsOps[Self <: CredentialRequestOptions] (val x: Self) extends AnyVal {
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
    def setMediation(value: CredentialMediationRequirement): Self = this.set("mediation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMediation: Self = this.set("mediation", js.undefined)
    @scala.inline
    def setPublicKey(value: PublicKeyCredentialRequestOptions): Self = this.set("publicKey", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePublicKey: Self = this.set("publicKey", js.undefined)
    @scala.inline
    def setSignal(value: AbortSignal): Self = this.set("signal", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSignal: Self = this.set("signal", js.undefined)
  }
  
}

