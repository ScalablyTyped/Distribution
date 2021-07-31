package typings.pulumiAws.inputMod.ecs

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ServiceNetworkConfiguration extends StObject {
  
  /**
    * Assign a public IP address to the ENI (Fargate launch type only). Valid values are `true` or `false`. Default `false`.
    */
  var assignPublicIp: js.UndefOr[Input[Boolean]] = js.undefined
  
  /**
    * The security groups associated with the task or service. If you do not specify a security group, the default security group for the VPC is used.
    */
  var securityGroups: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
  
  /**
    * The subnets associated with the task or service.
    */
  var subnets: Input[js.Array[Input[String]]]
}
object ServiceNetworkConfiguration {
  
  @scala.inline
  def apply(subnets: Input[js.Array[Input[String]]]): ServiceNetworkConfiguration = {
    val __obj = js.Dynamic.literal(subnets = subnets.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServiceNetworkConfiguration]
  }
  
  @scala.inline
  implicit class ServiceNetworkConfigurationMutableBuilder[Self <: ServiceNetworkConfiguration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAssignPublicIp(value: Input[Boolean]): Self = StObject.set(x, "assignPublicIp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAssignPublicIpUndefined: Self = StObject.set(x, "assignPublicIp", js.undefined)
    
    @scala.inline
    def setSecurityGroups(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "securityGroups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecurityGroupsUndefined: Self = StObject.set(x, "securityGroups", js.undefined)
    
    @scala.inline
    def setSecurityGroupsVarargs(value: Input[String]*): Self = StObject.set(x, "securityGroups", js.Array(value :_*))
    
    @scala.inline
    def setSubnets(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "subnets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubnetsVarargs(value: Input[String]*): Self = StObject.set(x, "subnets", js.Array(value :_*))
  }
}
