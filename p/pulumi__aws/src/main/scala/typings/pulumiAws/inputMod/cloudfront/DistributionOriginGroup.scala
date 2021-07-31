package typings.pulumiAws.inputMod.cloudfront

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DistributionOriginGroup extends StObject {
  
  /**
    * The failover criteria for when to failover to the secondary origin
    */
  var failoverCriteria: Input[DistributionOriginGroupFailoverCriteria]
  
  /**
    * Ordered member configuration blocks assigned to the origin group, where the first member is the primary origin. You must specify two members.
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
  
  @scala.inline
  implicit class DistributionOriginGroupMutableBuilder[Self <: DistributionOriginGroup] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFailoverCriteria(value: Input[DistributionOriginGroupFailoverCriteria]): Self = StObject.set(x, "failoverCriteria", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMembers(value: Input[js.Array[Input[DistributionOriginGroupMember]]]): Self = StObject.set(x, "members", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMembersVarargs(value: Input[DistributionOriginGroupMember]*): Self = StObject.set(x, "members", js.Array(value :_*))
    
    @scala.inline
    def setOriginId(value: Input[String]): Self = StObject.set(x, "originId", value.asInstanceOf[js.Any])
  }
}
