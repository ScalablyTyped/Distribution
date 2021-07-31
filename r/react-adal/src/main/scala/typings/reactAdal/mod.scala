package typings.reactAdal

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.react.mod.StatelessComponent
import typings.react.mod.global.JSX.Element
import typings.reactAdal.anon.ACCESSTOKENKEY
import typings.reactAdal.anon.ERROR
import typings.reactAdal.anon.`0`
import typings.reactAdal.reactAdalNumbers.`483`
import typings.reactAdal.reactAdalNumbers.`600`
import typings.reactAdal.reactAdalStrings.Canceled
import typings.reactAdal.reactAdalStrings.Completed
import typings.reactAdal.reactAdalStrings.Verticalline
import typings.reactAdal.reactAdalStrings.`6000`
import typings.reactAdal.reactAdalStrings.`In Progress`
import typings.reactAdal.reactAdalStrings.access_token
import typings.reactAdal.reactAdalStrings.error_description
import typings.reactAdal.reactAdalStrings.expires_in
import typings.reactAdal.reactAdalStrings.id_token
import typings.reactAdal.reactAdalStrings.localStorage
import typings.reactAdal.reactAdalStrings.sessionStorage
import typings.reactAdal.reactAdalStrings.session_state
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-adal", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("react-adal", "AuthenticationContext")
  @js.native
  class AuthenticationContext protected () extends StObject {
    def this(options: AdalConfig) = this()
    
    var CONSTANTS: Constants = js.native
    
    /**
      * Enum for request type
      */
    var REQUEST_TYPE: RequestType = js.native
    
    var RESPONSE_TYPE: ResponseType = js.native
    
    /**
      * Acquires token from the cache if it is not expired. Otherwise sends request to AAD to obtain a new token.
      * @param resource Resource URI identifying the target resource.
      * @param callback The callback provided by the caller. It will be called with token or error.
      */
    def acquireToken(resource: String, callback: TokenCallback): Unit = js.native
    
    /**
      * Acquires token (interactive flow using a popup window) by sending request to AAD to obtain a new token.
      * @param resource Resource URI identifying the target resource.
      * @param extraQueryParameters Query parameters to add to the authentication request.
      * @param claims Claims to add to the authentication request.
      * @param callback The callback provided by the caller. It will be called with token or error.
      */
    def acquireTokenPopup(resource: String, extraQueryParameters: String, claims: String, callback: TokenCallback): Unit = js.native
    def acquireTokenPopup(resource: String, extraQueryParameters: String, claims: Null, callback: TokenCallback): Unit = js.native
    def acquireTokenPopup(resource: String, extraQueryParameters: String, claims: Unit, callback: TokenCallback): Unit = js.native
    def acquireTokenPopup(resource: String, extraQueryParameters: Null, claims: String, callback: TokenCallback): Unit = js.native
    def acquireTokenPopup(resource: String, extraQueryParameters: Null, claims: Null, callback: TokenCallback): Unit = js.native
    def acquireTokenPopup(resource: String, extraQueryParameters: Null, claims: Unit, callback: TokenCallback): Unit = js.native
    def acquireTokenPopup(resource: String, extraQueryParameters: Unit, claims: String, callback: TokenCallback): Unit = js.native
    def acquireTokenPopup(resource: String, extraQueryParameters: Unit, claims: Null, callback: TokenCallback): Unit = js.native
    def acquireTokenPopup(resource: String, extraQueryParameters: Unit, claims: Unit, callback: TokenCallback): Unit = js.native
    
    /**
      * Acquires token (interactive flow using a redirect) by sending request to AAD to obtain a new token. In this case the callback passed in the authentication request constructor will be called.
      * @param resource Resource URI identifying the target resource.
      * @param extraQueryParameters Query parameters to add to the authentication request.
      * @param claims Claims to add to the authentication request.
      */
    def acquireTokenRedirect(resource: String): Unit = js.native
    def acquireTokenRedirect(resource: String, extraQueryParameters: String): Unit = js.native
    def acquireTokenRedirect(resource: String, extraQueryParameters: String, claims: String): Unit = js.native
    def acquireTokenRedirect(resource: String, extraQueryParameters: Null, claims: String): Unit = js.native
    def acquireTokenRedirect(resource: String, extraQueryParameters: Unit, claims: String): Unit = js.native
    
    var callback: TokenCallback = js.native
    
    /**
      * Clears cache items.
      */
    def clearCache(): Unit = js.native
    
    /**
      * Clears cache items for a given resource.
      * @param resource Resource URI identifying the target resource.
      */
    def clearCacheForResource(resource: String): Unit = js.native
    
    var config: AdalConfig = js.native
    
    /**
      * Logs messages when logging level is set to 0.
      * @param message Message to log.
      * @param error Error to log.
      */
    def error(message: String, error: js.Any): Unit = js.native
    
    /**
      * Logs Pii messages when Logging Level is set to 0 and window.piiLoggingEnabled is set to true.
      * @param message Message to log.
      * @param error Error to log.
      */
    def errorPii(message: String, error: js.Any): Unit = js.native
    
    /**
      * Gets token for the specified resource from the cache.
      * @param resource A URI that identifies the resource for which the token is requested.
      */
    def getCachedToken(resource: String): String | Null = js.native
    
    /**
      * If user object exists, returns it. Else creates a new user object by decoding `id_token` from the cache.
      */
    def getCachedUser(): UserInfo = js.native
    
    /**
      * Gets login error.
      */
    def getLoginError(): String = js.native
    
    /**
      * Creates a request info object from the URL fragment and returns it.
      */
    def getRequestInfo(hash: String): RequestInfo = js.native
    
    /**
      * Gets resource for given endpoint if mapping is provided with config.
      * @param endpoint Resource URI identifying the target resource.
      */
    def getResourceForEndpoint(resource: String): String = js.native
    
    /**
      * Calls the passed in callback with the user object or error message related to the user.
      * @param callback The callback provided by the caller. It will be called with user or error.
      */
    def getUser(callback: UserCallback): Unit = js.native
    
    /**
      * This method must be called for processing the response received from AAD. It extracts the hash, processes the token or error, saves it in the cache and calls the callbacks with the result.
      * @param hash Hash fragment of URL. Defaults to `window.location.hash`.
      */
    def handleWindowCallback(): Unit = js.native
    def handleWindowCallback(hash: String): Unit = js.native
    
    /**
      * Logs messages when logging level is set to 2.
      * @param message Message to log.
      */
    def info(message: String): Unit = js.native
    
    /**
      * Logs messages when Logging Level is set to 2 and window.piiLoggingEnabled is set to true.
      * @param message Message to log.
      */
    def infoPii(message: String): Unit = js.native
    
    var instance: String = js.native
    
    var isAngular: Boolean = js.native
    
    /**
      * Checks if the URL fragment contains access token, id token or error description.
      * @param hash Hash passed from redirect page.
      */
    def isCallback(hash: String): Boolean = js.native
    
    /**
      * Checks the logging Level, constructs the log message and logs it. Users need to implement/override this method to turn on logging.
      * @param level Level can be set 0, 1, 2 and 3 which turns on 'error', 'warning', 'info' or 'verbose' level logging respectively.
      * @param message Message to log.
      * @param error Error to log.
      */
    def log(level: LoggingLevel, message: String, error: js.Any): Unit = js.native
    
    /**
      * Redirects user to logout endpoint. After logout, it will redirect to `postLogoutRedirectUri` if added as a property on the config object.
      */
    def logOut(): Unit = js.native
    
    /**
      * Initiates the login process by redirecting the user to Azure AD authorization endpoint.
      */
    def login(): Unit = js.native
    
    /**
      * Returns whether a login is in progress.
      */
    def loginInProgress(): Boolean = js.native
    
    var popUp: Boolean = js.native
    
    /**
      * Redirects the browser to Azure AD authorization endpoint.
      * @param urlNavigate URL of the authorization endpoint.
      */
    def promptUser(urlNavigate: String): Unit = js.native
    
    /**
      * Adds the passed callback to the array of callbacks for the specified resource.
      * @param resource A URI that identifies the resource for which the token is requested.
      * @param expectedState A unique identifier (guid).
      * @param callback The callback provided by the caller. It will be called with token or error.
      */
    def registerCallback(expectedState: String, resource: String, callback: TokenCallback): Unit = js.native
    
    /**
      * Saves token or error received in the response from AAD in the cache. In case of `id_token`, it also creates the user object.
      */
    def saveTokenFromHash(requestInfo: RequestInfo): Unit = js.native
    
    /**
      * Logs messages when logging level is set to 3.
      * @param message Message to log.
      */
    def verbose(message: String): Unit = js.native
    
    /**
      * Logs messages when Logging Level is set to 3 and window.piiLoggingEnabled is set to true.
      * @param message Message to log.
      */
    def verbosePii(message: String): Unit = js.native
    
    /**
      * Logs messages when logging level is set to 1.
      * @param message Message to log.
      */
    def warn(message: String): Unit = js.native
    
    /**
      * Logs  Pii messages when Logging Level is set to 1 and window.piiLoggingEnabled is set to true.
      * @param message Message to log.
      */
    def warnPii(message: String): Unit = js.native
  }
  
  @scala.inline
  def adalFetch(
    authContext: AuthenticationContext,
    resource: String,
    fetch: js.Function2[/* input */ String, /* init */ js.Any, js.Promise[js.Any]],
    url: String,
    options: js.Any
  ): js.Promise[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("adalFetch")(authContext.asInstanceOf[js.Any], resource.asInstanceOf[js.Any], fetch.asInstanceOf[js.Any], url.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Any]]
  
  @scala.inline
  def adalGetToken(authContext: AuthenticationContext, resourceUrl: String): js.Promise[String | Null] = (^.asInstanceOf[js.Dynamic].applyDynamic("adalGetToken")(authContext.asInstanceOf[js.Any], resourceUrl.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String | Null]]
  
  @scala.inline
  def runWithAdal(authContext: AuthenticationContext, app: js.Function0[Unit], doNotLogin: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("runWithAdal")(authContext.asInstanceOf[js.Any], app.asInstanceOf[js.Any], doNotLogin.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def withAdalLogin(authContext: AuthenticationContext, resource: String): js.Function3[
    /* wrappedComponent */ (ComponentClass[js.Object, ComponentState]) | StatelessComponent[js.Object], 
    /* renderLoading */ js.Function0[Element | Null], 
    /* renderError */ js.Function1[/* error */ js.Any, Element | Null], 
    ComponentClass[js.Object, ComponentState]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("withAdalLogin")(authContext.asInstanceOf[js.Any], resource.asInstanceOf[js.Any])).asInstanceOf[js.Function3[
    /* wrappedComponent */ (ComponentClass[js.Object, ComponentState]) | StatelessComponent[js.Object], 
    /* renderLoading */ js.Function0[Element | Null], 
    /* renderError */ js.Function1[/* error */ js.Any, Element | Null], 
    ComponentClass[js.Object, ComponentState]
  ]]
  
  trait AdalConfig extends StObject {
    
    /**
      * Array of keywords or URIs. Adal will not attach a token to outgoing requests that have these keywords or URIs.
      */
    var anonymousEndpoints: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * Sets browser storage to either 'localStorage' or sessionStorage'. Defaults to `sessionStorage`.
      */
    var cacheLocation: js.UndefOr[localStorage | sessionStorage] = js.undefined
    
    /**
      * Callback to be invoked when a token is acquired.
      */
    var callback: js.UndefOr[TokenCallback] = js.undefined
    
    /**
      * Client ID assigned to your app by Azure Active Directory.
      */
    var clientId: String
    
    /**
      * Unique identifier used to map the request with the response. Defaults to RFC4122 version 4 guid (128 bits).
      */
    var correlationId: js.UndefOr[String] = js.undefined
    
    /**
      * User defined function of handling the navigation to Azure AD authorization endpoint in case of login.
      */
    var displayCall: js.UndefOr[js.Function1[/* url */ String, Unit]] = js.undefined
    
    /**
      * Array of keywords or URIs. Adal will attach a token to outgoing requests that have these keywords or URIs.
      */
    var endpoints: js.UndefOr[StringDictionary[String]] = js.undefined
    
    /**
      * If the cached token is about to be expired in the expireOffsetSeconds (in seconds), Adal will renew the token instead of using the cached token. Defaults to 300 seconds.
      */
    var expireOffsetSeconds: js.UndefOr[Double] = js.undefined
    
    /**
      * Query parameters to add to the authentication request.
      */
    var extraQueryParameter: js.UndefOr[String] = js.undefined
    
    /**
      * Azure Active Directory instance. Defaults to `https://login.microsoftonline.com/`.
      */
    var instance: js.UndefOr[String] = js.undefined
    
    /**
      * The number of milliseconds of inactivity before a token renewal response from AAD should be considered timed out. Defaults to 6 seconds.
      */
    var loadFrameTimeout: js.UndefOr[Double] = js.undefined
    
    /**
      * Set this to redirect the user to a custom login page.
      */
    var localLoginUrl: js.UndefOr[String] = js.undefined
    
    /**
      * Set this to redirect the user to a custom logout page.
      */
    var logOutUri: js.UndefOr[String] = js.undefined
    
    /**
      * Set this to the resource to request on login. Defaults to `clientId`.
      */
    var loginResource: js.UndefOr[String] = js.undefined
    
    /**
      * Redirects to start page after login. Defaults to `true`.
      */
    var navigateToLoginRequestUrl: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Set this to true to enable login in a popup winodow instead of a full redirect. Defaults to `false`.
      */
    var popUp: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Redirects the user to postLogoutRedirectUri after logout. Defaults to `redirectUri`.
      */
    var postLogoutRedirectUri: js.UndefOr[String] = js.undefined
    
    /**
      * Endpoint at which you expect to receive tokens.Defaults to `window.location.href`.
      */
    var redirectUri: js.UndefOr[String] = js.undefined
    
    /**
      * Your target tenant. Defaults to `common`.
      */
    var tenant: js.UndefOr[String] = js.undefined
  }
  object AdalConfig {
    
    @scala.inline
    def apply(clientId: String): AdalConfig = {
      val __obj = js.Dynamic.literal(clientId = clientId.asInstanceOf[js.Any])
      __obj.asInstanceOf[AdalConfig]
    }
    
    @scala.inline
    implicit class AdalConfigMutableBuilder[Self <: AdalConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAnonymousEndpoints(value: js.Array[String]): Self = StObject.set(x, "anonymousEndpoints", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnonymousEndpointsUndefined: Self = StObject.set(x, "anonymousEndpoints", js.undefined)
      
      @scala.inline
      def setAnonymousEndpointsVarargs(value: String*): Self = StObject.set(x, "anonymousEndpoints", js.Array(value :_*))
      
      @scala.inline
      def setCacheLocation(value: localStorage | sessionStorage): Self = StObject.set(x, "cacheLocation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCacheLocationUndefined: Self = StObject.set(x, "cacheLocation", js.undefined)
      
      @scala.inline
      def setCallback(value: (/* errorDesc */ String | Null, /* token */ String | Null, /* error */ js.Any) => Unit): Self = StObject.set(x, "callback", js.Any.fromFunction3(value))
      
      @scala.inline
      def setCallbackUndefined: Self = StObject.set(x, "callback", js.undefined)
      
      @scala.inline
      def setClientId(value: String): Self = StObject.set(x, "clientId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCorrelationId(value: String): Self = StObject.set(x, "correlationId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCorrelationIdUndefined: Self = StObject.set(x, "correlationId", js.undefined)
      
      @scala.inline
      def setDisplayCall(value: /* url */ String => Unit): Self = StObject.set(x, "displayCall", js.Any.fromFunction1(value))
      
      @scala.inline
      def setDisplayCallUndefined: Self = StObject.set(x, "displayCall", js.undefined)
      
      @scala.inline
      def setEndpoints(value: StringDictionary[String]): Self = StObject.set(x, "endpoints", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEndpointsUndefined: Self = StObject.set(x, "endpoints", js.undefined)
      
      @scala.inline
      def setExpireOffsetSeconds(value: Double): Self = StObject.set(x, "expireOffsetSeconds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpireOffsetSecondsUndefined: Self = StObject.set(x, "expireOffsetSeconds", js.undefined)
      
      @scala.inline
      def setExtraQueryParameter(value: String): Self = StObject.set(x, "extraQueryParameter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExtraQueryParameterUndefined: Self = StObject.set(x, "extraQueryParameter", js.undefined)
      
      @scala.inline
      def setInstance(value: String): Self = StObject.set(x, "instance", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInstanceUndefined: Self = StObject.set(x, "instance", js.undefined)
      
      @scala.inline
      def setLoadFrameTimeout(value: Double): Self = StObject.set(x, "loadFrameTimeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoadFrameTimeoutUndefined: Self = StObject.set(x, "loadFrameTimeout", js.undefined)
      
      @scala.inline
      def setLocalLoginUrl(value: String): Self = StObject.set(x, "localLoginUrl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocalLoginUrlUndefined: Self = StObject.set(x, "localLoginUrl", js.undefined)
      
      @scala.inline
      def setLogOutUri(value: String): Self = StObject.set(x, "logOutUri", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLogOutUriUndefined: Self = StObject.set(x, "logOutUri", js.undefined)
      
      @scala.inline
      def setLoginResource(value: String): Self = StObject.set(x, "loginResource", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoginResourceUndefined: Self = StObject.set(x, "loginResource", js.undefined)
      
      @scala.inline
      def setNavigateToLoginRequestUrl(value: Boolean): Self = StObject.set(x, "navigateToLoginRequestUrl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNavigateToLoginRequestUrlUndefined: Self = StObject.set(x, "navigateToLoginRequestUrl", js.undefined)
      
      @scala.inline
      def setPopUp(value: Boolean): Self = StObject.set(x, "popUp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPopUpUndefined: Self = StObject.set(x, "popUp", js.undefined)
      
      @scala.inline
      def setPostLogoutRedirectUri(value: String): Self = StObject.set(x, "postLogoutRedirectUri", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPostLogoutRedirectUriUndefined: Self = StObject.set(x, "postLogoutRedirectUri", js.undefined)
      
      @scala.inline
      def setRedirectUri(value: String): Self = StObject.set(x, "redirectUri", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRedirectUriUndefined: Self = StObject.set(x, "redirectUri", js.undefined)
      
      @scala.inline
      def setTenant(value: String): Self = StObject.set(x, "tenant", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTenantUndefined: Self = StObject.set(x, "tenant", js.undefined)
    }
  }
  
  trait Constants extends StObject {
    
    var ACCESS_TOKEN: access_token
    
    var ERROR_DESCRIPTION: error_description
    
    var EXPIRES_IN: expires_in
    
    var ID_TOKEN: id_token
    
    var LEVEL_STRING_MAP: `0`
    
    var LOADFRAME_TIMEOUT: `6000`
    
    var LOGGING_LEVEL: ERROR
    
    var POPUP_HEIGHT: `600`
    
    var POPUP_WIDTH: `483`
    
    var RESOURCE_DELIMETER: Verticalline
    
    var SESSION_STATE: session_state
    
    var STORAGE: ACCESSTOKENKEY
    
    var TOKEN_RENEW_STATUS_CANCELED: Canceled
    
    var TOKEN_RENEW_STATUS_COMPLETED: Completed
    
    var TOKEN_RENEW_STATUS_IN_PROGRESS: `In Progress`
  }
  object Constants {
    
    @scala.inline
    def apply(LEVEL_STRING_MAP: `0`, LOGGING_LEVEL: ERROR, STORAGE: ACCESSTOKENKEY): Constants = {
      val __obj = js.Dynamic.literal(ACCESS_TOKEN = "access_token", ERROR_DESCRIPTION = "error_description", EXPIRES_IN = "expires_in", ID_TOKEN = "id_token", LEVEL_STRING_MAP = LEVEL_STRING_MAP.asInstanceOf[js.Any], LOADFRAME_TIMEOUT = "6000", LOGGING_LEVEL = LOGGING_LEVEL.asInstanceOf[js.Any], POPUP_HEIGHT = 600, POPUP_WIDTH = 483, RESOURCE_DELIMETER = "|", SESSION_STATE = "session_state", STORAGE = STORAGE.asInstanceOf[js.Any], TOKEN_RENEW_STATUS_CANCELED = "Canceled", TOKEN_RENEW_STATUS_COMPLETED = "Completed", TOKEN_RENEW_STATUS_IN_PROGRESS = "In Progress")
      __obj.asInstanceOf[Constants]
    }
    
    @scala.inline
    implicit class ConstantsMutableBuilder[Self <: Constants] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setACCESS_TOKEN(value: access_token): Self = StObject.set(x, "ACCESS_TOKEN", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setERROR_DESCRIPTION(value: error_description): Self = StObject.set(x, "ERROR_DESCRIPTION", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEXPIRES_IN(value: expires_in): Self = StObject.set(x, "EXPIRES_IN", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setID_TOKEN(value: id_token): Self = StObject.set(x, "ID_TOKEN", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLEVEL_STRING_MAP(value: `0`): Self = StObject.set(x, "LEVEL_STRING_MAP", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLOADFRAME_TIMEOUT(value: `6000`): Self = StObject.set(x, "LOADFRAME_TIMEOUT", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLOGGING_LEVEL(value: ERROR): Self = StObject.set(x, "LOGGING_LEVEL", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPOPUP_HEIGHT(value: `600`): Self = StObject.set(x, "POPUP_HEIGHT", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPOPUP_WIDTH(value: `483`): Self = StObject.set(x, "POPUP_WIDTH", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRESOURCE_DELIMETER(value: Verticalline): Self = StObject.set(x, "RESOURCE_DELIMETER", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSESSION_STATE(value: session_state): Self = StObject.set(x, "SESSION_STATE", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSTORAGE(value: ACCESSTOKENKEY): Self = StObject.set(x, "STORAGE", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTOKEN_RENEW_STATUS_CANCELED(value: Canceled): Self = StObject.set(x, "TOKEN_RENEW_STATUS_CANCELED", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTOKEN_RENEW_STATUS_COMPLETED(value: Completed): Self = StObject.set(x, "TOKEN_RENEW_STATUS_COMPLETED", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTOKEN_RENEW_STATUS_IN_PROGRESS(value: `In Progress`): Self = StObject.set(x, "TOKEN_RENEW_STATUS_IN_PROGRESS", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.reactAdal.reactAdalNumbers.`0`
    - typings.reactAdal.reactAdalNumbers.`1`
    - typings.reactAdal.reactAdalNumbers.`2`
    - typings.reactAdal.reactAdalNumbers.`3`
  */
  trait LoggingLevel extends StObject
  object LoggingLevel {
    
    @scala.inline
    def `0`: typings.reactAdal.reactAdalNumbers.`0` = 0.asInstanceOf[typings.reactAdal.reactAdalNumbers.`0`]
    
    @scala.inline
    def `1`: typings.reactAdal.reactAdalNumbers.`1` = 1.asInstanceOf[typings.reactAdal.reactAdalNumbers.`1`]
    
    @scala.inline
    def `2`: typings.reactAdal.reactAdalNumbers.`2` = 2.asInstanceOf[typings.reactAdal.reactAdalNumbers.`2`]
    
    @scala.inline
    def `3`: typings.reactAdal.reactAdalNumbers.`3` = 3.asInstanceOf[typings.reactAdal.reactAdalNumbers.`3`]
  }
  
  trait RequestInfo extends StObject {
    
    /**
      * Object comprising of fields such as id_token/error, session_state, state, e.t.c.
      */
    var parameters: js.Any
    
    /**
      * Request type.
      */
    var requestType: RequestType
    
    /**
      * Whether state is valid.
      */
    var stateMatch: Boolean
    
    /**
      * Unique guid used to match the response with the request.
      */
    var stateResponse: String
    
    /**
      * Whether `requestType` contains `id_token`, `access_token` or error.
      */
    var valid: Boolean
  }
  object RequestInfo {
    
    @scala.inline
    def apply(
      parameters: js.Any,
      requestType: RequestType,
      stateMatch: Boolean,
      stateResponse: String,
      valid: Boolean
    ): RequestInfo = {
      val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestType = requestType.asInstanceOf[js.Any], stateMatch = stateMatch.asInstanceOf[js.Any], stateResponse = stateResponse.asInstanceOf[js.Any], valid = valid.asInstanceOf[js.Any])
      __obj.asInstanceOf[RequestInfo]
    }
    
    @scala.inline
    implicit class RequestInfoMutableBuilder[Self <: RequestInfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setParameters(value: js.Any): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequestType(value: RequestType): Self = StObject.set(x, "requestType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStateMatch(value: Boolean): Self = StObject.set(x, "stateMatch", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStateResponse(value: String): Self = StObject.set(x, "stateResponse", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValid(value: Boolean): Self = StObject.set(x, "valid", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.reactAdal.reactAdalStrings.LOGIN
    - typings.reactAdal.reactAdalStrings.RENEW_TOKEN
    - typings.reactAdal.reactAdalStrings.UNKNOWN
  */
  trait RequestType extends StObject
  object RequestType {
    
    @scala.inline
    def LOGIN: typings.reactAdal.reactAdalStrings.LOGIN = "LOGIN".asInstanceOf[typings.reactAdal.reactAdalStrings.LOGIN]
    
    @scala.inline
    def RENEW_TOKEN: typings.reactAdal.reactAdalStrings.RENEW_TOKEN = "RENEW_TOKEN".asInstanceOf[typings.reactAdal.reactAdalStrings.RENEW_TOKEN]
    
    @scala.inline
    def UNKNOWN: typings.reactAdal.reactAdalStrings.UNKNOWN = "UNKNOWN".asInstanceOf[typings.reactAdal.reactAdalStrings.UNKNOWN]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.reactAdal.reactAdalStrings.`id_token token`
    - typings.reactAdal.reactAdalStrings.token
  */
  trait ResponseType extends StObject
  object ResponseType {
    
    @scala.inline
    def `id_token token`: typings.reactAdal.reactAdalStrings.`id_token token` = ("id_token token").asInstanceOf[typings.reactAdal.reactAdalStrings.`id_token token`]
    
    @scala.inline
    def token: typings.reactAdal.reactAdalStrings.token = "token".asInstanceOf[typings.reactAdal.reactAdalStrings.token]
  }
  
  type TokenCallback = js.Function3[/* errorDesc */ String | Null, /* token */ String | Null, /* error */ js.Any, Unit]
  
  type UserCallback = js.Function2[/* errorDesc */ String | Null, /* user */ UserInfo | Null, Unit]
  
  trait UserInfo extends StObject {
    
    /**
      * Properties parsed from `id_token`.
      */
    var profile: js.Any
    
    /**
      * Username assigned from UPN or email.
      */
    var userName: String
  }
  object UserInfo {
    
    @scala.inline
    def apply(profile: js.Any, userName: String): UserInfo = {
      val __obj = js.Dynamic.literal(profile = profile.asInstanceOf[js.Any], userName = userName.asInstanceOf[js.Any])
      __obj.asInstanceOf[UserInfo]
    }
    
    @scala.inline
    implicit class UserInfoMutableBuilder[Self <: UserInfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setProfile(value: js.Any): Self = StObject.set(x, "profile", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUserName(value: String): Self = StObject.set(x, "userName", value.asInstanceOf[js.Any])
    }
  }
}
