package typings.pulumiAws.inputMod.appmesh

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VirtualGatewaySpecLogging extends StObject {
  
  /**
    * The access log configuration for a virtual gateway.
    */
  var accessLog: js.UndefOr[Input[VirtualGatewaySpecLoggingAccessLog]] = js.native
}
object VirtualGatewaySpecLogging {
  
  @scala.inline
  def apply(): VirtualGatewaySpecLogging = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VirtualGatewaySpecLogging]
  }
  
  @scala.inline
  implicit class VirtualGatewaySpecLoggingMutableBuilder[Self <: VirtualGatewaySpecLogging] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccessLog(value: Input[VirtualGatewaySpecLoggingAccessLog]): Self = StObject.set(x, "accessLog", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccessLogUndefined: Self = StObject.set(x, "accessLog", js.undefined)
  }
}
