package typings.saml2Js.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IdentityProviderOptions extends js.Object {
  
  var allow_unencrypted_assertion: js.UndefOr[Boolean] = js.native
  
  var certificates: js.Array[String] = js.native
  
  var force_authn: js.UndefOr[Boolean] = js.native
  
  var sign_get_request: js.UndefOr[Boolean] = js.native
  
  var sso_login_url: String = js.native
  
  var sso_logout_url: String = js.native
}
object IdentityProviderOptions {
  
  @scala.inline
  def apply(certificates: js.Array[String], sso_login_url: String, sso_logout_url: String): IdentityProviderOptions = {
    val __obj = js.Dynamic.literal(certificates = certificates.asInstanceOf[js.Any], sso_login_url = sso_login_url.asInstanceOf[js.Any], sso_logout_url = sso_logout_url.asInstanceOf[js.Any])
    __obj.asInstanceOf[IdentityProviderOptions]
  }
  
  @scala.inline
  implicit class IdentityProviderOptionsOps[Self <: IdentityProviderOptions] (val x: Self) extends AnyVal {
    
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
    def setCertificatesVarargs(value: String*): Self = this.set("certificates", js.Array(value :_*))
    
    @scala.inline
    def setCertificates(value: js.Array[String]): Self = this.set("certificates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSso_login_url(value: String): Self = this.set("sso_login_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSso_logout_url(value: String): Self = this.set("sso_logout_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllow_unencrypted_assertion(value: Boolean): Self = this.set("allow_unencrypted_assertion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllow_unencrypted_assertion: Self = this.set("allow_unencrypted_assertion", js.undefined)
    
    @scala.inline
    def setForce_authn(value: Boolean): Self = this.set("force_authn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteForce_authn: Self = this.set("force_authn", js.undefined)
    
    @scala.inline
    def setSign_get_request(value: Boolean): Self = this.set("sign_get_request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSign_get_request: Self = this.set("sign_get_request", js.undefined)
  }
}
