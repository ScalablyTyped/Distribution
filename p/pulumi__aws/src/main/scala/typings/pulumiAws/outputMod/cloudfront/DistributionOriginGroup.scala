package typings.pulumiAws.outputMod.cloudfront

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DistributionOriginGroup extends StObject {
  
  /**
    * The failover criteria for when to failover to the secondary origin
    */
  var failoverCriteria: DistributionOriginGroupFailoverCriteria
  
  /**
    * Ordered member configuration blocks assigned to the origin group, where the first member is the primary origin. You must specify two members.
    */
  var members: js.Array[DistributionOriginGroupMember]
  
  /**
    * The unique identifier of the member origin
    */
  var originId: String
}
object DistributionOriginGroup {
  
  inline def apply(
    failoverCriteria: DistributionOriginGroupFailoverCriteria,
    members: js.Array[DistributionOriginGroupMember],
    originId: String
  ): DistributionOriginGroup = {
    val __obj = js.Dynamic.literal(failoverCriteria = failoverCriteria.asInstanceOf[js.Any], members = members.asInstanceOf[js.Any], originId = originId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DistributionOriginGroup]
  }
  
  extension [Self <: DistributionOriginGroup](x: Self) {
    
    inline def setFailoverCriteria(value: DistributionOriginGroupFailoverCriteria): Self = StObject.set(x, "failoverCriteria", value.asInstanceOf[js.Any])
    
    inline def setMembers(value: js.Array[DistributionOriginGroupMember]): Self = StObject.set(x, "members", value.asInstanceOf[js.Any])
    
    inline def setMembersVarargs(value: DistributionOriginGroupMember*): Self = StObject.set(x, "members", js.Array(value :_*))
    
    inline def setOriginId(value: String): Self = StObject.set(x, "originId", value.asInstanceOf[js.Any])
  }
}
