package typings.atPulumiAws.typesInputMod.cloudfront

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DistributionOriginGroup extends js.Object {
  /**
    * The failover criteria for when to failover to the secondary origin
    */
  var failoverCriteria: Input[DistributionOriginGroupFailoverCriteria]
  /**
    * Ordered member configuration blocks assigned to the origin group, where the first member is the primary origin. Minimum 2.
    */
  var members: Input[js.Array[Input[DistributionOriginGroupMember]]]
  /**
    * The unique identifier of the member origin
    */
  var originId: Input[String]
}

object DistributionOriginGroup {
  @scala.inline
  def apply(
    failoverCriteria: Input[DistributionOriginGroupFailoverCriteria],
    members: Input[js.Array[Input[DistributionOriginGroupMember]]],
    originId: Input[String]
  ): DistributionOriginGroup = {
    val __obj = js.Dynamic.literal(failoverCriteria = failoverCriteria.asInstanceOf[js.Any], members = members.asInstanceOf[js.Any], originId = originId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DistributionOriginGroup]
  }
}

