package typings.pulumiAws.vpcEndpointSubnetAssociationMod

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VpcEndpointSubnetAssociationArgs extends js.Object {
  
  /**
    * The ID of the subnet to be associated with the VPC endpoint.
    */
  val subnetId: Input[String] = js.native
  
  /**
    * The ID of the VPC endpoint with which the subnet will be associated.
    */
  val vpcEndpointId: Input[String] = js.native
}
object VpcEndpointSubnetAssociationArgs {
  
  @scala.inline
  def apply(subnetId: Input[String], vpcEndpointId: Input[String]): VpcEndpointSubnetAssociationArgs = {
    val __obj = js.Dynamic.literal(subnetId = subnetId.asInstanceOf[js.Any], vpcEndpointId = vpcEndpointId.asInstanceOf[js.Any])
    __obj.asInstanceOf[VpcEndpointSubnetAssociationArgs]
  }
  
  @scala.inline
  implicit class VpcEndpointSubnetAssociationArgsOps[Self <: VpcEndpointSubnetAssociationArgs] (val x: Self) extends AnyVal {
    
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
    def setSubnetId(value: Input[String]): Self = this.set("subnetId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVpcEndpointId(value: Input[String]): Self = this.set("vpcEndpointId", value.asInstanceOf[js.Any])
  }
}
