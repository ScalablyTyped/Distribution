package typings.pulumiAws.inputMod.codebuild

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProjectLogsConfig extends StObject {
  
  /**
    * Configuration for the builds to store logs to CloudWatch
    */
  var cloudwatchLogs: js.UndefOr[Input[ProjectLogsConfigCloudwatchLogs]] = js.undefined
  
  /**
    * Configuration for the builds to store logs to S3.
    */
  var s3Logs: js.UndefOr[Input[ProjectLogsConfigS3Logs]] = js.undefined
}
object ProjectLogsConfig {
  
  inline def apply(): ProjectLogsConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProjectLogsConfig]
  }
  
  extension [Self <: ProjectLogsConfig](x: Self) {
    
    inline def setCloudwatchLogs(value: Input[ProjectLogsConfigCloudwatchLogs]): Self = StObject.set(x, "cloudwatchLogs", value.asInstanceOf[js.Any])
    
    inline def setCloudwatchLogsUndefined: Self = StObject.set(x, "cloudwatchLogs", js.undefined)
    
    inline def setS3Logs(value: Input[ProjectLogsConfigS3Logs]): Self = StObject.set(x, "s3Logs", value.asInstanceOf[js.Any])
    
    inline def setS3LogsUndefined: Self = StObject.set(x, "s3Logs", js.undefined)
  }
}
