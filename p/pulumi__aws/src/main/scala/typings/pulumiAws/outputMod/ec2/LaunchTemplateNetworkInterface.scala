package typings.pulumiAws.outputMod.ec2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LaunchTemplateNetworkInterface extends StObject {
  
  /**
    * Associate a public ip address with the network interface.  Boolean value.
    */
  var associatePublicIpAddress: js.UndefOr[String] = js.undefined
  
  /**
    * Whether the network interface should be destroyed on instance termination. Defaults to `false` if not set.
    */
  var deleteOnTermination: js.UndefOr[String] = js.undefined
  
  /**
    * Description of the network interface.
    */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * The integer index of the network interface attachment.
    */
  var deviceIndex: js.UndefOr[Double] = js.undefined
  
  /**
    * The number of secondary private IPv4 addresses to assign to a network interface. Conflicts with `ipv4Addresses`
    */
  var ipv4AddressCount: js.UndefOr[Double] = js.undefined
  
  /**
    * One or more private IPv4 addresses to associate. Conflicts with `ipv4AddressCount`
    */
  var ipv4Addresses: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * The number of IPv6 addresses to assign to a network interface. Conflicts with `ipv6Addresses`
    */
  var ipv6AddressCount: js.UndefOr[Double] = js.undefined
  
  /**
    * One or more specific IPv6 addresses from the IPv6 CIDR block range of your subnet. Conflicts with `ipv6AddressCount`
    */
  var ipv6Addresses: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * The ID of the network interface to attach.
    */
  var networkInterfaceId: js.UndefOr[String] = js.undefined
  
  /**
    * The primary private IPv4 address.
    */
  var privateIpAddress: js.UndefOr[String] = js.undefined
  
  /**
    * A list of security group IDs to associate.
    */
  var securityGroups: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * The VPC Subnet ID to associate.
    */
  var subnetId: js.UndefOr[String] = js.undefined
}
object LaunchTemplateNetworkInterface {
  
  inline def apply(): LaunchTemplateNetworkInterface = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LaunchTemplateNetworkInterface]
  }
  
  extension [Self <: LaunchTemplateNetworkInterface](x: Self) {
    
    inline def setAssociatePublicIpAddress(value: String): Self = StObject.set(x, "associatePublicIpAddress", value.asInstanceOf[js.Any])
    
    inline def setAssociatePublicIpAddressUndefined: Self = StObject.set(x, "associatePublicIpAddress", js.undefined)
    
    inline def setDeleteOnTermination(value: String): Self = StObject.set(x, "deleteOnTermination", value.asInstanceOf[js.Any])
    
    inline def setDeleteOnTerminationUndefined: Self = StObject.set(x, "deleteOnTermination", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setDeviceIndex(value: Double): Self = StObject.set(x, "deviceIndex", value.asInstanceOf[js.Any])
    
    inline def setDeviceIndexUndefined: Self = StObject.set(x, "deviceIndex", js.undefined)
    
    inline def setIpv4AddressCount(value: Double): Self = StObject.set(x, "ipv4AddressCount", value.asInstanceOf[js.Any])
    
    inline def setIpv4AddressCountUndefined: Self = StObject.set(x, "ipv4AddressCount", js.undefined)
    
    inline def setIpv4Addresses(value: js.Array[String]): Self = StObject.set(x, "ipv4Addresses", value.asInstanceOf[js.Any])
    
    inline def setIpv4AddressesUndefined: Self = StObject.set(x, "ipv4Addresses", js.undefined)
    
    inline def setIpv4AddressesVarargs(value: String*): Self = StObject.set(x, "ipv4Addresses", js.Array(value :_*))
    
    inline def setIpv6AddressCount(value: Double): Self = StObject.set(x, "ipv6AddressCount", value.asInstanceOf[js.Any])
    
    inline def setIpv6AddressCountUndefined: Self = StObject.set(x, "ipv6AddressCount", js.undefined)
    
    inline def setIpv6Addresses(value: js.Array[String]): Self = StObject.set(x, "ipv6Addresses", value.asInstanceOf[js.Any])
    
    inline def setIpv6AddressesUndefined: Self = StObject.set(x, "ipv6Addresses", js.undefined)
    
    inline def setIpv6AddressesVarargs(value: String*): Self = StObject.set(x, "ipv6Addresses", js.Array(value :_*))
    
    inline def setNetworkInterfaceId(value: String): Self = StObject.set(x, "networkInterfaceId", value.asInstanceOf[js.Any])
    
    inline def setNetworkInterfaceIdUndefined: Self = StObject.set(x, "networkInterfaceId", js.undefined)
    
    inline def setPrivateIpAddress(value: String): Self = StObject.set(x, "privateIpAddress", value.asInstanceOf[js.Any])
    
    inline def setPrivateIpAddressUndefined: Self = StObject.set(x, "privateIpAddress", js.undefined)
    
    inline def setSecurityGroups(value: js.Array[String]): Self = StObject.set(x, "securityGroups", value.asInstanceOf[js.Any])
    
    inline def setSecurityGroupsUndefined: Self = StObject.set(x, "securityGroups", js.undefined)
    
    inline def setSecurityGroupsVarargs(value: String*): Self = StObject.set(x, "securityGroups", js.Array(value :_*))
    
    inline def setSubnetId(value: String): Self = StObject.set(x, "subnetId", value.asInstanceOf[js.Any])
    
    inline def setSubnetIdUndefined: Self = StObject.set(x, "subnetId", js.undefined)
  }
}
