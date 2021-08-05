package typings.pulumiAws.outputMod.codebuild

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProjectLogsConfigCloudwatchLogs extends StObject {
  
  /**
    * The group name of the logs in CloudWatch Logs.
    */
  var groupName: js.UndefOr[String] = js.undefined
  
  /**
    * Current status of logs in S3 for a build project. Valid values: `ENABLED`, `DISABLED`. Defaults to `DISABLED`.
    */
  var status: js.UndefOr[String] = js.undefined
  
  /**
    * The stream name of the logs in CloudWatch Logs.
    */
  var streamName: js.UndefOr[String] = js.undefined
}
object ProjectLogsConfigCloudwatchLogs {
  
  inline def apply(): ProjectLogsConfigCloudwatchLogs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProjectLogsConfigCloudwatchLogs]
  }
  
  extension [Self <: ProjectLogsConfigCloudwatchLogs](x: Self) {
    
    inline def setGroupName(value: String): Self = StObject.set(x, "groupName", value.asInstanceOf[js.Any])
    
    inline def setGroupNameUndefined: Self = StObject.set(x, "groupName", js.undefined)
    
    inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setStreamName(value: String): Self = StObject.set(x, "streamName", value.asInstanceOf[js.Any])
    
    inline def setStreamNameUndefined: Self = StObject.set(x, "streamName", js.undefined)
  }
}
