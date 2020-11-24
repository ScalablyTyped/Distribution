package typings.pulumiAws.outputMod.transfer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ServerEndpointDetails extends js.Object {
  
  /**
    * A list of address allocation IDs that are required to attach an Elastic IP address to your SFTP server's endpoint. This property can only be used when `endpointType` is set to `VPC`.
    */
  var addressAllocationIds: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * A list of subnet IDs that are required to host your SFTP server endpoint in your VPC. This property can only be used when `endpointType` is set to `VPC`.
    */
  var subnetIds: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * The ID of the VPC endpoint. This property can only be used when `endpointType` is set to `VPC_ENDPOINT`
    */
  var vpcEndpointId: String = js.native
  
  /**
    * The VPC ID of the virtual private cloud in which the SFTP server's endpoint will be hosted. This property can only be used when `endpointType` is set to `VPC`.
    */
  var vpcId: js.UndefOr[String] = js.native
}
object ServerEndpointDetails {
  
  @scala.inline
  def apply(vpcEndpointId: String): ServerEndpointDetails = {
    val __obj = js.Dynamic.literal(vpcEndpointId = vpcEndpointId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServerEndpointDetails]
  }
  
  @scala.inline
  implicit class ServerEndpointDetailsOps[Self <: ServerEndpointDetails] (val x: Self) extends AnyVal {
    
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
    def setVpcEndpointId(value: String): Self = this.set("vpcEndpointId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddressAllocationIdsVarargs(value: String*): Self = this.set("addressAllocationIds", js.Array(value :_*))
    
    @scala.inline
    def setAddressAllocationIds(value: js.Array[String]): Self = this.set("addressAllocationIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAddressAllocationIds: Self = this.set("addressAllocationIds", js.undefined)
    
    @scala.inline
    def setSubnetIdsVarargs(value: String*): Self = this.set("subnetIds", js.Array(value :_*))
    
    @scala.inline
    def setSubnetIds(value: js.Array[String]): Self = this.set("subnetIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubnetIds: Self = this.set("subnetIds", js.undefined)
    
    @scala.inline
    def setVpcId(value: String): Self = this.set("vpcId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVpcId: Self = this.set("vpcId", js.undefined)
  }
}
