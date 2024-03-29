package typings.pulumiAws.inputMod.msk

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClusterLoggingInfo extends StObject {
  
  /**
    * Configuration block for Broker Logs settings for logging info. See below.
    */
  var brokerLogs: Input[ClusterLoggingInfoBrokerLogs]
}
object ClusterLoggingInfo {
  
  inline def apply(brokerLogs: Input[ClusterLoggingInfoBrokerLogs]): ClusterLoggingInfo = {
    val __obj = js.Dynamic.literal(brokerLogs = brokerLogs.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClusterLoggingInfo]
  }
  
  extension [Self <: ClusterLoggingInfo](x: Self) {
    
    inline def setBrokerLogs(value: Input[ClusterLoggingInfoBrokerLogs]): Self = StObject.set(x, "brokerLogs", value.asInstanceOf[js.Any])
  }
}
