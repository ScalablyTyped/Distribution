package typings.raygun4js.mod

import typings.raygun4js.raygun4jsStrings.onLoad
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RaygunOptions extends js.Object {
  /**
    * Posts error payloads over HTTP. This allows IE8 to send JS errors.
    */
  var allowInsecureSubmissions: js.UndefOr[Boolean] = js.undefined
  /**
    * A string URI containing the protocol, domain and port (optional) where all payloads will be sent to.
    * This can be used to proxy payloads to the Raygun API through your own server. When not set this defaults internally to the Raygun API, and for most usages you won't need to set this.
    */
  var apiEndpoint: js.UndefOr[String] = js.undefined
  var captureUnhandledRejections: js.UndefOr[Boolean] = js.undefined
  /**
    * Raygun4JS will log to the console when sending errors.
    */
  var debugMode: js.UndefOr[Boolean] = js.undefined
  /**
    * Disabling anonymous user tracking.
    */
  var disableAnonymousUserTracking: js.UndefOr[Boolean] = js.undefined
  /**
    * Prevent uncaught errors from being sent.
    */
  var disableErrorTracking: js.UndefOr[Boolean] = js.undefined
  /**
    * Prevent Pulse real user monitoring events from being sent.
    */
  var disablePulse: js.UndefOr[Boolean] = js.undefined
  /**
    * Prevents errors from being sent from certain hostnames (domains) by providing an array of strings or RegExp objects (for partial matches).
    * Each should match the hostname or TLD that you want to exclude. Note that protocols are not tested.
    */
  var excludedHostnames: js.UndefOr[js.Array[String | RegExp]] = js.undefined
  /**
    * Prevents errors from being sent from certain user agents by providing an array of strings.
    * This is very helpful to exclude errors reported by certain browsers or test automation with CasperJS, PhantomJS or any other testing utility that sends a custom user agent.
    * If a part of the client's navigator.userAgent matches one of the given strings in the array, then the client will be excluded from error reporting.
    */
  var excludedUserAgents: js.UndefOr[js.Array[String | RegExp]] = js.undefined
  /**
    * String which can be optionally set "onLoad" which will then boot the RealUserMonitoring side instead of waiting for the `load` event.
    */
  var from: js.UndefOr[String | onLoad] = js.undefined
  /**
    * Ignores any errors that have no stack trace information. This will discard any errors that occur completely within 3rd party scripts -
    * if code loaded from the current domain called the 3rd party function, it will have at least one stack line and will still be sent.
    */
  var ignore3rdPartyErrors: js.UndefOr[Boolean] = js.undefined
  /**
    * User-aborted Ajax calls result in errors. If this option is true, these errors will not be sent.
    */
  var ignoreAjaxAbort: js.UndefOr[Boolean] = js.undefined
  /**
    * Ajax requests that return error codes will not be sent as errors to Raygun if this options is true.
    */
  var ignoreAjaxError: js.UndefOr[Boolean] = js.undefined
  /**
    * Ignore URL casing when sending data to Pulse.
    */
  var pulseIgnoreUrlCasing: js.UndefOr[Boolean] = js.undefined
  /**
    * The maximum time a virtual page can be considered viewed, in milliseconds (defaults to 30 minutes).
    */
  var pulseMaxVirtualPageDuration: js.UndefOr[Double] = js.undefined
  var setCookieAsSecure: js.UndefOr[Boolean] = js.undefined
  /**
    * If false, async callback functions triggered by setTimeout/setInterval will not be wrapped when attach() is called. Defaults to true
    */
  var wrapAsynchronousCallbacks: js.UndefOr[Boolean] = js.undefined
}

