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
  def apply(enabled: Boolean): ClusterLoggingInfoBrokerLogsFirehose = {
    val __obj = js.Dynamic.literal(enabled = enabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClusterLoggingInfoBrokerLogsFirehose]
  }
  @scala.inline
  implicit class ClusterLoggingInfoBrokerLogsFirehoseOps[Self <: ClusterLoggingInfoBrokerLogsFirehose] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setEnabled(value: Boolean): Self = this.set("enabled", value.asInstanceOf[js.Any])
    @scala.inline
    def setDeliveryStream(value: String): Self = this.set("deliveryStream", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeliveryStream: Self = this.set("deliveryStream", js.undefined)
  }
  
}

