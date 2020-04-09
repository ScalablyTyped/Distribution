package typings.pulumiAws.outputMod.msk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClusterLoggingInfoBrokerLogsCloudwatchLogs extends js.Object {
  /**
    * Indicates whether you want to enable or disable streaming broker logs to Cloudwatch Logs.
    */
  var enabled: Boolean = js.native
  /**
    * Name of the Cloudwatch Log Group to deliver logs to.
    */
  var logGroup: js.UndefOr[String] = js.native
}

object ClusterLoggingInfoBrokerLogsCloudwatchLogs {
  @scala.inline
  def apply(enabled: Boolean, logGroup: String = null): ClusterLoggingInfoBrokerLogsCloudwatchLogs = {
    val __obj = js.Dynamic.literal(enabled = enabled.asInstanceOf[js.Any])
    if (logGroup != null) __obj.updateDynamic("logGroup")(logGroup.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClusterLoggingInfoBrokerLogsCloudwatchLogs]
  }
}

