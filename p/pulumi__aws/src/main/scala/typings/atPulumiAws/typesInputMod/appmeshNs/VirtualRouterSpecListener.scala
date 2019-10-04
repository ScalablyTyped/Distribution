package typings.atPulumiAws.typesInputMod.appmeshNs

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VirtualRouterSpecListener extends js.Object {
  /**
    * The port mapping information for the listener.
    */
  var portMapping: Input[VirtualRouterSpecListenerPortMapping]
}

object VirtualRouterSpecListener {
  @scala.inline
  def apply(portMapping: Input[VirtualRouterSpecListenerPortMapping]): VirtualRouterSpecListener = {
    val __obj = js.Dynamic.literal(portMapping = portMapping.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[VirtualRouterSpecListener]
  }
}

