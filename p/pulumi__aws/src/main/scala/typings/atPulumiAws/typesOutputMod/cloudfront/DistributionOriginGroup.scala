package typings.atPulumiAws.typesOutputMod.cloudfront

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DistributionOriginGroup extends js.Object {
  /**
    * The failover criteria for when to failover to the secondary origin
    */
  var failoverCriteria: DistributionOriginGroupFailoverCriteria
  /**
    * Ordered member configuration blocks assigned to the origin group, where the first member is the primary origin. Minimum 2.
    */
  var members: js.Array[DistributionOriginGroupMember]
  /**
    * The unique identifier of the member origin
    */
  var originId: String
}

object DistributionOriginGroup {
  @scala.inline
  def apply(
    failoverCriteria: DistributionOriginGroupFailoverCriteria,
    members: js.Array[DistributionOriginGroupMember],
    originId: String
  ): DistributionOriginGroup = {
    val __obj = js.Dynamic.literal(failoverCriteria = failoverCriteria, members = members, originId = originId)
  
    __obj.asInstanceOf[DistributionOriginGroup]
  }
}

