package typings
package sockjsLib.sockjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ServerOptions extends js.Object {
  var disconnect_delay: js.UndefOr[scala.Double] = js.undefined
  var heartbeat_delay: js.UndefOr[scala.Double] = js.undefined
  var jsessionid: js.UndefOr[js.Any] = js.undefined
  var log: js.UndefOr[
    js.Function2[/* severity */ java.lang.String, /* message */ java.lang.String, scala.Unit]
  ] = js.undefined
  var prefix: js.UndefOr[java.lang.String] = js.undefined
  var response_limit: js.UndefOr[scala.Double] = js.undefined
  var sockjs_url: js.UndefOr[java.lang.String] = js.undefined
  var websocket: js.UndefOr[scala.Boolean] = js.undefined
}

object ServerOptions {
  @scala.inline
  def apply(
    disconnect_delay: scala.Int | scala.Double = null,
    heartbeat_delay: scala.Int | scala.Double = null,
    jsessionid: js.Any = null,
    log: (/* severity */ java.lang.String, /* message */ java.lang.String) => scala.Unit = null,
    prefix: java.lang.String = null,
    response_limit: scala.Int | scala.Double = null,
    sockjs_url: java.lang.String = null,
    websocket: js.UndefOr[scala.Boolean] = js.undefined
  ): ServerOptions = {
    val __obj = js.Dynamic.literal()
    if (disconnect_delay != null) __obj.updateDynamic("disconnect_delay")(disconnect_delay.asInstanceOf[js.Any])
    if (heartbeat_delay != null) __obj.updateDynamic("heartbeat_delay")(heartbeat_delay.asInstanceOf[js.Any])
    if (jsessionid != null) __obj.updateDynamic("jsessionid")(jsessionid)
    if (log != null) __obj.updateDynamic("log")(js.Any.fromFunction2(log))
    if (prefix != null) __obj.updateDynamic("prefix")(prefix)
    if (response_limit != null) __obj.updateDynamic("response_limit")(response_limit.asInstanceOf[js.Any])
    if (sockjs_url != null) __obj.updateDynamic("sockjs_url")(sockjs_url)
    if (!js.isUndefined(websocket)) __obj.updateDynamic("websocket")(websocket)
    __obj.asInstanceOf[ServerOptions]
  }
}

