package typings
package reactDashRequestLib.reactDashRequestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FetchRequestProps
  extends stdLib.RequestInit {
  var `lazy`: js.UndefOr[scala.Boolean] = js.undefined
  var url: java.lang.String
}

object FetchRequestProps {
  @scala.inline
  def apply(
    url: java.lang.String,
    body: stdLib.BodyInit = null,
    cache: stdLib.RequestCache = null,
    credentials: stdLib.RequestCredentials = null,
    headers: stdLib.HeadersInit = null,
    integrity: java.lang.String = null,
    keepalive: js.UndefOr[scala.Boolean] = js.undefined,
    `lazy`: js.UndefOr[scala.Boolean] = js.undefined,
    method: java.lang.String = null,
    mode: stdLib.RequestMode = null,
    redirect: stdLib.RequestRedirect = null,
    referrer: java.lang.String = null,
    referrerPolicy: stdLib.ReferrerPolicy = null,
    signal: stdLib.AbortSignal = null,
    window: js.Any = null
  ): FetchRequestProps = {
    val __obj = js.Dynamic.literal(url = url)
    if (body != null) __obj.updateDynamic("body")(body.asInstanceOf[js.Any])
    if (cache != null) __obj.updateDynamic("cache")(cache)
    if (credentials != null) __obj.updateDynamic("credentials")(credentials)
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (integrity != null) __obj.updateDynamic("integrity")(integrity)
    if (!js.isUndefined(keepalive)) __obj.updateDynamic("keepalive")(keepalive)
    if (!js.isUndefined(`lazy`)) __obj.updateDynamic("lazy")(`lazy`)
    if (method != null) __obj.updateDynamic("method")(method)
    if (mode != null) __obj.updateDynamic("mode")(mode)
    if (redirect != null) __obj.updateDynamic("redirect")(redirect)
    if (referrer != null) __obj.updateDynamic("referrer")(referrer)
    if (referrerPolicy != null) __obj.updateDynamic("referrerPolicy")(referrerPolicy)
    if (signal != null) __obj.updateDynamic("signal")(signal)
    if (window != null) __obj.updateDynamic("window")(window)
    __obj.asInstanceOf[FetchRequestProps]
  }
}

