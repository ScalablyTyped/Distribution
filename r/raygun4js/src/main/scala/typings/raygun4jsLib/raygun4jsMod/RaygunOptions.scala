package typings
package raygun4jsLib.raygun4jsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RaygunOptions extends js.Object {
  /**
    * Posts error payloads over HTTP. This allows IE8 to send JS errors.
    */
  var allowInsecureSubmissions: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * A string URI containing the protocol, domain and port (optional) where all payloads will be sent to.
    * This can be used to proxy payloads to the Raygun API through your own server. When not set this defaults internally to the Raygun API, and for most usages you won't need to set this.
    */
  var apiEndpoint: js.UndefOr[java.lang.String] = js.undefined
  var captureUnhandledRejections: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Raygun4JS will log to the console when sending errors.
    */
  var debugMode: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Disabling anonymous user tracking.
    */
  var disableAnonymousUserTracking: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Prevent uncaught errors from being sent.
    */
  var disableErrorTracking: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Prevent Pulse real user monitoring events from being sent.
    */
  var disablePulse: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Prevents errors from being sent from certain hostnames (domains) by providing an array of strings or RegExp objects (for partial matches).
    * Each should match the hostname or TLD that you want to exclude. Note that protocols are not tested.
    */
  var excludedHostnames: js.UndefOr[js.Array[java.lang.String | stdLib.RegExp]] = js.undefined
  /**
    * Prevents errors from being sent from certain user agents by providing an array of strings.
    * This is very helpful to exclude errors reported by certain browsers or test automation with CasperJS, PhantomJS or any other testing utility that sends a custom user agent.
    * If a part of the client's navigator.userAgent matches one of the given strings in the array, then the client will be excluded from error reporting.
    */
  var excludedUserAgents: js.UndefOr[js.Array[java.lang.String | stdLib.RegExp]] = js.undefined
  /**
    * String which can be optionally set "onLoad" which will then boot the RealUserMonitoring side instead of waiting for the `load` event.
    */
  var from: js.UndefOr[java.lang.String | raygun4jsLib.raygun4jsLibStrings.onLoad] = js.undefined
  /**
    * Ignores any errors that have no stack trace information. This will discard any errors that occur completely within 3rd party scripts -
    * if code loaded from the current domain called the 3rd party function, it will have at least one stack line and will still be sent.
    */
  var ignore3rdPartyErrors: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * User-aborted Ajax calls result in errors. If this option is true, these errors will not be sent.
    */
  var ignoreAjaxAbort: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Ajax requests that return error codes will not be sent as errors to Raygun if this options is true.
    */
  var ignoreAjaxError: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Ignore URL casing when sending data to Pulse.
    */
  var pulseIgnoreUrlCasing: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The maximum time a virtual page can be considered viewed, in milliseconds (defaults to 30 minutes).
    */
  var pulseMaxVirtualPageDuration: js.UndefOr[scala.Double] = js.undefined
  var setCookieAsSecure: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * If false, async callback functions triggered by setTimeout/setInterval will not be wrapped when attach() is called. Defaults to true
    */
  var wrapAsynchronousCallbacks: js.UndefOr[scala.Boolean] = js.undefined
}

