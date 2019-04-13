package typings
package ravenDashJsLib.ravenDashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RavenOptions extends js.Object {
  /**
    * By default, Raven.js attempts to suppress duplicate captured errors and messages that occur back-to-back.
    * Such events are often triggered by rogue code (e.g. from a `setInterval` callback in a browser extension),
    * are not actionable, and eat up your event quota.
    */
  var allowDuplicates: js.UndefOr[scala.Boolean] = js.undefined
  /** Allow use of private/secretKey. */
  var allowSecretKey: js.UndefOr[scala.Boolean] = js.undefined
  /** Enables/disables automatic collection of breadcrumbs. */
  var autoBreadcrumbs: js.UndefOr[scala.Boolean | AutoBreadcrumbOptions] = js.undefined
  /** A function that allows filtering or mutating breadcrumb payloads. Return false to throw away the breadcrumb. */
  var breadcrumbCallback: js.UndefOr[js.Function1[/* data */ js.Any, _]] = js.undefined
  /** By default, Raven captures all unhandled promise rejections using standard `unhandledrejection` event. If you want to disable this behaviour, set this option to `false` */
  var captureUnhandledRejections: js.UndefOr[scala.Boolean] = js.undefined
  /** A function which allows mutation of the data payload right before being sent to Sentry */
  var dataCallback: js.UndefOr[js.Function1[/* data */ js.Any, _]] = js.undefined
  /**
    * If set to true, Raven.js outputs some light debugging information onto the console.
    */
  var debug: js.UndefOr[scala.Boolean] = js.undefined
  /** The environment of the application you are monitoring with Sentry */
  var environment: js.UndefOr[java.lang.String] = js.undefined
  var extra: js.UndefOr[js.Any] = js.undefined
  /** `fetch` init parameters */
  var fetchParameters: js.UndefOr[org.scalablytyped.runtime.StringDictionary[java.lang.String | js.Function]] = js.undefined
  /** In some cases you may see issues where Sentry groups multiple events together when they should be separate entities. In other cases, Sentry simply doesn’t group events together because they’re so sporadic that they never look the same. */
  var fingerprint: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /** Append headers to the fetch or XMLHttpRequest request. Should be in a form of hash, were value can be string or function */
  var headers: js.UndefOr[org.scalablytyped.runtime.StringDictionary[java.lang.String | js.Function]] = js.undefined
  /** List of messages to be filtered out before being sent to Sentry. */
  var ignoreErrors: js.UndefOr[js.Array[stdLib.RegExp | java.lang.String]] = js.undefined
  /** Similar to ignoreErrors, but will ignore errors from whole urls patching a regex pattern. */
  var ignoreUrls: js.UndefOr[js.Array[stdLib.RegExp | java.lang.String]] = js.undefined
  /** An array of regex patterns to indicate which urls are a part of your app. */
  var includePaths: js.UndefOr[js.Array[stdLib.RegExp | java.lang.String]] = js.undefined
  /** Enables/disables instrumentation of globals. */
  var instrument: js.UndefOr[scala.Boolean | RavenInstrumentationOptions] = js.undefined
  /** The log level associated with this event. Default: error */
  var level: js.UndefOr[LogLevel] = js.undefined
  /** The name of the logger used by Sentry. Default: javascript */
  var logger: js.UndefOr[java.lang.String] = js.undefined
  /** By default, Raven captures as many as 100 breadcrumb entries. If you find this too noisy, you can reduce this number by setting maxBreadcrumbs. Note that this number cannot be set higher than the default of 100. */
  var maxBreadcrumbs: js.UndefOr[scala.Double] = js.undefined
  /** By default, Raven does not truncate messages. If you need to truncate characters for whatever reason, you may set this to limit the length. */
  var maxMessageLength: js.UndefOr[scala.Double] = js.undefined
  /** By default, Raven will truncate URLs as they appear in breadcrumbs and other meta interfaces to 250 characters in order to minimize bytes over the wire. This does *not* affect URLs in stack traces. */
  var maxUrlLength: js.UndefOr[scala.Double] = js.undefined
  /** The release version of the application you are monitoring with Sentry */
  var release: js.UndefOr[java.lang.String] = js.undefined
  /**
    * A sampling rate to apply to events. A value of 0.0 will send no events, and a value of 1.0 will send all events (default).
    */
  var sampleRate: js.UndefOr[scala.Double] = js.undefined
  /** An array of strings representing keys that should be scrubbed from the payload sent to Sentry */
  var sanitizeKeys: js.UndefOr[js.Array[stdLib.RegExp | java.lang.String]] = js.undefined
  /** The name of the server or device that the client is running on */
  var serverName: js.UndefOr[java.lang.String] = js.undefined
  /** A callback function that allows you to apply your own filters to determine if the message should be sent to Sentry. */
  var shouldSendCallback: js.UndefOr[js.Function1[/* data */ js.Any, scala.Boolean]] = js.undefined
  /** set to true to get the stack trace of your message */
  var stacktrace: js.UndefOr[scala.Boolean] = js.undefined
  /** Additional data to be tagged onto the error. */
  var tags: js.UndefOr[org.scalablytyped.runtime.StringDictionary[java.lang.String]] = js.undefined
  /** Override the default HTTP data transport handler. */
  var transport: js.UndefOr[js.Function1[/* options */ RavenTransportOptions, scala.Unit]] = js.undefined
  /** The inverse of ignoreUrls. Only report errors from whole urls matching a regex pattern. */
  var whitelistUrls: js.UndefOr[js.Array[stdLib.RegExp | java.lang.String]] = js.undefined
}

