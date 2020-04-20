package typings.pulumiAws.inputMod.appmesh

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VirtualNodeSpecServiceDiscoveryDns extends js.Object {
  /**
    * The DNS host name for your virtual node.
    */
  var hostname: Input[String] = js.native
}

object VirtualNodeSpecServiceDiscoveryDns {
  @scala.inline
  def apply(hostname: Input[String]): VirtualNodeSpecServiceDiscoveryDns = {
    val __obj = js.Dynamic.literal(hostname = hostname.asInstanceOf[js.Any])
    __obj.asInstanceOf[VirtualNodeSpecServiceDiscoveryDns]
  }
}

