package typings.scBrokerCluster.mod

import typings.socketclusterServer.serverMod.AGServerOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SCBrokerClusterServerOptions extends js.Object {
  var appBrokerControllerPath: js.UndefOr[String] = js.undefined
  var brokerOptions: js.UndefOr[AGServerOptions] = js.undefined
  var brokers: js.Array[String]
  var debug: js.UndefOr[Boolean] = js.undefined
  var downgradeToUser: Double | String
  var expiryAccuracy: js.UndefOr[Double] = js.undefined
  var inspect: js.UndefOr[Boolean] = js.undefined
  var instanceId: js.UndefOr[String] = js.undefined
  var ipcAckTimeout: js.UndefOr[Double] = js.undefined
  var processTermTimeout: js.UndefOr[Double] = js.undefined
  var secretKey: js.UndefOr[String] = js.undefined
}

object SCBrokerClusterServerOptions {
  @scala.inline
  def apply(
    brokers: js.Array[String],
    downgradeToUser: Double | String,
    appBrokerControllerPath: String = null,
    brokerOptions: AGServerOptions = null,
    debug: js.UndefOr[Boolean] = js.undefined,
    expiryAccuracy: js.UndefOr[Double] = js.undefined,
    inspect: js.UndefOr[Boolean] = js.undefined,
    instanceId: String = null,
    ipcAckTimeout: js.UndefOr[Double] = js.undefined,
    processTermTimeout: js.UndefOr[Double] = js.undefined,
    secretKey: String = null
  ): SCBrokerClusterServerOptions = {
    val __obj = js.Dynamic.literal(brokers = brokers.asInstanceOf[js.Any], downgradeToUser = downgradeToUser.asInstanceOf[js.Any])
    if (appBrokerControllerPath != null) __obj.updateDynamic("appBrokerControllerPath")(appBrokerControllerPath.asInstanceOf[js.Any])
    if (brokerOptions != null) __obj.updateDynamic("brokerOptions")(brokerOptions.asInstanceOf[js.Any])
    if (!js.isUndefined(debug)) __obj.updateDynamic("debug")(debug.get.asInstanceOf[js.Any])
    if (!js.isUndefined(expiryAccuracy)) __obj.updateDynamic("expiryAccuracy")(expiryAccuracy.get.asInstanceOf[js.Any])
    if (!js.isUndefined(inspect)) __obj.updateDynamic("inspect")(inspect.get.asInstanceOf[js.Any])
    if (instanceId != null) __obj.updateDynamic("instanceId")(instanceId.asInstanceOf[js.Any])
    if (!js.isUndefined(ipcAckTimeout)) __obj.updateDynamic("ipcAckTimeout")(ipcAckTimeout.get.asInstanceOf[js.Any])
    if (!js.isUndefined(processTermTimeout)) __obj.updateDynamic("processTermTimeout")(processTermTimeout.get.asInstanceOf[js.Any])
    if (secretKey != null) __obj.updateDynamic("secretKey")(secretKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SCBrokerClusterServerOptions]
  }
}

