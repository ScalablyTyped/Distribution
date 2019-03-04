package typings
package reactDashAdalLib.reactDashAdalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AdalConfig extends js.Object {
  /**
    * Array of keywords or URIs. Adal will not attach a token to outgoing requests that have these keywords or URIs.
    */
  var anonymousEndpoints: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
    * Sets browser storage to either 'localStorage' or sessionStorage'. Defaults to `sessionStorage`.
    */
  var cacheLocation: js.UndefOr[
    reactDashAdalLib.reactDashAdalLibStrings.localStorage | reactDashAdalLib.reactDashAdalLibStrings.sessionStorage
  ] = js.undefined
  /**
    * Callback to be invoked when a token is acquired.
    */
  var callback: js.UndefOr[TokenCallback] = js.undefined
  /**
    * Client ID assigned to your app by Azure Active Directory.
    */
  var clientId: java.lang.String
  /**
    * Unique identifier used to map the request with the response. Defaults to RFC4122 version 4 guid (128 bits).
    */
  var correlationId: js.UndefOr[java.lang.String] = js.undefined
  /**
    * User defined function of handling the navigation to Azure AD authorization endpoint in case of login.
    */
  var displayCall: js.UndefOr[js.Function1[/* url */ java.lang.String, scala.Unit]] = js.undefined
  /**
    * Array of keywords or URIs. Adal will attach a token to outgoing requests that have these keywords or URIs.
    */
  var endpoints: js.UndefOr[org.scalablytyped.runtime.StringDictionary[java.lang.String]] = js.undefined
  /**
    * If the cached token is about to be expired in the expireOffsetSeconds (in seconds), Adal will renew the token instead of using the cached token. Defaults to 300 seconds.
    */
  var expireOffsetSeconds: js.UndefOr[scala.Double] = js.undefined
  /**
    * Query parameters to add to the authentication request.
    */
  var extraQueryParameter: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Azure Active Directory instance. Defaults to `https://login.microsoftonline.com/`.
    */
  var instance: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The number of milliseconds of inactivity before a token renewal response from AAD should be considered timed out. Defaults to 6 seconds.
    */
  var loadFrameTimeout: js.UndefOr[scala.Double] = js.undefined
  /**
    * Set this to redirect the user to a custom login page.
    */
  var localLoginUrl: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Set this to redirect the user to a custom logout page.
    */
  var logOutUri: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Set this to the resource to request on login. Defaults to `clientId`.
    */
  var loginResource: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Redirects to start page after login. Defaults to `true`.
    */
  var navigateToLoginRequestUrl: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Set this to true to enable login in a popup winodow instead of a full redirect. Defaults to `false`.
    */
  var popUp: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Redirects the user to postLogoutRedirectUri after logout. Defaults to `redirectUri`.
    */
  var postLogoutRedirectUri: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Endpoint at which you expect to receive tokens.Defaults to `window.location.href`.
    */
  var redirectUri: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Your target tenant. Defaults to `common`.
    */
  var tenant: js.UndefOr[java.lang.String] = js.undefined
}

object AdalConfig {
  @scala.inline
  def apply(
    clientId: java.lang.String,
    anonymousEndpoints: js.Array[java.lang.String] = null,
    cacheLocation: reactDashAdalLib.reactDashAdalLibStrings.localStorage | reactDashAdalLib.reactDashAdalLibStrings.sessionStorage = null,
    callback: TokenCallback = null,
    correlationId: java.lang.String = null,
    displayCall: js.Function1[/* url */ java.lang.String, scala.Unit] = null,
    endpoints: org.scalablytyped.runtime.StringDictionary[java.lang.String] = null,
    expireOffsetSeconds: scala.Int | scala.Double = null,
    extraQueryParameter: java.lang.String = null,
    instance: java.lang.String = null,
    loadFrameTimeout: scala.Int | scala.Double = null,
    localLoginUrl: java.lang.String = null,
    logOutUri: java.lang.String = null,
    loginResource: java.lang.String = null,
    navigateToLoginRequestUrl: js.UndefOr[scala.Boolean] = js.undefined,
    popUp: js.UndefOr[scala.Boolean] = js.undefined,
    postLogoutRedirectUri: java.lang.String = null,
    redirectUri: java.lang.String = null,
    tenant: java.lang.String = null
  ): AdalConfig = {
    val __obj = js.Dynamic.literal(clientId = clientId)
    if (anonymousEndpoints != null) __obj.updateDynamic("anonymousEndpoints")(anonymousEndpoints)
    if (cacheLocation != null) __obj.updateDynamic("cacheLocation")(cacheLocation.asInstanceOf[js.Any])
    if (callback != null) __obj.updateDynamic("callback")(callback)
    if (correlationId != null) __obj.updateDynamic("correlationId")(correlationId)
    if (displayCall != null) __obj.updateDynamic("displayCall")(displayCall)
    if (endpoints != null) __obj.updateDynamic("endpoints")(endpoints)
    if (expireOffsetSeconds != null) __obj.updateDynamic("expireOffsetSeconds")(expireOffsetSeconds.asInstanceOf[js.Any])
    if (extraQueryParameter != null) __obj.updateDynamic("extraQueryParameter")(extraQueryParameter)
    if (instance != null) __obj.updateDynamic("instance")(instance)
    if (loadFrameTimeout != null) __obj.updateDynamic("loadFrameTimeout")(loadFrameTimeout.asInstanceOf[js.Any])
    if (localLoginUrl != null) __obj.updateDynamic("localLoginUrl")(localLoginUrl)
    if (logOutUri != null) __obj.updateDynamic("logOutUri")(logOutUri)
    if (loginResource != null) __obj.updateDynamic("loginResource")(loginResource)
    if (!js.isUndefined(navigateToLoginRequestUrl)) __obj.updateDynamic("navigateToLoginRequestUrl")(navigateToLoginRequestUrl)
    if (!js.isUndefined(popUp)) __obj.updateDynamic("popUp")(popUp)
    if (postLogoutRedirectUri != null) __obj.updateDynamic("postLogoutRedirectUri")(postLogoutRedirectUri)
    if (redirectUri != null) __obj.updateDynamic("redirectUri")(redirectUri)
    if (tenant != null) __obj.updateDynamic("tenant")(tenant)
    __obj.asInstanceOf[AdalConfig]
  }
}

