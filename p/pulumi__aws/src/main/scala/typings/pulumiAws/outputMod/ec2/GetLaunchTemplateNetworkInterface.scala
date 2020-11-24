package typings.pulumiAws.outputMod.ec2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetLaunchTemplateNetworkInterface extends js.Object {
  
  var associatePublicIpAddress: js.UndefOr[Boolean] = js.native
  
  var deleteOnTermination: js.UndefOr[Boolean] = js.native
  
  /**
    * Description of the launch template.
    */
  var description: String = js.native
  
  var deviceIndex: Double = js.native
  
  var ipv4AddressCount: Double = js.native
  
  var ipv4Addresses: js.Array[String] = js.native
  
  var ipv6AddressCount: Double = js.native
  
  var ipv6Addresses: js.Array[String] = js.native
  
  var networkInterfaceId: String = js.native
  
  var privateIpAddress: String = js.native
  
  var securityGroups: js.Array[String] = js.native
  
  var subnetId: String = js.native
}
object GetLaunchTemplateNetworkInterface {
  
  @scala.inline
  def apply(
    description: String,
    deviceIndex: Double,
    ipv4AddressCount: Double,
    ipv4Addresses: js.Array[String],
    ipv6AddressCount: Double,
    ipv6Addresses: js.Array[String],
    networkInterfaceId: String,
    privateIpAddress: String,
    securityGroups: js.Array[String],
    subnetId: String
  ): GetLaunchTemplateNetworkInterface = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], deviceIndex = deviceIndex.asInstanceOf[js.Any], ipv4AddressCount = ipv4AddressCount.asInstanceOf[js.Any], ipv4Addresses = ipv4Addresses.asInstanceOf[js.Any], ipv6AddressCount = ipv6AddressCount.asInstanceOf[js.Any], ipv6Addresses = ipv6Addresses.asInstanceOf[js.Any], networkInterfaceId = networkInterfaceId.asInstanceOf[js.Any], privateIpAddress = privateIpAddress.asInstanceOf[js.Any], securityGroups = securityGroups.asInstanceOf[js.Any], subnetId = subnetId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetLaunchTemplateNetworkInterface]
  }
  
  @scala.inline
  implicit class GetLaunchTemplateNetworkInterfaceOps[Self <: GetLaunchTemplateNetworkInterface] (val x: Self) extends AnyVal {
    
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
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeviceIndex(value: Double): Self = this.set("deviceIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIpv4AddressCount(value: Double): Self = this.set("ipv4AddressCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIpv4AddressesVarargs(value: String*): Self = this.set("ipv4Addresses", js.Array(value :_*))
    
    @scala.inline
    def setIpv4Addresses(value: js.Array[String]): Self = this.set("ipv4Addresses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIpv6AddressCount(value: Double): Self = this.set("ipv6AddressCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIpv6AddressesVarargs(value: String*): Self = this.set("ipv6Addresses", js.Array(value :_*))
    
    @scala.inline
    def setIpv6Addresses(value: js.Array[String]): Self = this.set("ipv6Addresses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNetworkInterfaceId(value: String): Self = this.set("networkInterfaceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrivateIpAddress(value: String): Self = this.set("privateIpAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecurityGroupsVarargs(value: String*): Self = this.set("securityGroups", js.Array(value :_*))
    
    @scala.inline
    def setSecurityGroups(value: js.Array[String]): Self = this.set("securityGroups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubnetId(value: String): Self = this.set("subnetId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAssociatePublicIpAddress(value: Boolean): Self = this.set("associatePublicIpAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAssociatePublicIpAddress: Self = this.set("associatePublicIpAddress", js.undefined)
    
    @scala.inline
    def setDeleteOnTermination(value: Boolean): Self = this.set("deleteOnTermination", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeleteOnTermination: Self = this.set("deleteOnTermination", js.undefined)
  }
}
