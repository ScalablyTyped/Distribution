package typings.sipDotJs.libPlatformWebTransportMod

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
    * If true, messsages sent and received by the transport are logged.
    * @defaultValue `true`
    */
  var traceSip: js.UndefOr[Boolean] = js.undefined
}

object TransportOptions {
  @scala.inline
  def apply(
    server: String,
    connectionTimeout: Int | Double = null,
    keepAliveDebounce: Int | Double = null,
    keepAliveInterval: Int | Double = null,
    traceSip: js.UndefOr[Boolean] = js.undefined
  ): TransportOptions = {
    val __obj = js.Dynamic.literal(server = server.asInstanceOf[js.Any])
    if (connectionTimeout != null) __obj.updateDynamic("connectionTimeout")(connectionTimeout.asInstanceOf[js.Any])
    if (keepAliveDebounce != null) __obj.updateDynamic("keepAliveDebounce")(keepAliveDebounce.asInstanceOf[js.Any])
    if (keepAliveInterval != null) __obj.updateDynamic("keepAliveInterval")(keepAliveInterval.asInstanceOf[js.Any])
    if (!js.isUndefined(traceSip)) __obj.updateDynamic("traceSip")(traceSip.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransportOptions]
  }
}

