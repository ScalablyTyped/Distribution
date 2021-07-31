package typings.pulumiAws.inputMod.appmesh

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VirtualNodeSpecListenerTls extends StObject {
  
  /**
    * The listener's TLS certificate.
    */
  var certificate: Input[VirtualNodeSpecListenerTlsCertificate]
  
  /**
    * The listener's TLS mode. Valid values: `DISABLED`, `PERMISSIVE`, `STRICT`.
    */
  var mode: Input[String]
}
object VirtualNodeSpecListenerTls {
  
  @scala.inline
  def apply(certificate: Input[VirtualNodeSpecListenerTlsCertificate], mode: Input[String]): VirtualNodeSpecListenerTls = {
    val __obj = js.Dynamic.literal(certificate = certificate.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any])
    __obj.asInstanceOf[VirtualNodeSpecListenerTls]
  }
  
  @scala.inline
  implicit class VirtualNodeSpecListenerTlsMutableBuilder[Self <: VirtualNodeSpecListenerTls] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCertificate(value: Input[VirtualNodeSpecListenerTlsCertificate]): Self = StObject.set(x, "certificate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMode(value: Input[String]): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
  }
}
