package typings.pulumiAws.outputMod.appmesh

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VirtualRouterSpecListenerPortMapping extends StObject {
  
  /**
    * The port used for the port mapping.
    */
  var port: Double
  
  /**
    * The protocol used for the port mapping. Valid values are `http`,`http2`, `tcp` and `grpc`.
    */
  var protocol: String
}
object VirtualRouterSpecListenerPortMapping {
  
  @scala.inline
  def apply(port: Double, protocol: String): VirtualRouterSpecListenerPortMapping = {
    val __obj = js.Dynamic.literal(port = port.asInstanceOf[js.Any], protocol = protocol.asInstanceOf[js.Any])
    __obj.asInstanceOf[VirtualRouterSpecListenerPortMapping]
  }
  
  @scala.inline
  implicit class VirtualRouterSpecListenerPortMappingMutableBuilder[Self <: VirtualRouterSpecListenerPortMapping] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProtocol(value: String): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
  }
}