object RaygunOptions {
  @scala.inline
  def apply(
    allowInsecureSubmissions: js.UndefOr[Boolean] = js.undefined,
    apiEndpoint: String = null,
    captureUnhandledRejections: js.UndefOr[Boolean] = js.undefined,
    debugMode: js.UndefOr[Boolean] = js.undefined,
    disableAnonymousUserTracking: js.UndefOr[Boolean] = js.undefined,
    disableErrorTracking: js.UndefOr[Boolean] = js.undefined,
    disablePulse: js.UndefOr[Boolean] = js.undefined,
    excludedHostnames: js.Array[String | RegExp] = null,
    excludedUserAgents: js.Array[String | RegExp] = null,
    from: String | onLoad = null,
    ignore3rdPartyErrors: js.UndefOr[Boolean] = js.undefined,
    ignoreAjaxAbort: js.UndefOr[Boolean] = js.undefined,
    ignoreAjaxError: js.UndefOr[Boolean] = js.undefined,
    pulseIgnoreUrlCasing: js.UndefOr[Boolean] = js.undefined,
    pulseMaxVirtualPageDuration: Int | Double = null,
    setCookieAsSecure: js.UndefOr[Boolean] = js.undefined,
    wrapAsynchronousCallbacks: js.UndefOr[Boolean] = js.undefined
  ): RaygunOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowInsecureSubmissions)) __obj.updateDynamic("allowInsecureSubmissions")(allowInsecureSubmissions.asInstanceOf[js.Any])
    if (apiEndpoint != null) __obj.updateDynamic("apiEndpoint")(apiEndpoint.asInstanceOf[js.Any])
    if (!js.isUndefined(captureUnhandledRejections)) __obj.updateDynamic("captureUnhandledRejections")(captureUnhandledRejections.asInstanceOf[js.Any])
    if (!js.isUndefined(debugMode)) __obj.updateDynamic("debugMode")(debugMode.asInstanceOf[js.Any])
    if (!js.isUndefined(disableAnonymousUserTracking)) __obj.updateDynamic("disableAnonymousUserTracking")(disableAnonymousUserTracking.asInstanceOf[js.Any])
    if (!js.isUndefined(disableErrorTracking)) __obj.updateDynamic("disableErrorTracking")(disableErrorTracking.asInstanceOf[js.Any])
    if (!js.isUndefined(disablePulse)) __obj.updateDynamic("disablePulse")(disablePulse.asInstanceOf[js.Any])
    if (excludedHostnames != null) __obj.updateDynamic("excludedHostnames")(excludedHostnames.asInstanceOf[js.Any])
    if (excludedUserAgents != null) __obj.updateDynamic("excludedUserAgents")(excludedUserAgents.asInstanceOf[js.Any])
    if (from != null) __obj.updateDynamic("from")(from.asInstanceOf[js.Any])
    if (!js.isUndefined(ignore3rdPartyErrors)) __obj.updateDynamic("ignore3rdPartyErrors")(ignore3rdPartyErrors.asInstanceOf[js.Any])
    if (!js.isUndefined(ignoreAjaxAbort)) __obj.updateDynamic("ignoreAjaxAbort")(ignoreAjaxAbort.asInstanceOf[js.Any])
    if (!js.isUndefined(ignoreAjaxError)) __obj.updateDynamic("ignoreAjaxError")(ignoreAjaxError.asInstanceOf[js.Any])
    if (!js.isUndefined(pulseIgnoreUrlCasing)) __obj.updateDynamic("pulseIgnoreUrlCasing")(pulseIgnoreUrlCasing.asInstanceOf[js.Any])
    if (pulseMaxVirtualPageDuration != null) __obj.updateDynamic("pulseMaxVirtualPageDuration")(pulseMaxVirtualPageDuration.asInstanceOf[js.Any])
    if (!js.isUndefined(setCookieAsSecure)) __obj.updateDynamic("setCookieAsSecure")(setCookieAsSecure.asInstanceOf[js.Any])
    if (!js.isUndefined(wrapAsynchronousCallbacks)) __obj.updateDynamic("wrapAsynchronousCallbacks")(wrapAsynchronousCallbacks.asInstanceOf[js.Any])
    __obj.asInstanceOf[RaygunOptions]
  }
}

