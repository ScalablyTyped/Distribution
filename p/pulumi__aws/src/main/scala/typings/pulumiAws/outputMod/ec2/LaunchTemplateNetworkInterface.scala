package typings.pulumiAws.outputMod.ec2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LaunchTemplateNetworkInterface extends js.Object {
  /**
    * Associate a public ip address with the network interface.  Boolean value.
    */
  var associatePublicIpAddress: js.UndefOr[String] = js.native
  /**
    * Whether the network interface should be destroyed on instance termination. Defaults to `false` if not set.
    */
  var deleteOnTermination: js.UndefOr[Boolean] = js.native
  /**
    * Description of the network interface.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * The integer index of the network interface attachment.
    */
  var deviceIndex: js.UndefOr[Double] = js.native
  /**
    * The number of secondary private IPv4 addresses to assign to a network interface. Conflicts with `ipv4Addresses`
    */
  var ipv4AddressCount: js.UndefOr[Double] = js.native
  /**
    * One or more private IPv4 addresses to associate. Conflicts with `ipv4AddressCount`
    */
  var ipv4Addresses: js.UndefOr[js.Array[String]] = js.native
  /**
    * The number of IPv6 addresses to assign to a network interface. Conflicts with `ipv6Addresses`
    */
  var ipv6AddressCount: js.UndefOr[Double] = js.native
  /**
    * One or more specific IPv6 addresses from the IPv6 CIDR block range of your subnet. Conflicts with `ipv6AddressCount`
    */
  var ipv6Addresses: js.UndefOr[js.Array[String]] = js.native
  /**
    * The ID of the network interface to attach.
    */
  var networkInterfaceId: js.UndefOr[String] = js.native
  /**
    * The primary private IPv4 address.
    */
  var privateIpAddress: js.UndefOr[String] = js.native
  /**
    * A list of security group IDs to associate.
    */
  var securityGroups: js.UndefOr[js.Array[String]] = js.native
  /**
    * The VPC Subnet ID to associate.
    */
  var subnetId: js.UndefOr[String] = js.native
}

object LaunchTemplateNetworkInterface {
  @scala.inline
  def apply(): LaunchTemplateNetworkInterface = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LaunchTemplateNetworkInterface]
  }
  @scala.inline
  implicit class LaunchTemplateNetworkInterfaceOps[Self <: LaunchTemplateNetworkInterface] (val x: Self) extends AnyVal {
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
    def setAssociatePublicIpAddress(value: String): Self = this.set("associatePublicIpAddress", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAssociatePublicIpAddress: Self = this.set("associatePublicIpAddress", js.undefined)
    @scala.inline
    def setDeleteOnTermination(value: Boolean): Self = this.set("deleteOnTermination", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeleteOnTermination: Self = this.set("deleteOnTermination", js.undefined)
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setDeviceIndex(value: Double): Self = this.set("deviceIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeviceIndex: Self = this.set("deviceIndex", js.undefined)
    @scala.inline
    def setIpv4AddressCount(value: Double): Self = this.set("ipv4AddressCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIpv4AddressCount: Self = this.set("ipv4AddressCount", js.undefined)
    @scala.inline
    def setIpv4AddressesVarargs(value: String*): Self = this.set("ipv4Addresses", js.Array(value :_*))
    @scala.inline
    def setIpv4Addresses(value: js.Array[String]): Self = this.set("ipv4Addresses", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIpv4Addresses: Self = this.set("ipv4Addresses", js.undefined)
    @scala.inline
    def setIpv6AddressCount(value: Double): Self = this.set("ipv6AddressCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIpv6AddressCount: Self = this.set("ipv6AddressCount", js.undefined)
    @scala.inline
    def setIpv6AddressesVarargs(value: String*): Self = this.set("ipv6Addresses", js.Array(value :_*))
    @scala.inline
    def setIpv6Addresses(value: js.Array[String]): Self = this.set("ipv6Addresses", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIpv6Addresses: Self = this.set("ipv6Addresses", js.undefined)
    @scala.inline
    def setNetworkInterfaceId(value: String): Self = this.set("networkInterfaceId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNetworkInterfaceId: Self = this.set("networkInterfaceId", js.undefined)
    @scala.inline
    def setPrivateIpAddress(value: String): Self = this.set("privateIpAddress", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrivateIpAddress: Self = this.set("privateIpAddress", js.undefined)
    @scala.inline
    def setSecurityGroupsVarargs(value: String*): Self = this.set("securityGroups", js.Array(value :_*))
    @scala.inline
    def setSecurityGroups(value: js.Array[String]): Self = this.set("securityGroups", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSecurityGroups: Self = this.set("securityGroups", js.undefined)
    @scala.inline
    def setSubnetId(value: String): Self = this.set("subnetId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSubnetId: Self = this.set("subnetId", js.undefined)
  }
  
}

