package typings.pulumiAws.outputMod.appmesh

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VirtualNodeSpecBackend extends js.Object {
  
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
  implicit class VirtualNodeSpecBackendOps[Self <: VirtualNodeSpecBackend] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setVirtualService(value: VirtualNodeSpecBackendVirtualService): Self = this.set("virtualService", value.asInstanceOf[js.Any])
  }
}
