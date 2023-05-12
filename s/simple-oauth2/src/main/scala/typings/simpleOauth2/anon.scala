package typings.simpleOauth2

import org.scalablytyped.runtime.StringDictionary
import typings.simpleOauth2.simpleOauth2Booleans.`false`
import typings.simpleOauth2.simpleOauth2Strings.body
import typings.simpleOauth2.simpleOauth2Strings.force
import typings.simpleOauth2.simpleOauth2Strings.form
import typings.simpleOauth2.simpleOauth2Strings.header
import typings.simpleOauth2.simpleOauth2Strings.json
import typings.simpleOauth2.simpleOauth2Strings.loose
import typings.simpleOauth2.simpleOauth2Strings.strict
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait AuthorizationMethod extends StObject {
    
    /**
      * Indicates the method used to send the client.id/client.secret authorization params at the token request.
      * If set to body, the bodyFormat option will be used to format the credentials.
      * Defaults to header
      */
    var authorizationMethod: js.UndefOr[header | body] = js.undefined
    
    /** Format of data sent in the request body. Defaults to form. */
    var bodyFormat: js.UndefOr[form | json] = js.undefined
    
    /**
      * Setup how credentials are encoded when options.authorizationMethod is header.
      * Use loose if your provider doesn't conform to the OAuth 2.0 specification.
      * Defaults to strict
      */
    var credentialsEncodingMode: js.UndefOr[strict | loose] = js.undefined
    
    /** Scope separator character. Some providers may require a different separator. Defaults to empty space */
    var scopeSeparator: js.UndefOr[String] = js.undefined
  }
  object AuthorizationMethod {
    
    inline def apply(): AuthorizationMethod = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AuthorizationMethod]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AuthorizationMethod] (val x: Self) extends AnyVal {
      
      inline def setAuthorizationMethod(value: header | body): Self = StObject.set(x, "authorizationMethod", value.asInstanceOf[js.Any])
      
      inline def setAuthorizationMethodUndefined: Self = StObject.set(x, "authorizationMethod", js.undefined)
      
      inline def setBodyFormat(value: form | json): Self = StObject.set(x, "bodyFormat", value.asInstanceOf[js.Any])
      
      inline def setBodyFormatUndefined: Self = StObject.set(x, "bodyFormat", js.undefined)
      
      inline def setCredentialsEncodingMode(value: strict | loose): Self = StObject.set(x, "credentialsEncodingMode", value.asInstanceOf[js.Any])
      
      inline def setCredentialsEncodingModeUndefined: Self = StObject.set(x, "credentialsEncodingMode", js.undefined)
      
      inline def setScopeSeparator(value: String): Self = StObject.set(x, "scopeSeparator", value.asInstanceOf[js.Any])
      
      inline def setScopeSeparatorUndefined: Self = StObject.set(x, "scopeSeparator", js.undefined)
    }
  }
  
  trait AuthorizeHost extends StObject {
    
    /** Base URL used to request an authorization code. Only valid for AuthorizationCode. Defaults to auth.tokenHost */
    var authorizeHost: js.UndefOr[String] = js.undefined
    
    /**
      * URL path to request an authorization code. Only valid for AuthorizationCode. Defaults to /oauth/authorize
      *
      * Note: URL paths are relatively resolved to their corresponding host property using the Node WHATWG URL resolution algorithm
      */
    var authorizePath: js.UndefOr[String] = js.undefined
    
    /**
      * URL path to refresh access tokens. Defaults to auth.tokenPath
      *
      * Note: URL paths are relatively resolved to their corresponding host property using the Node WHATWG URL resolution algorithm
      */
    var refreshPath: js.UndefOr[String] = js.undefined
    
    /**
      * URL path to revoke access tokens. Defaults to /oauth/revoke
      *
      * Note: URL paths are relatively resolved to their corresponding host property using the Node WHATWG URL resolution algorithm
      */
    var revokePath: js.UndefOr[String] = js.undefined
    
    /** Base URL used to obtain access tokens. Required */
    var tokenHost: String
    
    /**
      * URL path to obtain access tokens. Defaults to /oauth/token.
      *
      * Note: URL paths are relatively resolved to their corresponding host property using the Node WHATWG URL resolution algorithm
      */
    var tokenPath: js.UndefOr[String] = js.undefined
  }
  object AuthorizeHost {
    
    inline def apply(tokenHost: String): AuthorizeHost = {
      val __obj = js.Dynamic.literal(tokenHost = tokenHost.asInstanceOf[js.Any])
      __obj.asInstanceOf[AuthorizeHost]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AuthorizeHost] (val x: Self) extends AnyVal {
      
      inline def setAuthorizeHost(value: String): Self = StObject.set(x, "authorizeHost", value.asInstanceOf[js.Any])
      
      inline def setAuthorizeHostUndefined: Self = StObject.set(x, "authorizeHost", js.undefined)
      
      inline def setAuthorizePath(value: String): Self = StObject.set(x, "authorizePath", value.asInstanceOf[js.Any])
      
      inline def setAuthorizePathUndefined: Self = StObject.set(x, "authorizePath", js.undefined)
      
      inline def setRefreshPath(value: String): Self = StObject.set(x, "refreshPath", value.asInstanceOf[js.Any])
      
      inline def setRefreshPathUndefined: Self = StObject.set(x, "refreshPath", js.undefined)
      
      inline def setRevokePath(value: String): Self = StObject.set(x, "revokePath", value.asInstanceOf[js.Any])
      
      inline def setRevokePathUndefined: Self = StObject.set(x, "revokePath", js.undefined)
      
      inline def setTokenHost(value: String): Self = StObject.set(x, "tokenHost", value.asInstanceOf[js.Any])
      
      inline def setTokenPath(value: String): Self = StObject.set(x, "tokenPath", value.asInstanceOf[js.Any])
      
      inline def setTokenPathUndefined: Self = StObject.set(x, "tokenPath", js.undefined)
    }
  }
  
  trait Dictkey
    extends StObject
       with /**
    * Additional options will be automatically serialized as params for the token request.
    */
  /* key */ StringDictionary[Any] {
    
    /**
      * Acceptable http response content type. Defaults to application/json
      */
    var accept: js.UndefOr[String] = js.undefined
    
    /**
      * Always overriden by the library to properly send the required credentials on each scenario
      */
    var authorization: js.UndefOr[String] = js.undefined
  }
  object Dictkey {
    
    inline def apply(): Dictkey = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Dictkey]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Dictkey] (val x: Self) extends AnyVal {
      
      inline def setAccept(value: String): Self = StObject.set(x, "accept", value.asInstanceOf[js.Any])
      
      inline def setAcceptUndefined: Self = StObject.set(x, "accept", js.undefined)
      
      inline def setAuthorization(value: String): Self = StObject.set(x, "authorization", value.asInstanceOf[js.Any])
      
      inline def setAuthorizationUndefined: Self = StObject.set(x, "authorization", js.undefined)
    }
  }
  
  trait Id[ClientIdName /* <: String */] extends StObject {
    
    /** Service registered client id. When required by the spec this value will be automatically encoded. Required. */
    var id: String
    
    /** Parameter name used to send the client id. Defaults to client_id. */
    var idParamName: js.UndefOr[ClientIdName] = js.undefined
    
    /** Service registered client secret. When required by the spec this value will be automatically encoded. Required. */
    var secret: String
    
    /** Parameter name used to send the client secret. Defaults to client_secret. */
    var secretParamName: js.UndefOr[String] = js.undefined
  }
  object Id {
    
    inline def apply[ClientIdName /* <: String */](id: String, secret: String): Id[ClientIdName] = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], secret = secret.asInstanceOf[js.Any])
      __obj.asInstanceOf[Id[ClientIdName]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Id[?], ClientIdName /* <: String */] (val x: Self & Id[ClientIdName]) extends AnyVal {
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdParamName(value: ClientIdName): Self = StObject.set(x, "idParamName", value.asInstanceOf[js.Any])
      
      inline def setIdParamNameUndefined: Self = StObject.set(x, "idParamName", js.undefined)
      
      inline def setSecret(value: String): Self = StObject.set(x, "secret", value.asInstanceOf[js.Any])
      
      inline def setSecretParamName(value: String): Self = StObject.set(x, "secretParamName", value.asInstanceOf[js.Any])
      
      inline def setSecretParamNameUndefined: Self = StObject.set(x, "secretParamName", js.undefined)
    }
  }
  
  /* Inlined std.Omit<simple-oauth2.simple-oauth2.WreckHttpOptions, 'baseUrl' | 'headers' | 'redirects' | 'json'> & {  baseUrl :undefined,   headers :{  accept :string | undefined,   authorization :string | undefined, [key: string] : unknown} | undefined,   redirects :false | number | undefined,   json :boolean | 'strict' | 'force' | undefined} */
  trait OmitWreckHttpOptionsbaseU extends StObject {
    
    var agent: js.UndefOr[Any] = js.undefined
    
    var baseUrl: Unit
    
    var beforeRedirect: js.UndefOr[
        js.Function6[
          /* redirectMethod */ String, 
          /* statusCode */ Double, 
          /* location */ String, 
          /* resHeaders */ StringDictionary[Any], 
          /* redirectOptions */ Any, 
          /* next */ js.Function0[js.Object], 
          Unit
        ]
      ] = js.undefined
    
    var ciphers: js.UndefOr[String] = js.undefined
    
    var events: js.UndefOr[Boolean] = js.undefined
    
    var gunzip: js.UndefOr[Boolean | force] = js.undefined
    
    var headers: js.UndefOr[Dictkey] = js.undefined
    
    /**
      * JSON response parsing mode. Defaults to strict
      */
    var json: js.UndefOr[Boolean | strict | force] = js.undefined
    
    var maxBytes: js.UndefOr[Double] = js.undefined
    
    var payload: js.UndefOr[Any] = js.undefined
    
    var redirect303: js.UndefOr[Boolean] = js.undefined
    
    var redirected: js.UndefOr[
        js.Function3[/* statusCode */ Double, /* location */ String, /* req */ Any, Unit]
      ] = js.undefined
    
    /**
      * Number or redirects to follow. Defaults to false (no redirects)
      */
    var redirects: js.UndefOr[`false` | Double] = js.undefined
    
    var rejectUnauthorized: js.UndefOr[Boolean] = js.undefined
    
    var secureProtocol: js.UndefOr[String] = js.undefined
    
    var socketPath: js.UndefOr[String] = js.undefined
    
    var timeout: js.UndefOr[Double] = js.undefined
  }
  object OmitWreckHttpOptionsbaseU {
    
    inline def apply(baseUrl: Unit): OmitWreckHttpOptionsbaseU = {
      val __obj = js.Dynamic.literal(baseUrl = baseUrl.asInstanceOf[js.Any])
      __obj.asInstanceOf[OmitWreckHttpOptionsbaseU]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: OmitWreckHttpOptionsbaseU] (val x: Self) extends AnyVal {
      
      inline def setAgent(value: Any): Self = StObject.set(x, "agent", value.asInstanceOf[js.Any])
      
      inline def setAgentUndefined: Self = StObject.set(x, "agent", js.undefined)
      
      inline def setBaseUrl(value: Unit): Self = StObject.set(x, "baseUrl", value.asInstanceOf[js.Any])
      
      inline def setBeforeRedirect(
        value: (/* redirectMethod */ String, /* statusCode */ Double, /* location */ String, /* resHeaders */ StringDictionary[Any], /* redirectOptions */ Any, /* next */ js.Function0[js.Object]) => Unit
      ): Self = StObject.set(x, "beforeRedirect", js.Any.fromFunction6(value))
      
      inline def setBeforeRedirectUndefined: Self = StObject.set(x, "beforeRedirect", js.undefined)
      
      inline def setCiphers(value: String): Self = StObject.set(x, "ciphers", value.asInstanceOf[js.Any])
      
      inline def setCiphersUndefined: Self = StObject.set(x, "ciphers", js.undefined)
      
      inline def setEvents(value: Boolean): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
      
      inline def setEventsUndefined: Self = StObject.set(x, "events", js.undefined)
      
      inline def setGunzip(value: Boolean | force): Self = StObject.set(x, "gunzip", value.asInstanceOf[js.Any])
      
      inline def setGunzipUndefined: Self = StObject.set(x, "gunzip", js.undefined)
      
      inline def setHeaders(value: Dictkey): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      inline def setJson(value: Boolean | strict | force): Self = StObject.set(x, "json", value.asInstanceOf[js.Any])
      
      inline def setJsonUndefined: Self = StObject.set(x, "json", js.undefined)
      
      inline def setMaxBytes(value: Double): Self = StObject.set(x, "maxBytes", value.asInstanceOf[js.Any])
      
      inline def setMaxBytesUndefined: Self = StObject.set(x, "maxBytes", js.undefined)
      
      inline def setPayload(value: Any): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
      
      inline def setPayloadUndefined: Self = StObject.set(x, "payload", js.undefined)
      
      inline def setRedirect303(value: Boolean): Self = StObject.set(x, "redirect303", value.asInstanceOf[js.Any])
      
      inline def setRedirect303Undefined: Self = StObject.set(x, "redirect303", js.undefined)
      
      inline def setRedirected(value: (/* statusCode */ Double, /* location */ String, /* req */ Any) => Unit): Self = StObject.set(x, "redirected", js.Any.fromFunction3(value))
      
      inline def setRedirectedUndefined: Self = StObject.set(x, "redirected", js.undefined)
      
      inline def setRedirects(value: `false` | Double): Self = StObject.set(x, "redirects", value.asInstanceOf[js.Any])
      
      inline def setRedirectsUndefined: Self = StObject.set(x, "redirects", js.undefined)
      
      inline def setRejectUnauthorized(value: Boolean): Self = StObject.set(x, "rejectUnauthorized", value.asInstanceOf[js.Any])
      
      inline def setRejectUnauthorizedUndefined: Self = StObject.set(x, "rejectUnauthorized", js.undefined)
      
      inline def setSecureProtocol(value: String): Self = StObject.set(x, "secureProtocol", value.asInstanceOf[js.Any])
      
      inline def setSecureProtocolUndefined: Self = StObject.set(x, "secureProtocol", js.undefined)
      
      inline def setSocketPath(value: String): Self = StObject.set(x, "socketPath", value.asInstanceOf[js.Any])
      
      inline def setSocketPathUndefined: Self = StObject.set(x, "socketPath", js.undefined)
      
      inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    }
  }
  
  trait Redirecturi extends StObject {
    
    var redirect_uri: js.UndefOr[String] = js.undefined
    
    var scope: js.UndefOr[String | js.Array[String]] = js.undefined
    
    var state: js.UndefOr[String] = js.undefined
  }
  object Redirecturi {
    
    inline def apply(): Redirecturi = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Redirecturi]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Redirecturi] (val x: Self) extends AnyVal {
      
      inline def setRedirect_uri(value: String): Self = StObject.set(x, "redirect_uri", value.asInstanceOf[js.Any])
      
      inline def setRedirect_uriUndefined: Self = StObject.set(x, "redirect_uri", js.undefined)
      
      inline def setScope(value: String | js.Array[String]): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
      
      inline def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
      
      inline def setScopeVarargs(value: String*): Self = StObject.set(x, "scope", js.Array(value*))
      
      inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    }
  }
  
  trait Scope extends StObject {
    
    var scope: js.UndefOr[String | js.Array[String]] = js.undefined
  }
  object Scope {
    
    inline def apply(): Scope = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Scope]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Scope] (val x: Self) extends AnyVal {
      
      inline def setScope(value: String | js.Array[String]): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
      
      inline def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
      
      inline def setScopeVarargs(value: String*): Self = StObject.set(x, "scope", js.Array(value*))
    }
  }
}
