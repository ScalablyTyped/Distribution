package typings.atPulumiAws.typesOutputMod.daxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClusterNode extends js.Object {
  var address: String
  var availabilityZone: String
  var id: String
  /**
    * The port used by the configuration endpoint
    */
  var port: Double
}

object ClusterNode {
  @scala.inline
  def apply(address: String, availabilityZone: String, id: String, port: Double): ClusterNode = {
    val __obj = js.Dynamic.literal(address = address, availabilityZone = availabilityZone, id = id, port = port)
  
    __obj.asInstanceOf[ClusterNode]
  }
}

