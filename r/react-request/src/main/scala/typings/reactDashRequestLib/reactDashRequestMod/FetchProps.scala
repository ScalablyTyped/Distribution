package typings
package reactDashRequestLib.reactDashRequestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FetchProps[T] extends FetchRequestProps {
  var children: js.UndefOr[
    js.Function1[/* renderProps */ RenderProps[T], reactLib.reactMod.ReactNs.ReactNode]
  ] = js.undefined
}

object FetchProps {
  @scala.inline
  def apply[T](
    url: java.lang.String,
    body: stdLib.BodyInit = null,
    cache: stdLib.RequestCache = null,
    children: js.Function1[/* renderProps */ RenderProps[T], reactLib.reactMod.ReactNs.ReactNode] = null,
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
  ): FetchProps[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("url")(url)
    if (body != null) __obj.updateDynamic("body")(body.asInstanceOf[js.Any])
    if (cache != null) __obj.updateDynamic("cache")(cache)
    if (children != null) __obj.updateDynamic("children")(children)
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
    __obj.asInstanceOf[FetchProps[T]]
  }
}

