package typings.pulumiAws.inputMod.msk

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClusterLoggingInfoBrokerLogs extends js.Object {
  
  var cloudwatchLogs: js.UndefOr[Input[ClusterLoggingInfoBrokerLogsCloudwatchLogs]] = js.native
  
  var firehose: js.UndefOr[Input[ClusterLoggingInfoBrokerLogsFirehose]] = js.native
  
  var s3: js.UndefOr[Input[ClusterLoggingInfoBrokerLogsS3]] = js.native
}
object ClusterLoggingInfoBrokerLogs {
  
  @scala.inline
  def apply(): ClusterLoggingInfoBrokerLogs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClusterLoggingInfoBrokerLogs]
  }
  
  @scala.inline
  implicit class ClusterLoggingInfoBrokerLogsOps[Self <: ClusterLoggingInfoBrokerLogs] (val x: Self) extends AnyVal {
    
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
    def setCloudwatchLogs(value: Input[ClusterLoggingInfoBrokerLogsCloudwatchLogs]): Self = this.set("cloudwatchLogs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCloudwatchLogs: Self = this.set("cloudwatchLogs", js.undefined)
    
    @scala.inline
    def setFirehose(value: Input[ClusterLoggingInfoBrokerLogsFirehose]): Self = this.set("firehose", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFirehose: Self = this.set("firehose", js.undefined)
    
    @scala.inline
    def setS3(value: Input[ClusterLoggingInfoBrokerLogsS3]): Self = this.set("s3", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteS3: Self = this.set("s3", js.undefined)
  }
}
