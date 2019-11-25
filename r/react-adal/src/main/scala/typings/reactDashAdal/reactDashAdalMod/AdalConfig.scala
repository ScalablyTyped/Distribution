package typings.reactDashAdal.reactDashAdalMod

import org.scalablytyped.runtime.StringDictionary
import typings.reactDashAdal.reactDashAdalStrings.localStorage
import typings.reactDashAdal.reactDashAdalStrings.sessionStorage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AdalConfig extends js.Object {
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
  def apply(
    clientId: String,
    anonymousEndpoints: js.Array[String] = null,
    cacheLocation: localStorage | sessionStorage = null,
    callback: (/* errorDesc */ String | Null, /* token */ String | Null, /* error */ js.Any) => Unit = null,
    correlationId: String = null,
    displayCall: /* url */ String => Unit = null,
    endpoints: StringDictionary[String] = null,
    expireOffsetSeconds: Int | Double = null,
    extraQueryParameter: String = null,
    instance: String = null,
    loadFrameTimeout: Int | Double = null,
    localLoginUrl: String = null,
    logOutUri: String = null,
    loginResource: String = null,
    navigateToLoginRequestUrl: js.UndefOr[Boolean] = js.undefined,
    popUp: js.UndefOr[Boolean] = js.undefined,
    postLogoutRedirectUri: String = null,
    redirectUri: String = null,
    tenant: String = null
  ): AdalConfig = {
    val __obj = js.Dynamic.literal(clientId = clientId.asInstanceOf[js.Any])
    if (anonymousEndpoints != null) __obj.updateDynamic("anonymousEndpoints")(anonymousEndpoints.asInstanceOf[js.Any])
    if (cacheLocation != null) __obj.updateDynamic("cacheLocation")(cacheLocation.asInstanceOf[js.Any])
    if (callback != null) __obj.updateDynamic("callback")(js.Any.fromFunction3(callback))
    if (correlationId != null) __obj.updateDynamic("correlationId")(correlationId.asInstanceOf[js.Any])
    if (displayCall != null) __obj.updateDynamic("displayCall")(js.Any.fromFunction1(displayCall))
    if (endpoints != null) __obj.updateDynamic("endpoints")(endpoints.asInstanceOf[js.Any])
    if (expireOffsetSeconds != null) __obj.updateDynamic("expireOffsetSeconds")(expireOffsetSeconds.asInstanceOf[js.Any])
    if (extraQueryParameter != null) __obj.updateDynamic("extraQueryParameter")(extraQueryParameter.asInstanceOf[js.Any])
    if (instance != null) __obj.updateDynamic("instance")(instance.asInstanceOf[js.Any])
    if (loadFrameTimeout != null) __obj.updateDynamic("loadFrameTimeout")(loadFrameTimeout.asInstanceOf[js.Any])
    if (localLoginUrl != null) __obj.updateDynamic("localLoginUrl")(localLoginUrl.asInstanceOf[js.Any])
    if (logOutUri != null) __obj.updateDynamic("logOutUri")(logOutUri.asInstanceOf[js.Any])
    if (loginResource != null) __obj.updateDynamic("loginResource")(loginResource.asInstanceOf[js.Any])
    if (!js.isUndefined(navigateToLoginRequestUrl)) __obj.updateDynamic("navigateToLoginRequestUrl")(navigateToLoginRequestUrl.asInstanceOf[js.Any])
    if (!js.isUndefined(popUp)) __obj.updateDynamic("popUp")(popUp.asInstanceOf[js.Any])
    if (postLogoutRedirectUri != null) __obj.updateDynamic("postLogoutRedirectUri")(postLogoutRedirectUri.asInstanceOf[js.Any])
    if (redirectUri != null) __obj.updateDynamic("redirectUri")(redirectUri.asInstanceOf[js.Any])
    if (tenant != null) __obj.updateDynamic("tenant")(tenant.asInstanceOf[js.Any])
    __obj.asInstanceOf[AdalConfig]
  }
}

