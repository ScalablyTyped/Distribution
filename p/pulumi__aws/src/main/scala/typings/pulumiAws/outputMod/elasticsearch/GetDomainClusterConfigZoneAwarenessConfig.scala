package typings.pulumiAws.outputMod.elasticsearch

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetDomainClusterConfigZoneAwarenessConfig extends js.Object {
  /**
    * Number of availability zones used.
    */
  var availabilityZoneCount: Double = js.native
}

object GetDomainClusterConfigZoneAwarenessConfig {
  @scala.inline
  def apply(availabilityZoneCount: Double): GetDomainClusterConfigZoneAwarenessConfig = {
    val __obj = js.Dynamic.literal(availabilityZoneCount = availabilityZoneCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetDomainClusterConfigZoneAwarenessConfig]
  }
}

