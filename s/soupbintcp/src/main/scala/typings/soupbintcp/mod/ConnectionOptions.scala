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
    keepAliveMillis: Int | Double = null,
    rxTimeoutMillis: Int | Double = null,
    txIntervalMillis: Int | Double = null
  ): ConnectionOptions = {
    val __obj = js.Dynamic.literal(heartbeatPacketType = heartbeatPacketType.asInstanceOf[js.Any])
    if (keepAliveMillis != null) __obj.updateDynamic("keepAliveMillis")(keepAliveMillis.asInstanceOf[js.Any])
    if (rxTimeoutMillis != null) __obj.updateDynamic("rxTimeoutMillis")(rxTimeoutMillis.asInstanceOf[js.Any])
    if (txIntervalMillis != null) __obj.updateDynamic("txIntervalMillis")(txIntervalMillis.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConnectionOptions]
  }
}

