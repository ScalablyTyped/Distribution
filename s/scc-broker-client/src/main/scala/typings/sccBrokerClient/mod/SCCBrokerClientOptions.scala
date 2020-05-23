package typings.sccBrokerClient.mod

import typings.jsonwebtoken.mod.Secret
import typings.sccBrokerClient.sccBrokerClientStrings.simple
import typings.sccBrokerClient.sccBrokerClientStrings.skeletonRendezvous
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SCCBrokerClientOptions extends js.Object {
  var authKey: js.UndefOr[Secret] = js.undefined
  var brokerRetryDelay: js.UndefOr[Double] = js.undefined
  var clientPoolSize: js.UndefOr[Double] = js.undefined
  var instanceId: js.UndefOr[String] = js.undefined
  var instanceIp: js.UndefOr[String] = js.undefined
  var instanceIpFamily: js.UndefOr[String] = js.undefined
  var instancePort: js.UndefOr[Double] = js.undefined
  var mappingEngine: js.UndefOr[skeletonRendezvous | simple | MappingEngine] = js.undefined
  var noErrorLogging: js.UndefOr[Boolean] = js.undefined
  var pubSubBatchDuration: js.UndefOr[Double] = js.undefined
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
    brokerRetryDelay: js.UndefOr[Double] = js.undefined,
    clientPoolSize: js.UndefOr[Double] = js.undefined,
    instanceId: String = null,
    instanceIp: String = null,
    instanceIpFamily: String = null,
    instancePort: js.UndefOr[Double] = js.undefined,
    mappingEngine: skeletonRendezvous | simple | MappingEngine = null,
    noErrorLogging: js.UndefOr[Boolean] = js.undefined,
    pubSubBatchDuration: js.UndefOr[Double] = js.undefined,
    stateServerAckTimeout: js.UndefOr[Double] = js.undefined,
    stateServerConnectTimeout: js.UndefOr[Double] = js.undefined,
    stateServerPort: js.UndefOr[Double] = js.undefined,
    stateServerReconnectRandomness: js.UndefOr[Double] = js.undefined
  ): SCCBrokerClientOptions = {
    val __obj = js.Dynamic.literal(stateServerHost = stateServerHost.asInstanceOf[js.Any])
    if (authKey != null) __obj.updateDynamic("authKey")(authKey.asInstanceOf[js.Any])
    if (!js.isUndefined(brokerRetryDelay)) __obj.updateDynamic("brokerRetryDelay")(brokerRetryDelay.get.asInstanceOf[js.Any])
    if (!js.isUndefined(clientPoolSize)) __obj.updateDynamic("clientPoolSize")(clientPoolSize.get.asInstanceOf[js.Any])
    if (instanceId != null) __obj.updateDynamic("instanceId")(instanceId.asInstanceOf[js.Any])
    if (instanceIp != null) __obj.updateDynamic("instanceIp")(instanceIp.asInstanceOf[js.Any])
    if (instanceIpFamily != null) __obj.updateDynamic("instanceIpFamily")(instanceIpFamily.asInstanceOf[js.Any])
    if (!js.isUndefined(instancePort)) __obj.updateDynamic("instancePort")(instancePort.get.asInstanceOf[js.Any])
    if (mappingEngine != null) __obj.updateDynamic("mappingEngine")(mappingEngine.asInstanceOf[js.Any])
    if (!js.isUndefined(noErrorLogging)) __obj.updateDynamic("noErrorLogging")(noErrorLogging.get.asInstanceOf[js.Any])
    if (!js.isUndefined(pubSubBatchDuration)) __obj.updateDynamic("pubSubBatchDuration")(pubSubBatchDuration.get.asInstanceOf[js.Any])
    if (!js.isUndefined(stateServerAckTimeout)) __obj.updateDynamic("stateServerAckTimeout")(stateServerAckTimeout.get.asInstanceOf[js.Any])
    if (!js.isUndefined(stateServerConnectTimeout)) __obj.updateDynamic("stateServerConnectTimeout")(stateServerConnectTimeout.get.asInstanceOf[js.Any])
    if (!js.isUndefined(stateServerPort)) __obj.updateDynamic("stateServerPort")(stateServerPort.get.asInstanceOf[js.Any])
    if (!js.isUndefined(stateServerReconnectRandomness)) __obj.updateDynamic("stateServerReconnectRandomness")(stateServerReconnectRandomness.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SCCBrokerClientOptions]
  }
}

