package typings.pulumiAws.inputMod.msk

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClusterLoggingInfoBrokerLogs extends js.Object {
  var cloudwatchLogs: js.UndefOr[Input[ClusterLoggingInfoBrokerLogsCloudwatchLogs]] = js.native
  var firehose: js.UndefOr[Input[ClusterLoggingInfoBrokerLogsFirehose]] = js.native
  var s3: js.UndefOr[Input[ClusterLoggingInfoBrokerLogsS3]] = js.native
}

object ClusterLoggingInfoBrokerLogs {
  @scala.inline
  def apply(
    cloudwatchLogs: Input[ClusterLoggingInfoBrokerLogsCloudwatchLogs] = null,
    firehose: Input[ClusterLoggingInfoBrokerLogsFirehose] = null,
    s3: Input[ClusterLoggingInfoBrokerLogsS3] = null
  ): ClusterLoggingInfoBrokerLogs = {
    val __obj = js.Dynamic.literal()
    if (cloudwatchLogs != null) __obj.updateDynamic("cloudwatchLogs")(cloudwatchLogs.asInstanceOf[js.Any])
    if (firehose != null) __obj.updateDynamic("firehose")(firehose.asInstanceOf[js.Any])
    if (s3 != null) __obj.updateDynamic("s3")(s3.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClusterLoggingInfoBrokerLogs]
  }
}

