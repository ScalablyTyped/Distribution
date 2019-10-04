package typings.atPulumiAws.typesOutputMod.appmeshNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VirtualNodeSpecBackendVirtualService extends js.Object {
  /**
    * The name of the virtual service that is acting as a virtual node backend.
    */
  var virtualServiceName: String
}

object VirtualNodeSpecBackendVirtualService {
  @scala.inline
  def apply(virtualServiceName: String): VirtualNodeSpecBackendVirtualService = {
    val __obj = js.Dynamic.literal(virtualServiceName = virtualServiceName)
  
    __obj.asInstanceOf[VirtualNodeSpecBackendVirtualService]
  }
}

