package typings
package sipDotJsLib.libWebTransportMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Configuration extends js.Object {
  var connectionTimeout: scala.Double
  var keepAliveDebounce: scala.Double
  var keepAliveInterval: scala.Double
  var maxReconnectionAttempts: scala.Double
  var reconnectionTimeout: scala.Double
  var traceSip: scala.Boolean
  var wsServers: js.Array[WsServer]
}

object Configuration {
  @scala.inline
  def apply(
    connectionTimeout: scala.Double,
    keepAliveDebounce: scala.Double,
    keepAliveInterval: scala.Double,
    maxReconnectionAttempts: scala.Double,
    reconnectionTimeout: scala.Double,
    traceSip: scala.Boolean,
    wsServers: js.Array[WsServer]
  ): Configuration = {
    val __obj = js.Dynamic.literal(connectionTimeout = connectionTimeout, keepAliveDebounce = keepAliveDebounce, keepAliveInterval = keepAliveInterval, maxReconnectionAttempts = maxReconnectionAttempts, reconnectionTimeout = reconnectionTimeout, traceSip = traceSip, wsServers = wsServers)
  
    __obj.asInstanceOf[Configuration]
  }
}

