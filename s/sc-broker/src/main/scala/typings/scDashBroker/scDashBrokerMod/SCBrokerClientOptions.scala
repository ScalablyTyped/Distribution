package typings.scDashBroker.scDashBrokerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SCBrokerClientOptions extends js.Object {
  var autoReconnect: js.UndefOr[Boolean] = js.undefined
  var autoReconnectOptions: js.UndefOr[AutoReconnectOptions] = js.undefined
  var connectRetryErrorThreshold: js.UndefOr[Double] = js.undefined
  var host: js.UndefOr[String] = js.undefined
  var port: js.UndefOr[Double] = js.undefined
  var pubSubBatchDuration: js.UndefOr[Double] = js.undefined
  var secretKey: js.UndefOr[String] = js.undefined
  var socketPath: js.UndefOr[String] = js.undefined
  var timeout: js.UndefOr[Double] = js.undefined
}

object SCBrokerClientOptions {
  @scala.inline
  def apply(
    autoReconnect: js.UndefOr[Boolean] = js.undefined,
    autoReconnectOptions: AutoReconnectOptions = null,
    connectRetryErrorThreshold: Int | Double = null,
    host: String = null,
    port: Int | Double = null,
    pubSubBatchDuration: Int | Double = null,
    secretKey: String = null,
    socketPath: String = null,
    timeout: Int | Double = null
  ): SCBrokerClientOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoReconnect)) __obj.updateDynamic("autoReconnect")(autoReconnect.asInstanceOf[js.Any])
    if (autoReconnectOptions != null) __obj.updateDynamic("autoReconnectOptions")(autoReconnectOptions.asInstanceOf[js.Any])
    if (connectRetryErrorThreshold != null) __obj.updateDynamic("connectRetryErrorThreshold")(connectRetryErrorThreshold.asInstanceOf[js.Any])
    if (host != null) __obj.updateDynamic("host")(host.asInstanceOf[js.Any])
    if (port != null) __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
    if (pubSubBatchDuration != null) __obj.updateDynamic("pubSubBatchDuration")(pubSubBatchDuration.asInstanceOf[js.Any])
    if (secretKey != null) __obj.updateDynamic("secretKey")(secretKey.asInstanceOf[js.Any])
    if (socketPath != null) __obj.updateDynamic("socketPath")(socketPath.asInstanceOf[js.Any])
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[SCBrokerClientOptions]
  }
}

