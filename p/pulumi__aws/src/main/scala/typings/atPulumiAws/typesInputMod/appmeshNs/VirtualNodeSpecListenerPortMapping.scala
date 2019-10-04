package typings.atPulumiAws.typesInputMod.appmeshNs

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VirtualNodeSpecListenerPortMapping extends js.Object {
  /**
    * The destination port for the health check request. This port must match the port defined in the `portMapping` for the listener.
    */
  var port: Input[Double]
  /**
    * The protocol for the health check request. Valid values are `http` and `tcp`.
    */
  var protocol: Input[String]
}

object VirtualNodeSpecListenerPortMapping {
  @scala.inline
  def apply(port: Input[Double], protocol: Input[String]): VirtualNodeSpecListenerPortMapping = {
    val __obj = js.Dynamic.literal(port = port.asInstanceOf[js.Any], protocol = protocol.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[VirtualNodeSpecListenerPortMapping]
  }
}

