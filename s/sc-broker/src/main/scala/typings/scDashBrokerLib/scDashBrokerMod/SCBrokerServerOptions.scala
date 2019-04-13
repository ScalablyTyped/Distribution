package typings
package scDashBrokerLib.scDashBrokerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SCBrokerServerOptions extends js.Object {
  var brokerControllerPath: js.UndefOr[java.lang.String] = js.undefined
  var brokerOptions: js.UndefOr[scDashBrokerLib.scbrokerMod.SCBrokerOptions] = js.undefined
  var debug: js.UndefOr[scala.Boolean] = js.undefined
  var downgradeToUser: scala.Double | java.lang.String
  var expiryAccuracy: js.UndefOr[scala.Double] = js.undefined
  var id: js.UndefOr[java.lang.String] = js.undefined
  var inspect: js.UndefOr[scala.Boolean] = js.undefined
  var instanceId: js.UndefOr[java.lang.String] = js.undefined
  var ipcAckTimeout: js.UndefOr[scala.Double] = js.undefined
  var port: js.UndefOr[scala.Double] = js.undefined
  var processTermTimeout: js.UndefOr[scala.Double] = js.undefined
  var secretKey: js.UndefOr[java.lang.String] = js.undefined
  var socketPath: js.UndefOr[java.lang.String] = js.undefined
}

object SCBrokerServerOptions {
  @scala.inline
  def apply(
    downgradeToUser: scala.Double | java.lang.String,
    brokerControllerPath: java.lang.String = null,
    brokerOptions: scDashBrokerLib.scbrokerMod.SCBrokerOptions = null,
    debug: js.UndefOr[scala.Boolean] = js.undefined,
    expiryAccuracy: scala.Int | scala.Double = null,
    id: java.lang.String = null,
    inspect: js.UndefOr[scala.Boolean] = js.undefined,
    instanceId: java.lang.String = null,
    ipcAckTimeout: scala.Int | scala.Double = null,
    port: scala.Int | scala.Double = null,
    processTermTimeout: scala.Int | scala.Double = null,
    secretKey: java.lang.String = null,
    socketPath: java.lang.String = null
  ): SCBrokerServerOptions = {
    val __obj = js.Dynamic.literal(downgradeToUser = downgradeToUser.asInstanceOf[js.Any])
    if (brokerControllerPath != null) __obj.updateDynamic("brokerControllerPath")(brokerControllerPath)
    if (brokerOptions != null) __obj.updateDynamic("brokerOptions")(brokerOptions)
    if (!js.isUndefined(debug)) __obj.updateDynamic("debug")(debug)
    if (expiryAccuracy != null) __obj.updateDynamic("expiryAccuracy")(expiryAccuracy.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id)
    if (!js.isUndefined(inspect)) __obj.updateDynamic("inspect")(inspect)
    if (instanceId != null) __obj.updateDynamic("instanceId")(instanceId)
    if (ipcAckTimeout != null) __obj.updateDynamic("ipcAckTimeout")(ipcAckTimeout.asInstanceOf[js.Any])
    if (port != null) __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
    if (processTermTimeout != null) __obj.updateDynamic("processTermTimeout")(processTermTimeout.asInstanceOf[js.Any])
    if (secretKey != null) __obj.updateDynamic("secretKey")(secretKey)
    if (socketPath != null) __obj.updateDynamic("socketPath")(socketPath)
    __obj.asInstanceOf[SCBrokerServerOptions]
  }
}

