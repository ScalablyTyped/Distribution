package typings.pulumiAws.inputMod.appmesh

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VirtualNodeSpecBackend extends js.Object {
  
  /**
    * Specifies a virtual service to use as a backend for a virtual node.
    */
  var virtualService: Input[VirtualNodeSpecBackendVirtualService] = js.native
}
object VirtualNodeSpecBackend {
  
  @scala.inline
  def apply(virtualService: Input[VirtualNodeSpecBackendVirtualService]): VirtualNodeSpecBackend = {
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
    def setVirtualService(value: Input[VirtualNodeSpecBackendVirtualService]): Self = this.set("virtualService", value.asInstanceOf[js.Any])
  }
}
