package typings.pulumiAws.outputMod.appmesh

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VirtualGatewaySpecListenerTls extends StObject {
  
  /**
    * The listener's TLS certificate.
    */
  var certificate: VirtualGatewaySpecListenerTlsCertificate = js.native
  
  /**
    * The listener's TLS mode. Valid values: `DISABLED`, `PERMISSIVE`, `STRICT`.
    */
  var mode: String = js.native
}
object VirtualGatewaySpecListenerTls {
  
  @scala.inline
  def apply(certificate: VirtualGatewaySpecListenerTlsCertificate, mode: String): VirtualGatewaySpecListenerTls = {
    val __obj = js.Dynamic.literal(certificate = certificate.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any])
    __obj.asInstanceOf[VirtualGatewaySpecListenerTls]
  }
  
  @scala.inline
  implicit class VirtualGatewaySpecListenerTlsMutableBuilder[Self <: VirtualGatewaySpecListenerTls] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCertificate(value: VirtualGatewaySpecListenerTlsCertificate): Self = StObject.set(x, "certificate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMode(value: String): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
  }
}
