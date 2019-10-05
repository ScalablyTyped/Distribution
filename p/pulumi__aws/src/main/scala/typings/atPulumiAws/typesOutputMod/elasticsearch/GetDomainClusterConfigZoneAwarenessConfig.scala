package typings.atPulumiAws.typesOutputMod.elasticsearch

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetDomainClusterConfigZoneAwarenessConfig extends js.Object {
  /**
    * Number of availability zones used.
    */
  var availabilityZoneCount: Double
}

object GetDomainClusterConfigZoneAwarenessConfig {
  @scala.inline
  def apply(availabilityZoneCount: Double): GetDomainClusterConfigZoneAwarenessConfig = {
    val __obj = js.Dynamic.literal(availabilityZoneCount = availabilityZoneCount)
  
    __obj.asInstanceOf[GetDomainClusterConfigZoneAwarenessConfig]
  }
}

