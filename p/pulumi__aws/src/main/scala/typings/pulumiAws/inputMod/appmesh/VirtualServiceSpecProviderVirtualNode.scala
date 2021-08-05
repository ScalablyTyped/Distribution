package typings.pulumiAws.inputMod.appmesh

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VirtualServiceSpecProviderVirtualNode extends StObject {
  
  /**
    * The name of the virtual node that is acting as a service provider. Must be between 1 and 255 characters in length.
    */
  var virtualNodeName: Input[String]
}
object VirtualServiceSpecProviderVirtualNode {
  
  inline def apply(virtualNodeName: Input[String]): VirtualServiceSpecProviderVirtualNode = {
    val __obj = js.Dynamic.literal(virtualNodeName = virtualNodeName.asInstanceOf[js.Any])
    __obj.asInstanceOf[VirtualServiceSpecProviderVirtualNode]
  }
  
  extension [Self <: VirtualServiceSpecProviderVirtualNode](x: Self) {
    
    inline def setVirtualNodeName(value: Input[String]): Self = StObject.set(x, "virtualNodeName", value.asInstanceOf[js.Any])
  }
}
