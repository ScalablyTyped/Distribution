package typings
package reactDashNativeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RequestInit extends js.Object {
  var body: js.UndefOr[BodyInit_] = js.undefined
  var credentials: js.UndefOr[RequestCredentials_] = js.undefined
  var headers: js.UndefOr[HeadersInit_] = js.undefined
  var integrity: js.UndefOr[java.lang.String] = js.undefined
  var keepalive: js.UndefOr[scala.Boolean] = js.undefined
  var method: js.UndefOr[java.lang.String] = js.undefined
  var mode: js.UndefOr[RequestMode_] = js.undefined
  var referrer: js.UndefOr[java.lang.String] = js.undefined
  var window: js.UndefOr[js.Any] = js.undefined
}

object RequestInit {
  @scala.inline
  def apply(
    body: BodyInit_ = null,
    credentials: RequestCredentials_ = null,
    headers: HeadersInit_ = null,
    integrity: java.lang.String = null,
    keepalive: js.UndefOr[scala.Boolean] = js.undefined,
    method: java.lang.String = null,
    mode: RequestMode_ = null,
    referrer: java.lang.String = null,
    window: js.Any = null
  ): RequestInit = {
    val __obj = js.Dynamic.literal()
    if (body != null) __obj.updateDynamic("body")(body.asInstanceOf[js.Any])
    if (credentials != null) __obj.updateDynamic("credentials")(credentials)
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (integrity != null) __obj.updateDynamic("integrity")(integrity)
    if (!js.isUndefined(keepalive)) __obj.updateDynamic("keepalive")(keepalive)
    if (method != null) __obj.updateDynamic("method")(method)
    if (mode != null) __obj.updateDynamic("mode")(mode)
    if (referrer != null) __obj.updateDynamic("referrer")(referrer)
    if (window != null) __obj.updateDynamic("window")(window)
    __obj.asInstanceOf[RequestInit]
  }
}

