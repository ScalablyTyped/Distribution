package typings.scBroker.mod

import typings.scBroker.scbrokerMod.SCBrokerOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SCBrokerServerOptions extends js.Object {
  var brokerControllerPath: js.UndefOr[String] = js.undefined
  var brokerOptions: js.UndefOr[SCBrokerOptions] = js.undefined
  var debug: js.UndefOr[Boolean] = js.undefined
  var downgradeToUser: js.UndefOr[Double | String] = js.undefined
  var expiryAccuracy: js.UndefOr[Double] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var inspect: js.UndefOr[Boolean] = js.undefined
  var instanceId: js.UndefOr[String] = js.undefined
  var ipcAckTimeout: js.UndefOr[Double] = js.undefined
  var port: js.UndefOr[Double] = js.undefined
  var processTermTimeout: js.UndefOr[Double] = js.undefined
  var secretKey: js.UndefOr[String] = js.undefined
  var socketPath: js.UndefOr[String] = js.undefined
}

object SCBrokerServerOptions {
  @scala.inline
  def apply(
    brokerControllerPath: String = null,
    brokerOptions: SCBrokerOptions = null,
    debug: js.UndefOr[Boolean] = js.undefined,
    downgradeToUser: Double | String = null,
    expiryAccuracy: js.UndefOr[Double] = js.undefined,
    id: String = null,
    inspect: js.UndefOr[Boolean] = js.undefined,
    instanceId: String = null,
    ipcAckTimeout: js.UndefOr[Double] = js.undefined,
    port: js.UndefOr[Double] = js.undefined,
    processTermTimeout: js.UndefOr[Double] = js.undefined,
    secretKey: String = null,
    socketPath: String = null
  ): SCBrokerServerOptions = {
    val __obj = js.Dynamic.literal()
    if (brokerControllerPath != null) __obj.updateDynamic("brokerControllerPath")(brokerControllerPath.asInstanceOf[js.Any])
    if (brokerOptions != null) __obj.updateDynamic("brokerOptions")(brokerOptions.asInstanceOf[js.Any])
    if (!js.isUndefined(debug)) __obj.updateDynamic("debug")(debug.get.asInstanceOf[js.Any])
    if (downgradeToUser != null) __obj.updateDynamic("downgradeToUser")(downgradeToUser.asInstanceOf[js.Any])
    if (!js.isUndefined(expiryAccuracy)) __obj.updateDynamic("expiryAccuracy")(expiryAccuracy.get.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (!js.isUndefined(inspect)) __obj.updateDynamic("inspect")(inspect.get.asInstanceOf[js.Any])
    if (instanceId != null) __obj.updateDynamic("instanceId")(instanceId.asInstanceOf[js.Any])
    if (!js.isUndefined(ipcAckTimeout)) __obj.updateDynamic("ipcAckTimeout")(ipcAckTimeout.get.asInstanceOf[js.Any])
    if (!js.isUndefined(port)) __obj.updateDynamic("port")(port.get.asInstanceOf[js.Any])
    if (!js.isUndefined(processTermTimeout)) __obj.updateDynamic("processTermTimeout")(processTermTimeout.get.asInstanceOf[js.Any])
    if (secretKey != null) __obj.updateDynamic("secretKey")(secretKey.asInstanceOf[js.Any])
    if (socketPath != null) __obj.updateDynamic("socketPath")(socketPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[SCBrokerServerOptions]
  }
}

