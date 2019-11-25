package typings.reactDashNative

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RequestInit extends js.Object {
  var body: js.UndefOr[BodyInit_] = js.undefined
  var credentials: js.UndefOr[RequestCredentials_] = js.undefined
  var headers: js.UndefOr[HeadersInit_] = js.undefined
  var integrity: js.UndefOr[String] = js.undefined
  var keepalive: js.UndefOr[Boolean] = js.undefined
  var method: js.UndefOr[String] = js.undefined
  var mode: js.UndefOr[RequestMode_] = js.undefined
  var referrer: js.UndefOr[String] = js.undefined
  var window: js.UndefOr[js.Any] = js.undefined
}

object RequestInit {
  @scala.inline
  def apply(
    body: BodyInit_ = null,
    credentials: RequestCredentials_ = null,
    headers: HeadersInit_ = null,
    integrity: String = null,
    keepalive: js.UndefOr[Boolean] = js.undefined,
    method: String = null,
    mode: RequestMode_ = null,
    referrer: String = null,
    window: js.Any = null
  ): RequestInit = {
    val __obj = js.Dynamic.literal()
    if (body != null) __obj.updateDynamic("body")(body.asInstanceOf[js.Any])
    if (credentials != null) __obj.updateDynamic("credentials")(credentials.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (integrity != null) __obj.updateDynamic("integrity")(integrity.asInstanceOf[js.Any])
    if (!js.isUndefined(keepalive)) __obj.updateDynamic("keepalive")(keepalive.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (referrer != null) __obj.updateDynamic("referrer")(referrer.asInstanceOf[js.Any])
    if (window != null) __obj.updateDynamic("window")(window.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestInit]
  }
}

