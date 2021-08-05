package typings.pulumiAws.outputMod.appmesh

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VirtualNodeSpecBackend extends StObject {
  
  /**
    * Specifies a virtual service to use as a backend for a virtual node.
    */
  var virtualService: VirtualNodeSpecBackendVirtualService
}
object VirtualNodeSpecBackend {
  
  inline def apply(virtualService: VirtualNodeSpecBackendVirtualService): VirtualNodeSpecBackend = {
    val __obj = js.Dynamic.literal(virtualService = virtualService.asInstanceOf[js.Any])
    __obj.asInstanceOf[VirtualNodeSpecBackend]
  }
  
  extension [Self <: VirtualNodeSpecBackend](x: Self) {
    
    inline def setVirtualService(value: VirtualNodeSpecBackendVirtualService): Self = StObject.set(x, "virtualService", value.asInstanceOf[js.Any])
  }
}
