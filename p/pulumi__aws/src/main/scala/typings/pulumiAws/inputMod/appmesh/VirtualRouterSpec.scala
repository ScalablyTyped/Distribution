package typings.pulumiAws.inputMod.appmesh

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VirtualRouterSpec extends StObject {
  
  /**
    * The listeners that the virtual router is expected to receive inbound traffic from.
    * Currently only one listener is supported per virtual router.
    */
  var listener: Input[VirtualRouterSpecListener]
}
object VirtualRouterSpec {
  
  inline def apply(listener: Input[VirtualRouterSpecListener]): VirtualRouterSpec = {
    val __obj = js.Dynamic.literal(listener = listener.asInstanceOf[js.Any])
    __obj.asInstanceOf[VirtualRouterSpec]
  }
  
  extension [Self <: VirtualRouterSpec](x: Self) {
    
    inline def setListener(value: Input[VirtualRouterSpecListener]): Self = StObject.set(x, "listener", value.asInstanceOf[js.Any])
  }
}
