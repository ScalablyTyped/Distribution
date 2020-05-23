package typings.scBroker.mod

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
    connectRetryErrorThreshold: js.UndefOr[Double] = js.undefined,
    host: String = null,
    port: js.UndefOr[Double] = js.undefined,
    pubSubBatchDuration: js.UndefOr[Double] = js.undefined,
    secretKey: String = null,
    socketPath: String = null,
    timeout: js.UndefOr[Double] = js.undefined
  ): SCBrokerClientOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoReconnect)) __obj.updateDynamic("autoReconnect")(autoReconnect.get.asInstanceOf[js.Any])
    if (autoReconnectOptions != null) __obj.updateDynamic("autoReconnectOptions")(autoReconnectOptions.asInstanceOf[js.Any])
    if (!js.isUndefined(connectRetryErrorThreshold)) __obj.updateDynamic("connectRetryErrorThreshold")(connectRetryErrorThreshold.get.asInstanceOf[js.Any])
    if (host != null) __obj.updateDynamic("host")(host.asInstanceOf[js.Any])
    if (!js.isUndefined(port)) __obj.updateDynamic("port")(port.get.asInstanceOf[js.Any])
    if (!js.isUndefined(pubSubBatchDuration)) __obj.updateDynamic("pubSubBatchDuration")(pubSubBatchDuration.get.asInstanceOf[js.Any])
    if (secretKey != null) __obj.updateDynamic("secretKey")(secretKey.asInstanceOf[js.Any])
    if (socketPath != null) __obj.updateDynamic("socketPath")(socketPath.asInstanceOf[js.Any])
    if (!js.isUndefined(timeout)) __obj.updateDynamic("timeout")(timeout.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SCBrokerClientOptions]
  }
}

