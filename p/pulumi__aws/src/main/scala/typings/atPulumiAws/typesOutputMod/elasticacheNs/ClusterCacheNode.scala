package typings.atPulumiAws.typesOutputMod.elasticacheNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClusterCacheNode extends js.Object {
  var address: String
  /**
    * The Availability Zone for the cache cluster. If you want to create cache nodes in multi-az, use `preferredAvailabilityZones` instead. Default: System chosen Availability Zone.
    */
  var availabilityZone: String
  var id: String
  /**
    * The port number on which each of the cache nodes will accept connections. For Memcache the default is 11211, and for Redis the default port is 6379. Cannot be provided with `replicationGroupId`.
    */
  var port: Double
}

object ClusterCacheNode {
  @scala.inline
  def apply(address: String, availabilityZone: String, id: String, port: Double): ClusterCacheNode = {
    val __obj = js.Dynamic.literal(address = address, availabilityZone = availabilityZone, id = id, port = port)
  
    __obj.asInstanceOf[ClusterCacheNode]
  }
}

