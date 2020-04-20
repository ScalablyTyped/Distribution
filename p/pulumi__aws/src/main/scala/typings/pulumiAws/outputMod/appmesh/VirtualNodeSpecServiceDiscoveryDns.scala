package typings.pulumiAws.outputMod.appmesh

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VirtualNodeSpecServiceDiscoveryDns extends js.Object {
  /**
    * The DNS host name for your virtual node.
    */
  var hostname: String = js.native
}

object VirtualNodeSpecServiceDiscoveryDns {
  @scala.inline
  def apply(hostname: String): VirtualNodeSpecServiceDiscoveryDns = {
    val __obj = js.Dynamic.literal(hostname = hostname.asInstanceOf[js.Any])
    __obj.asInstanceOf[VirtualNodeSpecServiceDiscoveryDns]
  }
}

