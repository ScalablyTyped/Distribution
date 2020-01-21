package typings.pulumiAws.inputMod.appmesh

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VirtualNodeSpecListener extends js.Object {
  /**
    * The health check information for the listener.
    */
  var healthCheck: js.UndefOr[Input[VirtualNodeSpecListenerHealthCheck]] = js.native
  /**
    * The port mapping information for the listener.
    */
  var portMapping: Input[VirtualNodeSpecListenerPortMapping] = js.native
}

object VirtualNodeSpecListener {
  @scala.inline
  def apply(
    portMapping: Input[VirtualNodeSpecListenerPortMapping],
    healthCheck: Input[VirtualNodeSpecListenerHealthCheck] = null
  ): VirtualNodeSpecListener = {
    val __obj = js.Dynamic.literal(portMapping = portMapping.asInstanceOf[js.Any])
    if (healthCheck != null) __obj.updateDynamic("healthCheck")(healthCheck.asInstanceOf[js.Any])
    __obj.asInstanceOf[VirtualNodeSpecListener]
  }
}

