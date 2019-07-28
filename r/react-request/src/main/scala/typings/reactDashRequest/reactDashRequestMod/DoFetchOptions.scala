package typings.reactDashRequest.reactDashRequestMod

import typings.std.AbortSignal
import typings.std.BodyInit
import typings.std.HeadersInit
import typings.std.ReferrerPolicy
import typings.std.RequestCache
import typings.std.RequestCredentials
import typings.std.RequestInit
import typings.std.RequestMode
import typings.std.RequestRedirect
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DoFetchOptions extends RequestInit {
  var url: js.UndefOr[String] = js.undefined
}

object DoFetchOptions {
  @scala.inline
  def apply(
    body: BodyInit = null,
    cache: RequestCache = null,
    credentials: RequestCredentials = null,
    headers: HeadersInit = null,
    integrity: String = null,
    keepalive: js.UndefOr[Boolean] = js.undefined,
    method: String = null,
    mode: RequestMode = null,
    redirect: RequestRedirect = null,
    referrer: String = null,
    referrerPolicy: ReferrerPolicy = null,
    signal: AbortSignal = null,
    url: String = null,
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

