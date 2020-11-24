package typings.pulumiAws.inputMod.codebuild

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProjectLogsConfigCloudwatchLogs extends js.Object {
  
  /**
    * The group name of the logs in CloudWatch Logs.
    */
  var groupName: js.UndefOr[Input[String]] = js.native
  
  /**
    * Current status of logs in S3 for a build project. Valid values: `ENABLED`, `DISABLED`. Defaults to `DISABLED`.
    */
  var status: js.UndefOr[Input[String]] = js.native
  
  /**
    * The stream name of the logs in CloudWatch Logs.
    */
  var streamName: js.UndefOr[Input[String]] = js.native
}
object ProjectLogsConfigCloudwatchLogs {
  
  @scala.inline
  def apply(): ProjectLogsConfigCloudwatchLogs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProjectLogsConfigCloudwatchLogs]
  }
  
  @scala.inline
  implicit class ProjectLogsConfigCloudwatchLogsOps[Self <: ProjectLogsConfigCloudwatchLogs] (val x: Self) extends AnyVal {
    
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
    def setGroupName(value: Input[String]): Self = this.set("groupName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGroupName: Self = this.set("groupName", js.undefined)
    
    @scala.inline
    def setStatus(value: Input[String]): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
    
    @scala.inline
    def setStreamName(value: Input[String]): Self = this.set("streamName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStreamName: Self = this.set("streamName", js.undefined)
  }
}
