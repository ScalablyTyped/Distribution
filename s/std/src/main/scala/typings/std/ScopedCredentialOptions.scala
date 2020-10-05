package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ScopedCredentialOptions extends js.Object {
  var excludeList: js.UndefOr[js.Array[ScopedCredentialDescriptor]] = js.native
  var extensions: js.UndefOr[WebAuthnExtensions] = js.native
  var rpId: js.UndefOr[java.lang.String] = js.native
  var timeoutSeconds: js.UndefOr[Double] = js.native
}

object ScopedCredentialOptions {
  @scala.inline
  def apply(): ScopedCredentialOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScopedCredentialOptions]
  }
  @scala.inline
  implicit class ScopedCredentialOptionsOps[Self <: ScopedCredentialOptions] (val x: Self) extends AnyVal {
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
    def setExcludeListVarargs(value: ScopedCredentialDescriptor*): Self = this.set("excludeList", js.Array(value :_*))
    @scala.inline
    def setExcludeList(value: js.Array[ScopedCredentialDescriptor]): Self = this.set("excludeList", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExcludeList: Self = this.set("excludeList", js.undefined)
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

