package typings.sccDashBrokerDashClient.sccDashBrokerDashClientMod

import typings.jsonwebtoken.jsonwebtokenMod.Secret
import typings.sccDashBrokerDashClient.sccDashBrokerDashClientStrings.simple
import typings.sccDashBrokerDashClient.sccDashBrokerDashClientStrings.skeletonRendezvous
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SCCBrokerClientOptions extends js.Object {
  var authKey: js.UndefOr[Secret] = js.undefined
  var brokerRetryDelay: js.UndefOr[Double] = js.undefined
  var clientPoolSize: js.UndefOr[Double] = js.undefined
  var mappingEngine: js.UndefOr[skeletonRendezvous | simple | MappingEngine] = js.undefined
  var noErrorLogging: js.UndefOr[Boolean] = js.undefined
  var stateServerAckTimeout: js.UndefOr[Double] = js.undefined
  var stateServerConnectTimeout: js.UndefOr[Double] = js.undefined
  var stateServerHost: String
  var stateServerPort: js.UndefOr[Double] = js.undefined
  var stateServerReconnectRandomness: js.UndefOr[Double] = js.undefined
}

object SCCBrokerClientOptions {
  @scala.inline
  def apply(
    stateServerHost: String,
    authKey: Secret = null,
    brokerRetryDelay: Int | Double = null,
    clientPoolSize: Int | Double = null,
    mappingEngine: skeletonRendezvous | simple | MappingEngine = null,
    noErrorLogging: js.UndefOr[Boolean] = js.undefined,
    stateServerAckTimeout: Int | Double = null,
    stateServerConnectTimeout: Int | Double = null,
    stateServerPort: Int | Double = null,
    stateServerReconnectRandomness: Int | Double = null
  ): SCCBrokerClientOptions = {
    val __obj = js.Dynamic.literal(stateServerHost = stateServerHost.asInstanceOf[js.Any])
    if (authKey != null) __obj.updateDynamic("authKey")(authKey.asInstanceOf[js.Any])
    if (brokerRetryDelay != null) __obj.updateDynamic("brokerRetryDelay")(brokerRetryDelay.asInstanceOf[js.Any])
    if (clientPoolSize != null) __obj.updateDynamic("clientPoolSize")(clientPoolSize.asInstanceOf[js.Any])
    if (mappingEngine != null) __obj.updateDynamic("mappingEngine")(mappingEngine.asInstanceOf[js.Any])
    if (!js.isUndefined(noErrorLogging)) __obj.updateDynamic("noErrorLogging")(noErrorLogging.asInstanceOf[js.Any])
    if (stateServerAckTimeout != null) __obj.updateDynamic("stateServerAckTimeout")(stateServerAckTimeout.asInstanceOf[js.Any])
    if (stateServerConnectTimeout != null) __obj.updateDynamic("stateServerConnectTimeout")(stateServerConnectTimeout.asInstanceOf[js.Any])
    if (stateServerPort != null) __obj.updateDynamic("stateServerPort")(stateServerPort.asInstanceOf[js.Any])
    if (stateServerReconnectRandomness != null) __obj.updateDynamic("stateServerReconnectRandomness")(stateServerReconnectRandomness.asInstanceOf[js.Any])
    __obj.asInstanceOf[SCCBrokerClientOptions]
  }
}

