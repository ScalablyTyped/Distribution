package typings.pulumiAws.outputMod.ec2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetNetworkInterfaceAssociation extends js.Object {
  
  /**
    * The allocation ID.
    */
  var allocationId: String = js.native
  
  /**
    * The association ID.
    */
  var associationId: String = js.native
  
  /**
    * The ID of the Elastic IP address owner.
    */
  var ipOwnerId: String = js.native
  
  /**
    * The public DNS name.
    */
  var publicDnsName: String = js.native
  
  /**
    * The address of the Elastic IP address bound to the network interface.
    */
  var publicIp: String = js.native
}
object GetNetworkInterfaceAssociation {
  
  @scala.inline
  def apply(
    allocationId: String,
    associationId: String,
    ipOwnerId: String,
    publicDnsName: String,
    publicIp: String
  ): GetNetworkInterfaceAssociation = {
    val __obj = js.Dynamic.literal(allocationId = allocationId.asInstanceOf[js.Any], associationId = associationId.asInstanceOf[js.Any], ipOwnerId = ipOwnerId.asInstanceOf[js.Any], publicDnsName = publicDnsName.asInstanceOf[js.Any], publicIp = publicIp.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetNetworkInterfaceAssociation]
  }
  
  @scala.inline
  implicit class GetNetworkInterfaceAssociationOps[Self <: GetNetworkInterfaceAssociation] (val x: Self) extends AnyVal {
    
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
    def setAllocationId(value: String): Self = this.set("allocationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAssociationId(value: String): Self = this.set("associationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIpOwnerId(value: String): Self = this.set("ipOwnerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPublicDnsName(value: String): Self = this.set("publicDnsName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPublicIp(value: String): Self = this.set("publicIp", value.asInstanceOf[js.Any])
  }
}
