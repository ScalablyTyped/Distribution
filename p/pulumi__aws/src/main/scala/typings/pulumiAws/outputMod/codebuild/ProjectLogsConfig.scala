package typings.pulumiAws.outputMod.codebuild

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProjectLogsConfig extends js.Object {
  
  /**
    * Configuration for the builds to store logs to CloudWatch
    */
  var cloudwatchLogs: js.UndefOr[ProjectLogsConfigCloudwatchLogs] = js.native
  
  /**
    * Configuration for the builds to store logs to S3.
    */
  var s3Logs: js.UndefOr[ProjectLogsConfigS3Logs] = js.native
}
object ProjectLogsConfig {
  
  @scala.inline
  def apply(): ProjectLogsConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProjectLogsConfig]
  }
  
  @scala.inline
  implicit class ProjectLogsConfigOps[Self <: ProjectLogsConfig] (val x: Self) extends AnyVal {
    
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
    def setCloudwatchLogs(value: ProjectLogsConfigCloudwatchLogs): Self = this.set("cloudwatchLogs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCloudwatchLogs: Self = this.set("cloudwatchLogs", js.undefined)
    
    @scala.inline
    def setS3Logs(value: ProjectLogsConfigS3Logs): Self = this.set("s3Logs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteS3Logs: Self = this.set("s3Logs", js.undefined)
  }
}
