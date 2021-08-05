package typings.saml2Js

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("saml2-js", "IdentityProvider")
  @js.native
  class IdentityProvider protected () extends StObject {
    def this(options: IdentityProviderOptions) = this()
  }
  
  @JSImport("saml2-js", "ServiceProvider")
  @js.native
  class ServiceProvider protected () extends StObject {
    def this(options: ServiceProviderOptions) = this()
    
    def create_login_request_url(
      IdP: IdentityProvider,
      options: CreateLoginRequestUrlOptions,
      cb: js.Function3[/* error */ js.Any, /* login_url */ String, /* request_id */ String, Unit]
    ): Unit = js.native
    
    def create_logout_request_url(
      IdP: IdentityProvider,
      options: CreateLogoutRequestUrlOptions,
      cb: js.Function2[/* error */ js.Any, /* request_url */ String, Unit]
    ): Unit = js.native
    
    def create_logout_response_url(
      IdP: IdentityProvider,
      options: CreateLogoutResponseUrlOptions,
      cb: js.Function2[/* error */ js.Any, /* response_url */ String, Unit]
    ): Unit = js.native
    
    def create_metadata(): String = js.native
    
    def post_assert(
      IdP: IdentityProvider,
      options: GetAssertOptions,
      cb: js.Function2[/* error */ js.Any, /* response */ js.Any, Unit]
    ): Unit = js.native
    
    def redirect_assert(
      IdP: IdentityProvider,
      options: GetAssertOptions,
      cb: js.Function2[/* error */ js.Any, /* response */ js.Any, Unit]
    ): Unit = js.native
  }
  
  trait AuthnContextClassRef extends StObject {
    
    var class_refs: js.Array[String]
    
    var comparison: String
  }
  object AuthnContextClassRef {
    
    inline def apply(class_refs: js.Array[String], comparison: String): AuthnContextClassRef = {
      val __obj = js.Dynamic.literal(class_refs = class_refs.asInstanceOf[js.Any], comparison = comparison.asInstanceOf[js.Any])
      __obj.asInstanceOf[AuthnContextClassRef]
    }
    
    extension [Self <: AuthnContextClassRef](x: Self) {
      
      inline def setClass_refs(value: js.Array[String]): Self = StObject.set(x, "class_refs", value.asInstanceOf[js.Any])
      
      inline def setClass_refsVarargs(value: String*): Self = StObject.set(x, "class_refs", js.Array(value :_*))
      
      inline def setComparison(value: String): Self = StObject.set(x, "comparison", value.asInstanceOf[js.Any])
    }
  }
  
  trait CreateLoginRequestUrlOptions extends StObject {
    
    var auth_context: js.UndefOr[AuthnContextClassRef] = js.undefined
    
    var force_authn: js.UndefOr[Boolean] = js.undefined
    
    var nameid_format: js.UndefOr[String] = js.undefined
    
    var relay_state: js.UndefOr[String] = js.undefined
    
    var sign_get_request: js.UndefOr[Boolean] = js.undefined
  }
  object CreateLoginRequestUrlOptions {
    
    inline def apply(): CreateLoginRequestUrlOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CreateLoginRequestUrlOptions]
    }
    
    extension [Self <: CreateLoginRequestUrlOptions](x: Self) {
      
      inline def setAuth_context(value: AuthnContextClassRef): Self = StObject.set(x, "auth_context", value.asInstanceOf[js.Any])
      
      inline def setAuth_contextUndefined: Self = StObject.set(x, "auth_context", js.undefined)
      
      inline def setForce_authn(value: Boolean): Self = StObject.set(x, "force_authn", value.asInstanceOf[js.Any])
      
      inline def setForce_authnUndefined: Self = StObject.set(x, "force_authn", js.undefined)
      
      inline def setNameid_format(value: String): Self = StObject.set(x, "nameid_format", value.asInstanceOf[js.Any])
      
      inline def setNameid_formatUndefined: Self = StObject.set(x, "nameid_format", js.undefined)
      
      inline def setRelay_state(value: String): Self = StObject.set(x, "relay_state", value.asInstanceOf[js.Any])
      
      inline def setRelay_stateUndefined: Self = StObject.set(x, "relay_state", js.undefined)
      
      inline def setSign_get_request(value: Boolean): Self = StObject.set(x, "sign_get_request", value.asInstanceOf[js.Any])
      
      inline def setSign_get_requestUndefined: Self = StObject.set(x, "sign_get_request", js.undefined)
    }
  }
  
  trait CreateLogoutRequestUrlOptions extends StObject {
    
    var allow_unencrypted_assertion: js.UndefOr[Boolean] = js.undefined
    
    var name_id: js.UndefOr[String] = js.undefined
    
    var relay_state: js.UndefOr[String] = js.undefined
    
    var session_index: js.UndefOr[String] = js.undefined
    
    var sign_get_request: js.UndefOr[Boolean] = js.undefined
  }
  object CreateLogoutRequestUrlOptions {
    
    inline def apply(): CreateLogoutRequestUrlOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CreateLogoutRequestUrlOptions]
    }
    
    extension [Self <: CreateLogoutRequestUrlOptions](x: Self) {
      
      inline def setAllow_unencrypted_assertion(value: Boolean): Self = StObject.set(x, "allow_unencrypted_assertion", value.asInstanceOf[js.Any])
      
      inline def setAllow_unencrypted_assertionUndefined: Self = StObject.set(x, "allow_unencrypted_assertion", js.undefined)
      
      inline def setName_id(value: String): Self = StObject.set(x, "name_id", value.asInstanceOf[js.Any])
      
      inline def setName_idUndefined: Self = StObject.set(x, "name_id", js.undefined)
      
      inline def setRelay_state(value: String): Self = StObject.set(x, "relay_state", value.asInstanceOf[js.Any])
      
      inline def setRelay_stateUndefined: Self = StObject.set(x, "relay_state", js.undefined)
      
      inline def setSession_index(value: String): Self = StObject.set(x, "session_index", value.asInstanceOf[js.Any])
      
      inline def setSession_indexUndefined: Self = StObject.set(x, "session_index", js.undefined)
      
      inline def setSign_get_request(value: Boolean): Self = StObject.set(x, "sign_get_request", value.asInstanceOf[js.Any])
      
      inline def setSign_get_requestUndefined: Self = StObject.set(x, "sign_get_request", js.undefined)
    }
  }
  
  trait CreateLogoutResponseUrlOptions extends StObject {
    
    var in_response_to: js.UndefOr[String] = js.undefined
    
    var relay_state: js.UndefOr[String] = js.undefined
    
    var sign_get_request: js.UndefOr[Boolean] = js.undefined
  }
  object CreateLogoutResponseUrlOptions {
    
    inline def apply(): CreateLogoutResponseUrlOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CreateLogoutResponseUrlOptions]
    }
    
    extension [Self <: CreateLogoutResponseUrlOptions](x: Self) {
      
      inline def setIn_response_to(value: String): Self = StObject.set(x, "in_response_to", value.asInstanceOf[js.Any])
      
      inline def setIn_response_toUndefined: Self = StObject.set(x, "in_response_to", js.undefined)
      
      inline def setRelay_state(value: String): Self = StObject.set(x, "relay_state", value.asInstanceOf[js.Any])
      
      inline def setRelay_stateUndefined: Self = StObject.set(x, "relay_state", js.undefined)
      
      inline def setSign_get_request(value: Boolean): Self = StObject.set(x, "sign_get_request", value.asInstanceOf[js.Any])
      
      inline def setSign_get_requestUndefined: Self = StObject.set(x, "sign_get_request", js.undefined)
    }
  }
  
  trait GetAssertOptions extends StObject {
    
    var allow_unencrypted_assertion: js.UndefOr[Boolean] = js.undefined
    
    var request_body: js.UndefOr[js.Any] = js.undefined
  }
  object GetAssertOptions {
    
    inline def apply(): GetAssertOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GetAssertOptions]
    }
    
    extension [Self <: GetAssertOptions](x: Self) {
      
      inline def setAllow_unencrypted_assertion(value: Boolean): Self = StObject.set(x, "allow_unencrypted_assertion", value.asInstanceOf[js.Any])
      
      inline def setAllow_unencrypted_assertionUndefined: Self = StObject.set(x, "allow_unencrypted_assertion", js.undefined)
      
      inline def setRequest_body(value: js.Any): Self = StObject.set(x, "request_body", value.asInstanceOf[js.Any])
      
      inline def setRequest_bodyUndefined: Self = StObject.set(x, "request_body", js.undefined)
    }
  }
  
  trait IdentityProviderOptions extends StObject {
    
    var allow_unencrypted_assertion: js.UndefOr[Boolean] = js.undefined
    
    var certificates: js.Array[String]
    
    var force_authn: js.UndefOr[Boolean] = js.undefined
    
    var sign_get_request: js.UndefOr[Boolean] = js.undefined
    
    var sso_login_url: String
    
    var sso_logout_url: String
  }
  object IdentityProviderOptions {
    
    inline def apply(certificates: js.Array[String], sso_login_url: String, sso_logout_url: String): IdentityProviderOptions = {
      val __obj = js.Dynamic.literal(certificates = certificates.asInstanceOf[js.Any], sso_login_url = sso_login_url.asInstanceOf[js.Any], sso_logout_url = sso_logout_url.asInstanceOf[js.Any])
      __obj.asInstanceOf[IdentityProviderOptions]
    }
    
    extension [Self <: IdentityProviderOptions](x: Self) {
      
      inline def setAllow_unencrypted_assertion(value: Boolean): Self = StObject.set(x, "allow_unencrypted_assertion", value.asInstanceOf[js.Any])
      
      inline def setAllow_unencrypted_assertionUndefined: Self = StObject.set(x, "allow_unencrypted_assertion", js.undefined)
      
      inline def setCertificates(value: js.Array[String]): Self = StObject.set(x, "certificates", value.asInstanceOf[js.Any])
      
      inline def setCertificatesVarargs(value: String*): Self = StObject.set(x, "certificates", js.Array(value :_*))
      
      inline def setForce_authn(value: Boolean): Self = StObject.set(x, "force_authn", value.asInstanceOf[js.Any])
      
      inline def setForce_authnUndefined: Self = StObject.set(x, "force_authn", js.undefined)
      
      inline def setSign_get_request(value: Boolean): Self = StObject.set(x, "sign_get_request", value.asInstanceOf[js.Any])
      
      inline def setSign_get_requestUndefined: Self = StObject.set(x, "sign_get_request", js.undefined)
      
      inline def setSso_login_url(value: String): Self = StObject.set(x, "sso_login_url", value.asInstanceOf[js.Any])
      
      inline def setSso_logout_url(value: String): Self = StObject.set(x, "sso_logout_url", value.asInstanceOf[js.Any])
    }
  }
  
  trait ServiceProviderOptions extends StObject {
    
    var allow_unencrypted_assertion: js.UndefOr[Boolean] = js.undefined
    
    var alt_certs: js.UndefOr[js.Array[String]] = js.undefined
    
    var alt_private_keys: js.UndefOr[js.Array[String]] = js.undefined
    
    var assert_endpoint: String
    
    var auth_context: js.UndefOr[AuthnContextClassRef] = js.undefined
    
    var certificate: String
    
    var entity_id: String
    
    var force_authn: js.UndefOr[Boolean] = js.undefined
    
    var nameid_format: js.UndefOr[String] = js.undefined
    
    var private_key: String
    
    var sign_get_request: js.UndefOr[Boolean] = js.undefined
  }
  object ServiceProviderOptions {
    
    inline def apply(assert_endpoint: String, certificate: String, entity_id: String, private_key: String): ServiceProviderOptions = {
      val __obj = js.Dynamic.literal(assert_endpoint = assert_endpoint.asInstanceOf[js.Any], certificate = certificate.asInstanceOf[js.Any], entity_id = entity_id.asInstanceOf[js.Any], private_key = private_key.asInstanceOf[js.Any])
      __obj.asInstanceOf[ServiceProviderOptions]
    }
    
    extension [Self <: ServiceProviderOptions](x: Self) {
      
      inline def setAllow_unencrypted_assertion(value: Boolean): Self = StObject.set(x, "allow_unencrypted_assertion", value.asInstanceOf[js.Any])
      
      inline def setAllow_unencrypted_assertionUndefined: Self = StObject.set(x, "allow_unencrypted_assertion", js.undefined)
      
      inline def setAlt_certs(value: js.Array[String]): Self = StObject.set(x, "alt_certs", value.asInstanceOf[js.Any])
      
      inline def setAlt_certsUndefined: Self = StObject.set(x, "alt_certs", js.undefined)
      
      inline def setAlt_certsVarargs(value: String*): Self = StObject.set(x, "alt_certs", js.Array(value :_*))
      
      inline def setAlt_private_keys(value: js.Array[String]): Self = StObject.set(x, "alt_private_keys", value.asInstanceOf[js.Any])
      
      inline def setAlt_private_keysUndefined: Self = StObject.set(x, "alt_private_keys", js.undefined)
      
      inline def setAlt_private_keysVarargs(value: String*): Self = StObject.set(x, "alt_private_keys", js.Array(value :_*))
      
      inline def setAssert_endpoint(value: String): Self = StObject.set(x, "assert_endpoint", value.asInstanceOf[js.Any])
      
      inline def setAuth_context(value: AuthnContextClassRef): Self = StObject.set(x, "auth_context", value.asInstanceOf[js.Any])
      
      inline def setAuth_contextUndefined: Self = StObject.set(x, "auth_context", js.undefined)
      
      inline def setCertificate(value: String): Self = StObject.set(x, "certificate", value.asInstanceOf[js.Any])
      
      inline def setEntity_id(value: String): Self = StObject.set(x, "entity_id", value.asInstanceOf[js.Any])
      
      inline def setForce_authn(value: Boolean): Self = StObject.set(x, "force_authn", value.asInstanceOf[js.Any])
      
      inline def setForce_authnUndefined: Self = StObject.set(x, "force_authn", js.undefined)
      
      inline def setNameid_format(value: String): Self = StObject.set(x, "nameid_format", value.asInstanceOf[js.Any])
      
      inline def setNameid_formatUndefined: Self = StObject.set(x, "nameid_format", js.undefined)
      
      inline def setPrivate_key(value: String): Self = StObject.set(x, "private_key", value.asInstanceOf[js.Any])
      
      inline def setSign_get_request(value: Boolean): Self = StObject.set(x, "sign_get_request", value.asInstanceOf[js.Any])
      
      inline def setSign_get_requestUndefined: Self = StObject.set(x, "sign_get_request", js.undefined)
    }
  }
}
