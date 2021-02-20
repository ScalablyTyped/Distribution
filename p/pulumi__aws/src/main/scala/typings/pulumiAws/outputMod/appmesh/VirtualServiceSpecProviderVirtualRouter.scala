package typings.pulumiAws.outputMod.appmesh

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VirtualServiceSpecProviderVirtualRouter extends StObject {
  
  /**
    * The name of the virtual router that is acting as a service provider. Must be between 1 and 255 characters in length.
    */
  var virtualRouterName: String = js.native
}
object VirtualServiceSpecProviderVirtualRouter {
  
  @scala.inline
  def apply(virtualRouterName: String): VirtualServiceSpecProviderVirtualRouter = {
    val __obj = js.Dynamic.literal(virtualRouterName = virtualRouterName.asInstanceOf[js.Any])
    __obj.asInstanceOf[VirtualServiceSpecProviderVirtualRouter]
  }
  
  @scala.inline
  implicit class VirtualServiceSpecProviderVirtualRouterMutableBuilder[Self <: VirtualServiceSpecProviderVirtualRouter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setVirtualRouterName(value: String): Self = StObject.set(x, "virtualRouterName", value.asInstanceOf[js.Any])
  }
}
