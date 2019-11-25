package typings.sipDotJs.libWebTransportMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Configuration extends js.Object {
  var connectionTimeout: Double
  var keepAliveDebounce: Double
  var keepAliveInterval: Double
  var maxReconnectionAttempts: Double
  var reconnectionTimeout: Double
  var traceSip: Boolean
  var wsServers: js.Array[WsServer]
}

object Configuration {
  @scala.inline
  def apply(
    connectionTimeout: Double,
    keepAliveDebounce: Double,
    keepAliveInterval: Double,
    maxReconnectionAttempts: Double,
    reconnectionTimeout: Double,
    traceSip: Boolean,
    wsServers: js.Array[WsServer]
  ): Configuration = {
    val __obj = js.Dynamic.literal(connectionTimeout = connectionTimeout.asInstanceOf[js.Any], keepAliveDebounce = keepAliveDebounce.asInstanceOf[js.Any], keepAliveInterval = keepAliveInterval.asInstanceOf[js.Any], maxReconnectionAttempts = maxReconnectionAttempts.asInstanceOf[js.Any], reconnectionTimeout = reconnectionTimeout.asInstanceOf[js.Any], traceSip = traceSip.asInstanceOf[js.Any], wsServers = wsServers.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Configuration]
  }
}

