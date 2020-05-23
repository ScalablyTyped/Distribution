package typings.primus.mod

import typings.primus.anon.Factor
import typings.primus.primusStrings.disconnect
import typings.primus.primusStrings.online
import typings.primus.primusStrings.timeout
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SocketOptions extends js.Object {
  var manual: js.UndefOr[Boolean] = js.undefined
  var network: js.UndefOr[Boolean] = js.undefined
  var pingTimeout: js.UndefOr[Double] = js.undefined
  var queueSize: js.UndefOr[Double] = js.undefined
  // https://github.com/unshiftio/recovery
  var reconnect: js.UndefOr[Factor] = js.undefined
  var strategy: js.UndefOr[String | (js.Array[disconnect | online | timeout])] = js.undefined
  var timeout: js.UndefOr[Double] = js.undefined
  var transport: js.UndefOr[js.Object] = js.undefined
  var websockets: js.UndefOr[Boolean] = js.undefined
}

object SocketOptions {
  @scala.inline
  def apply(
    manual: js.UndefOr[Boolean] = js.undefined,
    network: js.UndefOr[Boolean] = js.undefined,
    pingTimeout: js.UndefOr[Double] = js.undefined,
    queueSize: js.UndefOr[Double] = js.undefined,
    reconnect: Factor = null,
    strategy: String | (js.Array[disconnect | online | timeout]) = null,
    timeout: js.UndefOr[Double] = js.undefined,
    transport: js.Object = null,
    websockets: js.UndefOr[Boolean] = js.undefined
  ): SocketOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(manual)) __obj.updateDynamic("manual")(manual.get.asInstanceOf[js.Any])
    if (!js.isUndefined(network)) __obj.updateDynamic("network")(network.get.asInstanceOf[js.Any])
    if (!js.isUndefined(pingTimeout)) __obj.updateDynamic("pingTimeout")(pingTimeout.get.asInstanceOf[js.Any])
    if (!js.isUndefined(queueSize)) __obj.updateDynamic("queueSize")(queueSize.get.asInstanceOf[js.Any])
    if (reconnect != null) __obj.updateDynamic("reconnect")(reconnect.asInstanceOf[js.Any])
    if (strategy != null) __obj.updateDynamic("strategy")(strategy.asInstanceOf[js.Any])
    if (!js.isUndefined(timeout)) __obj.updateDynamic("timeout")(timeout.get.asInstanceOf[js.Any])
    if (transport != null) __obj.updateDynamic("transport")(transport.asInstanceOf[js.Any])
    if (!js.isUndefined(websockets)) __obj.updateDynamic("websockets")(websockets.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SocketOptions]
  }
}

