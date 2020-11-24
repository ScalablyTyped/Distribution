package typings.ravenJs.mod

import org.scalablytyped.runtime.StringDictionary
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RavenOptions extends js.Object {
  
  /**
    * By default, Raven.js attempts to suppress duplicate captured errors and messages that occur back-to-back.
    * Such events are often triggered by rogue code (e.g. from a `setInterval` callback in a browser extension),
    * are not actionable, and eat up your event quota.
    */
  var allowDuplicates: js.UndefOr[Boolean] = js.native
  
  /** Allow use of private/secretKey. */
  var allowSecretKey: js.UndefOr[Boolean] = js.native
  
  /** Enables/disables automatic collection of breadcrumbs. */
  var autoBreadcrumbs: js.UndefOr[Boolean | AutoBreadcrumbOptions] = js.native
  
  /** A function that allows filtering or mutating breadcrumb payloads. Return false to throw away the breadcrumb. */
  var breadcrumbCallback: js.UndefOr[js.Function1[/* data */ js.Any, _]] = js.native
  
  /** By default, Raven captures all unhandled promise rejections using standard `unhandledrejection` event. If you want to disable this behaviour, set this option to `false` */
  var captureUnhandledRejections: js.UndefOr[Boolean] = js.native
  
  /** A function which allows mutation of the data payload right before being sent to Sentry */
  var dataCallback: js.UndefOr[js.Function1[/* data */ js.Any, _]] = js.native
  
  /**
    * If set to true, Raven.js outputs some light debugging information onto the console.
    */
  var debug: js.UndefOr[Boolean] = js.native
  
  /** The environment of the application you are monitoring with Sentry */
  var environment: js.UndefOr[String] = js.native
  
  var extra: js.UndefOr[js.Any] = js.native
  
  /** `fetch` init parameters */
  var fetchParameters: js.UndefOr[StringDictionary[String | js.Function]] = js.native
  
  /** In some cases you may see issues where Sentry groups multiple events together when they should be separate entities. In other cases, Sentry simply doesn’t group events together because they’re so sporadic that they never look the same. */
  var fingerprint: js.UndefOr[js.Array[String]] = js.native
  
  /** Append headers to the fetch or XMLHttpRequest request. Should be in a form of hash, were value can be string or function */
  var headers: js.UndefOr[StringDictionary[String | js.Function]] = js.native
  
  /** List of messages to be filtered out before being sent to Sentry. */
  var ignoreErrors: js.UndefOr[js.Array[RegExp | String]] = js.native
  
  /** Similar to ignoreErrors, but will ignore errors from whole urls patching a regex pattern. */
  var ignoreUrls: js.UndefOr[js.Array[RegExp | String]] = js.native
  
  /** An array of regex patterns to indicate which urls are a part of your app. */
  var includePaths: js.UndefOr[js.Array[RegExp | String]] = js.native
  
  /** Enables/disables instrumentation of globals. */
  var instrument: js.UndefOr[Boolean | RavenInstrumentationOptions] = js.native
  
  /** The log level associated with this event. Default: error */
  var level: js.UndefOr[LogLevel] = js.native
  
  /** The name of the logger used by Sentry. Default: javascript */
  var logger: js.UndefOr[String] = js.native
  
  /** By default, Raven captures as many as 100 breadcrumb entries. If you find this too noisy, you can reduce this number by setting maxBreadcrumbs. Note that this number cannot be set higher than the default of 100. */
  var maxBreadcrumbs: js.UndefOr[Double] = js.native
  
  /** By default, Raven does not truncate messages. If you need to truncate characters for whatever reason, you may set this to limit the length. */
  var maxMessageLength: js.UndefOr[Double] = js.native
  
  /** By default, Raven will truncate URLs as they appear in breadcrumbs and other meta interfaces to 250 characters in order to minimize bytes over the wire. This does *not* affect URLs in stack traces. */
  var maxUrlLength: js.UndefOr[Double] = js.native
  
  /** The release version of the application you are monitoring with Sentry */
  var release: js.UndefOr[String] = js.native
  
  /**
    * A sampling rate to apply to events. A value of 0.0 will send no events, and a value of 1.0 will send all events (default).
    */
  var sampleRate: js.UndefOr[Double] = js.native
  
  /** An array of strings representing keys that should be scrubbed from the payload sent to Sentry */
  var sanitizeKeys: js.UndefOr[js.Array[RegExp | String]] = js.native
  
  /** The name of the server or device that the client is running on */
  var serverName: js.UndefOr[String] = js.native
  
  /** A callback function that allows you to apply your own filters to determine if the message should be sent to Sentry. */
  var shouldSendCallback: js.UndefOr[js.Function1[/* data */ js.Any, Boolean]] = js.native
  
  /** set to true to get the stack trace of your message */
  var stacktrace: js.UndefOr[Boolean] = js.native
  
  /** Additional data to be tagged onto the error. */
  var tags: js.UndefOr[StringDictionary[String]] = js.native
  
  /** Override the default HTTP data transport handler. */
  var transport: js.UndefOr[js.Function1[/* options */ RavenTransportOptions, Unit]] = js.native
  
  /** The inverse of ignoreUrls. Only report errors from whole urls matching a regex pattern. */
  var whitelistUrls: js.UndefOr[js.Array[RegExp | String]] = js.native
}
object RavenOptions {
  
