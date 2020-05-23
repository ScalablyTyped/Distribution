package typings.reactAsync.mod

import typings.std.AbortSignal
import typings.std.BodyInit
import typings.std.HeadersInit
import typings.std.ReferrerPolicy
import typings.std.RequestCache
import typings.std.RequestCredentials
import typings.std.RequestInfo
import typings.std.RequestMode
import typings.std.RequestRedirect
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {  resource ? :std.RequestInfo} & std.Partial<std.RequestInit> */
trait OverrideParams extends js.Object {
  var body: js.UndefOr[BodyInit] = js.undefined
  var cache: js.UndefOr[RequestCache] = js.undefined
  var credentials: js.UndefOr[RequestCredentials] = js.undefined
  var headers: js.UndefOr[HeadersInit] = js.undefined
  var integrity: js.UndefOr[String] = js.undefined
  var keepalive: js.UndefOr[Boolean] = js.undefined
  var method: js.UndefOr[String] = js.undefined
  var mode: js.UndefOr[RequestMode] = js.undefined
  var redirect: js.UndefOr[RequestRedirect] = js.undefined
  var referrer: js.UndefOr[String] = js.undefined
  var referrerPolicy: js.UndefOr[ReferrerPolicy] = js.undefined
  var resource: js.UndefOr[RequestInfo] = js.undefined
  var signal: js.UndefOr[AbortSignal] = js.undefined
  var window: js.UndefOr[js.Any] = js.undefined
}

object OverrideParams {
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
    resource: RequestInfo = null,
    signal: AbortSignal = null,
    window: js.Any = null
  ): OverrideParams = {
    val __obj = js.Dynamic.literal()
    if (body != null) __obj.updateDynamic("body")(body.asInstanceOf[js.Any])
    if (cache != null) __obj.updateDynamic("cache")(cache.asInstanceOf[js.Any])
    if (credentials != null) __obj.updateDynamic("credentials")(credentials.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (integrity != null) __obj.updateDynamic("integrity")(integrity.asInstanceOf[js.Any])
    if (!js.isUndefined(keepalive)) __obj.updateDynamic("keepalive")(keepalive.get.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (redirect != null) __obj.updateDynamic("redirect")(redirect.asInstanceOf[js.Any])
    if (referrer != null) __obj.updateDynamic("referrer")(referrer.asInstanceOf[js.Any])
    if (referrerPolicy != null) __obj.updateDynamic("referrerPolicy")(referrerPolicy.asInstanceOf[js.Any])
    if (resource != null) __obj.updateDynamic("resource")(resource.asInstanceOf[js.Any])
    if (signal != null) __obj.updateDynamic("signal")(signal.asInstanceOf[js.Any])
    if (window != null) __obj.updateDynamic("window")(window.asInstanceOf[js.Any])
    __obj.asInstanceOf[OverrideParams]
  }
}

