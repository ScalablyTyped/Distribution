package typings.pulumiAws.outputMod.cloudfront

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
    def setFailoverCriteria(value: DistributionOriginGroupFailoverCriteria): Self = this.set("failoverCriteria", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMembersVarargs(value: DistributionOriginGroupMember*): Self = this.set("members", js.Array(value :_*))
    
    @scala.inline
    def setMembers(value: js.Array[DistributionOriginGroupMember]): Self = this.set("members", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOriginId(value: String): Self = this.set("originId", value.asInstanceOf[js.Any])
  }
}
