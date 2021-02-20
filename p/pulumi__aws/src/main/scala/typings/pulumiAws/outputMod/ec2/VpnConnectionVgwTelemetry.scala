package typings.pulumiAws.outputMod.ec2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VpnConnectionVgwTelemetry extends StObject {
  
  var acceptedRouteCount: Double = js.native
  
  var lastStatusChange: String = js.native
  
  var outsideIpAddress: String = js.native
  
  var status: String = js.native
  
  var statusMessage: String = js.native
}
object VpnConnectionVgwTelemetry {
  
  @scala.inline
  def apply(
    acceptedRouteCount: Double,
    lastStatusChange: String,
    outsideIpAddress: String,
    status: String,
    statusMessage: String
  ): VpnConnectionVgwTelemetry = {
    val __obj = js.Dynamic.literal(acceptedRouteCount = acceptedRouteCount.asInstanceOf[js.Any], lastStatusChange = lastStatusChange.asInstanceOf[js.Any], outsideIpAddress = outsideIpAddress.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], statusMessage = statusMessage.asInstanceOf[js.Any])
    __obj.asInstanceOf[VpnConnectionVgwTelemetry]
  }
  
  @scala.inline
  implicit class VpnConnectionVgwTelemetryMutableBuilder[Self <: VpnConnectionVgwTelemetry] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAcceptedRouteCount(value: Double): Self = StObject.set(x, "acceptedRouteCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastStatusChange(value: String): Self = StObject.set(x, "lastStatusChange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutsideIpAddress(value: String): Self = StObject.set(x, "outsideIpAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusMessage(value: String): Self = StObject.set(x, "statusMessage", value.asInstanceOf[js.Any])
  }
}
