package typings.sipJs.webTransportMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TransportOptions extends js.Object {
  /**
    * Seconds to wait for WebSocket to connect before giving up.
    * @defaultValue `5`
    */
  var connectionTimeout: js.UndefOr[Double] = js.undefined
  /**
    * Keep alive - needs review.
    * @internal
    */
  var keepAliveDebounce: js.UndefOr[Double] = js.undefined
  /**
    * Keep alive - needs review.
    * @internal
    */
  var keepAliveInterval: js.UndefOr[Double] = js.undefined
  /**
    * URL of WebSocket server to connect with. For example, "wss://localhost:8080".
    */
  var server: String
  /**
    * If true, messages sent and received by the transport are logged.
    * @defaultValue `true`
    */
  var traceSip: js.UndefOr[Boolean] = js.undefined
}

object TransportOptions {
  @scala.inline
  def apply(
    server: String,
    connectionTimeout: js.UndefOr[Double] = js.undefined,
    keepAliveDebounce: js.UndefOr[Double] = js.undefined,
    keepAliveInterval: js.UndefOr[Double] = js.undefined,
    traceSip: js.UndefOr[Boolean] = js.undefined
  ): TransportOptions = {
    val __obj = js.Dynamic.literal(server = server.asInstanceOf[js.Any])
    if (!js.isUndefined(connectionTimeout)) __obj.updateDynamic("connectionTimeout")(connectionTimeout.get.asInstanceOf[js.Any])
    if (!js.isUndefined(keepAliveDebounce)) __obj.updateDynamic("keepAliveDebounce")(keepAliveDebounce.get.asInstanceOf[js.Any])
    if (!js.isUndefined(keepAliveInterval)) __obj.updateDynamic("keepAliveInterval")(keepAliveInterval.get.asInstanceOf[js.Any])
    if (!js.isUndefined(traceSip)) __obj.updateDynamic("traceSip")(traceSip.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransportOptions]
  }
}

