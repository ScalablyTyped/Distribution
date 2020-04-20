package typings.pulumiAws.outputMod.elasticache

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClusterCacheNode extends js.Object {
  var address: String = js.native
  /**
    * The Availability Zone for the cache cluster. If you want to create cache nodes in multi-az, use `preferredAvailabilityZones` instead. Default: System chosen Availability Zone.
    */
  var availabilityZone: String = js.native
  var id: String = js.native
  /**
    * The port number on which each of the cache nodes will accept connections. For Memcache the default is 11211, and for Redis the default port is 6379. Cannot be provided with `replicationGroupId`.
    */
  var port: Double = js.native
}

object ClusterCacheNode {
  @scala.inline
  def apply(address: String, availabilityZone: String, id: String, port: Double): ClusterCacheNode = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], availabilityZone = availabilityZone.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClusterCacheNode]
  }
}

