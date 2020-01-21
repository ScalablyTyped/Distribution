package typings.pulumiAws.outputMod.dax

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClusterNode extends js.Object {
  var address: String = js.native
  var availabilityZone: String = js.native
  var id: String = js.native
  /**
    * The port used by the configuration endpoint
    */
  var port: Double = js.native
}

object ClusterNode {
  @scala.inline
  def apply(address: String, availabilityZone: String, id: String, port: Double): ClusterNode = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], availabilityZone = availabilityZone.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ClusterNode]
  }
}

