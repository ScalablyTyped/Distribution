package typings.pulumiAws.outputMod.ec2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VpnConnectionVgwTelemetry extends StObject {
  
  var acceptedRouteCount: Double
  
  var lastStatusChange: String
  
  var outsideIpAddress: String
  
  var status: String
  
  var statusMessage: String
}
object VpnConnectionVgwTelemetry {
  
  inline def apply(
    acceptedRouteCount: Double,
    lastStatusChange: String,
    outsideIpAddress: String,
    status: String,
    statusMessage: String
  ): VpnConnectionVgwTelemetry = {
    val __obj = js.Dynamic.literal(acceptedRouteCount = acceptedRouteCount.asInstanceOf[js.Any], lastStatusChange = lastStatusChange.asInstanceOf[js.Any], outsideIpAddress = outsideIpAddress.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], statusMessage = statusMessage.asInstanceOf[js.Any])
    __obj.asInstanceOf[VpnConnectionVgwTelemetry]
  }
  
  extension [Self <: VpnConnectionVgwTelemetry](x: Self) {
    
    inline def setAcceptedRouteCount(value: Double): Self = StObject.set(x, "acceptedRouteCount", value.asInstanceOf[js.Any])
    
    inline def setLastStatusChange(value: String): Self = StObject.set(x, "lastStatusChange", value.asInstanceOf[js.Any])
    
    inline def setOutsideIpAddress(value: String): Self = StObject.set(x, "outsideIpAddress", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusMessage(value: String): Self = StObject.set(x, "statusMessage", value.asInstanceOf[js.Any])
  }
}
