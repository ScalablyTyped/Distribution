package typings.raygun4js.mod

import typings.raygun4js.raygun4jsStrings.onLoad
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RaygunOptions extends js.Object {
  
  /**
    * Posts error payloads over HTTP. This allows IE8 to send JS errors.
    */
  var allowInsecureSubmissions: js.UndefOr[Boolean] = js.native
  
  /**
    * A string URI containing the protocol, domain and port (optional) where all payloads will be sent to.
    * This can be used to proxy payloads to the Raygun API through your own server. When not set this defaults internally to the Raygun API, and for most usages you won't need to set this.
    */
  var apiEndpoint: js.UndefOr[String] = js.native
  
  /**
    * Raygun4JS will track each window.performance.measure call as a custom timing entry. This enables developers to use a more native API for tracking performance timings.
    */
  var automaticPerformanceCustomTimings: js.UndefOr[Boolean] = js.native
  
  /**
    * RUM uses the window.performance API to track XHR timing information and (depending on the browser) not all non-2XX XHR timings are recorded by this API.
    * This option enables the tracking of these missing XHR's calls by tracking the difference between send & success XHR handlers.
    */
  var captureMissingRequests: js.UndefOr[Boolean] = js.native
  
  var captureUnhandledRejections: js.UndefOr[Boolean] = js.native
  
  /**
    * RUM requests will be associated to this IP address when set.
    */
  var clientIp: js.UndefOr[String] = js.native
  
  /**
    * Raygun4JS will log to the console when sending errors.
    */
  var debugMode: js.UndefOr[Boolean] = js.native
  
  /**
    * Disabling anonymous user tracking.
    */
  var disableAnonymousUserTracking: js.UndefOr[Boolean] = js.native
  
  /**
    * Prevent uncaught errors from being sent.
    */
  var disableErrorTracking: js.UndefOr[Boolean] = js.native
  
  /**
    * Prevent Pulse real user monitoring events from being sent.
    */
  var disablePulse: js.UndefOr[Boolean] = js.native
  
  /**
    * Prevents errors from being sent from certain hostnames (domains) by providing an array of strings or RegExp objects (for partial matches).
    * Each should match the hostname or TLD that you want to exclude. Note that protocols are not tested.
    */
  var excludedHostnames: js.UndefOr[js.Array[String | RegExp]] = js.native
  
  /**
    * Prevents errors from being sent from certain user agents by providing an array of strings.
    * This is very helpful to exclude errors reported by certain browsers or test automation with CasperJS, PhantomJS or any other testing utility that sends a custom user agent.
    * If a part of the client's navigator.userAgent matches one of the given strings in the array, then the client will be excluded from error reporting.
    */
  var excludedUserAgents: js.UndefOr[js.Array[String | RegExp]] = js.native
  
  /**
    * String which can be optionally set "onLoad" which will then boot the RealUserMonitoring side instead of waiting for the `load` event.
    */
  var from: js.UndefOr[String | onLoad] = js.native
  
  /**
    * Ignores any errors that have no stack trace information. This will discard any errors that occur completely within 3rd party scripts -
    * if code loaded from the current domain called the 3rd party function, it will have at least one stack line and will still be sent.
    */
  var ignore3rdPartyErrors: js.UndefOr[Boolean] = js.native
  
  /**
    * User-aborted Ajax calls result in errors. If this option is true, these errors will not be sent.
    */
  var ignoreAjaxAbort: js.UndefOr[Boolean] = js.native
  
  /**
    * Ajax requests that return error codes will not be sent as errors to Raygun if this options is true.
    */
  var ignoreAjaxError: js.UndefOr[Boolean] = js.native
  
  /**
    * Ignore URL casing when sending data to Pulse.
    */
  var pulseIgnoreUrlCasing: js.UndefOr[Boolean] = js.native
  
  /**
    * The maximum time a virtual page can be considered viewed, in milliseconds (defaults to 30 minutes).
    */
  var pulseMaxVirtualPageDuration: js.UndefOr[Double] = js.native
  
  var setCookieAsSecure: js.UndefOr[Boolean] = js.native
  
  /**
    * If false, async callback functions triggered by setTimeout/setInterval will not be wrapped when attach() is called. Defaults to true
    */
  var wrapAsynchronousCallbacks: js.UndefOr[Boolean] = js.native
}
object RaygunOptions {
  
