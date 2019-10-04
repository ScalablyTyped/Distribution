package typings.atPulumiAws.typesOutputMod.elasticacheNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetClusterCacheNode extends js.Object {
  var address: String
  /**
    * The Availability Zone for the cache cluster.
    */
  var availabilityZone: String
  var id: String
  /**
    * The port number on which each of the cache nodes will
    * accept connections.
    */
  var port: Double
}

object GetClusterCacheNode {
  @scala.inline
  def apply(address: String, availabilityZone: String, id: String, port: Double): GetClusterCacheNode = {
    val __obj = js.Dynamic.literal(address = address, availabilityZone = availabilityZone, id = id, port = port)
  
    __obj.asInstanceOf[GetClusterCacheNode]
  }
}

