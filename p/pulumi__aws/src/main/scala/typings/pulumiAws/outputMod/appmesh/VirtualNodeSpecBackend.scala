package typings.pulumiAws.outputMod.appmesh

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VirtualNodeSpecBackend extends StObject {
  
  /**
    * Specifies a virtual service to use as a backend for a virtual node.
    */
  var virtualService: VirtualNodeSpecBackendVirtualService = js.native
}
object VirtualNodeSpecBackend {
  
  @scala.inline
  def apply(virtualService: VirtualNodeSpecBackendVirtualService): VirtualNodeSpecBackend = {
    val __obj = js.Dynamic.literal(virtualService = virtualService.asInstanceOf[js.Any])
    __obj.asInstanceOf[VirtualNodeSpecBackend]
  }
  
  @scala.inline
  implicit class VirtualNodeSpecBackendMutableBuilder[Self <: VirtualNodeSpecBackend] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setVirtualService(value: VirtualNodeSpecBackendVirtualService): Self = StObject.set(x, "virtualService", value.asInstanceOf[js.Any])
  }
}
