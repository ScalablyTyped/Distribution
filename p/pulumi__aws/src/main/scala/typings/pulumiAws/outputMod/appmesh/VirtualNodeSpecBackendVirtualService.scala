package typings.pulumiAws.outputMod.appmesh

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VirtualNodeSpecBackendVirtualService extends js.Object {
  /**
    * The name of the virtual service that is acting as a virtual node backend.
    */
  var virtualServiceName: String = js.native
}

object VirtualNodeSpecBackendVirtualService {
  @scala.inline
  def apply(virtualServiceName: String): VirtualNodeSpecBackendVirtualService = {
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
    def setVirtualServiceName(value: String): Self = this.set("virtualServiceName", value.asInstanceOf[js.Any])
  }
  
}

