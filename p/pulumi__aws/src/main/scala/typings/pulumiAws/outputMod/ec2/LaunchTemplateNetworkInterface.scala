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
    * Whether the network interface should be destroyed on instance termination.
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
  def apply(
    associatePublicIpAddress: String = null,
    deleteOnTermination: js.UndefOr[Boolean] = js.undefined,
    description: String = null,
    deviceIndex: js.UndefOr[Double] = js.undefined,
    ipv4AddressCount: js.UndefOr[Double] = js.undefined,
    ipv4Addresses: js.Array[String] = null,
    ipv6AddressCount: js.UndefOr[Double] = js.undefined,
    ipv6Addresses: js.Array[String] = null,
    networkInterfaceId: String = null,
    privateIpAddress: String = null,
    securityGroups: js.Array[String] = null,
    subnetId: String = null
  ): LaunchTemplateNetworkInterface = {
    val __obj = js.Dynamic.literal()
    if (associatePublicIpAddress != null) __obj.updateDynamic("associatePublicIpAddress")(associatePublicIpAddress.asInstanceOf[js.Any])
    if (!js.isUndefined(deleteOnTermination)) __obj.updateDynamic("deleteOnTermination")(deleteOnTermination.get.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (!js.isUndefined(deviceIndex)) __obj.updateDynamic("deviceIndex")(deviceIndex.get.asInstanceOf[js.Any])
    if (!js.isUndefined(ipv4AddressCount)) __obj.updateDynamic("ipv4AddressCount")(ipv4AddressCount.get.asInstanceOf[js.Any])
    if (ipv4Addresses != null) __obj.updateDynamic("ipv4Addresses")(ipv4Addresses.asInstanceOf[js.Any])
    if (!js.isUndefined(ipv6AddressCount)) __obj.updateDynamic("ipv6AddressCount")(ipv6AddressCount.get.asInstanceOf[js.Any])
    if (ipv6Addresses != null) __obj.updateDynamic("ipv6Addresses")(ipv6Addresses.asInstanceOf[js.Any])
    if (networkInterfaceId != null) __obj.updateDynamic("networkInterfaceId")(networkInterfaceId.asInstanceOf[js.Any])
    if (privateIpAddress != null) __obj.updateDynamic("privateIpAddress")(privateIpAddress.asInstanceOf[js.Any])
    if (securityGroups != null) __obj.updateDynamic("securityGroups")(securityGroups.asInstanceOf[js.Any])
    if (subnetId != null) __obj.updateDynamic("subnetId")(subnetId.asInstanceOf[js.Any])
    __obj.asInstanceOf[LaunchTemplateNetworkInterface]
  }
}

