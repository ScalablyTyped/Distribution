package typings
package signalrLib.SignalRNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConnectionOptions extends js.Object {
  var callback: js.UndefOr[js.Function] = js.undefined
  var jsonp: js.UndefOr[scala.Boolean] = js.undefined
  var pingInterval: js.UndefOr[scala.Double] = js.undefined
  var transport: js.UndefOr[java.lang.String | js.Array[java.lang.String] | Transport] = js.undefined
  var waitForPageLoad: js.UndefOr[scala.Boolean] = js.undefined
  var withCredentials: js.UndefOr[scala.Boolean] = js.undefined
}

object ConnectionOptions {
  @scala.inline
  def apply(
    callback: js.Function = null,
    jsonp: js.UndefOr[scala.Boolean] = js.undefined,
    pingInterval: scala.Int | scala.Double = null,
    transport: java.lang.String | js.Array[java.lang.String] | Transport = null,
    waitForPageLoad: js.UndefOr[scala.Boolean] = js.undefined,
    withCredentials: js.UndefOr[scala.Boolean] = js.undefined
  ): ConnectionOptions = {
    val __obj = js.Dynamic.literal()
    if (callback != null) __obj.updateDynamic("callback")(callback)
    if (!js.isUndefined(jsonp)) __obj.updateDynamic("jsonp")(jsonp)
    if (pingInterval != null) __obj.updateDynamic("pingInterval")(pingInterval.asInstanceOf[js.Any])
    if (transport != null) __obj.updateDynamic("transport")(transport.asInstanceOf[js.Any])
    if (!js.isUndefined(waitForPageLoad)) __obj.updateDynamic("waitForPageLoad")(waitForPageLoad)
    if (!js.isUndefined(withCredentials)) __obj.updateDynamic("withCredentials")(withCredentials)
    __obj.asInstanceOf[ConnectionOptions]
  }
}

