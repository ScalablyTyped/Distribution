package typings.atPulumiAws.typesOutputMod.appmesh

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VirtualNodeSpecServiceDiscoveryDns extends js.Object {
  /**
    * The DNS host name for your virtual node.
    */
  var hostname: String
}

object VirtualNodeSpecServiceDiscoveryDns {
  @scala.inline
  def apply(hostname: String): VirtualNodeSpecServiceDiscoveryDns = {
    val __obj = js.Dynamic.literal(hostname = hostname)
  
    __obj.asInstanceOf[VirtualNodeSpecServiceDiscoveryDns]
  }
}

