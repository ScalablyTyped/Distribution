package typings.pulumiAws.vpcEndpointServiceAllowedPrincipleMod

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VpcEndpointServiceAllowedPrincipleArgs extends js.Object {
  
  /**
    * The ARN of the principal to allow permissions.
    */
  val principalArn: Input[String] = js.native
  
  /**
    * The ID of the VPC endpoint service to allow permission.
    */
  val vpcEndpointServiceId: Input[String] = js.native
}
object VpcEndpointServiceAllowedPrincipleArgs {
  
  @scala.inline
  def apply(principalArn: Input[String], vpcEndpointServiceId: Input[String]): VpcEndpointServiceAllowedPrincipleArgs = {
    val __obj = js.Dynamic.literal(principalArn = principalArn.asInstanceOf[js.Any], vpcEndpointServiceId = vpcEndpointServiceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[VpcEndpointServiceAllowedPrincipleArgs]
  }
  
  @scala.inline
  implicit class VpcEndpointServiceAllowedPrincipleArgsOps[Self <: VpcEndpointServiceAllowedPrincipleArgs] (val x: Self) extends AnyVal {
    
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
    def setPrincipalArn(value: Input[String]): Self = this.set("principalArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVpcEndpointServiceId(value: Input[String]): Self = this.set("vpcEndpointServiceId", value.asInstanceOf[js.Any])
  }
}