  @scala.inline
  def apply(): RaygunOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RaygunOptions]
  }
  
  @scala.inline
  implicit class RaygunOptionsOps[Self <: RaygunOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAllowInsecureSubmissions(value: Boolean): Self = this.set("allowInsecureSubmissions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowInsecureSubmissions: Self = this.set("allowInsecureSubmissions", js.undefined)
    
    @scala.inline
    def setApiEndpoint(value: String): Self = this.set("apiEndpoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteApiEndpoint: Self = this.set("apiEndpoint", js.undefined)
    
    @scala.inline
    def setAutomaticPerformanceCustomTimings(value: Boolean): Self = this.set("automaticPerformanceCustomTimings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutomaticPerformanceCustomTimings: Self = this.set("automaticPerformanceCustomTimings", js.undefined)
    
    @scala.inline
    def setCaptureMissingRequests(value: Boolean): Self = this.set("captureMissingRequests", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCaptureMissingRequests: Self = this.set("captureMissingRequests", js.undefined)
    
    @scala.inline
    def setCaptureUnhandledRejections(value: Boolean): Self = this.set("captureUnhandledRejections", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCaptureUnhandledRejections: Self = this.set("captureUnhandledRejections", js.undefined)
    
    @scala.inline
    def setClientIp(value: String): Self = this.set("clientIp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClientIp: Self = this.set("clientIp", js.undefined)
    
    @scala.inline
    def setDebugMode(value: Boolean): Self = this.set("debugMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDebugMode: Self = this.set("debugMode", js.undefined)
    
    @scala.inline
    def setDisableAnonymousUserTracking(value: Boolean): Self = this.set("disableAnonymousUserTracking", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisableAnonymousUserTracking: Self = this.set("disableAnonymousUserTracking", js.undefined)
    
    @scala.inline
    def setDisableErrorTracking(value: Boolean): Self = this.set("disableErrorTracking", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisableErrorTracking: Self = this.set("disableErrorTracking", js.undefined)
    
    @scala.inline
    def setDisablePulse(value: Boolean): Self = this.set("disablePulse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisablePulse: Self = this.set("disablePulse", js.undefined)
    
    @scala.inline
    def setExcludedHostnamesVarargs(value: (String | RegExp)*): Self = this.set("excludedHostnames", js.Array(value :_*))
    
    @scala.inline
    def setExcludedHostnames(value: js.Array[String | RegExp]): Self = this.set("excludedHostnames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExcludedHostnames: Self = this.set("excludedHostnames", js.undefined)
    
    @scala.inline
    def setExcludedUserAgentsVarargs(value: (String | RegExp)*): Self = this.set("excludedUserAgents", js.Array(value :_*))
    
    @scala.inline
    def setExcludedUserAgents(value: js.Array[String | RegExp]): Self = this.set("excludedUserAgents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExcludedUserAgents: Self = this.set("excludedUserAgents", js.undefined)
    
    @scala.inline
    def setFrom(value: String | onLoad): Self = this.set("from", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFrom: Self = this.set("from", js.undefined)
    
    @scala.inline
    def setIgnore3rdPartyErrors(value: Boolean): Self = this.set("ignore3rdPartyErrors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIgnore3rdPartyErrors: Self = this.set("ignore3rdPartyErrors", js.undefined)
    
    @scala.inline
    def setIgnoreAjaxAbort(value: Boolean): Self = this.set("ignoreAjaxAbort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIgnoreAjaxAbort: Self = this.set("ignoreAjaxAbort", js.undefined)
    
    @scala.inline
    def setIgnoreAjaxError(value: Boolean): Self = this.set("ignoreAjaxError", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIgnoreAjaxError: Self = this.set("ignoreAjaxError", js.undefined)
    
    @scala.inline
    def setPulseIgnoreUrlCasing(value: Boolean): Self = this.set("pulseIgnoreUrlCasing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePulseIgnoreUrlCasing: Self = this.set("pulseIgnoreUrlCasing", js.undefined)
    
    @scala.inline
    def setPulseMaxVirtualPageDuration(value: Double): Self = this.set("pulseMaxVirtualPageDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePulseMaxVirtualPageDuration: Self = this.set("pulseMaxVirtualPageDuration", js.undefined)
    
    @scala.inline
    def setSetCookieAsSecure(value: Boolean): Self = this.set("setCookieAsSecure", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSetCookieAsSecure: Self = this.set("setCookieAsSecure", js.undefined)
    
    @scala.inline
    def setWrapAsynchronousCallbacks(value: Boolean): Self = this.set("wrapAsynchronousCallbacks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWrapAsynchronousCallbacks: Self = this.set("wrapAsynchronousCallbacks", js.undefined)
  }
}
