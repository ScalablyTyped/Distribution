package typings
package reactDashAdalLib.reactDashAdalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-adal", "AuthenticationContext")
@js.native
class AuthenticationContext protected () extends js.Object {
  def this(options: AdalConfig) = this()
  var CONSTANTS: Constants = js.native
  /**
    * Enum for request type
    */
  var REQUEST_TYPE: RequestType = js.native
  var RESPONSE_TYPE: ResponseType = js.native
  @JSName("callback")
  var callback_Original: TokenCallback = js.native
  var config: AdalConfig = js.native
  var instance: java.lang.String = js.native
  var isAngular: scala.Boolean = js.native
  var popUp: scala.Boolean = js.native
  /**
    * Acquires token from the cache if it is not expired. Otherwise sends request to AAD to obtain a new token.
    * @param resource Resource URI identifying the target resource.
    * @param callback The callback provided by the caller. It will be called with token or error.
    */
  def acquireToken(resource: java.lang.String, callback: TokenCallback): scala.Unit = js.native
  /**
    * Acquires token (interactive flow using a popup window) by sending request to AAD to obtain a new token.
    * @param resource Resource URI identifying the target resource.
    * @param extraQueryParameters Query parameters to add to the authentication request.
    * @param claims Claims to add to the authentication request.
    * @param callback The callback provided by the caller. It will be called with token or error.
    */
  def acquireTokenPopup(
    resource: java.lang.String,
    extraQueryParameters: java.lang.String,
    claims: java.lang.String,
    callback: TokenCallback
  ): scala.Unit = js.native
  def acquireTokenPopup(
    resource: java.lang.String,
    extraQueryParameters: java.lang.String,
    claims: js.UndefOr[scala.Nothing],
    callback: TokenCallback
  ): scala.Unit = js.native
  def acquireTokenPopup(
    resource: java.lang.String,
    extraQueryParameters: java.lang.String,
    claims: scala.Null,
    callback: TokenCallback
  ): scala.Unit = js.native
  def acquireTokenPopup(
    resource: java.lang.String,
    extraQueryParameters: js.UndefOr[scala.Nothing],
    claims: java.lang.String,
    callback: TokenCallback
  ): scala.Unit = js.native
  def acquireTokenPopup(
    resource: java.lang.String,
    extraQueryParameters: js.UndefOr[scala.Nothing],
    claims: js.UndefOr[scala.Nothing],
    callback: TokenCallback
  ): scala.Unit = js.native
  def acquireTokenPopup(
    resource: java.lang.String,
    extraQueryParameters: js.UndefOr[scala.Nothing],
    claims: scala.Null,
    callback: TokenCallback
  ): scala.Unit = js.native
  def acquireTokenPopup(
    resource: java.lang.String,
    extraQueryParameters: scala.Null,
    claims: java.lang.String,
    callback: TokenCallback
  ): scala.Unit = js.native
  def acquireTokenPopup(
    resource: java.lang.String,
    extraQueryParameters: scala.Null,
    claims: js.UndefOr[scala.Nothing],
    callback: TokenCallback
  ): scala.Unit = js.native
  def acquireTokenPopup(
    resource: java.lang.String,
    extraQueryParameters: scala.Null,
    claims: scala.Null,
    callback: TokenCallback
  ): scala.Unit = js.native
  /**
    * Acquires token (interactive flow using a redirect) by sending request to AAD to obtain a new token. In this case the callback passed in the authentication request constructor will be called.
    * @param resource Resource URI identifying the target resource.
    * @param extraQueryParameters Query parameters to add to the authentication request.
    * @param claims Claims to add to the authentication request.
    */
  def acquireTokenRedirect(resource: java.lang.String): scala.Unit = js.native
  def acquireTokenRedirect(resource: java.lang.String, extraQueryParameters: java.lang.String): scala.Unit = js.native
  def acquireTokenRedirect(resource: java.lang.String, extraQueryParameters: java.lang.String, claims: java.lang.String): scala.Unit = js.native
  def acquireTokenRedirect(resource: java.lang.String, extraQueryParameters: scala.Null, claims: java.lang.String): scala.Unit = js.native
  def callback(errorDesc: java.lang.String, token: java.lang.String, error: js.Any): scala.Unit = js.native
  def callback(errorDesc: java.lang.String, token: scala.Null, error: js.Any): scala.Unit = js.native
  def callback(errorDesc: scala.Null, token: java.lang.String, error: js.Any): scala.Unit = js.native
  def callback(errorDesc: scala.Null, token: scala.Null, error: js.Any): scala.Unit = js.native
  /**
    * Clears cache items.
    */
  def clearCache(): scala.Unit = js.native
  /**
    * Clears cache items for a given resource.
    * @param resource Resource URI identifying the target resource.
    */
  def clearCacheForResource(resource: java.lang.String): scala.Unit = js.native
  /**
    * Logs messages when logging level is set to 0.
    * @param message Message to log.
    * @param error Error to log.
    */
  def error(message: java.lang.String, error: js.Any): scala.Unit = js.native
  /**
    * Logs Pii messages when Logging Level is set to 0 and window.piiLoggingEnabled is set to true.
    * @param message Message to log.
    * @param error Error to log.
    */
  def errorPii(message: java.lang.String, error: js.Any): scala.Unit = js.native
  /**
    * Gets token for the specified resource from the cache.
    * @param resource A URI that identifies the resource for which the token is requested.
    */
  def getCachedToken(resource: java.lang.String): java.lang.String = js.native
  /**
    * If user object exists, returns it. Else creates a new user object by decoding `id_token` from the cache.
    */
  def getCachedUser(): UserInfo = js.native
  /**
    * Gets login error.
    */
  def getLoginError(): java.lang.String = js.native
  /**
    * Creates a request info object from the URL fragment and returns it.
    */
  def getRequestInfo(hash: java.lang.String): RequestInfo = js.native
  /**
    * Gets resource for given endpoint if mapping is provided with config.
    * @param endpoint Resource URI identifying the target resource.
    */
  def getResourceForEndpoint(resource: java.lang.String): java.lang.String = js.native
  /**
    * Calls the passed in callback with the user object or error message related to the user.
    * @param callback The callback provided by the caller. It will be called with user or error.
    */
  def getUser(callback: UserCallback): scala.Unit = js.native
  /**
    * This method must be called for processing the response received from AAD. It extracts the hash, processes the token or error, saves it in the cache and calls the callbacks with the result.
    * @param hash Hash fragment of URL. Defaults to `window.location.hash`.
    */
  def handleWindowCallback(): scala.Unit = js.native
  def handleWindowCallback(hash: java.lang.String): scala.Unit = js.native
  /**
    * Logs messages when logging level is set to 2.
    * @param message Message to log.
    */
  def info(message: java.lang.String): scala.Unit = js.native
  /**
    * Logs messages when Logging Level is set to 2 and window.piiLoggingEnabled is set to true.
    * @param message Message to log.
    */
  def infoPii(message: java.lang.String): scala.Unit = js.native
  /**
    * Checks if the URL fragment contains access token, id token or error description.
    * @param hash Hash passed from redirect page.
    */
  def isCallback(hash: java.lang.String): scala.Boolean = js.native
  /**
    * Checks the logging Level, constructs the log message and logs it. Users need to implement/override this method to turn on logging.
    * @param level Level can be set 0, 1, 2 and 3 which turns on 'error', 'warning', 'info' or 'verbose' level logging respectively.
    * @param message Message to log.
    * @param error Error to log.
    */
  def log(level: LoggingLevel, message: java.lang.String, error: js.Any): scala.Unit = js.native
  /**
    * Redirects user to logout endpoint. After logout, it will redirect to `postLogoutRedirectUri` if added as a property on the config object.
    */
  def logOut(): scala.Unit = js.native
  /**
    * Initiates the login process by redirecting the user to Azure AD authorization endpoint.
    */
  def login(): scala.Unit = js.native
  /**
    * Returns whether a login is in progress.
    */
  def loginInProgress(): scala.Boolean = js.native
  /**
    * Redirects the browser to Azure AD authorization endpoint.
    * @param urlNavigate URL of the authorization endpoint.
    */
  def promptUser(urlNavigate: java.lang.String): scala.Unit = js.native
  /**
    * Adds the passed callback to the array of callbacks for the specified resource.
    * @param resource A URI that identifies the resource for which the token is requested.
    * @param expectedState A unique identifier (guid).
    * @param callback The callback provided by the caller. It will be called with token or error.
    */
  def registerCallback(expectedState: java.lang.String, resource: java.lang.String, callback: TokenCallback): scala.Unit = js.native
  /**
    * Saves token or error received in the response from AAD in the cache. In case of `id_token`, it also creates the user object.
    */
  def saveTokenFromHash(requestInfo: RequestInfo): scala.Unit = js.native
  /**
    * Logs messages when logging level is set to 3.
    * @param message Message to log.
    */
  def verbose(message: java.lang.String): scala.Unit = js.native
  /**
    * Logs messages when Logging Level is set to 3 and window.piiLoggingEnabled is set to true.
    * @param message Message to log.
    */
  def verbosePii(message: java.lang.String): scala.Unit = js.native
  /**
    * Logs messages when logging level is set to 1.
    * @param message Message to log.
    */
  def warn(message: java.lang.String): scala.Unit = js.native
  /**
    * Logs  Pii messages when Logging Level is set to 1 and window.piiLoggingEnabled is set to true.
    * @param message Message to log.
    */
  def warnPii(message: java.lang.String): scala.Unit = js.native
}

