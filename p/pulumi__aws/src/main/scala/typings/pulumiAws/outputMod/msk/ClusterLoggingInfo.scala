package typings.pulumiAws.outputMod.msk

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClusterLoggingInfo extends StObject {
  
  /**
    * Configuration block for Broker Logs settings for logging info. See below.
    */
  var brokerLogs: ClusterLoggingInfoBrokerLogs
}
object ClusterLoggingInfo {
  
  inline def apply(brokerLogs: ClusterLoggingInfoBrokerLogs): ClusterLoggingInfo = {
    val __obj = js.Dynamic.literal(brokerLogs = brokerLogs.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClusterLoggingInfo]
  }
  
  extension [Self <: ClusterLoggingInfo](x: Self) {
    
    inline def setBrokerLogs(value: ClusterLoggingInfoBrokerLogs): Self = StObject.set(x, "brokerLogs", value.asInstanceOf[js.Any])
  }
}
