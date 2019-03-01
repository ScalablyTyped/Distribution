package typings
package scDashBrokerDashClusterLib.scDashBrokerDashClusterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SCBrokerClusterClientOptions extends js.Object {
  var brokers: js.Array[java.lang.String]
  var connectRetryErrorThreshold: scala.Double
  var pubSubBatchDuration: js.UndefOr[scala.Double] = js.undefined
  var secretKey: js.UndefOr[java.lang.String] = js.undefined
}

object SCBrokerClusterClientOptions {
  @scala.inline
  def apply(
    brokers: js.Array[java.lang.String],
    connectRetryErrorThreshold: scala.Double,
    pubSubBatchDuration: scala.Int | scala.Double = null,
    secretKey: java.lang.String = null
  ): SCBrokerClusterClientOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("brokers")(brokers)
    __obj.updateDynamic("connectRetryErrorThreshold")(connectRetryErrorThreshold)
    if (pubSubBatchDuration != null) __obj.updateDynamic("pubSubBatchDuration")(pubSubBatchDuration.asInstanceOf[js.Any])
    if (secretKey != null) __obj.updateDynamic("secretKey")(secretKey)
    __obj.asInstanceOf[SCBrokerClusterClientOptions]
  }
}

