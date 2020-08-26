package typings.pulumiAws.inputMod.cloudfront

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DistributionOriginGroup extends js.Object {
  /**
    * The failover criteria for when to failover to the secondary origin
    */
  var failoverCriteria: Input[DistributionOriginGroupFailoverCriteria] = js.native
  /**
    * Ordered member configuration blocks assigned to the origin group, where the first member is the primary origin. You must specify two members.
    */
  var members: Input[js.Array[Input[DistributionOriginGroupMember]]] = js.native
  /**
    * The unique identifier of the member origin
    */
  var originId: Input[String] = js.native
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
  @scala.inline
  implicit class DistributionOriginGroupOps[Self <: DistributionOriginGroup] (val x: Self) extends AnyVal {
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
    def setFailoverCriteria(value: Input[DistributionOriginGroupFailoverCriteria]): Self = this.set("failoverCriteria", value.asInstanceOf[js.Any])
    @scala.inline
    def setMembersVarargs(value: Input[DistributionOriginGroupMember]*): Self = this.set("members", js.Array(value :_*))
    @scala.inline
    def setMembers(value: Input[js.Array[Input[DistributionOriginGroupMember]]]): Self = this.set("members", value.asInstanceOf[js.Any])
    @scala.inline
    def setOriginId(value: Input[String]): Self = this.set("originId", value.asInstanceOf[js.Any])
  }
  
}

