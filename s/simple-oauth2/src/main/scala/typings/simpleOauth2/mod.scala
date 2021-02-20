package typings.simpleOauth2

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.TopLevel
import typings.simpleOauth2.anon.AuthorizationMethod
import typings.simpleOauth2.anon.AuthorizeHost
import typings.simpleOauth2.anon.Id
import typings.simpleOauth2.anon.Redirecturi
import typings.simpleOauth2.simpleOauth2Booleans.`true`
import typings.simpleOauth2.simpleOauth2Strings.force
import typings.simpleOauth2.simpleOauth2Strings.strict
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("simple-oauth2", "AuthorizationCode")
  @js.native
  class AuthorizationCode[ClientIdName /* <: String */] protected () extends StObject {
    def this(options: ModuleOptions[ClientIdName]) = this()
    
    /**
      * Get a valid redirect URL used to redirect users to an authorization page
      *
      * @param params
      * @param params.redirectURI String representing the registered application URI where the user is redirected after authentication
      * @param params.scope String or array of strings representing the application privileges
      * @param params.state String representing an opaque value used by the client to main the state between the request and the callback
      *
      * @return the absolute authorization url
      */
    def authorizeURL(): String = js.native
    def authorizeURL(
      params: typings.simpleOauth2.simpleOauth2Strings.AuthorizationCode with TopLevel[js.Any] with Redirecturi
    ): String = js.native
    
    /**
      * Creates a new access token by providing a token object as specified by RFC6750.
      * @param token
      */
    def createToken(token: Token): AccessToken = js.native
    
    /**
      * Requests and returns an access token from the authorization server
      *
      * @param params
      * @param params.code Authorization code received by the callback URL
      * @param params.redirectURI String representing the registered application URI where the user is redirected after authentication
      * @param [params.scope] String or array of strings representing the application privileges
      * @param [httpOptions] Optional http options passed through the underlying http library
      */
    def getToken(params: AuthorizationTokenConfig): js.Promise[AccessToken] = js.native
    def getToken(params: AuthorizationTokenConfig, httpOptions: WreckHttpOptions): js.Promise[AccessToken] = js.native
  }
  
  @JSImport("simple-oauth2", "ClientCredentials")
  @js.native
  class ClientCredentials[ClientIdName /* <: String */] protected () extends StObject {
    def this(options: ModuleOptions[ClientIdName]) = this()
    
    /**
      * Creates a new access token by providing a token object as specified by RFC6750.
      *
      * @param token Plain object representation of an access token
      */
    def createToken(token: Token): AccessToken = js.native
    
    /**
      * Requests and returns an access token from the authorization server
      *
      * @param params
      * @param [params.scope] A String or array of strings representing the application privileges
      * @param [httpOptions] Optional http options passed through the underlying http library
      */
    def getToken(params: ClientCredentialTokenConfig): js.Promise[AccessToken] = js.native
    def getToken(params: ClientCredentialTokenConfig, httpOptions: WreckHttpOptions): js.Promise[AccessToken] = js.native
  }
  
  @JSImport("simple-oauth2", "ResourceOwnerPassword")
  @js.native
  class ResourceOwnerPassword[ClientIdName /* <: String */] protected () extends StObject {
    def this(options: ModuleOptions[ClientIdName]) = this()
    
    /**
      * Creates a new access token by providing a token object as specified by RFC6750.
      *
      * @param token Plain object representation of an access token
      */
    def createToken(token: Token): AccessToken = js.native
    
    /**
      * Requests and returns an access token from the authorization server
      *
      * @param params
      * @param params.username A string representing the registered username
      * @param params.password A string representing the registered password
      * @param [params.scope] A String or array of strings representing the application privileges
      * @param [httpOptions] Optional http options passed through the underlying http library
      */
    def getToken(params: PasswordTokenConfig): js.Promise[AccessToken] = js.native
    def getToken(params: PasswordTokenConfig, httpOptions: WreckHttpOptions): js.Promise[AccessToken] = js.native
  }
  
  @js.native
  trait AccessToken extends StObject {
    
    /**
      * Determines if the current access token is definitely expired or not
      * @param expirationWindowSeconds Window of time before the actual expiration to refresh the token. Defaults to 0.
      */
    def expired(): Boolean = js.native
    def expired(expirationWindowSeconds: Double): Boolean = js.native
    
    /** Refresh the access token */
    def refresh(): js.Promise[AccessToken] = js.native
    def refresh(params: js.Object): js.Promise[AccessToken] = js.native
    
    /** Revoke access or refresh token */
    def revoke(tokenType: TokenType): js.Promise[Unit] = js.native
    
    /** Revoke both the existing access and refresh tokens */
    def revokeAll(): js.Promise[Unit] = js.native
    
    /**
      * Immutable object containing the token object provided while constructing a new access token instance.
      * This property will usually have the schema as specified by RFC6750,
      * but the exact properties may vary between authorization servers.
      */
    var token: Token = js.native
  }
  
  @js.native
  trait AuthorizationTokenConfig extends StObject {
    
    /** Authorization code received by the callback URL */
    var code: String = js.native
    
    /** String representing the registered application URI where the user is redirected after authentication */
    var redirect_uri: String = js.native
    
    /** String or array of strings representing the application privileges */
    var scope: js.UndefOr[String | js.Array[String]] = js.native
  }
  object AuthorizationTokenConfig {
    
    @scala.inline
    def apply(code: String, redirect_uri: String): AuthorizationTokenConfig = {
      val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], redirect_uri = redirect_uri.asInstanceOf[js.Any])
      __obj.asInstanceOf[AuthorizationTokenConfig]
    }
    
    @scala.inline
    implicit class AuthorizationTokenConfigMutableBuilder[Self <: AuthorizationTokenConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRedirect_uri(value: String): Self = StObject.set(x, "redirect_uri", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScope(value: String | js.Array[String]): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
      
      @scala.inline
      def setScopeVarargs(value: String*): Self = StObject.set(x, "scope", js.Array(value :_*))
    }
  }
  
  @js.native
  trait ClientCredentialTokenConfig
    extends /**
    * Additional options will be automatically serialized as params for the token request.
    */
  /* key */ StringDictionary[js.Any] {
    
    /** A string that represents the application privileges */
    var scope: js.UndefOr[String | js.Array[String]] = js.native
  }
  object ClientCredentialTokenConfig {
    
    @scala.inline
    def apply(): ClientCredentialTokenConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ClientCredentialTokenConfig]
    }
    
    @scala.inline
    implicit class ClientCredentialTokenConfigMutableBuilder[Self <: ClientCredentialTokenConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setScope(value: String | js.Array[String]): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
      
      @scala.inline
      def setScopeVarargs(value: String*): Self = StObject.set(x, "scope", js.Array(value :_*))
    }
  }
  
  @js.native
  trait ModuleOptions[ClientIdName /* <: String */] extends StObject {
    
    var auth: AuthorizeHost = js.native
    
    var client: Id[ClientIdName] = js.native
    
    /**
      * Used to set global options to the internal http library (wreck).
      * All options except baseUrl are allowed
      * Defaults to header.Accept = "application/json"
      */
    var http: js.UndefOr[js.Object] = js.native
    
    var options: js.UndefOr[AuthorizationMethod] = js.native
  }
  object ModuleOptions {
    
    @scala.inline
    def apply[ClientIdName /* <: String */](auth: AuthorizeHost, client: Id[ClientIdName]): ModuleOptions[ClientIdName] = {
      val __obj = js.Dynamic.literal(auth = auth.asInstanceOf[js.Any], client = client.asInstanceOf[js.Any])
      __obj.asInstanceOf[ModuleOptions[ClientIdName]]
    }
    
    @scala.inline
    implicit class ModuleOptionsMutableBuilder[Self <: ModuleOptions[_], ClientIdName /* <: String */] (val x: Self with ModuleOptions[ClientIdName]) extends AnyVal {
      
      @scala.inline
      def setAuth(value: AuthorizeHost): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClient(value: Id[ClientIdName]): Self = StObject.set(x, "client", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHttp(value: js.Object): Self = StObject.set(x, "http", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHttpUndefined: Self = StObject.set(x, "http", js.undefined)
      
      @scala.inline
      def setOptions(value: AuthorizationMethod): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    }
  }
  
  @js.native
  trait PasswordTokenConfig
    extends /**
    * Additional options will be automatically serialized as params for the token request.
    */
  /* key */ StringDictionary[js.Any] {
    
    /** A string that represents the registered password. */
    var password: String = js.native
    
    /** A string or array of strings that represents the application privileges */
    var scope: String | js.Array[String] = js.native
    
    /** A string that represents the registered username */
    var username: String = js.native
  }
  object PasswordTokenConfig {
    
    @scala.inline
    def apply(password: String, scope: String | js.Array[String], username: String): PasswordTokenConfig = {
      val __obj = js.Dynamic.literal(password = password.asInstanceOf[js.Any], scope = scope.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
      __obj.asInstanceOf[PasswordTokenConfig]
    }
    
    @scala.inline
    implicit class PasswordTokenConfigMutableBuilder[Self <: PasswordTokenConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScope(value: String | js.Array[String]): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScopeVarargs(value: String*): Self = StObject.set(x, "scope", js.Array(value :_*))
      
      @scala.inline
      def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
    }
  }
  
  type Token = StringDictionary[js.Any]
  
  /* Rewritten from type alias, can be one of: 
    - typings.simpleOauth2.simpleOauth2Strings.access_token
    - typings.simpleOauth2.simpleOauth2Strings.refresh_token
  */
  trait TokenType extends StObject
  object TokenType {
    
    @scala.inline
    def access_token: typings.simpleOauth2.simpleOauth2Strings.access_token = "access_token".asInstanceOf[typings.simpleOauth2.simpleOauth2Strings.access_token]
    
    @scala.inline
    def refresh_token: typings.simpleOauth2.simpleOauth2Strings.refresh_token = "refresh_token".asInstanceOf[typings.simpleOauth2.simpleOauth2Strings.refresh_token]
  }
  
  @js.native
  trait WreckHttpOptions extends StObject {
    
    var agent: js.UndefOr[js.Any] = js.native
    
    var baseUrl: js.UndefOr[String] = js.native
    
    var beforeRedirect: js.UndefOr[
        js.Function6[
          /* redirectMethod */ String, 
          /* statusCode */ Double, 
          /* location */ String, 
          /* resHeaders */ StringDictionary[js.Any], 
          /* redirectOptions */ js.Any, 
          /* next */ js.Function0[js.Object], 
          Unit
        ]
      ] = js.native
    
    var ciphers: js.UndefOr[String] = js.native
    
    var downstreamRes: js.UndefOr[js.Any] = js.native
    
    var events: js.UndefOr[Boolean] = js.native
    
    var gunzip: js.UndefOr[Boolean | force] = js.native
    
    var headers: js.UndefOr[StringDictionary[js.Any]] = js.native
    
    var json: js.UndefOr[`true` | strict | force] = js.native
    
    var maxBytes: js.UndefOr[Double] = js.native
    
    var payload: js.UndefOr[js.Any] = js.native
    
    var redirect303: js.UndefOr[Boolean] = js.native
    
    var redirected: js.UndefOr[
        js.Function3[/* statusCode */ Double, /* location */ String, /* req */ js.Any, Unit]
      ] = js.native
    
    var redirects: js.UndefOr[Double] = js.native
    
    var rejectUnauthorized: js.UndefOr[Boolean] = js.native
    
    var secureProtocol: js.UndefOr[String] = js.native
    
    var socketPath: js.UndefOr[String] = js.native
    
    var timeout: js.UndefOr[Double] = js.native
  }
  object WreckHttpOptions {
    
    @scala.inline
    def apply(): WreckHttpOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WreckHttpOptions]
    }
    
    @scala.inline
    implicit class WreckHttpOptionsMutableBuilder[Self <: WreckHttpOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAgent(value: js.Any): Self = StObject.set(x, "agent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAgentUndefined: Self = StObject.set(x, "agent", js.undefined)
      
      @scala.inline
      def setBaseUrl(value: String): Self = StObject.set(x, "baseUrl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBaseUrlUndefined: Self = StObject.set(x, "baseUrl", js.undefined)
      
      @scala.inline
      def setBeforeRedirect(
        value: (/* redirectMethod */ String, /* statusCode */ Double, /* location */ String, /* resHeaders */ StringDictionary[js.Any], /* redirectOptions */ js.Any, /* next */ js.Function0[js.Object]) => Unit
      ): Self = StObject.set(x, "beforeRedirect", js.Any.fromFunction6(value))
      
      @scala.inline
      def setBeforeRedirectUndefined: Self = StObject.set(x, "beforeRedirect", js.undefined)
      
      @scala.inline
      def setCiphers(value: String): Self = StObject.set(x, "ciphers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCiphersUndefined: Self = StObject.set(x, "ciphers", js.undefined)
      
      @scala.inline
      def setDownstreamRes(value: js.Any): Self = StObject.set(x, "downstreamRes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDownstreamResUndefined: Self = StObject.set(x, "downstreamRes", js.undefined)
      
      @scala.inline
      def setEvents(value: Boolean): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEventsUndefined: Self = StObject.set(x, "events", js.undefined)
      
      @scala.inline
      def setGunzip(value: Boolean | force): Self = StObject.set(x, "gunzip", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGunzipUndefined: Self = StObject.set(x, "gunzip", js.undefined)
      
      @scala.inline
      def setHeaders(value: StringDictionary[js.Any]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      @scala.inline
      def setJson(value: `true` | strict | force): Self = StObject.set(x, "json", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setJsonUndefined: Self = StObject.set(x, "json", js.undefined)
      
      @scala.inline
      def setMaxBytes(value: Double): Self = StObject.set(x, "maxBytes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxBytesUndefined: Self = StObject.set(x, "maxBytes", js.undefined)
      
      @scala.inline
      def setPayload(value: js.Any): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPayloadUndefined: Self = StObject.set(x, "payload", js.undefined)
      
      @scala.inline
      def setRedirect303(value: Boolean): Self = StObject.set(x, "redirect303", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRedirect303Undefined: Self = StObject.set(x, "redirect303", js.undefined)
      
      @scala.inline
      def setRedirected(value: (/* statusCode */ Double, /* location */ String, /* req */ js.Any) => Unit): Self = StObject.set(x, "redirected", js.Any.fromFunction3(value))
      
      @scala.inline
      def setRedirectedUndefined: Self = StObject.set(x, "redirected", js.undefined)
      
      @scala.inline
      def setRedirects(value: Double): Self = StObject.set(x, "redirects", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRedirectsUndefined: Self = StObject.set(x, "redirects", js.undefined)
      
      @scala.inline
      def setRejectUnauthorized(value: Boolean): Self = StObject.set(x, "rejectUnauthorized", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRejectUnauthorizedUndefined: Self = StObject.set(x, "rejectUnauthorized", js.undefined)
      
      @scala.inline
      def setSecureProtocol(value: String): Self = StObject.set(x, "secureProtocol", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecureProtocolUndefined: Self = StObject.set(x, "secureProtocol", js.undefined)
      
      @scala.inline
      def setSocketPath(value: String): Self = StObject.set(x, "socketPath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSocketPathUndefined: Self = StObject.set(x, "socketPath", js.undefined)
      
      @scala.inline
      def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    }
  }
}
