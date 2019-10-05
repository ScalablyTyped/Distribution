package typings.atPulumiAws.typesOutputMod.appmesh

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VirtualNodeSpecListener extends js.Object {
  /**
    * The health check information for the listener.
    */
  var healthCheck: js.UndefOr[VirtualNodeSpecListenerHealthCheck] = js.undefined
  /**
    * The port mapping information for the listener.
    */
  var portMapping: VirtualNodeSpecListenerPortMapping
}

object VirtualNodeSpecListener {
  @scala.inline
  def apply(
    portMapping: VirtualNodeSpecListenerPortMapping,
    healthCheck: VirtualNodeSpecListenerHealthCheck = null
  ): VirtualNodeSpecListener = {
    val __obj = js.Dynamic.literal(portMapping = portMapping)
    if (healthCheck != null) __obj.updateDynamic("healthCheck")(healthCheck)
    __obj.asInstanceOf[VirtualNodeSpecListener]
  }
}

