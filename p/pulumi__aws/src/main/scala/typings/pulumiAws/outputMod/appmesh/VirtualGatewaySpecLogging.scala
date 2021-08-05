package typings.pulumiAws.outputMod.appmesh

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VirtualGatewaySpecLogging extends StObject {
  
  /**
    * The access log configuration for a virtual gateway.
    */
  var accessLog: js.UndefOr[VirtualGatewaySpecLoggingAccessLog] = js.undefined
}
object VirtualGatewaySpecLogging {
  
  inline def apply(): VirtualGatewaySpecLogging = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VirtualGatewaySpecLogging]
  }
  
  extension [Self <: VirtualGatewaySpecLogging](x: Self) {
    
    inline def setAccessLog(value: VirtualGatewaySpecLoggingAccessLog): Self = StObject.set(x, "accessLog", value.asInstanceOf[js.Any])
    
    inline def setAccessLogUndefined: Self = StObject.set(x, "accessLog", js.undefined)
  }
}
