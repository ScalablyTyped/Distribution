package typings.atPulumiAws.typesInputMod.appmesh

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VirtualRouterSpec extends js.Object {
  /**
    * The listeners that the virtual router is expected to receive inbound traffic from.
    * Currently only one listener is supported per virtual router.
    */
  var listener: Input[VirtualRouterSpecListener] = js.native
}

object VirtualRouterSpec {
  @scala.inline
  def apply(listener: Input[VirtualRouterSpecListener]): VirtualRouterSpec = {
    val __obj = js.Dynamic.literal(listener = listener.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[VirtualRouterSpec]
  }
}

