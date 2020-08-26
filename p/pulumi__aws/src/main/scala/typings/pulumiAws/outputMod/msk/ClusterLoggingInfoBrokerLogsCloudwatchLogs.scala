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
  def apply(enabled: Boolean): ClusterLoggingInfoBrokerLogsCloudwatchLogs = {
    val __obj = js.Dynamic.literal(enabled = enabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClusterLoggingInfoBrokerLogsCloudwatchLogs]
  }
  @scala.inline
  implicit class ClusterLoggingInfoBrokerLogsCloudwatchLogsOps[Self <: ClusterLoggingInfoBrokerLogsCloudwatchLogs] (val x: Self) extends AnyVal {
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
    def setLogGroup(value: String): Self = this.set("logGroup", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLogGroup: Self = this.set("logGroup", js.undefined)
  }
  
}

