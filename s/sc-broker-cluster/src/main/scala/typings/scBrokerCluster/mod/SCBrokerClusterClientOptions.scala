package typings.scBrokerCluster.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SCBrokerClusterClientOptions extends js.Object {
  var brokers: js.Array[String]
  var connectRetryErrorThreshold: Double
  var pubSubBatchDuration: js.UndefOr[Double] = js.undefined
  var secretKey: js.UndefOr[String] = js.undefined
}

object SCBrokerClusterClientOptions {
  @scala.inline
  def apply(
    brokers: js.Array[String],
    connectRetryErrorThreshold: Double,
    pubSubBatchDuration: js.UndefOr[Double] = js.undefined,
    secretKey: String = null
  ): SCBrokerClusterClientOptions = {
    val __obj = js.Dynamic.literal(brokers = brokers.asInstanceOf[js.Any], connectRetryErrorThreshold = connectRetryErrorThreshold.asInstanceOf[js.Any])
    if (!js.isUndefined(pubSubBatchDuration)) __obj.updateDynamic("pubSubBatchDuration")(pubSubBatchDuration.get.asInstanceOf[js.Any])
    if (secretKey != null) __obj.updateDynamic("secretKey")(secretKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SCBrokerClusterClientOptions]
  }
}

