package typings.pulumiAws.outputMod.appmesh

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VirtualNodeSpecListenerPortMapping extends StObject {
  
  /**
    * The port used for the port mapping.
    */
  var port: Double
  
  /**
    * The protocol used for the port mapping. Valid values are `http`, `http2`, `tcp` and `grpc`.
    */
  var protocol: String
}
object VirtualNodeSpecListenerPortMapping {
  
  inline def apply(port: Double, protocol: String): VirtualNodeSpecListenerPortMapping = {
    val __obj = js.Dynamic.literal(port = port.asInstanceOf[js.Any], protocol = protocol.asInstanceOf[js.Any])
    __obj.asInstanceOf[VirtualNodeSpecListenerPortMapping]
  }
  
  extension [Self <: VirtualNodeSpecListenerPortMapping](x: Self) {
    
    inline def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
    
    inline def setProtocol(value: String): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
  }
}
