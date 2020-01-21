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
}

