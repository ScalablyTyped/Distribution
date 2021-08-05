package typings.pulumiAws.outputMod.msk

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClusterLoggingInfoBrokerLogsFirehose extends StObject {
  
  /**
    * Name of the Kinesis Data Firehose delivery stream to deliver logs to.
    */
  var deliveryStream: js.UndefOr[String] = js.undefined
  
  /**
    * Indicates whether you want to enable or disable streaming broker logs to Cloudwatch Logs.
    */
  var enabled: Boolean
}
object ClusterLoggingInfoBrokerLogsFirehose {
  
  inline def apply(enabled: Boolean): ClusterLoggingInfoBrokerLogsFirehose = {
    val __obj = js.Dynamic.literal(enabled = enabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClusterLoggingInfoBrokerLogsFirehose]
  }
  
  extension [Self <: ClusterLoggingInfoBrokerLogsFirehose](x: Self) {
    
    inline def setDeliveryStream(value: String): Self = StObject.set(x, "deliveryStream", value.asInstanceOf[js.Any])
    
    inline def setDeliveryStreamUndefined: Self = StObject.set(x, "deliveryStream", js.undefined)
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
  }
}
