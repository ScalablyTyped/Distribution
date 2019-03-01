package typings
package scDashBrokerLib.scDashBrokerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SCBrokerClientOptions extends js.Object {
  var autoReconnect: js.UndefOr[scala.Boolean] = js.undefined
  var autoReconnectOptions: js.UndefOr[AutoReconnectOptions] = js.undefined
  var connectRetryErrorThreshold: js.UndefOr[scala.Double] = js.undefined
  var host: js.UndefOr[java.lang.String] = js.undefined
  var port: js.UndefOr[scala.Double] = js.undefined
  var pubSubBatchDuration: js.UndefOr[scala.Double] = js.undefined
  var secretKey: js.UndefOr[java.lang.String] = js.undefined
  var socketPath: js.UndefOr[java.lang.String] = js.undefined
  var timeout: js.UndefOr[scala.Double] = js.undefined
}

object SCBrokerClientOptions {
  @scala.inline
  def apply(
    autoReconnect: js.UndefOr[scala.Boolean] = js.undefined,
    autoReconnectOptions: AutoReconnectOptions = null,
    connectRetryErrorThreshold: scala.Int | scala.Double = null,
    host: java.lang.String = null,
    port: scala.Int | scala.Double = null,
    pubSubBatchDuration: scala.Int | scala.Double = null,
    secretKey: java.lang.String = null,
    socketPath: java.lang.String = null,
    timeout: scala.Int | scala.Double = null
  ): SCBrokerClientOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoReconnect)) __obj.updateDynamic("autoReconnect")(autoReconnect)
    if (autoReconnectOptions != null) __obj.updateDynamic("autoReconnectOptions")(autoReconnectOptions)
    if (connectRetryErrorThreshold != null) __obj.updateDynamic("connectRetryErrorThreshold")(connectRetryErrorThreshold.asInstanceOf[js.Any])
    if (host != null) __obj.updateDynamic("host")(host)
    if (port != null) __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
    if (pubSubBatchDuration != null) __obj.updateDynamic("pubSubBatchDuration")(pubSubBatchDuration.asInstanceOf[js.Any])
    if (secretKey != null) __obj.updateDynamic("secretKey")(secretKey)
    if (socketPath != null) __obj.updateDynamic("socketPath")(socketPath)
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[SCBrokerClientOptions]
  }
}

