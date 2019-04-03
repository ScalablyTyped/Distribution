package typings
package reactDashRequestLib.reactDashRequestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DoFetchOptions
  extends stdLib.RequestInit {
  var url: js.UndefOr[java.lang.String] = js.undefined
}

object DoFetchOptions {
  @scala.inline
  def apply(
    body: stdLib.BodyInit = null,
    cache: stdLib.RequestCache = null,
    credentials: stdLib.RequestCredentials = null,
    headers: stdLib.HeadersInit = null,
    integrity: java.lang.String = null,
    keepalive: js.UndefOr[scala.Boolean] = js.undefined,
    method: java.lang.String = null,
    mode: stdLib.RequestMode = null,
    redirect: stdLib.RequestRedirect = null,
    referrer: java.lang.String = null,
    referrerPolicy: stdLib.ReferrerPolicy = null,
    signal: stdLib.AbortSignal = null,
    url: java.lang.String = null,
    window: js.Any = null
  ): DoFetchOptions = {
    val __obj = js.Dynamic.literal()
    if (body != null) __obj.updateDynamic("body")(body.asInstanceOf[js.Any])
    if (cache != null) __obj.updateDynamic("cache")(cache)
    if (credentials != null) __obj.updateDynamic("credentials")(credentials)
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (integrity != null) __obj.updateDynamic("integrity")(integrity)
    if (!js.isUndefined(keepalive)) __obj.updateDynamic("keepalive")(keepalive)
    if (method != null) __obj.updateDynamic("method")(method)
    if (mode != null) __obj.updateDynamic("mode")(mode)
    if (redirect != null) __obj.updateDynamic("redirect")(redirect)
    if (referrer != null) __obj.updateDynamic("referrer")(referrer)
    if (referrerPolicy != null) __obj.updateDynamic("referrerPolicy")(referrerPolicy)
    if (signal != null) __obj.updateDynamic("signal")(signal)
    if (url != null) __obj.updateDynamic("url")(url)
    if (window != null) __obj.updateDynamic("window")(window)
    __obj.asInstanceOf[DoFetchOptions]
  }
}

