package typings.pulumiAws.inputMod.appmesh

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VirtualNodeSpecBackendVirtualService extends js.Object {
  
  /**
    * The client policy for the backend.
    */
  var clientPolicy: js.UndefOr[Input[VirtualNodeSpecBackendVirtualServiceClientPolicy]] = js.native
  
  /**
    * The name of the virtual service that is acting as a virtual node backend. Must be between 1 and 255 characters in length.
    */
  var virtualServiceName: Input[String] = js.native
}
object VirtualNodeSpecBackendVirtualService {
  
  @scala.inline
  def apply(virtualServiceName: Input[String]): VirtualNodeSpecBackendVirtualService = {
    val __obj = js.Dynamic.literal(virtualServiceName = virtualServiceName.asInstanceOf[js.Any])
    __obj.asInstanceOf[VirtualNodeSpecBackendVirtualService]
  }
  
  @scala.inline
  implicit class VirtualNodeSpecBackendVirtualServiceOps[Self <: VirtualNodeSpecBackendVirtualService] (val x: Self) extends AnyVal {
    
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
    def setVirtualServiceName(value: Input[String]): Self = this.set("virtualServiceName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientPolicy(value: Input[VirtualNodeSpecBackendVirtualServiceClientPolicy]): Self = this.set("clientPolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClientPolicy: Self = this.set("clientPolicy", js.undefined)
  }
}
