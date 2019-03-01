package typings
package ravenLib.ravenMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConstructorOptions extends js.Object {
  var autoBreadcrumbs: js.UndefOr[scala.Boolean | org.scalablytyped.runtime.StringDictionary[scala.Boolean]] = js.undefined
  var captureUnhandledRejections: js.UndefOr[scala.Boolean] = js.undefined
  var dataCallback: js.UndefOr[DataCallback] = js.undefined
  var environment: js.UndefOr[java.lang.String] = js.undefined
  var extra: js.UndefOr[org.scalablytyped.runtime.StringDictionary[js.Any]] = js.undefined
  var logger: js.UndefOr[java.lang.String] = js.undefined
  var maxBreadcrumbs: js.UndefOr[scala.Double] = js.undefined
  var maxReqQueueCount: js.UndefOr[scala.Double] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var parseUser: js.UndefOr[scala.Boolean | js.Array[java.lang.String] | parseUserCallback] = js.undefined
  var release: js.UndefOr[java.lang.String] = js.undefined
  var sampleRate: js.UndefOr[scala.Double] = js.undefined
  var sendTimeout: js.UndefOr[scala.Double] = js.undefined
  var shouldSendCallback: js.UndefOr[ShouldSendCallback] = js.undefined
  var tags: js.UndefOr[org.scalablytyped.runtime.StringDictionary[java.lang.String]] = js.undefined
  var transport: js.UndefOr[ravenLib.ravenMod.transportsNs.Transport] = js.undefined
}

object ConstructorOptions {
  @scala.inline
  def apply(
    autoBreadcrumbs: scala.Boolean | org.scalablytyped.runtime.StringDictionary[scala.Boolean] = null,
    captureUnhandledRejections: js.UndefOr[scala.Boolean] = js.undefined,
    dataCallback: DataCallback = null,
    environment: java.lang.String = null,
    extra: org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    logger: java.lang.String = null,
    maxBreadcrumbs: scala.Int | scala.Double = null,
    maxReqQueueCount: scala.Int | scala.Double = null,
    name: java.lang.String = null,
    parseUser: scala.Boolean | js.Array[java.lang.String] | parseUserCallback = null,
    release: java.lang.String = null,
    sampleRate: scala.Int | scala.Double = null,
    sendTimeout: scala.Int | scala.Double = null,
    shouldSendCallback: ShouldSendCallback = null,
    tags: org.scalablytyped.runtime.StringDictionary[java.lang.String] = null,
    transport: ravenLib.ravenMod.transportsNs.Transport = null
  ): ConstructorOptions = {
    val __obj = js.Dynamic.literal()
    if (autoBreadcrumbs != null) __obj.updateDynamic("autoBreadcrumbs")(autoBreadcrumbs.asInstanceOf[js.Any])
    if (!js.isUndefined(captureUnhandledRejections)) __obj.updateDynamic("captureUnhandledRejections")(captureUnhandledRejections)
    if (dataCallback != null) __obj.updateDynamic("dataCallback")(dataCallback)
    if (environment != null) __obj.updateDynamic("environment")(environment)
    if (extra != null) __obj.updateDynamic("extra")(extra)
    if (logger != null) __obj.updateDynamic("logger")(logger)
    if (maxBreadcrumbs != null) __obj.updateDynamic("maxBreadcrumbs")(maxBreadcrumbs.asInstanceOf[js.Any])
    if (maxReqQueueCount != null) __obj.updateDynamic("maxReqQueueCount")(maxReqQueueCount.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name)
    if (parseUser != null) __obj.updateDynamic("parseUser")(parseUser.asInstanceOf[js.Any])
    if (release != null) __obj.updateDynamic("release")(release)
    if (sampleRate != null) __obj.updateDynamic("sampleRate")(sampleRate.asInstanceOf[js.Any])
    if (sendTimeout != null) __obj.updateDynamic("sendTimeout")(sendTimeout.asInstanceOf[js.Any])
    if (shouldSendCallback != null) __obj.updateDynamic("shouldSendCallback")(shouldSendCallback)
    if (tags != null) __obj.updateDynamic("tags")(tags)
    if (transport != null) __obj.updateDynamic("transport")(transport)
    __obj.asInstanceOf[ConstructorOptions]
  }
}

