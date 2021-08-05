package typings.pulumiAws.inputMod.msk

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClusterLoggingInfoBrokerLogsCloudwatchLogs extends StObject {
  
  /**
    * Indicates whether you want to enable or disable streaming broker logs to Cloudwatch Logs.
    */
  var enabled: Input[Boolean]
  
  /**
    * Name of the Cloudwatch Log Group to deliver logs to.
    */
  var logGroup: js.UndefOr[Input[String]] = js.undefined
}
object ClusterLoggingInfoBrokerLogsCloudwatchLogs {
  
  inline def apply(enabled: Input[Boolean]): ClusterLoggingInfoBrokerLogsCloudwatchLogs = {
    val __obj = js.Dynamic.literal(enabled = enabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClusterLoggingInfoBrokerLogsCloudwatchLogs]
  }
  
  extension [Self <: ClusterLoggingInfoBrokerLogsCloudwatchLogs](x: Self) {
    
    inline def setEnabled(value: Input[Boolean]): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setLogGroup(value: Input[String]): Self = StObject.set(x, "logGroup", value.asInstanceOf[js.Any])
    
    inline def setLogGroupUndefined: Self = StObject.set(x, "logGroup", js.undefined)
  }
}
