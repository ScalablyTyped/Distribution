package typings.atPulumiAws.typesOutputMod.appmeshNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VirtualServiceSpecProviderVirtualNode extends js.Object {
  /**
    * The name of the virtual node that is acting as a service provider.
    */
  var virtualNodeName: String
}

object VirtualServiceSpecProviderVirtualNode {
  @scala.inline
  def apply(virtualNodeName: String): VirtualServiceSpecProviderVirtualNode = {
    val __obj = js.Dynamic.literal(virtualNodeName = virtualNodeName)
  
    __obj.asInstanceOf[VirtualServiceSpecProviderVirtualNode]
  }
}

