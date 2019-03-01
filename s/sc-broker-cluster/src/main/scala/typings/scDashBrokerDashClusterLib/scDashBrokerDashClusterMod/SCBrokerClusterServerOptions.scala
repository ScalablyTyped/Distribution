package typings
package scDashBrokerDashClusterLib.scDashBrokerDashClusterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SCBrokerClusterServerOptions extends js.Object {
  var appBrokerControllerPath: js.UndefOr[java.lang.String] = js.undefined
  var brokerOptions: js.UndefOr[socketclusterDashServerLib.scserverMod.SCServerNs.SCServerOptions] = js.undefined
  var brokers: js.Array[java.lang.String]
  var debug: js.UndefOr[scala.Boolean] = js.undefined
  var downgradeToUser: scala.Double | java.lang.String
  var expiryAccuracy: js.UndefOr[scala.Double] = js.undefined
  var inspect: js.UndefOr[scala.Boolean] = js.undefined
  var instanceId: js.UndefOr[java.lang.String] = js.undefined
  var ipcAckTimeout: js.UndefOr[scala.Double] = js.undefined
  var processTermTimeout: js.UndefOr[scala.Double] = js.undefined
  var secretKey: js.UndefOr[java.lang.String] = js.undefined
}

object SCBrokerClusterServerOptions {
  @scala.inline
  def apply(
    brokers: js.Array[java.lang.String],
    downgradeToUser: scala.Double | java.lang.String,
    appBrokerControllerPath: java.lang.String = null,
    brokerOptions: socketclusterDashServerLib.scserverMod.SCServerNs.SCServerOptions = null,
    debug: js.UndefOr[scala.Boolean] = js.undefined,
    expiryAccuracy: scala.Int | scala.Double = null,
    inspect: js.UndefOr[scala.Boolean] = js.undefined,
    instanceId: java.lang.String = null,
    ipcAckTimeout: scala.Int | scala.Double = null,
    processTermTimeout: scala.Int | scala.Double = null,
    secretKey: java.lang.String = null
  ): SCBrokerClusterServerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("brokers")(brokers)
    __obj.updateDynamic("downgradeToUser")(downgradeToUser.asInstanceOf[js.Any])
    if (appBrokerControllerPath != null) __obj.updateDynamic("appBrokerControllerPath")(appBrokerControllerPath)
    if (brokerOptions != null) __obj.updateDynamic("brokerOptions")(brokerOptions)
    if (!js.isUndefined(debug)) __obj.updateDynamic("debug")(debug)
    if (expiryAccuracy != null) __obj.updateDynamic("expiryAccuracy")(expiryAccuracy.asInstanceOf[js.Any])
    if (!js.isUndefined(inspect)) __obj.updateDynamic("inspect")(inspect)
    if (instanceId != null) __obj.updateDynamic("instanceId")(instanceId)
    if (ipcAckTimeout != null) __obj.updateDynamic("ipcAckTimeout")(ipcAckTimeout.asInstanceOf[js.Any])
    if (processTermTimeout != null) __obj.updateDynamic("processTermTimeout")(processTermTimeout.asInstanceOf[js.Any])
    if (secretKey != null) __obj.updateDynamic("secretKey")(secretKey)
    __obj.asInstanceOf[SCBrokerClusterServerOptions]
  }
}

