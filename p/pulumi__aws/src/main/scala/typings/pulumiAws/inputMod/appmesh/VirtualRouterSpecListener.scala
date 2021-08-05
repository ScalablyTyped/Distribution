package typings.pulumiAws.inputMod.appmesh

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VirtualRouterSpecListener extends StObject {
  
  /**
    * The port mapping information for the listener.
    */
  var portMapping: Input[VirtualRouterSpecListenerPortMapping]
}
object VirtualRouterSpecListener {
  
  inline def apply(portMapping: Input[VirtualRouterSpecListenerPortMapping]): VirtualRouterSpecListener = {
    val __obj = js.Dynamic.literal(portMapping = portMapping.asInstanceOf[js.Any])
    __obj.asInstanceOf[VirtualRouterSpecListener]
  }
  
  extension [Self <: VirtualRouterSpecListener](x: Self) {
    
    inline def setPortMapping(value: Input[VirtualRouterSpecListenerPortMapping]): Self = StObject.set(x, "portMapping", value.asInstanceOf[js.Any])
  }
}
