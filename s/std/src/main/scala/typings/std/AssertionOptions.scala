package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AssertionOptions extends js.Object {
  var allowList: js.UndefOr[js.Array[ScopedCredentialDescriptor]] = js.native
  var extensions: js.UndefOr[WebAuthnExtensions] = js.native
  var rpId: js.UndefOr[java.lang.String] = js.native
  var timeoutSeconds: js.UndefOr[Double] = js.native
}

object AssertionOptions {
  @scala.inline
  def apply(): AssertionOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AssertionOptions]
  }
  @scala.inline
  implicit class AssertionOptionsOps[Self <: AssertionOptions] (val x: Self) extends AnyVal {
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
    def setAllowListVarargs(value: ScopedCredentialDescriptor*): Self = this.set("allowList", js.Array(value :_*))
    @scala.inline
    def setAllowList(value: js.Array[ScopedCredentialDescriptor]): Self = this.set("allowList", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowList: Self = this.set("allowList", js.undefined)
    @scala.inline
    def setExtensions(value: WebAuthnExtensions): Self = this.set("extensions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExtensions: Self = this.set("extensions", js.undefined)
    @scala.inline
    def setRpId(value: java.lang.String): Self = this.set("rpId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRpId: Self = this.set("rpId", js.undefined)
    @scala.inline
    def setTimeoutSeconds(value: Double): Self = this.set("timeoutSeconds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimeoutSeconds: Self = this.set("timeoutSeconds", js.undefined)
  }
  
}

