package typings.atPulumiAws.typesInputMod.appmesh

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VirtualRouterSpecListenerPortMapping extends js.Object {
  /**
    * The port used for the port mapping.
    */
  var port: Input[Double] = js.native
  /**
    * The protocol used for the port mapping. Valid values are `http` and `tcp`.
    */
  var protocol: Input[String] = js.native
}

object VirtualRouterSpecListenerPortMapping {
  @scala.inline
  def apply(port: Input[Double], protocol: Input[String]): VirtualRouterSpecListenerPortMapping = {
    val __obj = js.Dynamic.literal(port = port.asInstanceOf[js.Any], protocol = protocol.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[VirtualRouterSpecListenerPortMapping]
  }
}

