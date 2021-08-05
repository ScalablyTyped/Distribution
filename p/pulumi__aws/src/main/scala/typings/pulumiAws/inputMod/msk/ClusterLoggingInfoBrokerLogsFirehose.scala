package typings.pulumiAws.inputMod.msk

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClusterLoggingInfoBrokerLogsFirehose extends StObject {
  
  /**
    * Name of the Kinesis Data Firehose delivery stream to deliver logs to.
    */
  var deliveryStream: js.UndefOr[Input[String]] = js.undefined
  
  /**
    * Indicates whether you want to enable or disable streaming broker logs to Cloudwatch Logs.
    */
  var enabled: Input[Boolean]
}
object ClusterLoggingInfoBrokerLogsFirehose {
  
  inline def apply(enabled: Input[Boolean]): ClusterLoggingInfoBrokerLogsFirehose = {
    val __obj = js.Dynamic.literal(enabled = enabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClusterLoggingInfoBrokerLogsFirehose]
  }
  
  extension [Self <: ClusterLoggingInfoBrokerLogsFirehose](x: Self) {
    
    inline def setDeliveryStream(value: Input[String]): Self = StObject.set(x, "deliveryStream", value.asInstanceOf[js.Any])
    
    inline def setDeliveryStreamUndefined: Self = StObject.set(x, "deliveryStream", js.undefined)
    
    inline def setEnabled(value: Input[Boolean]): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
  }
}
