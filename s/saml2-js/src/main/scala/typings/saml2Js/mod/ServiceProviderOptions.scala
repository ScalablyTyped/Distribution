package typings.saml2Js.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ServiceProviderOptions extends js.Object {
  
  var allow_unencrypted_assertion: js.UndefOr[Boolean] = js.native
  
  var alt_certs: js.UndefOr[js.Array[String]] = js.native
  
  var alt_private_keys: js.UndefOr[js.Array[String]] = js.native
  
  var assert_endpoint: String = js.native
  
  var auth_context: js.UndefOr[AuthnContextClassRef] = js.native
  
  var certificate: String = js.native
  
  var entity_id: String = js.native
  
  var force_authn: js.UndefOr[Boolean] = js.native
  
  var nameid_format: js.UndefOr[String] = js.native
  
  var private_key: String = js.native
  
  var sign_get_request: js.UndefOr[Boolean] = js.native
}
object ServiceProviderOptions {
  
  @scala.inline
  def apply(assert_endpoint: String, certificate: String, entity_id: String, private_key: String): ServiceProviderOptions = {
    val __obj = js.Dynamic.literal(assert_endpoint = assert_endpoint.asInstanceOf[js.Any], certificate = certificate.asInstanceOf[js.Any], entity_id = entity_id.asInstanceOf[js.Any], private_key = private_key.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServiceProviderOptions]
  }
  
  @scala.inline
  implicit class ServiceProviderOptionsOps[Self <: ServiceProviderOptions] (val x: Self) extends AnyVal {
    
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
    def setAssert_endpoint(value: String): Self = this.set("assert_endpoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCertificate(value: String): Self = this.set("certificate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEntity_id(value: String): Self = this.set("entity_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrivate_key(value: String): Self = this.set("private_key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllow_unencrypted_assertion(value: Boolean): Self = this.set("allow_unencrypted_assertion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllow_unencrypted_assertion: Self = this.set("allow_unencrypted_assertion", js.undefined)
    
    @scala.inline
    def setAlt_certsVarargs(value: String*): Self = this.set("alt_certs", js.Array(value :_*))
    
    @scala.inline
    def setAlt_certs(value: js.Array[String]): Self = this.set("alt_certs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlt_certs: Self = this.set("alt_certs", js.undefined)
    
    @scala.inline
    def setAlt_private_keysVarargs(value: String*): Self = this.set("alt_private_keys", js.Array(value :_*))
    
    @scala.inline
    def setAlt_private_keys(value: js.Array[String]): Self = this.set("alt_private_keys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlt_private_keys: Self = this.set("alt_private_keys", js.undefined)
    
    @scala.inline
    def setAuth_context(value: AuthnContextClassRef): Self = this.set("auth_context", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAuth_context: Self = this.set("auth_context", js.undefined)
    
    @scala.inline
    def setForce_authn(value: Boolean): Self = this.set("force_authn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteForce_authn: Self = this.set("force_authn", js.undefined)
    
    @scala.inline
    def setNameid_format(value: String): Self = this.set("nameid_format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNameid_format: Self = this.set("nameid_format", js.undefined)
    
    @scala.inline
    def setSign_get_request(value: Boolean): Self = this.set("sign_get_request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSign_get_request: Self = this.set("sign_get_request", js.undefined)
  }
}
