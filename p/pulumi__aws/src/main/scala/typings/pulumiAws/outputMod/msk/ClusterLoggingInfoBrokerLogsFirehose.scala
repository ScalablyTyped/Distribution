package typings.pulumiAws.outputMod.msk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClusterLoggingInfoBrokerLogsFirehose extends js.Object {
  /**
    * Name of the Kinesis Data Firehose delivery stream to deliver logs to.
    */
  var deliveryStream: js.UndefOr[String] = js.native
  /**
    * Indicates whether you want to enable or disable streaming broker logs to Cloudwatch Logs.
    */
  var enabled: Boolean = js.native
}

object ClusterLoggingInfoBrokerLogsFirehose {
  @scala.inline
  def apply(enabled: Boolean, deliveryStream: String = null): ClusterLoggingInfoBrokerLogsFirehose = {
    val __obj = js.Dynamic.literal(enabled = enabled.asInstanceOf[js.Any])
    if (deliveryStream != null) __obj.updateDynamic("deliveryStream")(deliveryStream.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClusterLoggingInfoBrokerLogsFirehose]
  }
}

