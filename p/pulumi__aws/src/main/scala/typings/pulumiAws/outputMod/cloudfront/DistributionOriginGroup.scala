package typings.pulumiAws.outputMod.cloudfront

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DistributionOriginGroup extends js.Object {
  /**
    * The failover criteria for when to failover to the secondary origin
    */
  var failoverCriteria: DistributionOriginGroupFailoverCriteria = js.native
  /**
    * Ordered member configuration blocks assigned to the origin group, where the first member is the primary origin. You must specify two members.
    */
  var members: js.Array[DistributionOriginGroupMember] = js.native
  /**
    * The unique identifier of the member origin
    */
  var originId: String = js.native
}

object DistributionOriginGroup {
  @scala.inline
  def apply(
    failoverCriteria: DistributionOriginGroupFailoverCriteria,
    members: js.Array[DistributionOriginGroupMember],
    originId: String
  ): DistributionOriginGroup = {
    val __obj = js.Dynamic.literal(failoverCriteria = failoverCriteria.asInstanceOf[js.Any], members = members.asInstanceOf[js.Any], originId = originId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DistributionOriginGroup]
  }
}

