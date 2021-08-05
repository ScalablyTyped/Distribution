package typings.pulumiAws.outputMod.appmesh

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VirtualGatewaySpecListenerTls extends StObject {
  
  /**
    * The listener's TLS certificate.
    */
  var certificate: VirtualGatewaySpecListenerTlsCertificate
  
  /**
    * The listener's TLS mode. Valid values: `DISABLED`, `PERMISSIVE`, `STRICT`.
    */
  var mode: String
}
object VirtualGatewaySpecListenerTls {
  
  inline def apply(certificate: VirtualGatewaySpecListenerTlsCertificate, mode: String): VirtualGatewaySpecListenerTls = {
    val __obj = js.Dynamic.literal(certificate = certificate.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any])
    __obj.asInstanceOf[VirtualGatewaySpecListenerTls]
  }
  
  extension [Self <: VirtualGatewaySpecListenerTls](x: Self) {
    
    inline def setCertificate(value: VirtualGatewaySpecListenerTlsCertificate): Self = StObject.set(x, "certificate", value.asInstanceOf[js.Any])
    
    inline def setMode(value: String): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
  }
}
