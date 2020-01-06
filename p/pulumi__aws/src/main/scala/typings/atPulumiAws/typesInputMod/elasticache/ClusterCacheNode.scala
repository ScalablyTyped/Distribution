package typings.atPulumiAws.typesInputMod.elasticache

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClusterCacheNode extends js.Object {
  var address: js.UndefOr[Input[String]] = js.native
  /**
    * The Availability Zone for the cache cluster. If you want to create cache nodes in multi-az, use `preferredAvailabilityZones` instead. Default: System chosen Availability Zone.
    */
  var availabilityZone: js.UndefOr[Input[String]] = js.native
  var id: js.UndefOr[Input[String]] = js.native
  /**
    * The port number on which each of the cache nodes will accept connections. For Memcache the default is 11211, and for Redis the default port is 6379. Cannot be provided with `replicationGroupId`.
    */
  var port: js.UndefOr[Input[Double]] = js.native
}

object ClusterCacheNode {
  @scala.inline
  def apply(
    address: Input[String] = null,
    availabilityZone: Input[String] = null,
    id: Input[String] = null,
    port: Input[Double] = null
  ): ClusterCacheNode = {
    val __obj = js.Dynamic.literal()
    if (address != null) __obj.updateDynamic("address")(address.asInstanceOf[js.Any])
    if (availabilityZone != null) __obj.updateDynamic("availabilityZone")(availabilityZone.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (port != null) __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClusterCacheNode]
  }
}

