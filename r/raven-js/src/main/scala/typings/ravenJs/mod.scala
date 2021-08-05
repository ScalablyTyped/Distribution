package typings.ravenJs

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import typings.ravenJs.anon.ErrorrequestXMLHttpReques
import typings.ravenJs.anon.Sentryclient
import typings.std.Error
import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("raven-js", JSImport.Namespace)
  @js.native
  val ^ : RavenStatic = js.native
  
  trait AutoBreadcrumbOptions extends StObject {
    
    var console: js.UndefOr[Boolean] = js.undefined
    
    var dom: js.UndefOr[Boolean] = js.undefined
    
    var location: js.UndefOr[Boolean] = js.undefined
    
    var sentry: js.UndefOr[Boolean] = js.undefined
    
    var xhr: js.UndefOr[Boolean] = js.undefined
  }
  object AutoBreadcrumbOptions {
    
    inline def apply(): AutoBreadcrumbOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AutoBreadcrumbOptions]
    }
    
    extension [Self <: AutoBreadcrumbOptions](x: Self) {
      
      inline def setConsole(value: Boolean): Self = StObject.set(x, "console", value.asInstanceOf[js.Any])
      
      inline def setConsoleUndefined: Self = StObject.set(x, "console", js.undefined)
      
      inline def setDom(value: Boolean): Self = StObject.set(x, "dom", value.asInstanceOf[js.Any])
      
      inline def setDomUndefined: Self = StObject.set(x, "dom", js.undefined)
      
      inline def setLocation(value: Boolean): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
      
      inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
      
      inline def setSentry(value: Boolean): Self = StObject.set(x, "sentry", value.asInstanceOf[js.Any])
      
      inline def setSentryUndefined: Self = StObject.set(x, "sentry", js.undefined)
      
      inline def setXhr(value: Boolean): Self = StObject.set(x, "xhr", value.asInstanceOf[js.Any])
      
      inline def setXhrUndefined: Self = StObject.set(x, "xhr", js.undefined)
    }
  }
  
  trait Breadcrumb extends StObject {
    
    var category: js.UndefOr[String] = js.undefined
    
    var data: js.UndefOr[js.Any] = js.undefined
    
    var level: js.UndefOr[LogLevel] = js.undefined
    
    var message: js.UndefOr[String] = js.undefined
    
    var `type`: js.UndefOr[BreadcrumbType] = js.undefined
  }
  object Breadcrumb {
    
    inline def apply(): Breadcrumb = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Breadcrumb]
    }
    
    extension [Self <: Breadcrumb](x: Self) {
      
      inline def setCategory(value: String): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
      
      inline def setCategoryUndefined: Self = StObject.set(x, "category", js.undefined)
      
      inline def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setLevel(value: LogLevel): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
      
      inline def setLevelUndefined: Self = StObject.set(x, "level", js.undefined)
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
      
      inline def setType(value: BreadcrumbType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.ravenJs.ravenJsStrings.navigation
    - typings.ravenJs.ravenJsStrings.http
  */
  trait BreadcrumbType extends StObject
  object BreadcrumbType {
    
    inline def http: typings.ravenJs.ravenJsStrings.http = "http".asInstanceOf[typings.ravenJs.ravenJsStrings.http]
    
    inline def navigation: typings.ravenJs.ravenJsStrings.navigation = "navigation".asInstanceOf[typings.ravenJs.ravenJsStrings.navigation]
  }
  
  /** Event/Breadcrumb Severity. `critical` is for Breadcrumbs only and `fatal` is for Events only. */
  /* Rewritten from type alias, can be one of: 
    - typings.ravenJs.ravenJsStrings.critical
    - typings.ravenJs.ravenJsStrings.fatal
    - typings.ravenJs.ravenJsStrings.error
    - typings.ravenJs.ravenJsStrings.warning
    - typings.ravenJs.ravenJsStrings.info
    - typings.ravenJs.ravenJsStrings.debug
    - typings.ravenJs.ravenJsStrings.warn
    - typings.ravenJs.ravenJsStrings.log
  */
  trait LogLevel extends StObject
  object LogLevel {
    
    inline def critical: typings.ravenJs.ravenJsStrings.critical = "critical".asInstanceOf[typings.ravenJs.ravenJsStrings.critical]
    
    inline def debug: typings.ravenJs.ravenJsStrings.debug = "debug".asInstanceOf[typings.ravenJs.ravenJsStrings.debug]
    
    inline def error: typings.ravenJs.ravenJsStrings.error = "error".asInstanceOf[typings.ravenJs.ravenJsStrings.error]
    
    inline def fatal: typings.ravenJs.ravenJsStrings.fatal = "fatal".asInstanceOf[typings.ravenJs.ravenJsStrings.fatal]
    
    inline def info: typings.ravenJs.ravenJsStrings.info = "info".asInstanceOf[typings.ravenJs.ravenJsStrings.info]
    
    inline def log: typings.ravenJs.ravenJsStrings.log = "log".asInstanceOf[typings.ravenJs.ravenJsStrings.log]
    
    inline def warn: typings.ravenJs.ravenJsStrings.warn = "warn".asInstanceOf[typings.ravenJs.ravenJsStrings.warn]
    
    inline def warning: typings.ravenJs.ravenJsStrings.warning = "warning".asInstanceOf[typings.ravenJs.ravenJsStrings.warning]
  }
  
  type RavenCallback = js.Function2[
    /* data */ js.Any, 
    /* orig */ js.UndefOr[js.Function1[/* data */ js.Any, js.Any]], 
    js.Any | Unit
  ]
  
  trait RavenInstrumentationOptions extends StObject {
    
    var tryCatch: js.UndefOr[Boolean] = js.undefined
  }
  object RavenInstrumentationOptions {
    
    inline def apply(): RavenInstrumentationOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RavenInstrumentationOptions]
    }
    
    extension [Self <: RavenInstrumentationOptions](x: Self) {
      
      inline def setTryCatch(value: Boolean): Self = StObject.set(x, "tryCatch", value.asInstanceOf[js.Any])
      
      inline def setTryCatchUndefined: Self = StObject.set(x, "tryCatch", js.undefined)
    }
  }
  
  trait RavenOptions extends StObject {
    
    /**
      * By default, Raven.js attempts to suppress duplicate captured errors and messages that occur back-to-back.
      * Such events are often triggered by rogue code (e.g. from a `setInterval` callback in a browser extension),
      * are not actionable, and eat up your event quota.
      */
    var allowDuplicates: js.UndefOr[Boolean] = js.undefined
    
    /** Allow use of private/secretKey. */
    var allowSecretKey: js.UndefOr[Boolean] = js.undefined
    
    /** Enables/disables automatic collection of breadcrumbs. */
    var autoBreadcrumbs: js.UndefOr[Boolean | AutoBreadcrumbOptions] = js.undefined
    
    /** A function that allows filtering or mutating breadcrumb payloads. Return false to throw away the breadcrumb. */
    var breadcrumbCallback: js.UndefOr[js.Function1[/* data */ js.Any, js.Any]] = js.undefined
    
    /** By default, Raven captures all unhandled promise rejections using standard `unhandledrejection` event. If you want to disable this behaviour, set this option to `false` */
    var captureUnhandledRejections: js.UndefOr[Boolean] = js.undefined
    
    /** A function which allows mutation of the data payload right before being sent to Sentry */
    var dataCallback: js.UndefOr[js.Function1[/* data */ js.Any, js.Any]] = js.undefined
    
    /**
      * If set to true, Raven.js outputs some light debugging information onto the console.
      */
    var debug: js.UndefOr[Boolean] = js.undefined
    
    /** The environment of the application you are monitoring with Sentry */
    var environment: js.UndefOr[String] = js.undefined
    
    var extra: js.UndefOr[js.Any] = js.undefined
    
    /** `fetch` init parameters */
    var fetchParameters: js.UndefOr[StringDictionary[String | js.Function]] = js.undefined
    
    /** In some cases you may see issues where Sentry groups multiple events together when they should be separate entities. In other cases, Sentry simply doesn’t group events together because they’re so sporadic that they never look the same. */
    var fingerprint: js.UndefOr[js.Array[String]] = js.undefined
    
    /** Append headers to the fetch or XMLHttpRequest request. Should be in a form of hash, were value can be string or function */
    var headers: js.UndefOr[StringDictionary[String | js.Function]] = js.undefined
    
    /** List of messages to be filtered out before being sent to Sentry. */
    var ignoreErrors: js.UndefOr[js.Array[RegExp | String]] = js.undefined
    
    /** Similar to ignoreErrors, but will ignore errors from whole urls patching a regex pattern. */
    var ignoreUrls: js.UndefOr[js.Array[RegExp | String]] = js.undefined
    
    /** An array of regex patterns to indicate which urls are a part of your app. */
    var includePaths: js.UndefOr[js.Array[RegExp | String]] = js.undefined
    
    /** Enables/disables instrumentation of globals. */
    var instrument: js.UndefOr[Boolean | RavenInstrumentationOptions] = js.undefined
    
    /** The log level associated with this event. Default: error */
    var level: js.UndefOr[LogLevel] = js.undefined
    
    /** The name of the logger used by Sentry. Default: javascript */
    var logger: js.UndefOr[String] = js.undefined
    
    /** By default, Raven captures as many as 100 breadcrumb entries. If you find this too noisy, you can reduce this number by setting maxBreadcrumbs. Note that this number cannot be set higher than the default of 100. */
    var maxBreadcrumbs: js.UndefOr[Double] = js.undefined
    
    /** By default, Raven does not truncate messages. If you need to truncate characters for whatever reason, you may set this to limit the length. */
    var maxMessageLength: js.UndefOr[Double] = js.undefined
    
    /** By default, Raven will truncate URLs as they appear in breadcrumbs and other meta interfaces to 250 characters in order to minimize bytes over the wire. This does *not* affect URLs in stack traces. */
    var maxUrlLength: js.UndefOr[Double] = js.undefined
    
    /** The release version of the application you are monitoring with Sentry */
    var release: js.UndefOr[String] = js.undefined
    
    /**
      * A sampling rate to apply to events. A value of 0.0 will send no events, and a value of 1.0 will send all events (default).
      */
    var sampleRate: js.UndefOr[Double] = js.undefined
    
    /** An array of strings representing keys that should be scrubbed from the payload sent to Sentry */
    var sanitizeKeys: js.UndefOr[js.Array[RegExp | String]] = js.undefined
    
    /** The name of the server or device that the client is running on */
    var serverName: js.UndefOr[String] = js.undefined
    
    /** A callback function that allows you to apply your own filters to determine if the message should be sent to Sentry. */
    var shouldSendCallback: js.UndefOr[js.Function1[/* data */ js.Any, Boolean]] = js.undefined
    
    /** set to true to get the stack trace of your message */
    var stacktrace: js.UndefOr[Boolean] = js.undefined
    
    /** Additional data to be tagged onto the error. */
    var tags: js.UndefOr[StringDictionary[String]] = js.undefined
    
    /** Override the default HTTP data transport handler. */
    var transport: js.UndefOr[js.Function1[/* options */ RavenTransportOptions, Unit]] = js.undefined
    
    /** The inverse of ignoreUrls. Only report errors from whole urls matching a regex pattern. */
    var whitelistUrls: js.UndefOr[js.Array[RegExp | String]] = js.undefined
  }
  object RavenOptions {
    
    inline def apply(): RavenOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RavenOptions]
    }
    
    extension [Self <: RavenOptions](x: Self) {
      
      inline def setAllowDuplicates(value: Boolean): Self = StObject.set(x, "allowDuplicates", value.asInstanceOf[js.Any])
      
      inline def setAllowDuplicatesUndefined: Self = StObject.set(x, "allowDuplicates", js.undefined)
      
      inline def setAllowSecretKey(value: Boolean): Self = StObject.set(x, "allowSecretKey", value.asInstanceOf[js.Any])
      
      inline def setAllowSecretKeyUndefined: Self = StObject.set(x, "allowSecretKey", js.undefined)
      
      inline def setAutoBreadcrumbs(value: Boolean | AutoBreadcrumbOptions): Self = StObject.set(x, "autoBreadcrumbs", value.asInstanceOf[js.Any])
      
      inline def setAutoBreadcrumbsUndefined: Self = StObject.set(x, "autoBreadcrumbs", js.undefined)
      
      inline def setBreadcrumbCallback(value: /* data */ js.Any => js.Any): Self = StObject.set(x, "breadcrumbCallback", js.Any.fromFunction1(value))
      
      inline def setBreadcrumbCallbackUndefined: Self = StObject.set(x, "breadcrumbCallback", js.undefined)
      
      inline def setCaptureUnhandledRejections(value: Boolean): Self = StObject.set(x, "captureUnhandledRejections", value.asInstanceOf[js.Any])
      
      inline def setCaptureUnhandledRejectionsUndefined: Self = StObject.set(x, "captureUnhandledRejections", js.undefined)
      
      inline def setDataCallback(value: /* data */ js.Any => js.Any): Self = StObject.set(x, "dataCallback", js.Any.fromFunction1(value))
      
      inline def setDataCallbackUndefined: Self = StObject.set(x, "dataCallback", js.undefined)
      
      inline def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
      
      inline def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
      
      inline def setEnvironment(value: String): Self = StObject.set(x, "environment", value.asInstanceOf[js.Any])
      
      inline def setEnvironmentUndefined: Self = StObject.set(x, "environment", js.undefined)
      
      inline def setExtra(value: js.Any): Self = StObject.set(x, "extra", value.asInstanceOf[js.Any])
      
      inline def setExtraUndefined: Self = StObject.set(x, "extra", js.undefined)
      
      inline def setFetchParameters(value: StringDictionary[String | js.Function]): Self = StObject.set(x, "fetchParameters", value.asInstanceOf[js.Any])
      
      inline def setFetchParametersUndefined: Self = StObject.set(x, "fetchParameters", js.undefined)
      
      inline def setFingerprint(value: js.Array[String]): Self = StObject.set(x, "fingerprint", value.asInstanceOf[js.Any])
      
      inline def setFingerprintUndefined: Self = StObject.set(x, "fingerprint", js.undefined)
      
      inline def setFingerprintVarargs(value: String*): Self = StObject.set(x, "fingerprint", js.Array(value :_*))
      
      inline def setHeaders(value: StringDictionary[String | js.Function]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      inline def setIgnoreErrors(value: js.Array[RegExp | String]): Self = StObject.set(x, "ignoreErrors", value.asInstanceOf[js.Any])
      
      inline def setIgnoreErrorsUndefined: Self = StObject.set(x, "ignoreErrors", js.undefined)
      
      inline def setIgnoreErrorsVarargs(value: (RegExp | String)*): Self = StObject.set(x, "ignoreErrors", js.Array(value :_*))
      
      inline def setIgnoreUrls(value: js.Array[RegExp | String]): Self = StObject.set(x, "ignoreUrls", value.asInstanceOf[js.Any])
      
      inline def setIgnoreUrlsUndefined: Self = StObject.set(x, "ignoreUrls", js.undefined)
      
      inline def setIgnoreUrlsVarargs(value: (RegExp | String)*): Self = StObject.set(x, "ignoreUrls", js.Array(value :_*))
      
      inline def setIncludePaths(value: js.Array[RegExp | String]): Self = StObject.set(x, "includePaths", value.asInstanceOf[js.Any])
      
      inline def setIncludePathsUndefined: Self = StObject.set(x, "includePaths", js.undefined)
      
      inline def setIncludePathsVarargs(value: (RegExp | String)*): Self = StObject.set(x, "includePaths", js.Array(value :_*))
      
      inline def setInstrument(value: Boolean | RavenInstrumentationOptions): Self = StObject.set(x, "instrument", value.asInstanceOf[js.Any])
      
      inline def setInstrumentUndefined: Self = StObject.set(x, "instrument", js.undefined)
      
      inline def setLevel(value: LogLevel): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
      
      inline def setLevelUndefined: Self = StObject.set(x, "level", js.undefined)
      
      inline def setLogger(value: String): Self = StObject.set(x, "logger", value.asInstanceOf[js.Any])
      
      inline def setLoggerUndefined: Self = StObject.set(x, "logger", js.undefined)
      
      inline def setMaxBreadcrumbs(value: Double): Self = StObject.set(x, "maxBreadcrumbs", value.asInstanceOf[js.Any])
      
      inline def setMaxBreadcrumbsUndefined: Self = StObject.set(x, "maxBreadcrumbs", js.undefined)
      
      inline def setMaxMessageLength(value: Double): Self = StObject.set(x, "maxMessageLength", value.asInstanceOf[js.Any])
      
      inline def setMaxMessageLengthUndefined: Self = StObject.set(x, "maxMessageLength", js.undefined)
      
      inline def setMaxUrlLength(value: Double): Self = StObject.set(x, "maxUrlLength", value.asInstanceOf[js.Any])
      
      inline def setMaxUrlLengthUndefined: Self = StObject.set(x, "maxUrlLength", js.undefined)
      
      inline def setRelease(value: String): Self = StObject.set(x, "release", value.asInstanceOf[js.Any])
      
      inline def setReleaseUndefined: Self = StObject.set(x, "release", js.undefined)
      
      inline def setSampleRate(value: Double): Self = StObject.set(x, "sampleRate", value.asInstanceOf[js.Any])
      
      inline def setSampleRateUndefined: Self = StObject.set(x, "sampleRate", js.undefined)
      
      inline def setSanitizeKeys(value: js.Array[RegExp | String]): Self = StObject.set(x, "sanitizeKeys", value.asInstanceOf[js.Any])
      
      inline def setSanitizeKeysUndefined: Self = StObject.set(x, "sanitizeKeys", js.undefined)
      
      inline def setSanitizeKeysVarargs(value: (RegExp | String)*): Self = StObject.set(x, "sanitizeKeys", js.Array(value :_*))
      
      inline def setServerName(value: String): Self = StObject.set(x, "serverName", value.asInstanceOf[js.Any])
      
      inline def setServerNameUndefined: Self = StObject.set(x, "serverName", js.undefined)
      
      inline def setShouldSendCallback(value: /* data */ js.Any => Boolean): Self = StObject.set(x, "shouldSendCallback", js.Any.fromFunction1(value))
      
      inline def setShouldSendCallbackUndefined: Self = StObject.set(x, "shouldSendCallback", js.undefined)
      
      inline def setStacktrace(value: Boolean): Self = StObject.set(x, "stacktrace", value.asInstanceOf[js.Any])
      
      inline def setStacktraceUndefined: Self = StObject.set(x, "stacktrace", js.undefined)
      
      inline def setTags(value: StringDictionary[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      
      inline def setTransport(value: /* options */ RavenTransportOptions => Unit): Self = StObject.set(x, "transport", js.Any.fromFunction1(value))
      
      inline def setTransportUndefined: Self = StObject.set(x, "transport", js.undefined)
      
      inline def setWhitelistUrls(value: js.Array[RegExp | String]): Self = StObject.set(x, "whitelistUrls", value.asInstanceOf[js.Any])
      
      inline def setWhitelistUrlsUndefined: Self = StObject.set(x, "whitelistUrls", js.undefined)
      
      inline def setWhitelistUrlsVarargs(value: (RegExp | String)*): Self = StObject.set(x, "whitelistUrls", js.Array(value :_*))
    }
  }
  
  type RavenPlugin = js.Function2[/* raven */ RavenStatic, /* repeated */ js.Any, RavenStatic]
  
  @js.native
  trait RavenStatic extends StObject {
    
    var Plugins: StringDictionary[RavenPlugin] = js.native
    
    /** Raven.js version. */
    var VERSION: String = js.native
    
    /**
      * Adds a plugin to Raven
      *
      * @return {Raven}
      */
    def addPlugin(plugin: RavenPlugin, pluginArgs: js.Any*): RavenStatic = js.native
    
    /**
      * Allow Raven to be configured as soon as it is loaded
      * It uses a global RavenConfig = {dsn: '...', config: {}}
      *
      * @return undefined
      */
    def afterLoad(): Unit = js.native
    
    /** Log a breadcrumb */
    def captureBreadcrumb(crumb: Breadcrumb): RavenStatic = js.native
    
    /**
      * Manually capture an exception and send it over to Sentry
      *
      * @param {error|ErrorEvent|string} ex An exception to be logged
      * @param {object} options A specific set of options for this error [optional]
      * @return {Raven}
      */
    def captureException(ex: js.Any): RavenStatic = js.native
    def captureException(ex: js.Any, options: RavenOptions): RavenStatic = js.native
    
    /**
      * Manually send a message to Sentry
      *
      * @param {string} msg A plain message to be captured in Sentry
      * @param {object} options A specific set of options for this message [optional]
      * @return {Raven}
      */
    def captureMessage(msg: String): RavenStatic = js.native
    def captureMessage(msg: String, options: RavenOptions): RavenStatic = js.native
    
    /** Clear all of the context. */
    def clearContext(): RavenStatic = js.native
    
    /**
      * Configure Raven with a DSN and extra options
      *
      * @param {string} dsn The public Sentry DSN
      * @param {object} options Optional set of global options [optional]
      * @return {Raven}
      */
    def config(dsn: String): RavenStatic = js.native
    def config(dsn: String, options: RavenOptions): RavenStatic = js.native
    
    /**
      * Wrap code within a context so Raven can capture errors
      * reliably across domains that is executed immediately.
      *
      * @param {object} options A specific set of options for this context [optional]
      * @param {function} func The callback to be immediately executed within the context
      * @param {array} args An array of arguments to be called with the callback [optional]
      */
    def context(func: js.Function, args: js.Any*): Unit = js.native
    def context(options: RavenOptions, func: js.Function, args: js.Any*): Unit = js.native
    
    /** Get a copy of the current context. This cannot be mutated.*/
    def getContext(): js.Object = js.native
    
    /**
      * Installs a global window.onerror error handler
      * to capture and report uncaught exceptions.
      * At this point, install() is required to be called due
      * to the way TraceKit is set up.
      *
      * @return {Raven}
      */
    def install(): RavenStatic = js.native
    
    /** If you need to conditionally check if raven needs to be initialized or not, you can use the isSetup function. It will return true if Raven is already initialized. */
    def isSetup(): Boolean = js.native
    
    /** An event id is a globally unique id for the event that was just sent. This event id can be used to find the exact event from within Sentry. */
    def lastEventId(): String = js.native
    
    /** Get the latest raw exception that was captured by Raven.*/
    def lastException(): Error = js.native
    
    /**
      * Allow multiple versions of Raven to be installed.
      * Strip Raven from the global context and returns the instance.
      *
      * @return {Raven}
      */
    def noConflict(): RavenStatic = js.native
    
    /** Specify a callback function that allows you to mutate or filter breadcrumbs when they are captured. */
    def setBreadcrumbCallback(): RavenStatic = js.native
    def setBreadcrumbCallback(callback: RavenCallback): RavenStatic = js.native
    
    /**
      * Configure Raven DSN
      *
      * @param {string} dsn The public Sentry DSN
      */
    def setDSN(dsn: String): Unit = js.native
    
    /** Specify a function that allows mutation of the data payload right before being sent to Sentry. */
    def setDataCallback(): RavenStatic = js.native
    def setDataCallback(callback: RavenCallback): RavenStatic = js.native
    
    /** Set environment of application */
    def setEnvironment(environment: String): RavenStatic = js.native
    
    /**
      * Merge extra attributes to be sent along with the payload.
      *
      * @param {object} context A set of data to be merged with the current extra context data [optional]
      *                 If context is undefined, the current extra context data will be removed.
      * @return {Raven}
      */
    def setExtraContext(): RavenStatic = js.native
    def setExtraContext(context: js.Object): RavenStatic = js.native
    
    /** Set release version of application */
    def setRelease(release: String): RavenStatic = js.native
    
    /** Specify a callback function that allows you to apply your own filters to determine if the message should be sent to Sentry. */
    def setShouldSendCallback(): RavenStatic = js.native
    def setShouldSendCallback(callback: RavenCallback): RavenStatic = js.native
    
    /**
      * Merge tags to be sent along with the payload.
      *
      * @param {object} tags A set of data to be merged with the current tag context data [optional]
      *                 If tags is undefined, the current tag context data will be removed.
      * @return {Raven}
      */
    def setTagsContext(): RavenStatic = js.native
    def setTagsContext(tags: js.Object): RavenStatic = js.native
    
    /** Override the default HTTP data transport handler. */
    def setTransport(transportFunction: js.Function1[/* options */ RavenTransportOptions, Unit]): RavenStatic = js.native
    
    /**
      * Set/Clear a user to be sent along with the payload.
      *
      * @param {object} user An object representing user data [optional]
      *                 If user is undefined, the current user context will be removed.
      * @return {Raven}
      */
    def setUserContext(): RavenStatic = js.native
    def setUserContext(user: StringDictionary[js.Any]): RavenStatic = js.native
    
    /** Show Sentry user feedback dialog */
    def showReportDialog(): Unit = js.native
    def showReportDialog(options: js.Object): Unit = js.native
    
    /**
      * Uninstalls the global error handler.
      *
      * @return {Raven}
      */
    def uninstall(): RavenStatic = js.native
    
    /**
      * Wrap code within a context and returns back a new function to be executed
      *
      * @param {object} options A specific set of options for this context [optional]
      * @param {function} func The function to be wrapped in a new context
      * @return {function} The newly wrapped functions with a context
      */
    def wrap(func: js.Function): js.Function = js.native
    def wrap(options: RavenOptions, func: js.Function): js.Function = js.native
    def wrap[T /* <: js.Function */](func: T): T = js.native
    def wrap[T /* <: js.Function */](options: RavenOptions, func: T): T = js.native
  }
  
  trait RavenTransportOptions extends StObject {
    
    var auth: Sentryclient
    
    var data: js.Any
    
    def onError(error: ErrorrequestXMLHttpReques): Unit
    
    def onSuccess(): Unit
    
    var url: String
  }
  object RavenTransportOptions {
    
    inline def apply(
      auth: Sentryclient,
      data: js.Any,
      onError: ErrorrequestXMLHttpReques => Unit,
      onSuccess: () => Unit,
      url: String
    ): RavenTransportOptions = {
      val __obj = js.Dynamic.literal(auth = auth.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], onError = js.Any.fromFunction1(onError), onSuccess = js.Any.fromFunction0(onSuccess), url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[RavenTransportOptions]
    }
    
    extension [Self <: RavenTransportOptions](x: Self) {
      
      inline def setAuth(value: Sentryclient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
      
      inline def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setOnError(value: ErrorrequestXMLHttpReques => Unit): Self = StObject.set(x, "onError", js.Any.fromFunction1(value))
      
      inline def setOnSuccess(value: () => Unit): Self = StObject.set(x, "onSuccess", js.Any.fromFunction0(value))
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = RavenStatic
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: RavenStatic = ^
}
