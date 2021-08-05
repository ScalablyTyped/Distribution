package typings.pulumiAws.outputMod.codebuild

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProjectVpcConfig extends StObject {
  
  /**
    * The security group IDs to assign to running builds.
    */
  var securityGroupIds: js.Array[String]
  
  /**
    * The subnet IDs within which to run builds.
    */
  var subnets: js.Array[String]
  
  /**
    * The ID of the VPC within which to run builds.
    */
  var vpcId: String
}
object ProjectVpcConfig {
  
  inline def apply(securityGroupIds: js.Array[String], subnets: js.Array[String], vpcId: String): ProjectVpcConfig = {
    val __obj = js.Dynamic.literal(securityGroupIds = securityGroupIds.asInstanceOf[js.Any], subnets = subnets.asInstanceOf[js.Any], vpcId = vpcId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProjectVpcConfig]
  }
  
  extension [Self <: ProjectVpcConfig](x: Self) {
    
    inline def setSecurityGroupIds(value: js.Array[String]): Self = StObject.set(x, "securityGroupIds", value.asInstanceOf[js.Any])
    
    inline def setSecurityGroupIdsVarargs(value: String*): Self = StObject.set(x, "securityGroupIds", js.Array(value :_*))
    
    inline def setSubnets(value: js.Array[String]): Self = StObject.set(x, "subnets", value.asInstanceOf[js.Any])
    
    inline def setSubnetsVarargs(value: String*): Self = StObject.set(x, "subnets", js.Array(value :_*))
    
    inline def setVpcId(value: String): Self = StObject.set(x, "vpcId", value.asInstanceOf[js.Any])
  }
}
