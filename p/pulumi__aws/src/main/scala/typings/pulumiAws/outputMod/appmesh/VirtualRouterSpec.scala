package typings.pulumiAws.outputMod.appmesh

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VirtualRouterSpec extends StObject {
  
  /**
    * The listeners that the virtual router is expected to receive inbound traffic from.
    * Currently only one listener is supported per virtual router.
    */
  var listener: VirtualRouterSpecListener
}
object VirtualRouterSpec {
  
  inline def apply(listener: VirtualRouterSpecListener): VirtualRouterSpec = {
    val __obj = js.Dynamic.literal(listener = listener.asInstanceOf[js.Any])
    __obj.asInstanceOf[VirtualRouterSpec]
  }
  
  extension [Self <: VirtualRouterSpec](x: Self) {
    
    inline def setListener(value: VirtualRouterSpecListener): Self = StObject.set(x, "listener", value.asInstanceOf[js.Any])
  }
}
