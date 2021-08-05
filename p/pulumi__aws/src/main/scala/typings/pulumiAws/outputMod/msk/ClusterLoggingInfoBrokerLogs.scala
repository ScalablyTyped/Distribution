package typings.pulumiAws.outputMod.msk

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClusterLoggingInfoBrokerLogs extends StObject {
  
  var cloudwatchLogs: js.UndefOr[ClusterLoggingInfoBrokerLogsCloudwatchLogs] = js.undefined
  
  var firehose: js.UndefOr[ClusterLoggingInfoBrokerLogsFirehose] = js.undefined
  
  var s3: js.UndefOr[ClusterLoggingInfoBrokerLogsS3] = js.undefined
}
object ClusterLoggingInfoBrokerLogs {
  
  inline def apply(): ClusterLoggingInfoBrokerLogs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClusterLoggingInfoBrokerLogs]
  }
  
  extension [Self <: ClusterLoggingInfoBrokerLogs](x: Self) {
    
    inline def setCloudwatchLogs(value: ClusterLoggingInfoBrokerLogsCloudwatchLogs): Self = StObject.set(x, "cloudwatchLogs", value.asInstanceOf[js.Any])
    
    inline def setCloudwatchLogsUndefined: Self = StObject.set(x, "cloudwatchLogs", js.undefined)
    
    inline def setFirehose(value: ClusterLoggingInfoBrokerLogsFirehose): Self = StObject.set(x, "firehose", value.asInstanceOf[js.Any])
    
    inline def setFirehoseUndefined: Self = StObject.set(x, "firehose", js.undefined)
    
    inline def setS3(value: ClusterLoggingInfoBrokerLogsS3): Self = StObject.set(x, "s3", value.asInstanceOf[js.Any])
    
    inline def setS3Undefined: Self = StObject.set(x, "s3", js.undefined)
  }
}
