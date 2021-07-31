package typings.pulumiAws.outputMod.elasticsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetDomainVpcOption extends StObject {
  
  /**
    * The availability zones used by the domain.
    */
  var availabilityZones: js.Array[String]
  
  /**
    * The security groups used by the domain.
    */
  var securityGroupIds: js.Array[String]
  
  /**
    * The subnets used by the domain.
    */
  var subnetIds: js.Array[String]
  
  /**
    * The VPC used by the domain.
    */
  var vpcId: String
}
object GetDomainVpcOption {
  
  @scala.inline
  def apply(
    availabilityZones: js.Array[String],
    securityGroupIds: js.Array[String],
    subnetIds: js.Array[String],
    vpcId: String
  ): GetDomainVpcOption = {
    val __obj = js.Dynamic.literal(availabilityZones = availabilityZones.asInstanceOf[js.Any], securityGroupIds = securityGroupIds.asInstanceOf[js.Any], subnetIds = subnetIds.asInstanceOf[js.Any], vpcId = vpcId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetDomainVpcOption]
  }
  
  @scala.inline
  implicit class GetDomainVpcOptionMutableBuilder[Self <: GetDomainVpcOption] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAvailabilityZones(value: js.Array[String]): Self = StObject.set(x, "availabilityZones", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAvailabilityZonesVarargs(value: String*): Self = StObject.set(x, "availabilityZones", js.Array(value :_*))
    
    @scala.inline
    def setSecurityGroupIds(value: js.Array[String]): Self = StObject.set(x, "securityGroupIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecurityGroupIdsVarargs(value: String*): Self = StObject.set(x, "securityGroupIds", js.Array(value :_*))
    
    @scala.inline
    def setSubnetIds(value: js.Array[String]): Self = StObject.set(x, "subnetIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubnetIdsVarargs(value: String*): Self = StObject.set(x, "subnetIds", js.Array(value :_*))
    
    @scala.inline
    def setVpcId(value: String): Self = StObject.set(x, "vpcId", value.asInstanceOf[js.Any])
  }
}
