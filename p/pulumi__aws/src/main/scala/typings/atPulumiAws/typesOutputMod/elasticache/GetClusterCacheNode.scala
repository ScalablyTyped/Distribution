package typings.atPulumiAws.typesOutputMod.elasticache

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetClusterCacheNode extends js.Object {
  var address: String = js.native
  /**
    * The Availability Zone for the cache cluster.
    */
  var availabilityZone: String = js.native
  var id: String = js.native
  /**
    * The port number on which each of the cache nodes will
    * accept connections.
    */
  var port: Double = js.native
}

object GetClusterCacheNode {
  @scala.inline
  def apply(address: String, availabilityZone: String, id: String, port: Double): GetClusterCacheNode = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], availabilityZone = availabilityZone.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetClusterCacheNode]
  }
}

