package typings.signalr.SignalR

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConnectionOptions extends js.Object {
  var callback: js.UndefOr[js.Function] = js.undefined
  var jsonp: js.UndefOr[Boolean] = js.undefined
  var pingInterval: js.UndefOr[Double] = js.undefined
  var transport: js.UndefOr[String | js.Array[String] | Transport] = js.undefined
  var waitForPageLoad: js.UndefOr[Boolean] = js.undefined
  var withCredentials: js.UndefOr[Boolean] = js.undefined
}

object ConnectionOptions {
  @scala.inline
  def apply(
    callback: js.Function = null,
    jsonp: js.UndefOr[Boolean] = js.undefined,
    pingInterval: js.UndefOr[Double] = js.undefined,
    transport: String | js.Array[String] | Transport = null,
    waitForPageLoad: js.UndefOr[Boolean] = js.undefined,
    withCredentials: js.UndefOr[Boolean] = js.undefined
  ): ConnectionOptions = {
    val __obj = js.Dynamic.literal()
    if (callback != null) __obj.updateDynamic("callback")(callback.asInstanceOf[js.Any])
    if (!js.isUndefined(jsonp)) __obj.updateDynamic("jsonp")(jsonp.get.asInstanceOf[js.Any])
    if (!js.isUndefined(pingInterval)) __obj.updateDynamic("pingInterval")(pingInterval.get.asInstanceOf[js.Any])
    if (transport != null) __obj.updateDynamic("transport")(transport.asInstanceOf[js.Any])
    if (!js.isUndefined(waitForPageLoad)) __obj.updateDynamic("waitForPageLoad")(waitForPageLoad.get.asInstanceOf[js.Any])
    if (!js.isUndefined(withCredentials)) __obj.updateDynamic("withCredentials")(withCredentials.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConnectionOptions]
  }
}

