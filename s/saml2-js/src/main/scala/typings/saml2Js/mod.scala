package typings.saml2Js

import typings.saml2Js.anon.Attributes
import typings.saml2Js.anon.Destination
import typings.saml2Js.anon.SAMLRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("saml2-js", "IdentityProvider")
  @js.native
  open class IdentityProvider protected () extends StObject {
    def this(options: IdentityProviderOptions) = this()
  }
  
  @JSImport("saml2-js", "ServiceProvider")
  @js.native
  open class ServiceProvider protected () extends StObject {
    def this(options: ServiceProviderOptions) = this()
    
    /** Get a URL to initiate a login. */
    def create_login_request_url(
      IdP: IdentityProvider,
      options: CreateLoginRequestUrlOptions,
      cb: js.Function3[/* error */ js.Error | Null, /* login_url */ String, /* request_id */ String, Unit]
    ): Unit = js.native
    
    def create_logout_request_url(
      IdP: String,
      options: CreateLogoutRequestUrlOptions,
      cb: js.Function3[/* error */ js.Error | Null, /* request_url */ String, /* request_id */ String, Unit]
    ): Unit = js.native
    /** Creates a SAML Request URL to initiate a user logout. */
    def create_logout_request_url(
      IdP: IdentityProvider,
      options: CreateLogoutRequestUrlOptions,
      cb: js.Function3[/* error */ js.Error | Null, /* request_url */ String, /* request_id */ String, Unit]
    ): Unit = js.native
    
    def create_logout_response_url(
      IdP: String,
      options: CreateLogoutResponseUrlOptions,
      cb: js.Function2[/* error */ js.Error | Null, /* response_url */ String, Unit]
    ): Unit = js.native
    /** Creates a SAML Response URL to confirm a successful IdP initiated logout. */
    def create_logout_response_url(
      IdP: IdentityProvider,
      options: CreateLogoutResponseUrlOptions,
      cb: js.Function2[/* error */ js.Error | Null, /* response_url */ String, Unit]
    ): Unit = js.native
    
    /** Returns the XML metadata used during the initial SAML configuration. */
    def create_metadata(): String = js.native
    
    /** Gets a SAML response object if the login attempt is valid, used for post binding. */
    def post_assert(
      IdP: IdentityProvider,
      options: PostAssertOptions,
      cb: js.Function2[/* error */ js.Error | Null, /* response */ SAMLAssertResponse, Unit]
    ): Unit = js.native
    
    /** Gets a SAML response object if the login attempt is valid, used for redirect binding. */
    def redirect_assert(
      IdP: IdentityProvider,
      options: RedirectAssertOptions,
      cb: js.Function2[/* error */ js.Error | Null, /* response */ SAMLAssertResponse, Unit]
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AuthnContextClassRef] (val x: Self) extends AnyVal {
      
      inline def setClass_refs(value: js.Array[String]): Self = StObject.set(x, "class_refs", value.asInstanceOf[js.Any])
      
      inline def setClass_refsVarargs(value: String*): Self = StObject.set(x, "class_refs", js.Array(value*))
      
      inline def setComparison(value: String): Self = StObject.set(x, "comparison", value.asInstanceOf[js.Any])
    }
  }
  
  trait CreateLoginRequestUrlOptions extends StObject {
    
    /** Specifies AuthnContextClassRef. This can also be configured on the SP. */
    var auth_context: js.UndefOr[AuthnContextClassRef] = js.undefined
    
    /** If true, forces re-authentication of users even if the user has a SSO session with the IdP. This can also be configured on the IdP or SP. */
    var force_authn: js.UndefOr[Boolean] = js.undefined
    
    /** Format for Name ID. This can also be configured on the SP. */
    var nameid_format: js.UndefOr[String] = js.undefined
    
    /** SAML relay state. */
    var relay_state: js.UndefOr[String] = js.undefined
    
    /** If true, signs the request. This can also be configured on the IdP or SP. */
    var sign_get_request: js.UndefOr[Boolean] = js.undefined
  }
  object CreateLoginRequestUrlOptions {
    
    inline def apply(): CreateLoginRequestUrlOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CreateLoginRequestUrlOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CreateLoginRequestUrlOptions] (val x: Self) extends AnyVal {
      
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
    
    /** If true, allows unencrypted assertions. This can also be configured on the IdP or SP. */
    var allow_unencrypted_assertion: js.UndefOr[Boolean] = js.undefined
    
    /** Format for Name ID. This can also be configured on a per-method basis. */
    var name_id: js.UndefOr[String] = js.undefined
    
    /** SAML relay state. */
    var relay_state: js.UndefOr[String] = js.undefined
    
    /** Session index to use for creating logout request. */
    var session_index: js.UndefOr[String] = js.undefined
    
    /** If true, signs the request. This can also be configured on the IdP or SP. */
    var sign_get_request: js.UndefOr[Boolean] = js.undefined
  }
  object CreateLogoutRequestUrlOptions {
    
    inline def apply(): CreateLogoutRequestUrlOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CreateLogoutRequestUrlOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CreateLogoutRequestUrlOptions] (val x: Self) extends AnyVal {
      
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
    
    /** The ID of the request that this is in response to. Should be checked against any sent request IDs. */
    var in_response_to: js.UndefOr[String] = js.undefined
    
    /** SAML relay state. */
    var relay_state: js.UndefOr[String] = js.undefined
    
    /** If true, signs the request. This can also be configured on the IdP or SP. */
    var sign_get_request: js.UndefOr[Boolean] = js.undefined
  }
  object CreateLogoutResponseUrlOptions {
    
    inline def apply(): CreateLogoutResponseUrlOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CreateLogoutResponseUrlOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CreateLogoutResponseUrlOptions] (val x: Self) extends AnyVal {
      
      inline def setIn_response_to(value: String): Self = StObject.set(x, "in_response_to", value.asInstanceOf[js.Any])
      
      inline def setIn_response_toUndefined: Self = StObject.set(x, "in_response_to", js.undefined)
      
      inline def setRelay_state(value: String): Self = StObject.set(x, "relay_state", value.asInstanceOf[js.Any])
      
      inline def setRelay_stateUndefined: Self = StObject.set(x, "relay_state", js.undefined)
      
      inline def setSign_get_request(value: Boolean): Self = StObject.set(x, "sign_get_request", value.asInstanceOf[js.Any])
      
      inline def setSign_get_requestUndefined: Self = StObject.set(x, "sign_get_request", js.undefined)
    }
  }
  
  trait IdentityProviderOptions extends StObject {
    
    /** If true, allows unencrypted assertions. This can also be configured on the SP or on a per-method basis. */
    var allow_unencrypted_assertion: js.UndefOr[Boolean] = js.undefined
    
    /** Certificate or certificates (array of certificate) for the identity provider. */
    var certificates: String | js.Array[String]
    
    /** If true, forces re-authentication of users even if the user has a SSO session with the IdP. This can also be configured on the SP or on a per-method basis. */
    var force_authn: js.UndefOr[Boolean] = js.undefined
    
    /** If true, signs the request. This can also be configured on the SP or on a per-method basis. */
    var sign_get_request: js.UndefOr[Boolean] = js.undefined
    
    /** Login url to use during a login request. */
    var sso_login_url: String
    
    /** Logout url to use during a logout request. */
    var sso_logout_url: String
  }
  object IdentityProviderOptions {
    
    inline def apply(certificates: String | js.Array[String], sso_login_url: String, sso_logout_url: String): IdentityProviderOptions = {
      val __obj = js.Dynamic.literal(certificates = certificates.asInstanceOf[js.Any], sso_login_url = sso_login_url.asInstanceOf[js.Any], sso_logout_url = sso_logout_url.asInstanceOf[js.Any])
      __obj.asInstanceOf[IdentityProviderOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IdentityProviderOptions] (val x: Self) extends AnyVal {
      
      inline def setAllow_unencrypted_assertion(value: Boolean): Self = StObject.set(x, "allow_unencrypted_assertion", value.asInstanceOf[js.Any])
      
      inline def setAllow_unencrypted_assertionUndefined: Self = StObject.set(x, "allow_unencrypted_assertion", js.undefined)
      
      inline def setCertificates(value: String | js.Array[String]): Self = StObject.set(x, "certificates", value.asInstanceOf[js.Any])
      
      inline def setCertificatesVarargs(value: String*): Self = StObject.set(x, "certificates", js.Array(value*))
      
      inline def setForce_authn(value: Boolean): Self = StObject.set(x, "force_authn", value.asInstanceOf[js.Any])
      
      inline def setForce_authnUndefined: Self = StObject.set(x, "force_authn", js.undefined)
      
      inline def setSign_get_request(value: Boolean): Self = StObject.set(x, "sign_get_request", value.asInstanceOf[js.Any])
      
      inline def setSign_get_requestUndefined: Self = StObject.set(x, "sign_get_request", js.undefined)
      
      inline def setSso_login_url(value: String): Self = StObject.set(x, "sso_login_url", value.asInstanceOf[js.Any])
      
      inline def setSso_logout_url(value: String): Self = StObject.set(x, "sso_logout_url", value.asInstanceOf[js.Any])
    }
  }
  
  trait PostAssertOptions
    extends StObject
       with RedirectAssertOptions {
    
    /** If set, at least one of the <Audience> values within the <AudienceRestriction> condition of a SAML authentication response must match. Defaults to entity_id. */
    var audience: js.UndefOr[String | js.RegExp] = js.undefined
    
    /**
      * To account for clock skew between IdP and SP, accept responses with a NotBefore condition
      * ahead of the current time (according to our clock) by this number of seconds.
      *
      * Defaults to 1.
      * Set it to 0 for optimum security but no tolerance for clock skew.
      */
    var notbefore_skew: js.UndefOr[Double] = js.undefined
  }
  object PostAssertOptions {
    
    inline def apply(request_body: SAMLRequest): PostAssertOptions = {
      val __obj = js.Dynamic.literal(request_body = request_body.asInstanceOf[js.Any])
      __obj.asInstanceOf[PostAssertOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PostAssertOptions] (val x: Self) extends AnyVal {
      
      inline def setAudience(value: String | js.RegExp): Self = StObject.set(x, "audience", value.asInstanceOf[js.Any])
      
      inline def setAudienceUndefined: Self = StObject.set(x, "audience", js.undefined)
      
      inline def setNotbefore_skew(value: Double): Self = StObject.set(x, "notbefore_skew", value.asInstanceOf[js.Any])
      
      inline def setNotbefore_skewUndefined: Self = StObject.set(x, "notbefore_skew", js.undefined)
    }
  }
  
  trait RedirectAssertOptions extends StObject {
    
    /** If true, allows unencrypted assertions. This can also be configured on the IdP or SP. */
    var allow_unencrypted_assertion: js.UndefOr[Boolean] = js.undefined
    
    /** An object containing the parsed query string parameters. This object should contain the value for either a SAMLResponse or SAMLRequest. */
    var request_body: SAMLRequest
    
    /** If false, allow the assertion to be valid without a SessionIndex attribute on the AuthnStatement node. */
    var require_session_index: js.UndefOr[Boolean] = js.undefined
  }
  object RedirectAssertOptions {
    
    inline def apply(request_body: SAMLRequest): RedirectAssertOptions = {
      val __obj = js.Dynamic.literal(request_body = request_body.asInstanceOf[js.Any])
      __obj.asInstanceOf[RedirectAssertOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RedirectAssertOptions] (val x: Self) extends AnyVal {
      
      inline def setAllow_unencrypted_assertion(value: Boolean): Self = StObject.set(x, "allow_unencrypted_assertion", value.asInstanceOf[js.Any])
      
      inline def setAllow_unencrypted_assertionUndefined: Self = StObject.set(x, "allow_unencrypted_assertion", js.undefined)
      
      inline def setRequest_body(value: SAMLRequest): Self = StObject.set(x, "request_body", value.asInstanceOf[js.Any])
      
      inline def setRequire_session_index(value: Boolean): Self = StObject.set(x, "require_session_index", value.asInstanceOf[js.Any])
      
      inline def setRequire_session_indexUndefined: Self = StObject.set(x, "require_session_index", js.undefined)
    }
  }
  
  trait SAMLAssertResponse extends StObject {
    
    var response_header: Destination
    
    var `type`: String
    
    var user: Attributes
  }
  object SAMLAssertResponse {
    
    inline def apply(response_header: Destination, `type`: String, user: Attributes): SAMLAssertResponse = {
      val __obj = js.Dynamic.literal(response_header = response_header.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[SAMLAssertResponse]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SAMLAssertResponse] (val x: Self) extends AnyVal {
      
      inline def setResponse_header(value: Destination): Self = StObject.set(x, "response_header", value.asInstanceOf[js.Any])
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setUser(value: Attributes): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
    }
  }
  
  trait ServiceProviderOptions extends StObject {
    
    /** If true, allows unencrypted assertions. This can also be configured on the IdP or on a per-method basis. */
    var allow_unencrypted_assertion: js.UndefOr[Boolean] = js.undefined
    
    /** Additional certificates to expose in the SAML metadata. Useful for staging new certificates for rollovers. */
    var alt_certs: js.UndefOr[js.Array[String]] = js.undefined
    
    /** Additional private keys to use when attempting to decrypt responses. Useful for adding backward-compatibility for old certificates after a rollover. */
    var alt_private_keys: js.UndefOr[js.Array[String]] = js.undefined
    
    /** URL of service provider assert endpoint. */
    var assert_endpoint: String
    
    /** If set, at least one of the <Audience> values within the <AudienceRestriction> condition of a SAML authentication response must match. Defaults to `entity_id`. */
    var audience: js.UndefOr[String | js.RegExp] = js.undefined
    
    /** Specifies AuthnContextClassRef. This can also be configured on a per-method basis. */
    var auth_context: js.UndefOr[AuthnContextClassRef] = js.undefined
    
    /** Certificate for the service provider. */
    var certificate: String
    
    /** Unique identifier for the service provider, often the URL of the metadata file. */
    var entity_id: String
    
    /** If true, forces re-authentication of users even if the user has a SSO session with the IdP. This can also be configured on the IdP or on a per-method basis. */
    var force_authn: js.UndefOr[Boolean] = js.undefined
    
    /** Format for Name ID. This can also be configured on a per-method basis. */
    var nameid_format: js.UndefOr[String] = js.undefined
    
    /**
      * To account for clock skew between IdP and SP, accept responses with a NotBefore condition
      * ahead of the current time (according to our clock) by this number of seconds.
      *
      * Defaults to 1.
      * Set it to 0 for optimum security but no tolerance for clock skew.
      */
    var notbefore_skew: js.UndefOr[Double] = js.undefined
    
    /** Private key for the service provider. */
    var private_key: String
    
    /** If true, signs the request. This can also be configured on the IdP or on a per-method basis. */
    var sign_get_request: js.UndefOr[Boolean] = js.undefined
  }
  object ServiceProviderOptions {
    
    inline def apply(assert_endpoint: String, certificate: String, entity_id: String, private_key: String): ServiceProviderOptions = {
      val __obj = js.Dynamic.literal(assert_endpoint = assert_endpoint.asInstanceOf[js.Any], certificate = certificate.asInstanceOf[js.Any], entity_id = entity_id.asInstanceOf[js.Any], private_key = private_key.asInstanceOf[js.Any])
      __obj.asInstanceOf[ServiceProviderOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ServiceProviderOptions] (val x: Self) extends AnyVal {
      
      inline def setAllow_unencrypted_assertion(value: Boolean): Self = StObject.set(x, "allow_unencrypted_assertion", value.asInstanceOf[js.Any])
      
      inline def setAllow_unencrypted_assertionUndefined: Self = StObject.set(x, "allow_unencrypted_assertion", js.undefined)
      
      inline def setAlt_certs(value: js.Array[String]): Self = StObject.set(x, "alt_certs", value.asInstanceOf[js.Any])
      
      inline def setAlt_certsUndefined: Self = StObject.set(x, "alt_certs", js.undefined)
      
      inline def setAlt_certsVarargs(value: String*): Self = StObject.set(x, "alt_certs", js.Array(value*))
      
      inline def setAlt_private_keys(value: js.Array[String]): Self = StObject.set(x, "alt_private_keys", value.asInstanceOf[js.Any])
      
      inline def setAlt_private_keysUndefined: Self = StObject.set(x, "alt_private_keys", js.undefined)
      
      inline def setAlt_private_keysVarargs(value: String*): Self = StObject.set(x, "alt_private_keys", js.Array(value*))
      
      inline def setAssert_endpoint(value: String): Self = StObject.set(x, "assert_endpoint", value.asInstanceOf[js.Any])
      
      inline def setAudience(value: String | js.RegExp): Self = StObject.set(x, "audience", value.asInstanceOf[js.Any])
      
      inline def setAudienceUndefined: Self = StObject.set(x, "audience", js.undefined)
      
      inline def setAuth_context(value: AuthnContextClassRef): Self = StObject.set(x, "auth_context", value.asInstanceOf[js.Any])
      
      inline def setAuth_contextUndefined: Self = StObject.set(x, "auth_context", js.undefined)
      
      inline def setCertificate(value: String): Self = StObject.set(x, "certificate", value.asInstanceOf[js.Any])
      
      inline def setEntity_id(value: String): Self = StObject.set(x, "entity_id", value.asInstanceOf[js.Any])
      
      inline def setForce_authn(value: Boolean): Self = StObject.set(x, "force_authn", value.asInstanceOf[js.Any])
      
      inline def setForce_authnUndefined: Self = StObject.set(x, "force_authn", js.undefined)
      
      inline def setNameid_format(value: String): Self = StObject.set(x, "nameid_format", value.asInstanceOf[js.Any])
      
      inline def setNameid_formatUndefined: Self = StObject.set(x, "nameid_format", js.undefined)
      
      inline def setNotbefore_skew(value: Double): Self = StObject.set(x, "notbefore_skew", value.asInstanceOf[js.Any])
      
      inline def setNotbefore_skewUndefined: Self = StObject.set(x, "notbefore_skew", js.undefined)
      
      inline def setPrivate_key(value: String): Self = StObject.set(x, "private_key", value.asInstanceOf[js.Any])
      
      inline def setSign_get_request(value: Boolean): Self = StObject.set(x, "sign_get_request", value.asInstanceOf[js.Any])
      
      inline def setSign_get_requestUndefined: Self = StObject.set(x, "sign_get_request", js.undefined)
    }
  }
}
