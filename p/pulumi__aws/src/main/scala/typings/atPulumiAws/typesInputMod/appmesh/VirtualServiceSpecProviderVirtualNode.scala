package typings.atPulumiAws.typesInputMod.appmesh

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VirtualServiceSpecProviderVirtualNode extends js.Object {
  /**
    * The name of the virtual node that is acting as a service provider.
    */
  var virtualNodeName: Input[String]
}

object VirtualServiceSpecProviderVirtualNode {
  @scala.inline
  def apply(virtualNodeName: Input[String]): VirtualServiceSpecProviderVirtualNode = {
    val __obj = js.Dynamic.literal(virtualNodeName = virtualNodeName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[VirtualServiceSpecProviderVirtualNode]
  }
}