  @scala.inline
  def apply(): RavenOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RavenOptions]
  }
  
  @scala.inline
  implicit class RavenOptionsOps[Self <: RavenOptions] (val x: Self) extends AnyVal {
    
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
    def setAllowDuplicates(value: Boolean): Self = this.set("allowDuplicates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowDuplicates: Self = this.set("allowDuplicates", js.undefined)
    
    @scala.inline
    def setAllowSecretKey(value: Boolean): Self = this.set("allowSecretKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowSecretKey: Self = this.set("allowSecretKey", js.undefined)
    
    @scala.inline
    def setAutoBreadcrumbs(value: Boolean | AutoBreadcrumbOptions): Self = this.set("autoBreadcrumbs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoBreadcrumbs: Self = this.set("autoBreadcrumbs", js.undefined)
    
    @scala.inline
    def setBreadcrumbCallback(value: /* data */ js.Any => _): Self = this.set("breadcrumbCallback", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteBreadcrumbCallback: Self = this.set("breadcrumbCallback", js.undefined)
    
    @scala.inline
    def setCaptureUnhandledRejections(value: Boolean): Self = this.set("captureUnhandledRejections", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCaptureUnhandledRejections: Self = this.set("captureUnhandledRejections", js.undefined)
    
    @scala.inline
    def setDataCallback(value: /* data */ js.Any => _): Self = this.set("dataCallback", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteDataCallback: Self = this.set("dataCallback", js.undefined)
    
    @scala.inline
    def setDebug(value: Boolean): Self = this.set("debug", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDebug: Self = this.set("debug", js.undefined)
    
    @scala.inline
    def setEnvironment(value: String): Self = this.set("environment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnvironment: Self = this.set("environment", js.undefined)
    
    @scala.inline
    def setExtra(value: js.Any): Self = this.set("extra", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExtra: Self = this.set("extra", js.undefined)
    
    @scala.inline
    def setFetchParameters(value: StringDictionary[String | js.Function]): Self = this.set("fetchParameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFetchParameters: Self = this.set("fetchParameters", js.undefined)
    
    @scala.inline
    def setFingerprintVarargs(value: String*): Self = this.set("fingerprint", js.Array(value :_*))
    
    @scala.inline
    def setFingerprint(value: js.Array[String]): Self = this.set("fingerprint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFingerprint: Self = this.set("fingerprint", js.undefined)
    
    @scala.inline
    def setHeaders(value: StringDictionary[String | js.Function]): Self = this.set("headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeaders: Self = this.set("headers", js.undefined)
    
    @scala.inline
    def setIgnoreErrorsVarargs(value: (RegExp | String)*): Self = this.set("ignoreErrors", js.Array(value :_*))
    
    @scala.inline
    def setIgnoreErrors(value: js.Array[RegExp | String]): Self = this.set("ignoreErrors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIgnoreErrors: Self = this.set("ignoreErrors", js.undefined)
    
    @scala.inline
    def setIgnoreUrlsVarargs(value: (RegExp | String)*): Self = this.set("ignoreUrls", js.Array(value :_*))
    
    @scala.inline
    def setIgnoreUrls(value: js.Array[RegExp | String]): Self = this.set("ignoreUrls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIgnoreUrls: Self = this.set("ignoreUrls", js.undefined)
    
    @scala.inline
    def setIncludePathsVarargs(value: (RegExp | String)*): Self = this.set("includePaths", js.Array(value :_*))
    
    @scala.inline
    def setIncludePaths(value: js.Array[RegExp | String]): Self = this.set("includePaths", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIncludePaths: Self = this.set("includePaths", js.undefined)
    
    @scala.inline
    def setInstrument(value: Boolean | RavenInstrumentationOptions): Self = this.set("instrument", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInstrument: Self = this.set("instrument", js.undefined)
    
    @scala.inline
    def setLevel(value: LogLevel): Self = this.set("level", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLevel: Self = this.set("level", js.undefined)
    
    @scala.inline
    def setLogger(value: String): Self = this.set("logger", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLogger: Self = this.set("logger", js.undefined)
    
    @scala.inline
    def setMaxBreadcrumbs(value: Double): Self = this.set("maxBreadcrumbs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxBreadcrumbs: Self = this.set("maxBreadcrumbs", js.undefined)
    
    @scala.inline
    def setMaxMessageLength(value: Double): Self = this.set("maxMessageLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxMessageLength: Self = this.set("maxMessageLength", js.undefined)
    
    @scala.inline
    def setMaxUrlLength(value: Double): Self = this.set("maxUrlLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxUrlLength: Self = this.set("maxUrlLength", js.undefined)
    
    @scala.inline
    def setRelease(value: String): Self = this.set("release", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRelease: Self = this.set("release", js.undefined)
    
    @scala.inline
    def setSampleRate(value: Double): Self = this.set("sampleRate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSampleRate: Self = this.set("sampleRate", js.undefined)
    
    @scala.inline
    def setSanitizeKeysVarargs(value: (RegExp | String)*): Self = this.set("sanitizeKeys", js.Array(value :_*))
    
    @scala.inline
    def setSanitizeKeys(value: js.Array[RegExp | String]): Self = this.set("sanitizeKeys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSanitizeKeys: Self = this.set("sanitizeKeys", js.undefined)
    
    @scala.inline
    def setServerName(value: String): Self = this.set("serverName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteServerName: Self = this.set("serverName", js.undefined)
    
    @scala.inline
    def setShouldSendCallback(value: /* data */ js.Any => Boolean): Self = this.set("shouldSendCallback", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteShouldSendCallback: Self = this.set("shouldSendCallback", js.undefined)
    
    @scala.inline
    def setStacktrace(value: Boolean): Self = this.set("stacktrace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStacktrace: Self = this.set("stacktrace", js.undefined)
    
    @scala.inline
    def setTags(value: StringDictionary[String]): Self = this.set("tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
    
    @scala.inline
    def setTransport(value: /* options */ RavenTransportOptions => Unit): Self = this.set("transport", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteTransport: Self = this.set("transport", js.undefined)
    
    @scala.inline
    def setWhitelistUrlsVarargs(value: (RegExp | String)*): Self = this.set("whitelistUrls", js.Array(value :_*))
    
    @scala.inline
    def setWhitelistUrls(value: js.Array[RegExp | String]): Self = this.set("whitelistUrls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWhitelistUrls: Self = this.set("whitelistUrls", js.undefined)
  }
}
