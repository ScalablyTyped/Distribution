package typings.pulumiAws.inputMod.ec2

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VpnConnectionVgwTelemetry extends StObject {
  
  var acceptedRouteCount: js.UndefOr[Input[Double]] = js.undefined
  
  var lastStatusChange: js.UndefOr[Input[String]] = js.undefined
  
  var outsideIpAddress: js.UndefOr[Input[String]] = js.undefined
  
  var status: js.UndefOr[Input[String]] = js.undefined
  
  var statusMessage: js.UndefOr[Input[String]] = js.undefined
}
object VpnConnectionVgwTelemetry {
  
  inline def apply(): VpnConnectionVgwTelemetry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VpnConnectionVgwTelemetry]
  }
  
  extension [Self <: VpnConnectionVgwTelemetry](x: Self) {
    
    inline def setAcceptedRouteCount(value: Input[Double]): Self = StObject.set(x, "acceptedRouteCount", value.asInstanceOf[js.Any])
    
    inline def setAcceptedRouteCountUndefined: Self = StObject.set(x, "acceptedRouteCount", js.undefined)
    
    inline def setLastStatusChange(value: Input[String]): Self = StObject.set(x, "lastStatusChange", value.asInstanceOf[js.Any])
    
    inline def setLastStatusChangeUndefined: Self = StObject.set(x, "lastStatusChange", js.undefined)
    
    inline def setOutsideIpAddress(value: Input[String]): Self = StObject.set(x, "outsideIpAddress", value.asInstanceOf[js.Any])
    
    inline def setOutsideIpAddressUndefined: Self = StObject.set(x, "outsideIpAddress", js.undefined)
    
    inline def setStatus(value: Input[String]): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusMessage(value: Input[String]): Self = StObject.set(x, "statusMessage", value.asInstanceOf[js.Any])
    
    inline def setStatusMessageUndefined: Self = StObject.set(x, "statusMessage", js.undefined)
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
