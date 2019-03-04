package typings
package sccDashBrokerDashClientLib.sccDashBrokerDashClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SCCBrokerClientOptions extends js.Object {
  var authKey: js.UndefOr[jsonwebtokenLib.jsonwebtokenMod.Secret] = js.undefined
  var brokerRetryDelay: js.UndefOr[scala.Double] = js.undefined
  var clientPoolSize: js.UndefOr[scala.Double] = js.undefined
  var mappingEngine: js.UndefOr[
    sccDashBrokerDashClientLib.sccDashBrokerDashClientLibStrings.skeletonRendezvous | sccDashBrokerDashClientLib.sccDashBrokerDashClientLibStrings.simple | MappingEngine
  ] = js.undefined
  var noErrorLogging: js.UndefOr[scala.Boolean] = js.undefined
  var stateServerAckTimeout: js.UndefOr[scala.Double] = js.undefined
  var stateServerConnectTimeout: js.UndefOr[scala.Double] = js.undefined
  var stateServerHost: java.lang.String
  var stateServerPort: js.UndefOr[scala.Double] = js.undefined
  var stateServerReconnectRandomness: js.UndefOr[scala.Double] = js.undefined
}

object SCCBrokerClientOptions {
  @scala.inline
  def apply(
    stateServerHost: java.lang.String,
    authKey: jsonwebtokenLib.jsonwebtokenMod.Secret = null,
    brokerRetryDelay: scala.Int | scala.Double = null,
    clientPoolSize: scala.Int | scala.Double = null,
    mappingEngine: sccDashBrokerDashClientLib.sccDashBrokerDashClientLibStrings.skeletonRendezvous | sccDashBrokerDashClientLib.sccDashBrokerDashClientLibStrings.simple | MappingEngine = null,
    noErrorLogging: js.UndefOr[scala.Boolean] = js.undefined,
    stateServerAckTimeout: scala.Int | scala.Double = null,
    stateServerConnectTimeout: scala.Int | scala.Double = null,
    stateServerPort: scala.Int | scala.Double = null,
    stateServerReconnectRandomness: scala.Int | scala.Double = null
  ): SCCBrokerClientOptions = {
    val __obj = js.Dynamic.literal(stateServerHost = stateServerHost)
    if (authKey != null) __obj.updateDynamic("authKey")(authKey.asInstanceOf[js.Any])
    if (brokerRetryDelay != null) __obj.updateDynamic("brokerRetryDelay")(brokerRetryDelay.asInstanceOf[js.Any])
    if (clientPoolSize != null) __obj.updateDynamic("clientPoolSize")(clientPoolSize.asInstanceOf[js.Any])
    if (mappingEngine != null) __obj.updateDynamic("mappingEngine")(mappingEngine.asInstanceOf[js.Any])
    if (!js.isUndefined(noErrorLogging)) __obj.updateDynamic("noErrorLogging")(noErrorLogging)
    if (stateServerAckTimeout != null) __obj.updateDynamic("stateServerAckTimeout")(stateServerAckTimeout.asInstanceOf[js.Any])
    if (stateServerConnectTimeout != null) __obj.updateDynamic("stateServerConnectTimeout")(stateServerConnectTimeout.asInstanceOf[js.Any])
    if (stateServerPort != null) __obj.updateDynamic("stateServerPort")(stateServerPort.asInstanceOf[js.Any])
    if (stateServerReconnectRandomness != null) __obj.updateDynamic("stateServerReconnectRandomness")(stateServerReconnectRandomness.asInstanceOf[js.Any])
    __obj.asInstanceOf[SCCBrokerClientOptions]
  }
}

