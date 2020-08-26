package typings.pulumiAws.outputMod.elasticache

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
  @scala.inline
  implicit class GetClusterCacheNodeOps[Self <: GetClusterCacheNode] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAddress(value: String): Self = this.set("address", value.asInstanceOf[js.Any])
    @scala.inline
    def setAvailabilityZone(value: String): Self = this.set("availabilityZone", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setPort(value: Double): Self = this.set("port", value.asInstanceOf[js.Any])
  }
  
}

