package typings.reactRequest.mod

import typings.react.mod.ReactNode
import typings.std.AbortSignal
import typings.std.BodyInit
import typings.std.HeadersInit
import typings.std.ReferrerPolicy
import typings.std.RequestCache
import typings.std.RequestCredentials
import typings.std.RequestMode
import typings.std.RequestRedirect
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FetchProps[T] extends FetchRequestProps {
  var afterFetch: js.UndefOr[js.Function1[/* args */ FetchResponse[T], Unit]] = js.undefined
  var children: js.UndefOr[js.Function1[/* renderProps */ RenderProps[T], ReactNode]] = js.undefined
  var responseType: js.UndefOr[ResponseType] = js.undefined
  var transformData: js.UndefOr[js.Function1[/* data */ js.Any, T]] = js.undefined
}

object FetchProps {
  @scala.inline
  def apply[T](
    url: String,
    afterFetch: /* args */ FetchResponse[T] => Unit = null,
    body: BodyInit = null,
    cache: RequestCache = null,
    children: /* renderProps */ RenderProps[T] => ReactNode = null,
    credentials: RequestCredentials = null,
    headers: HeadersInit = null,
    integrity: String = null,
    keepalive: js.UndefOr[Boolean] = js.undefined,
    `lazy`: js.UndefOr[Boolean] = js.undefined,
    method: String = null,
    mode: RequestMode = null,
    redirect: RequestRedirect = null,
    referrer: String = null,
    referrerPolicy: ReferrerPolicy = null,
    responseType: ResponseType = null,
    signal: AbortSignal = null,
    transformData: /* data */ js.Any => T = null,
    window: js.Any = null
  ): FetchProps[T] = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    if (afterFetch != null) __obj.updateDynamic("afterFetch")(js.Any.fromFunction1(afterFetch))
    if (body != null) __obj.updateDynamic("body")(body.asInstanceOf[js.Any])
    if (cache != null) __obj.updateDynamic("cache")(cache.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(js.Any.fromFunction1(children))
    if (credentials != null) __obj.updateDynamic("credentials")(credentials.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (integrity != null) __obj.updateDynamic("integrity")(integrity.asInstanceOf[js.Any])
    if (!js.isUndefined(keepalive)) __obj.updateDynamic("keepalive")(keepalive.asInstanceOf[js.Any])
    if (!js.isUndefined(`lazy`)) __obj.updateDynamic("lazy")(`lazy`.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (redirect != null) __obj.updateDynamic("redirect")(redirect.asInstanceOf[js.Any])
    if (referrer != null) __obj.updateDynamic("referrer")(referrer.asInstanceOf[js.Any])
    if (referrerPolicy != null) __obj.updateDynamic("referrerPolicy")(referrerPolicy.asInstanceOf[js.Any])
    if (responseType != null) __obj.updateDynamic("responseType")(responseType.asInstanceOf[js.Any])
    if (signal != null) __obj.updateDynamic("signal")(signal.asInstanceOf[js.Any])
    if (transformData != null) __obj.updateDynamic("transformData")(js.Any.fromFunction1(transformData))
    if (window != null) __obj.updateDynamic("window")(window.asInstanceOf[js.Any])
    __obj.asInstanceOf[FetchProps[T]]
  }
}

