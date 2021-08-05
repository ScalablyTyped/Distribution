package typings.pulumiAws.outputMod.appmesh

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VirtualServiceSpecProviderVirtualNode extends StObject {
  
  /**
    * The name of the virtual node that is acting as a service provider. Must be between 1 and 255 characters in length.
    */
  var virtualNodeName: String
}
object VirtualServiceSpecProviderVirtualNode {
  
  inline def apply(virtualNodeName: String): VirtualServiceSpecProviderVirtualNode = {
    val __obj = js.Dynamic.literal(virtualNodeName = virtualNodeName.asInstanceOf[js.Any])
    __obj.asInstanceOf[VirtualServiceSpecProviderVirtualNode]
  }
  
  extension [Self <: VirtualServiceSpecProviderVirtualNode](x: Self) {
    
    inline def setVirtualNodeName(value: String): Self = StObject.set(x, "virtualNodeName", value.asInstanceOf[js.Any])
  }
}