object RavenOptions {
  @scala.inline
  def apply(
    allowDuplicates: js.UndefOr[scala.Boolean] = js.undefined,
    allowSecretKey: js.UndefOr[scala.Boolean] = js.undefined,
    autoBreadcrumbs: scala.Boolean | AutoBreadcrumbOptions = null,
    breadcrumbCallback: /* data */ js.Any => _ = null,
    captureUnhandledRejections: js.UndefOr[scala.Boolean] = js.undefined,
    dataCallback: /* data */ js.Any => _ = null,
    debug: js.UndefOr[scala.Boolean] = js.undefined,
    environment: java.lang.String = null,
    extra: js.Any = null,
    fetchParameters: org.scalablytyped.runtime.StringDictionary[java.lang.String | js.Function] = null,
    fingerprint: js.Array[java.lang.String] = null,
    headers: org.scalablytyped.runtime.StringDictionary[java.lang.String | js.Function] = null,
    ignoreErrors: js.Array[stdLib.RegExp | java.lang.String] = null,
    ignoreUrls: js.Array[stdLib.RegExp | java.lang.String] = null,
    includePaths: js.Array[stdLib.RegExp | java.lang.String] = null,
    instrument: scala.Boolean | RavenInstrumentationOptions = null,
    level: LogLevel = null,
    logger: java.lang.String = null,
    maxBreadcrumbs: scala.Int | scala.Double = null,
    maxMessageLength: scala.Int | scala.Double = null,
    maxUrlLength: scala.Int | scala.Double = null,
    release: java.lang.String = null,
    sampleRate: scala.Int | scala.Double = null,
    sanitizeKeys: js.Array[stdLib.RegExp | java.lang.String] = null,
    serverName: java.lang.String = null,
    shouldSendCallback: /* data */ js.Any => scala.Boolean = null,
    stacktrace: js.UndefOr[scala.Boolean] = js.undefined,
    tags: org.scalablytyped.runtime.StringDictionary[java.lang.String] = null,
    transport: /* options */ RavenTransportOptions => scala.Unit = null,
    whitelistUrls: js.Array[stdLib.RegExp | java.lang.String] = null
  ): RavenOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowDuplicates)) __obj.updateDynamic("allowDuplicates")(allowDuplicates)
    if (!js.isUndefined(allowSecretKey)) __obj.updateDynamic("allowSecretKey")(allowSecretKey)
    if (autoBreadcrumbs != null) __obj.updateDynamic("autoBreadcrumbs")(autoBreadcrumbs.asInstanceOf[js.Any])
    if (breadcrumbCallback != null) __obj.updateDynamic("breadcrumbCallback")(js.Any.fromFunction1(breadcrumbCallback))
    if (!js.isUndefined(captureUnhandledRejections)) __obj.updateDynamic("captureUnhandledRejections")(captureUnhandledRejections)
    if (dataCallback != null) __obj.updateDynamic("dataCallback")(js.Any.fromFunction1(dataCallback))
    if (!js.isUndefined(debug)) __obj.updateDynamic("debug")(debug)
    if (environment != null) __obj.updateDynamic("environment")(environment)
    if (extra != null) __obj.updateDynamic("extra")(extra)
    if (fetchParameters != null) __obj.updateDynamic("fetchParameters")(fetchParameters)
    if (fingerprint != null) __obj.updateDynamic("fingerprint")(fingerprint)
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (ignoreErrors != null) __obj.updateDynamic("ignoreErrors")(ignoreErrors)
    if (ignoreUrls != null) __obj.updateDynamic("ignoreUrls")(ignoreUrls)
    if (includePaths != null) __obj.updateDynamic("includePaths")(includePaths)
    if (instrument != null) __obj.updateDynamic("instrument")(instrument.asInstanceOf[js.Any])
    if (level != null) __obj.updateDynamic("level")(level)
    if (logger != null) __obj.updateDynamic("logger")(logger)
    if (maxBreadcrumbs != null) __obj.updateDynamic("maxBreadcrumbs")(maxBreadcrumbs.asInstanceOf[js.Any])
    if (maxMessageLength != null) __obj.updateDynamic("maxMessageLength")(maxMessageLength.asInstanceOf[js.Any])
    if (maxUrlLength != null) __obj.updateDynamic("maxUrlLength")(maxUrlLength.asInstanceOf[js.Any])
    if (release != null) __obj.updateDynamic("release")(release)
    if (sampleRate != null) __obj.updateDynamic("sampleRate")(sampleRate.asInstanceOf[js.Any])
    if (sanitizeKeys != null) __obj.updateDynamic("sanitizeKeys")(sanitizeKeys)
    if (serverName != null) __obj.updateDynamic("serverName")(serverName)
    if (shouldSendCallback != null) __obj.updateDynamic("shouldSendCallback")(js.Any.fromFunction1(shouldSendCallback))
    if (!js.isUndefined(stacktrace)) __obj.updateDynamic("stacktrace")(stacktrace)
    if (tags != null) __obj.updateDynamic("tags")(tags)
    if (transport != null) __obj.updateDynamic("transport")(js.Any.fromFunction1(transport))
    if (whitelistUrls != null) __obj.updateDynamic("whitelistUrls")(whitelistUrls)
    __obj.asInstanceOf[RavenOptions]
  }
}

