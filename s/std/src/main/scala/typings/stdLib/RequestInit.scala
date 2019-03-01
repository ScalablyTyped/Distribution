package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RequestInit extends js.Object {
  var body: js.UndefOr[BodyInit | scala.Null] = js.undefined
  var cache: js.UndefOr[RequestCache] = js.undefined
  var credentials: js.UndefOr[RequestCredentials] = js.undefined
  var headers: js.UndefOr[HeadersInit] = js.undefined
  var integrity: js.UndefOr[java.lang.String] = js.undefined
  var keepalive: js.UndefOr[scala.Boolean] = js.undefined
  var method: js.UndefOr[java.lang.String] = js.undefined
  var mode: js.UndefOr[RequestMode] = js.undefined
  var redirect: js.UndefOr[RequestRedirect] = js.undefined
  var referrer: js.UndefOr[java.lang.String] = js.undefined
  var referrerPolicy: js.UndefOr[ReferrerPolicy] = js.undefined
  var signal: js.UndefOr[AbortSignal | scala.Null] = js.undefined
  var window: js.UndefOr[js.Any] = js.undefined
}

object RequestInit {
  @scala.inline
  def apply(
    body: BodyInit = null,
    cache: RequestCache = null,
    credentials: RequestCredentials = null,
    headers: HeadersInit = null,
    integrity: java.lang.String = null,
    keepalive: js.UndefOr[scala.Boolean] = js.undefined,
    method: java.lang.String = null,
    mode: RequestMode = null,
    redirect: RequestRedirect = null,
    referrer: java.lang.String = null,
    referrerPolicy: ReferrerPolicy = null,
    signal: AbortSignal = null,
    window: js.Any = null
  ): RequestInit = {
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
    if (window != null) __obj.updateDynamic("window")(window)
    __obj.asInstanceOf[RequestInit]
  }
}

