package typings.pulumiAws.inputMod.codebuild

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProjectVpcConfig extends StObject {
  
  /**
    * The security group IDs to assign to running builds.
    */
  var securityGroupIds: Input[js.Array[Input[String]]]
  
  /**
    * The subnet IDs within which to run builds.
    */
  var subnets: Input[js.Array[Input[String]]]
  
  /**
    * The ID of the VPC within which to run builds.
    */
  var vpcId: Input[String]
}
object ProjectVpcConfig {
  
  @scala.inline
  def apply(
    securityGroupIds: Input[js.Array[Input[String]]],
    subnets: Input[js.Array[Input[String]]],
    vpcId: Input[String]
  ): ProjectVpcConfig = {
    val __obj = js.Dynamic.literal(securityGroupIds = securityGroupIds.asInstanceOf[js.Any], subnets = subnets.asInstanceOf[js.Any], vpcId = vpcId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProjectVpcConfig]
  }
  
  @scala.inline
  implicit class ProjectVpcConfigMutableBuilder[Self <: ProjectVpcConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSecurityGroupIds(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "securityGroupIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecurityGroupIdsVarargs(value: Input[String]*): Self = StObject.set(x, "securityGroupIds", js.Array(value :_*))
    
    @scala.inline
    def setSubnets(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "subnets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubnetsVarargs(value: Input[String]*): Self = StObject.set(x, "subnets", js.Array(value :_*))
    
    @scala.inline
    def setVpcId(value: Input[String]): Self = StObject.set(x, "vpcId", value.asInstanceOf[js.Any])
  }
}
