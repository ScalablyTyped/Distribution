package typings.soupbintcp.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConnectionOptions extends js.Object {
  var heartbeatPacketType: PacketType
  var keepAliveMillis: js.UndefOr[Double] = js.undefined
  var rxTimeoutMillis: js.UndefOr[Double] = js.undefined
  var txIntervalMillis: js.UndefOr[Double] = js.undefined
}

object ConnectionOptions {
  @scala.inline
  def apply(
    heartbeatPacketType: PacketType,
    keepAliveMillis: js.UndefOr[Double] = js.undefined,
    rxTimeoutMillis: js.UndefOr[Double] = js.undefined,
    txIntervalMillis: js.UndefOr[Double] = js.undefined
  ): ConnectionOptions = {
    val __obj = js.Dynamic.literal(heartbeatPacketType = heartbeatPacketType.asInstanceOf[js.Any])
    if (!js.isUndefined(keepAliveMillis)) __obj.updateDynamic("keepAliveMillis")(keepAliveMillis.get.asInstanceOf[js.Any])
    if (!js.isUndefined(rxTimeoutMillis)) __obj.updateDynamic("rxTimeoutMillis")(rxTimeoutMillis.get.asInstanceOf[js.Any])
    if (!js.isUndefined(txIntervalMillis)) __obj.updateDynamic("txIntervalMillis")(txIntervalMillis.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConnectionOptions]
  }
}

