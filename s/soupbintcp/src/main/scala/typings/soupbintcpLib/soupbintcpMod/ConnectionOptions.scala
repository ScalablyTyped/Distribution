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

