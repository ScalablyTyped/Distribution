package typings.sockjs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ServerOptions extends js.Object {
  var disconnect_delay: js.UndefOr[Double] = js.undefined
  var heartbeat_delay: js.UndefOr[Double] = js.undefined
  var jsessionid: js.UndefOr[js.Any] = js.undefined
  var log: js.UndefOr[js.Function2[/* severity */ String, /* message */ String, Unit]] = js.undefined
  var prefix: js.UndefOr[String] = js.undefined
  var response_limit: js.UndefOr[Double] = js.undefined
  var sockjs_url: js.UndefOr[String] = js.undefined
  var websocket: js.UndefOr[Boolean] = js.undefined
}

object ServerOptions {
  @scala.inline
  def apply(
    disconnect_delay: Int | Double = null,
    heartbeat_delay: Int | Double = null,
    jsessionid: js.Any = null,
    log: (/* severity */ String, /* message */ String) => Unit = null,
    prefix: String = null,
    response_limit: Int | Double = null,
    sockjs_url: String = null,
    websocket: js.UndefOr[Boolean] = js.undefined
  ): ServerOptions = {
    val __obj = js.Dynamic.literal()
    if (disconnect_delay != null) __obj.updateDynamic("disconnect_delay")(disconnect_delay.asInstanceOf[js.Any])
    if (heartbeat_delay != null) __obj.updateDynamic("heartbeat_delay")(heartbeat_delay.asInstanceOf[js.Any])
    if (jsessionid != null) __obj.updateDynamic("jsessionid")(jsessionid.asInstanceOf[js.Any])
    if (log != null) __obj.updateDynamic("log")(js.Any.fromFunction2(log))
    if (prefix != null) __obj.updateDynamic("prefix")(prefix.asInstanceOf[js.Any])
    if (response_limit != null) __obj.updateDynamic("response_limit")(response_limit.asInstanceOf[js.Any])
    if (sockjs_url != null) __obj.updateDynamic("sockjs_url")(sockjs_url.asInstanceOf[js.Any])
    if (!js.isUndefined(websocket)) __obj.updateDynamic("websocket")(websocket.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServerOptions]
  }
}

