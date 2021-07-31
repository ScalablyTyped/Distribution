package typings.pulumiAws.outputMod.ec2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetLaunchTemplateNetworkInterface extends StObject {
  
  var associatePublicIpAddress: js.UndefOr[Boolean] = js.undefined
  
  var deleteOnTermination: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Description of the launch template.
    */
  var description: String
  
  var deviceIndex: Double
  
  var ipv4AddressCount: Double
  
  var ipv4Addresses: js.Array[String]
  
  var ipv6AddressCount: Double
  
  var ipv6Addresses: js.Array[String]
  
  var networkInterfaceId: String
  
  var privateIpAddress: String
  
  var securityGroups: js.Array[String]
  
  var subnetId: String
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
  implicit class GetLaunchTemplateNetworkInterfaceMutableBuilder[Self <: GetLaunchTemplateNetworkInterface] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAssociatePublicIpAddress(value: Boolean): Self = StObject.set(x, "associatePublicIpAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAssociatePublicIpAddressUndefined: Self = StObject.set(x, "associatePublicIpAddress", js.undefined)
    
    @scala.inline
    def setDeleteOnTermination(value: Boolean): Self = StObject.set(x, "deleteOnTermination", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeleteOnTerminationUndefined: Self = StObject.set(x, "deleteOnTermination", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeviceIndex(value: Double): Self = StObject.set(x, "deviceIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIpv4AddressCount(value: Double): Self = StObject.set(x, "ipv4AddressCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIpv4Addresses(value: js.Array[String]): Self = StObject.set(x, "ipv4Addresses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIpv4AddressesVarargs(value: String*): Self = StObject.set(x, "ipv4Addresses", js.Array(value :_*))
    
    @scala.inline
    def setIpv6AddressCount(value: Double): Self = StObject.set(x, "ipv6AddressCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIpv6Addresses(value: js.Array[String]): Self = StObject.set(x, "ipv6Addresses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIpv6AddressesVarargs(value: String*): Self = StObject.set(x, "ipv6Addresses", js.Array(value :_*))
    
    @scala.inline
    def setNetworkInterfaceId(value: String): Self = StObject.set(x, "networkInterfaceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrivateIpAddress(value: String): Self = StObject.set(x, "privateIpAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecurityGroups(value: js.Array[String]): Self = StObject.set(x, "securityGroups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecurityGroupsVarargs(value: String*): Self = StObject.set(x, "securityGroups", js.Array(value :_*))
    
    @scala.inline
    def setSubnetId(value: String): Self = StObject.set(x, "subnetId", value.asInstanceOf[js.Any])
  }
}
