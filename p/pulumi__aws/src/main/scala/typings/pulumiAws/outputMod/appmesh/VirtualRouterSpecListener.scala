package typings.pulumiAws.outputMod.appmesh

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VirtualRouterSpecListener extends StObject {
  
  /**
    * The port mapping information for the listener.
    */
  var portMapping: VirtualRouterSpecListenerPortMapping
}
object VirtualRouterSpecListener {
  
  inline def apply(portMapping: VirtualRouterSpecListenerPortMapping): VirtualRouterSpecListener = {
    val __obj = js.Dynamic.literal(portMapping = portMapping.asInstanceOf[js.Any])
    __obj.asInstanceOf[VirtualRouterSpecListener]
  }
  
  extension [Self <: VirtualRouterSpecListener](x: Self) {
    
    inline def setPortMapping(value: VirtualRouterSpecListenerPortMapping): Self = StObject.set(x, "portMapping", value.asInstanceOf[js.Any])
  }
}
