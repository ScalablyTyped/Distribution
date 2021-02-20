package typings.pulumiAws.outputMod.codebuild

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProjectVpcConfig extends StObject {
  
  /**
    * The security group IDs to assign to running builds.
    */
  var securityGroupIds: js.Array[String] = js.native
  
  /**
    * The subnet IDs within which to run builds.
    */
  var subnets: js.Array[String] = js.native
  
  /**
    * The ID of the VPC within which to run builds.
    */
  var vpcId: String = js.native
}
object ProjectVpcConfig {
  
  @scala.inline
  def apply(securityGroupIds: js.Array[String], subnets: js.Array[String], vpcId: String): ProjectVpcConfig = {
    val __obj = js.Dynamic.literal(securityGroupIds = securityGroupIds.asInstanceOf[js.Any], subnets = subnets.asInstanceOf[js.Any], vpcId = vpcId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProjectVpcConfig]
  }
  
  @scala.inline
  implicit class ProjectVpcConfigMutableBuilder[Self <: ProjectVpcConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSecurityGroupIds(value: js.Array[String]): Self = StObject.set(x, "securityGroupIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecurityGroupIdsVarargs(value: String*): Self = StObject.set(x, "securityGroupIds", js.Array(value :_*))
    
    @scala.inline
    def setSubnets(value: js.Array[String]): Self = StObject.set(x, "subnets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubnetsVarargs(value: String*): Self = StObject.set(x, "subnets", js.Array(value :_*))
    
    @scala.inline
    def setVpcId(value: String): Self = StObject.set(x, "vpcId", value.asInstanceOf[js.Any])
  }
}
