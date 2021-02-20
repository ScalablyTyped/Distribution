package typings.pulumiAws.outputMod.codebuild

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProjectLogsConfigCloudwatchLogs extends StObject {
  
  /**
    * The group name of the logs in CloudWatch Logs.
    */
  var groupName: js.UndefOr[String] = js.native
  
  /**
    * Current status of logs in S3 for a build project. Valid values: `ENABLED`, `DISABLED`. Defaults to `DISABLED`.
    */
  var status: js.UndefOr[String] = js.native
  
  /**
    * The stream name of the logs in CloudWatch Logs.
    */
  var streamName: js.UndefOr[String] = js.native
}
object ProjectLogsConfigCloudwatchLogs {
  
  @scala.inline
  def apply(): ProjectLogsConfigCloudwatchLogs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProjectLogsConfigCloudwatchLogs]
  }
  
  @scala.inline
  implicit class ProjectLogsConfigCloudwatchLogsMutableBuilder[Self <: ProjectLogsConfigCloudwatchLogs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGroupName(value: String): Self = StObject.set(x, "groupName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupNameUndefined: Self = StObject.set(x, "groupName", js.undefined)
    
    @scala.inline
    def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    @scala.inline
    def setStreamName(value: String): Self = StObject.set(x, "streamName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStreamNameUndefined: Self = StObject.set(x, "streamName", js.undefined)
  }
}
