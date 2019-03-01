package typings
package soupbintcpLib.soupbintcpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConnectionOptions extends js.Object {
  var heartbeatPacketType: PacketType
  var keepAliveMillis: js.UndefOr[scala.Double] = js.undefined
  var rxTimeoutMillis: js.UndefOr[scala.Double] = js.undefined
  var txIntervalMillis: js.UndefOr[scala.Double] = js.undefined
}

object ConnectionOptions {
  @scala.inline
  def apply(
    heartbeatPacketType: PacketType,
    keepAliveMillis: scala.Int | scala.Double = null,
    rxTimeoutMillis: scala.Int | scala.Double = null,
    txIntervalMillis: scala.Int | scala.Double = null
  ): ConnectionOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("heartbeatPacketType")(heartbeatPacketType)
    if (keepAliveMillis != null) __obj.updateDynamic("keepAliveMillis")(keepAliveMillis.asInstanceOf[js.Any])
    if (rxTimeoutMillis != null) __obj.updateDynamic("rxTimeoutMillis")(rxTimeoutMillis.asInstanceOf[js.Any])
    if (txIntervalMillis != null) __obj.updateDynamic("txIntervalMillis")(txIntervalMillis.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConnectionOptions]
  }
}

