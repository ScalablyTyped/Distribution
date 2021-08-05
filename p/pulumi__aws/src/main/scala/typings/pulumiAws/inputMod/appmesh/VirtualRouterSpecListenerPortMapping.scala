package typings.pulumiAws.inputMod.appmesh

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VirtualRouterSpecListenerPortMapping extends StObject {
  
  /**
    * The port used for the port mapping.
    */
  var port: Input[Double]
  
  /**
    * The protocol used for the port mapping. Valid values are `http`,`http2`, `tcp` and `grpc`.
    */
  var protocol: Input[String]
}
object VirtualRouterSpecListenerPortMapping {
  
  inline def apply(port: Input[Double], protocol: Input[String]): VirtualRouterSpecListenerPortMapping = {
    val __obj = js.Dynamic.literal(port = port.asInstanceOf[js.Any], protocol = protocol.asInstanceOf[js.Any])
    __obj.asInstanceOf[VirtualRouterSpecListenerPortMapping]
  }
  
  extension [Self <: VirtualRouterSpecListenerPortMapping](x: Self) {
    
    inline def setPort(value: Input[Double]): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
    
    inline def setProtocol(value: Input[String]): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
  }
}
