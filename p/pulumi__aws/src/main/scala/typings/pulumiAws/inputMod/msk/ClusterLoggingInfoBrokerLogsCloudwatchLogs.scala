package typings.pulumiAws.inputMod.msk

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClusterLoggingInfoBrokerLogsCloudwatchLogs extends js.Object {
  /**
    * Indicates whether you want to enable or disable streaming broker logs to Cloudwatch Logs.
    */
  var enabled: Input[Boolean] = js.native
  /**
    * Name of the Cloudwatch Log Group to deliver logs to.
    */
  var logGroup: js.UndefOr[Input[String]] = js.native
}

object ClusterLoggingInfoBrokerLogsCloudwatchLogs {
  @scala.inline
  def apply(enabled: Input[Boolean], logGroup: Input[String] = null): ClusterLoggingInfoBrokerLogsCloudwatchLogs = {
    val __obj = js.Dynamic.literal(enabled = enabled.asInstanceOf[js.Any])
    if (logGroup != null) __obj.updateDynamic("logGroup")(logGroup.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClusterLoggingInfoBrokerLogsCloudwatchLogs]
  }
}

