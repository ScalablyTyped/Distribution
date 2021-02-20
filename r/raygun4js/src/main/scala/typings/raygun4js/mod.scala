package typings.raygun4js

import org.scalablytyped.runtime.Shortcut
import typings.raygun4js.anon.Client
import typings.raygun4js.anon.Duration
import typings.raygun4js.anon.Level
import typings.raygun4js.anon.Name
import typings.raygun4js.anon.Path
import typings.raygun4js.anon.Type
import typings.raygun4js.raygun4jsStrings.Clicks
import typings.raygun4js.raygun4jsStrings.Console
import typings.raygun4js.raygun4jsStrings.Navigation
import typings.raygun4js.raygun4jsStrings.XHR
import typings.raygun4js.raygun4jsStrings.all
import typings.raygun4js.raygun4jsStrings.apiKey
import typings.raygun4js.raygun4jsStrings.attach
import typings.raygun4js.raygun4jsStrings.breadcrumbsLevel
import typings.raygun4js.raygun4jsStrings.customData
import typings.raygun4js.raygun4jsStrings.customTiming
import typings.raygun4js.raygun4jsStrings.debug
import typings.raygun4js.raygun4jsStrings.detach
import typings.raygun4js.raygun4jsStrings.disableAutoBreadcrumbs
import typings.raygun4js.raygun4jsStrings.disableAutoBreadcrumbsClicks
import typings.raygun4js.raygun4jsStrings.disableAutoBreadcrumbsConsole
import typings.raygun4js.raygun4jsStrings.disableAutoBreadcrumbsNavigation
import typings.raygun4js.raygun4jsStrings.disableAutoBreadcrumbsXHR
import typings.raygun4js.raygun4jsStrings.enableAutoBreadcrumbs
import typings.raygun4js.raygun4jsStrings.enableAutoBreadcrumbsClicks
import typings.raygun4js.raygun4jsStrings.enableAutoBreadcrumbsConsole
import typings.raygun4js.raygun4jsStrings.enableAutoBreadcrumbsNavigation
import typings.raygun4js.raygun4jsStrings.enableAutoBreadcrumbsXHR
import typings.raygun4js.raygun4jsStrings.enableCrashReporting
import typings.raygun4js.raygun4jsStrings.enablePulse
import typings.raygun4js.raygun4jsStrings.endSession
import typings.raygun4js.raygun4jsStrings.error
import typings.raygun4js.raygun4jsStrings.filterSensitiveData
import typings.raygun4js.raygun4jsStrings.getRaygunInstance
import typings.raygun4js.raygun4jsStrings.groupingKey
import typings.raygun4js.raygun4jsStrings.info
import typings.raygun4js.raygun4jsStrings.logContentsOfXhrCalls
import typings.raygun4js.raygun4jsStrings.noConflict
import typings.raygun4js.raygun4jsStrings.onAfterSend
import typings.raygun4js.raygun4jsStrings.onBeforeSend
import typings.raygun4js.raygun4jsStrings.onBeforeXHR
import typings.raygun4js.raygun4jsStrings.onLoad
import typings.raygun4js.raygun4jsStrings.options
import typings.raygun4js.raygun4jsStrings.pageView
import typings.raygun4js.raygun4jsStrings.recordBreadcrumb
import typings.raygun4js.raygun4jsStrings.saveIfOffline
import typings.raygun4js.raygun4jsStrings.send
import typings.raygun4js.raygun4jsStrings.setAutoBreadcrumbsXHRIgnoredHosts
import typings.raygun4js.raygun4jsStrings.setBreadcrumbLevel
import typings.raygun4js.raygun4jsStrings.setFilterScope
import typings.raygun4js.raygun4jsStrings.setUser
import typings.raygun4js.raygun4jsStrings.setVersion
import typings.raygun4js.raygun4jsStrings.trackEvent
import typings.raygun4js.raygun4jsStrings.warning
import typings.raygun4js.raygun4jsStrings.whitelistCrossOriginDomains
import typings.raygun4js.raygun4jsStrings.withCustomData
import typings.raygun4js.raygun4jsStrings.withTags
import typings.std.Date
import typings.std.Error
import typings.std.RegExp
import typings.std.XMLHttpRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("raygun4js", JSImport.Default)
  @js.native
  val default: RaygunV2 = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typings.raygun4js.raygun4jsStrings.debug
    - typings.raygun4js.raygun4jsStrings.error
    - typings.raygun4js.raygun4jsStrings.warning
    - typings.raygun4js.raygun4jsStrings.info
  */
  trait BreadcrumbLevel extends StObject
  object BreadcrumbLevel {
    
    @scala.inline
    def debug: typings.raygun4js.raygun4jsStrings.debug = "debug".asInstanceOf[typings.raygun4js.raygun4jsStrings.debug]
    
    @scala.inline
    def error: typings.raygun4js.raygun4jsStrings.error = "error".asInstanceOf[typings.raygun4js.raygun4jsStrings.error]
    
    @scala.inline
    def info: typings.raygun4js.raygun4jsStrings.info = "info".asInstanceOf[typings.raygun4js.raygun4jsStrings.info]
    
    @scala.inline
    def warning: typings.raygun4js.raygun4jsStrings.warning = "warning".asInstanceOf[typings.raygun4js.raygun4jsStrings.warning]
  }
  
  @js.native
  trait RaygunOptions extends StObject {
    
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
    implicit class RaygunOptionsMutableBuilder[Self <: RaygunOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAllowInsecureSubmissions(value: Boolean): Self = StObject.set(x, "allowInsecureSubmissions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowInsecureSubmissionsUndefined: Self = StObject.set(x, "allowInsecureSubmissions", js.undefined)
      
      @scala.inline
      def setApiEndpoint(value: String): Self = StObject.set(x, "apiEndpoint", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setApiEndpointUndefined: Self = StObject.set(x, "apiEndpoint", js.undefined)
      
      @scala.inline
      def setAutomaticPerformanceCustomTimings(value: Boolean): Self = StObject.set(x, "automaticPerformanceCustomTimings", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutomaticPerformanceCustomTimingsUndefined: Self = StObject.set(x, "automaticPerformanceCustomTimings", js.undefined)
      
      @scala.inline
      def setCaptureMissingRequests(value: Boolean): Self = StObject.set(x, "captureMissingRequests", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCaptureMissingRequestsUndefined: Self = StObject.set(x, "captureMissingRequests", js.undefined)
      
      @scala.inline
      def setCaptureUnhandledRejections(value: Boolean): Self = StObject.set(x, "captureUnhandledRejections", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCaptureUnhandledRejectionsUndefined: Self = StObject.set(x, "captureUnhandledRejections", js.undefined)
      
      @scala.inline
      def setClientIp(value: String): Self = StObject.set(x, "clientIp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClientIpUndefined: Self = StObject.set(x, "clientIp", js.undefined)
      
      @scala.inline
      def setDebugMode(value: Boolean): Self = StObject.set(x, "debugMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDebugModeUndefined: Self = StObject.set(x, "debugMode", js.undefined)
      
      @scala.inline
      def setDisableAnonymousUserTracking(value: Boolean): Self = StObject.set(x, "disableAnonymousUserTracking", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisableAnonymousUserTrackingUndefined: Self = StObject.set(x, "disableAnonymousUserTracking", js.undefined)
      
      @scala.inline
      def setDisableErrorTracking(value: Boolean): Self = StObject.set(x, "disableErrorTracking", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisableErrorTrackingUndefined: Self = StObject.set(x, "disableErrorTracking", js.undefined)
      
      @scala.inline
      def setDisablePulse(value: Boolean): Self = StObject.set(x, "disablePulse", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisablePulseUndefined: Self = StObject.set(x, "disablePulse", js.undefined)
      
      @scala.inline
      def setExcludedHostnames(value: js.Array[String | RegExp]): Self = StObject.set(x, "excludedHostnames", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExcludedHostnamesUndefined: Self = StObject.set(x, "excludedHostnames", js.undefined)
      
      @scala.inline
      def setExcludedHostnamesVarargs(value: (String | RegExp)*): Self = StObject.set(x, "excludedHostnames", js.Array(value :_*))
      
      @scala.inline
      def setExcludedUserAgents(value: js.Array[String | RegExp]): Self = StObject.set(x, "excludedUserAgents", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExcludedUserAgentsUndefined: Self = StObject.set(x, "excludedUserAgents", js.undefined)
      
      @scala.inline
      def setExcludedUserAgentsVarargs(value: (String | RegExp)*): Self = StObject.set(x, "excludedUserAgents", js.Array(value :_*))
      
      @scala.inline
      def setFrom(value: String | onLoad): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFromUndefined: Self = StObject.set(x, "from", js.undefined)
      
      @scala.inline
      def setIgnore3rdPartyErrors(value: Boolean): Self = StObject.set(x, "ignore3rdPartyErrors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIgnore3rdPartyErrorsUndefined: Self = StObject.set(x, "ignore3rdPartyErrors", js.undefined)
      
      @scala.inline
      def setIgnoreAjaxAbort(value: Boolean): Self = StObject.set(x, "ignoreAjaxAbort", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIgnoreAjaxAbortUndefined: Self = StObject.set(x, "ignoreAjaxAbort", js.undefined)
      
      @scala.inline
      def setIgnoreAjaxError(value: Boolean): Self = StObject.set(x, "ignoreAjaxError", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIgnoreAjaxErrorUndefined: Self = StObject.set(x, "ignoreAjaxError", js.undefined)
      
      @scala.inline
      def setPulseIgnoreUrlCasing(value: Boolean): Self = StObject.set(x, "pulseIgnoreUrlCasing", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPulseIgnoreUrlCasingUndefined: Self = StObject.set(x, "pulseIgnoreUrlCasing", js.undefined)
      
      @scala.inline
      def setPulseMaxVirtualPageDuration(value: Double): Self = StObject.set(x, "pulseMaxVirtualPageDuration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPulseMaxVirtualPageDurationUndefined: Self = StObject.set(x, "pulseMaxVirtualPageDuration", js.undefined)
      
      @scala.inline
      def setSetCookieAsSecure(value: Boolean): Self = StObject.set(x, "setCookieAsSecure", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSetCookieAsSecureUndefined: Self = StObject.set(x, "setCookieAsSecure", js.undefined)
      
      @scala.inline
      def setWrapAsynchronousCallbacks(value: Boolean): Self = StObject.set(x, "wrapAsynchronousCallbacks", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWrapAsynchronousCallbacksUndefined: Self = StObject.set(x, "wrapAsynchronousCallbacks", js.undefined)
    }
  }
  
  @js.native
  trait RaygunPayload extends StObject {
    
    var Details: Client = js.native
    
    var OccurredOn: Date = js.native
  }
  object RaygunPayload {
    
    @scala.inline
    def apply(Details: Client, OccurredOn: Date): RaygunPayload = {
      val __obj = js.Dynamic.literal(Details = Details.asInstanceOf[js.Any], OccurredOn = OccurredOn.asInstanceOf[js.Any])
      __obj.asInstanceOf[RaygunPayload]
    }
    
    @scala.inline
    implicit class RaygunPayloadMutableBuilder[Self <: RaygunPayload] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDetails(value: Client): Self = StObject.set(x, "Details", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOccurredOn(value: Date): Self = StObject.set(x, "OccurredOn", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait RaygunStackTrace extends StObject {
    
    var ClassName: String = js.native
    
    var ColumnNumber: Double = js.native
    
    var FileName: String = js.native
    
    var LineNumber: Double = js.native
    
    var MethodName: String = js.native
  }
  object RaygunStackTrace {
    
    @scala.inline
    def apply(ClassName: String, ColumnNumber: Double, FileName: String, LineNumber: Double, MethodName: String): RaygunStackTrace = {
      val __obj = js.Dynamic.literal(ClassName = ClassName.asInstanceOf[js.Any], ColumnNumber = ColumnNumber.asInstanceOf[js.Any], FileName = FileName.asInstanceOf[js.Any], LineNumber = LineNumber.asInstanceOf[js.Any], MethodName = MethodName.asInstanceOf[js.Any])
      __obj.asInstanceOf[RaygunStackTrace]
    }
    
    @scala.inline
    implicit class RaygunStackTraceMutableBuilder[Self <: RaygunStackTrace] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "ClassName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColumnNumber(value: Double): Self = StObject.set(x, "ColumnNumber", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFileName(value: String): Self = StObject.set(x, "FileName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLineNumber(value: Double): Self = StObject.set(x, "LineNumber", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMethodName(value: String): Self = StObject.set(x, "MethodName", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait RaygunStatic extends StObject {
    
    /**
      * Attaches to the `window.onerror` handler. Enables unhandled errors to be automatically tracked.
      */
    def attach(): RaygunStatic = js.native
    
    /**
      * Creates a new Raygun object. Allows the sending of errors to different applications.
      */
    def constructNewRaygun(): RaygunStatic = js.native
    
    /**
      * Detaches the handler from the window.onerror method. Unhandled errors will no longer be tracked.
      */
    def detach(): RaygunStatic = js.native
    
    /**
      * Disables all breadcrumbs or a type can be passed to disable only that one.
      */
    def disableAutoBreadcrumbs(): Unit = js.native
    @JSName("disableAutoBreadcrumbs")
    def disableAutoBreadcrumbs_Clicks(`type`: Clicks): Unit = js.native
    @JSName("disableAutoBreadcrumbs")
    def disableAutoBreadcrumbs_Console(`type`: Console): Unit = js.native
    @JSName("disableAutoBreadcrumbs")
    def disableAutoBreadcrumbs_Navigation(`type`: Navigation): Unit = js.native
    @JSName("disableAutoBreadcrumbs")
    def disableAutoBreadcrumbs_XHR(`type`: XHR): Unit = js.native
    
    /**
      * Enables all breadcrumbs level or a type can be passed which will enable only that passed one.
      */
    def enableAutoBreadcrumbs(): Unit = js.native
    @JSName("enableAutoBreadcrumbs")
    def enableAutoBreadcrumbs_Clicks(`type`: Clicks): Unit = js.native
    @JSName("enableAutoBreadcrumbs")
    def enableAutoBreadcrumbs_Console(`type`: Console): Unit = js.native
    @JSName("enableAutoBreadcrumbs")
    def enableAutoBreadcrumbs_Navigation(`type`: Navigation): Unit = js.native
    @JSName("enableAutoBreadcrumbs")
    def enableAutoBreadcrumbs_XHR(`type`: XHR): Unit = js.native
    
    def endSession(): Unit = js.native
    
    /**
      * Blacklist keys to prevent their values from being sent to Raygun.
      */
    def filterSensitiveData(filteredKeys: js.Array[String | RegExp]): RaygunStatic = js.native
    
    /**
      * Overrides the default automatic grouping and instead group errors together by the string returned by the callback.
      */
    def groupingKey(
      callback: js.Function3[
          /* payload */ RaygunPayload, 
          /* stackTrace */ TracekitStackTrace, 
          /* options */ js.Any, 
          String | Unit
        ]
    ): RaygunStatic = js.native
    
    /**
      * Configures the Raygun provider.
      */
    def init(apiKey: String): RaygunStatic = js.native
    def init(apiKey: String, options: js.UndefOr[scala.Nothing], customdata: js.Any): RaygunStatic = js.native
    def init(apiKey: String, options: RaygunOptions): RaygunStatic = js.native
    def init(apiKey: String, options: RaygunOptions, customdata: js.Any): RaygunStatic = js.native
    
    /**
      * Prevents Raygun from overwriting anything bound to `window.Raygun`.
      */
    def noConflict(): RaygunStatic = js.native
    
    def onAfterSend(callback: js.Function1[/* response */ XMLHttpRequest, Unit]): RaygunStatic = js.native
    
    /**
      * Executed before the payload is sent. If a truthy object is returned, Raygun will attempt to use that as the payload. Raygun will abort the send if `false` is returned.
      */
    def onBeforeSend(callback: js.Function1[/* payload */ RaygunPayload, RaygunPayload | Boolean]): RaygunStatic = js.native
    
    def onBeforeXHR(callback: js.Function1[/* xhr */ XMLHttpRequest, Unit]): RaygunStatic = js.native
    
    /**
      * Records a manual breadcrumb with the given message and metadata passed.
      */
    def recordBreadcrumb(message: String): Unit = js.native
    def recordBreadcrumb(message: String, metadata: js.Any): Unit = js.native
    
    /**
      * Resets the information about the current user.
      */
    def resetAnonymousUser(): Unit = js.native
    
    /**
      * Whether caught errors should be saved in Local Storage when there is no network activity. Saved errors will be send when another error occurs, and activity is regained. Disabled by default.
      */
    def saveIfOffline(enableOffline: Boolean): RaygunStatic = js.native
    
    /**
      * Sends an error/exception to the Raygun Api.
      */
    def send(ex: Error): RaygunStatic = js.native
    def send(ex: Error, customData: js.UndefOr[scala.Nothing], tags: js.Array[String]): RaygunStatic = js.native
    def send(ex: Error, customData: js.Any): RaygunStatic = js.native
    def send(ex: Error, customData: js.Any, tags: js.Array[String]): RaygunStatic = js.native
    
    /**
      * Pass "breadcrumbsLevel" alongside a valid breadcrumbs level to set the current level. Passing options other than "breadcrumbsLevel" will set xhr hosts to ignore being
      */
    def setBreadcrumbOption(): Unit = js.native
    def setBreadcrumbOption(option: js.UndefOr[scala.Nothing], value: String): Unit = js.native
    def setBreadcrumbOption(option: String): Unit = js.native
    def setBreadcrumbOption(option: String, value: String): Unit = js.native
    def setBreadcrumbOption(option: breadcrumbsLevel, value: debug): Unit = js.native
    def setBreadcrumbOption(option: breadcrumbsLevel, value: error): Unit = js.native
    def setBreadcrumbOption(option: breadcrumbsLevel, value: info): Unit = js.native
    def setBreadcrumbOption(option: breadcrumbsLevel, value: warning): Unit = js.native
    @JSName("setBreadcrumbOption")
    def setBreadcrumbOption_breadcrumbsLevel(option: breadcrumbsLevel): Unit = js.native
    @JSName("setBreadcrumbOption")
    def setBreadcrumbOption_breadcrumbsLevel(option: breadcrumbsLevel, value: String): Unit = js.native
    @JSName("setBreadcrumbOption")
    def setBreadcrumbOption_debug(option: js.UndefOr[scala.Nothing], value: debug): Unit = js.native
    @JSName("setBreadcrumbOption")
    def setBreadcrumbOption_debug(option: String, value: debug): Unit = js.native
    @JSName("setBreadcrumbOption")
    def setBreadcrumbOption_error(option: js.UndefOr[scala.Nothing], value: error): Unit = js.native
    @JSName("setBreadcrumbOption")
    def setBreadcrumbOption_error(option: String, value: error): Unit = js.native
    @JSName("setBreadcrumbOption")
    def setBreadcrumbOption_info(option: js.UndefOr[scala.Nothing], value: info): Unit = js.native
    @JSName("setBreadcrumbOption")
    def setBreadcrumbOption_info(option: String, value: info): Unit = js.native
    @JSName("setBreadcrumbOption")
    def setBreadcrumbOption_warning(option: js.UndefOr[scala.Nothing], value: warning): Unit = js.native
    @JSName("setBreadcrumbOption")
    def setBreadcrumbOption_warning(option: String, value: warning): Unit = js.native
    
    /**
      * Change the scope at which filters are applied. Defaults to `customData` by default.
      */
    @JSName("setFilterScope")
    def setFilterScope_all(scope: all): RaygunStatic = js.native
    @JSName("setFilterScope")
    def setFilterScope_customData(scope: customData): RaygunStatic = js.native
    
    /**
      * Provides additional information about the current user.
      */
    def setUser(user: String): RaygunStatic = js.native
    def setUser(
      user: String,
      isAnonymous: js.UndefOr[scala.Nothing],
      email: js.UndefOr[scala.Nothing],
      fullName: js.UndefOr[scala.Nothing],
      firstName: js.UndefOr[scala.Nothing],
      uuid: String
    ): RaygunStatic = js.native
    def setUser(
      user: String,
      isAnonymous: js.UndefOr[scala.Nothing],
      email: js.UndefOr[scala.Nothing],
      fullName: js.UndefOr[scala.Nothing],
      firstName: String
    ): RaygunStatic = js.native
    def setUser(
      user: String,
      isAnonymous: js.UndefOr[scala.Nothing],
      email: js.UndefOr[scala.Nothing],
      fullName: js.UndefOr[scala.Nothing],
      firstName: String,
      uuid: String
    ): RaygunStatic = js.native
    def setUser(
      user: String,
      isAnonymous: js.UndefOr[scala.Nothing],
      email: js.UndefOr[scala.Nothing],
      fullName: String
    ): RaygunStatic = js.native
    def setUser(
      user: String,
      isAnonymous: js.UndefOr[scala.Nothing],
      email: js.UndefOr[scala.Nothing],
      fullName: String,
      firstName: js.UndefOr[scala.Nothing],
      uuid: String
    ): RaygunStatic = js.native
    def setUser(
      user: String,
      isAnonymous: js.UndefOr[scala.Nothing],
      email: js.UndefOr[scala.Nothing],
      fullName: String,
      firstName: String
    ): RaygunStatic = js.native
    def setUser(
      user: String,
      isAnonymous: js.UndefOr[scala.Nothing],
      email: js.UndefOr[scala.Nothing],
      fullName: String,
      firstName: String,
      uuid: String
    ): RaygunStatic = js.native
    def setUser(user: String, isAnonymous: js.UndefOr[scala.Nothing], email: String): RaygunStatic = js.native
    def setUser(
      user: String,
      isAnonymous: js.UndefOr[scala.Nothing],
      email: String,
      fullName: js.UndefOr[scala.Nothing],
      firstName: js.UndefOr[scala.Nothing],
      uuid: String
    ): RaygunStatic = js.native
    def setUser(
      user: String,
      isAnonymous: js.UndefOr[scala.Nothing],
      email: String,
      fullName: js.UndefOr[scala.Nothing],
      firstName: String
    ): RaygunStatic = js.native
    def setUser(
      user: String,
      isAnonymous: js.UndefOr[scala.Nothing],
      email: String,
      fullName: js.UndefOr[scala.Nothing],
      firstName: String,
      uuid: String
    ): RaygunStatic = js.native
    def setUser(user: String, isAnonymous: js.UndefOr[scala.Nothing], email: String, fullName: String): RaygunStatic = js.native
    def setUser(
      user: String,
      isAnonymous: js.UndefOr[scala.Nothing],
      email: String,
      fullName: String,
      firstName: js.UndefOr[scala.Nothing],
      uuid: String
    ): RaygunStatic = js.native
    def setUser(
      user: String,
      isAnonymous: js.UndefOr[scala.Nothing],
      email: String,
      fullName: String,
      firstName: String
    ): RaygunStatic = js.native
    def setUser(
      user: String,
      isAnonymous: js.UndefOr[scala.Nothing],
      email: String,
      fullName: String,
      firstName: String,
      uuid: String
    ): RaygunStatic = js.native
    def setUser(user: String, isAnonymous: Boolean): RaygunStatic = js.native
    def setUser(
      user: String,
      isAnonymous: Boolean,
      email: js.UndefOr[scala.Nothing],
      fullName: js.UndefOr[scala.Nothing],
      firstName: js.UndefOr[scala.Nothing],
      uuid: String
    ): RaygunStatic = js.native
    def setUser(
      user: String,
      isAnonymous: Boolean,
      email: js.UndefOr[scala.Nothing],
      fullName: js.UndefOr[scala.Nothing],
      firstName: String
    ): RaygunStatic = js.native
    def setUser(
      user: String,
      isAnonymous: Boolean,
      email: js.UndefOr[scala.Nothing],
      fullName: js.UndefOr[scala.Nothing],
      firstName: String,
      uuid: String
    ): RaygunStatic = js.native
    def setUser(user: String, isAnonymous: Boolean, email: js.UndefOr[scala.Nothing], fullName: String): RaygunStatic = js.native
    def setUser(
      user: String,
      isAnonymous: Boolean,
      email: js.UndefOr[scala.Nothing],
      fullName: String,
      firstName: js.UndefOr[scala.Nothing],
      uuid: String
    ): RaygunStatic = js.native
    def setUser(
      user: String,
      isAnonymous: Boolean,
      email: js.UndefOr[scala.Nothing],
      fullName: String,
      firstName: String
    ): RaygunStatic = js.native
    def setUser(
      user: String,
      isAnonymous: Boolean,
      email: js.UndefOr[scala.Nothing],
      fullName: String,
      firstName: String,
      uuid: String
    ): RaygunStatic = js.native
    def setUser(user: String, isAnonymous: Boolean, email: String): RaygunStatic = js.native
    def setUser(
      user: String,
      isAnonymous: Boolean,
      email: String,
      fullName: js.UndefOr[scala.Nothing],
      firstName: js.UndefOr[scala.Nothing],
      uuid: String
    ): RaygunStatic = js.native
    def setUser(
      user: String,
      isAnonymous: Boolean,
      email: String,
      fullName: js.UndefOr[scala.Nothing],
      firstName: String
    ): RaygunStatic = js.native
    def setUser(
      user: String,
      isAnonymous: Boolean,
      email: String,
      fullName: js.UndefOr[scala.Nothing],
      firstName: String,
      uuid: String
    ): RaygunStatic = js.native
    def setUser(user: String, isAnonymous: Boolean, email: String, fullName: String): RaygunStatic = js.native
    def setUser(
      user: String,
      isAnonymous: Boolean,
      email: String,
      fullName: String,
      firstName: js.UndefOr[scala.Nothing],
      uuid: String
    ): RaygunStatic = js.native
    def setUser(user: String, isAnonymous: Boolean, email: String, fullName: String, firstName: String): RaygunStatic = js.native
    def setUser(
      user: String,
      isAnonymous: Boolean,
      email: String,
      fullName: String,
      firstName: String,
      uuid: String
    ): RaygunStatic = js.native
    
    /**
      * Allows errors to be filtered by version in the Raygun Dashboard. Versions should be in the format `x.x.x`
      */
    def setVersion(version: String): RaygunStatic = js.native
    
    @JSName("trackEvent")
    def trackEvent_customTiming(`type`: customTiming, options: Duration): Unit = js.native
    /**
      * Track Single Page Application route events.
      */
    @JSName("trackEvent")
    def trackEvent_pageView(`type`: pageView, options: Path): Unit = js.native
    
    /**
      * Whitelist damains which should transmit errors to Raygun.
      */
    def whitelistCrossOriginDomains(whitelist: js.Array[String]): RaygunStatic = js.native
    
    /**
      * Attaches custom data to any errors sent to Raygun.
      */
    def withCustomData(customdata: js.Any): RaygunStatic = js.native
    
    /**
      * Allows errors to be filtered by tag in the Raygun Dashboard.
      */
    def withTags(tags: js.Array[String]): RaygunStatic = js.native
  }
  
  @js.native
  trait RaygunV2 extends StObject {
    
    def apply(key: apiKey, value: String): Unit = js.native
    def apply(key: attach, value: Boolean): Unit = js.native
    def apply(key: detach): Unit = js.native
    def apply(key: disableAutoBreadcrumbs): Unit = js.native
    def apply(key: disableAutoBreadcrumbsClicks): Unit = js.native
    def apply(key: disableAutoBreadcrumbsConsole): Unit = js.native
    def apply(key: disableAutoBreadcrumbsNavigation): Unit = js.native
    def apply(key: disableAutoBreadcrumbsXHR): Unit = js.native
    def apply(key: enableAutoBreadcrumbs): Unit = js.native
    def apply(key: enableAutoBreadcrumbsClicks): Unit = js.native
    def apply(key: enableAutoBreadcrumbsConsole): Unit = js.native
    def apply(key: enableAutoBreadcrumbsNavigation): Unit = js.native
    def apply(key: enableAutoBreadcrumbsXHR): Unit = js.native
    def apply(key: enableCrashReporting, value: Boolean): Unit = js.native
    def apply(key: enablePulse, value: Boolean): Unit = js.native
    def apply(key: endSession): Unit = js.native
    def apply(key: filterSensitiveData, values: js.Array[String | RegExp]): Unit = js.native
    def apply(key: getRaygunInstance): RaygunStatic = js.native
    def apply(
      key: groupingKey,
      value: js.Function3[
          /* payload */ RaygunPayload, 
          /* stackTrace */ TracekitStackTrace, 
          /* options */ js.Any, 
          String | Unit
        ]
    ): Unit = js.native
    def apply(key: logContentsOfXhrCalls, value: Boolean): Unit = js.native
    def apply(key: noConflict, value: Boolean): Unit = js.native
    def apply(key: onAfterSend, callback: js.Function1[/* xhr */ XMLHttpRequest, Unit]): Unit = js.native
    def apply(key: onBeforeSend, callback: js.Function1[/* payload */ RaygunPayload, RaygunPayload | Boolean]): Unit = js.native
    def apply(key: onBeforeXHR, callback: js.Function1[/* xhr */ XMLHttpRequest, Unit]): Unit = js.native
    def apply(key: options, value: RaygunOptions): Unit = js.native
    def apply(key: recordBreadcrumb, message: String, metadata: js.Object): Unit = js.native
    def apply(key: recordBreadcrumb, message: Level, metadata: js.Object): Unit = js.native
    def apply(key: saveIfOffline, value: Boolean): Unit = js.native
    def apply(key: send, value: js.Any): Unit = js.native
    def apply(key: setAutoBreadcrumbsXHRIgnoredHosts): Unit = js.native
    def apply(key: setBreadcrumbLevel, level: BreadcrumbLevel): Unit = js.native
    def apply(key: setFilterScope, value: String): Unit = js.native
    def apply(key: setUser, value: RaygunV2UserDetails): Unit = js.native
    def apply(key: setVersion, value: String): Unit = js.native
    def apply(key: trackEvent, value: Name): Unit = js.native
    def apply(key: trackEvent, value: Type): Unit = js.native
    def apply(key: whitelistCrossOriginDomains, values: js.Array[String]): Unit = js.native
    def apply(key: withCustomData, value: js.Any): Unit = js.native
    def apply(key: withTags, values: js.Array[String]): Unit = js.native
  }
  
  @js.native
  trait RaygunV2UserDetails extends StObject {
    
    /**
      * The user's email address.
      */
    var email: js.UndefOr[String] = js.native
    
    /**
      * The user's first or preferred name.
      */
    var firstName: js.UndefOr[String] = js.native
    
    /**
      * The user's full name.
      */
    var fullName: js.UndefOr[String] = js.native
    
    /**
      * Uniquely identifies the user within Raygun.
      */
    var identifier: String = js.native
    
    /**
      * Indicates whether the user is anonymous or has a user account. Even if this is set to true, you should still give the user a unique identifier of some kind.
      */
    var isAnonymous: js.UndefOr[Boolean] = js.native
    
    /**
      * Identifier of the device the app is running on. This could be used to correlate user accounts over multiple machines.
      */
    var uuid: js.UndefOr[String] = js.native
  }
  object RaygunV2UserDetails {
    
    @scala.inline
    def apply(identifier: String): RaygunV2UserDetails = {
      val __obj = js.Dynamic.literal(identifier = identifier.asInstanceOf[js.Any])
      __obj.asInstanceOf[RaygunV2UserDetails]
    }
    
    @scala.inline
    implicit class RaygunV2UserDetailsMutableBuilder[Self <: RaygunV2UserDetails] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
      
      @scala.inline
      def setFirstName(value: String): Self = StObject.set(x, "firstName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFirstNameUndefined: Self = StObject.set(x, "firstName", js.undefined)
      
      @scala.inline
      def setFullName(value: String): Self = StObject.set(x, "fullName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFullNameUndefined: Self = StObject.set(x, "fullName", js.undefined)
      
      @scala.inline
      def setIdentifier(value: String): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsAnonymous(value: Boolean): Self = StObject.set(x, "isAnonymous", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsAnonymousUndefined: Self = StObject.set(x, "isAnonymous", js.undefined)
      
      @scala.inline
      def setUuid(value: String): Self = StObject.set(x, "uuid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUuidUndefined: Self = StObject.set(x, "uuid", js.undefined)
    }
  }
  
  @js.native
  trait TracekitStack extends StObject {
    
    var column: Double = js.native
    
    var context: js.Any = js.native
    
    var func: String = js.native
    
    var line: Double = js.native
    
    var url: String = js.native
  }
  object TracekitStack {
    
    @scala.inline
    def apply(column: Double, context: js.Any, func: String, line: Double, url: String): TracekitStack = {
      val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], context = context.asInstanceOf[js.Any], func = func.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[TracekitStack]
    }
    
    @scala.inline
    implicit class TracekitStackMutableBuilder[Self <: TracekitStack] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColumn(value: Double): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContext(value: js.Any): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFunc(value: String): Self = StObject.set(x, "func", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLine(value: Double): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait TracekitStackTrace extends StObject {
    
    var message: String = js.native
    
    var mode: String = js.native
    
    var name: String = js.native
    
    var stack: js.Array[TracekitStack] = js.native
    
    var url: String = js.native
    
    var useragent: String = js.native
  }
  object TracekitStackTrace {
    
    @scala.inline
    def apply(
      message: String,
      mode: String,
      name: String,
      stack: js.Array[TracekitStack],
      url: String,
      useragent: String
    ): TracekitStackTrace = {
      val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], stack = stack.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], useragent = useragent.asInstanceOf[js.Any])
      __obj.asInstanceOf[TracekitStackTrace]
    }
    
    @scala.inline
    implicit class TracekitStackTraceMutableBuilder[Self <: TracekitStackTrace] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMode(value: String): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStack(value: js.Array[TracekitStack]): Self = StObject.set(x, "stack", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStackVarargs(value: TracekitStack*): Self = StObject.set(x, "stack", js.Array(value :_*))
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUseragent(value: String): Self = StObject.set(x, "useragent", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Window extends StObject {
    
    var Raygun: RaygunStatic = js.native
  }
  object Window {
    
    @scala.inline
    def apply(Raygun: RaygunStatic): Window = {
      val __obj = js.Dynamic.literal(Raygun = Raygun.asInstanceOf[js.Any])
      __obj.asInstanceOf[Window]
    }
    
    @scala.inline
    implicit class WindowMutableBuilder[Self <: Window] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRaygun(value: RaygunStatic): Self = StObject.set(x, "Raygun", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = RaygunV2
  
  /* This means you don't have to write `default`, but can instead just say `mod.foo` */
  override def _to: RaygunV2 = default
}
