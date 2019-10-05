package typings.atPulumiAws.typesInputMod.appmesh

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VirtualNodeSpecListener extends js.Object {
  /**
    * The health check information for the listener.
    */
  var healthCheck: js.UndefOr[Input[VirtualNodeSpecListenerHealthCheck]] = js.undefined
  /**
    * The port mapping information for the listener.
    */
  var portMapping: Input[VirtualNodeSpecListenerPortMapping]
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

