package typings.pulumiAws.inputMod.ec2

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VpnConnectionVgwTelemetry extends StObject {
  
  var acceptedRouteCount: js.UndefOr[Input[Double]] = js.native
  
  var lastStatusChange: js.UndefOr[Input[String]] = js.native
  
  var outsideIpAddress: js.UndefOr[Input[String]] = js.native
  
  var status: js.UndefOr[Input[String]] = js.native
  
  var statusMessage: js.UndefOr[Input[String]] = js.native
}
object VpnConnectionVgwTelemetry {
  
  @scala.inline
  def apply(): VpnConnectionVgwTelemetry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VpnConnectionVgwTelemetry]
  }
  
  @scala.inline
  implicit class VpnConnectionVgwTelemetryMutableBuilder[Self <: VpnConnectionVgwTelemetry] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAcceptedRouteCount(value: Input[Double]): Self = StObject.set(x, "acceptedRouteCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAcceptedRouteCountUndefined: Self = StObject.set(x, "acceptedRouteCount", js.undefined)
    
    @scala.inline
    def setLastStatusChange(value: Input[String]): Self = StObject.set(x, "lastStatusChange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastStatusChangeUndefined: Self = StObject.set(x, "lastStatusChange", js.undefined)
    
    @scala.inline
    def setOutsideIpAddress(value: Input[String]): Self = StObject.set(x, "outsideIpAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutsideIpAddressUndefined: Self = StObject.set(x, "outsideIpAddress", js.undefined)
    
    @scala.inline
    def setStatus(value: Input[String]): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusMessage(value: Input[String]): Self = StObject.set(x, "statusMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusMessageUndefined: Self = StObject.set(x, "statusMessage", js.undefined)
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
