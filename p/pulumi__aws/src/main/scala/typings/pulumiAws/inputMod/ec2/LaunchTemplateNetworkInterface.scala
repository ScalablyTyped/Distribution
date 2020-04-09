package typings.pulumiAws.inputMod.ec2

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LaunchTemplateNetworkInterface extends js.Object {
  /**
    * Associate a public ip address with the network interface.  Boolean value.
    */
  var associatePublicIpAddress: js.UndefOr[Input[String]] = js.native
  /**
    * Whether the network interface should be destroyed on instance termination.
    */
  var deleteOnTermination: js.UndefOr[Input[Boolean]] = js.native
  /**
    * Description of the network interface.
    */
  var description: js.UndefOr[Input[String]] = js.native
  /**
    * The integer index of the network interface attachment.
    */
  var deviceIndex: js.UndefOr[Input[Double]] = js.native
  /**
    * The number of secondary private IPv4 addresses to assign to a network interface. Conflicts with `ipv4Addresses`
    */
  var ipv4AddressCount: js.UndefOr[Input[Double]] = js.native
  /**
    * One or more private IPv4 addresses to associate. Conflicts with `ipv4AddressCount`
    */
  var ipv4Addresses: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  /**
    * The number of IPv6 addresses to assign to a network interface. Conflicts with `ipv6Addresses`
    */
  var ipv6AddressCount: js.UndefOr[Input[Double]] = js.native
  /**
    * One or more specific IPv6 addresses from the IPv6 CIDR block range of your subnet. Conflicts with `ipv6AddressCount`
    */
  var ipv6Addresses: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  /**
    * The ID of the network interface to attach.
    */
  var networkInterfaceId: js.UndefOr[Input[String]] = js.native
  /**
    * The primary private IPv4 address.
    */
  var privateIpAddress: js.UndefOr[Input[String]] = js.native
  /**
    * A list of security group IDs to associate.
    */
  var securityGroups: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  /**
    * The VPC Subnet ID to associate.
    */
  var subnetId: js.UndefOr[Input[String]] = js.native
}

object LaunchTemplateNetworkInterface {
  @scala.inline
  def apply(
    associatePublicIpAddress: Input[String] = null,
    deleteOnTermination: Input[Boolean] = null,
    description: Input[String] = null,
    deviceIndex: Input[Double] = null,
    ipv4AddressCount: Input[Double] = null,
    ipv4Addresses: Input[js.Array[Input[String]]] = null,
    ipv6AddressCount: Input[Double] = null,
    ipv6Addresses: Input[js.Array[Input[String]]] = null,
    networkInterfaceId: Input[String] = null,
    privateIpAddress: Input[String] = null,
    securityGroups: Input[js.Array[Input[String]]] = null,
    subnetId: Input[String] = null
  ): LaunchTemplateNetworkInterface = {
    val __obj = js.Dynamic.literal()
    if (associatePublicIpAddress != null) __obj.updateDynamic("associatePublicIpAddress")(associatePublicIpAddress.asInstanceOf[js.Any])
    if (deleteOnTermination != null) __obj.updateDynamic("deleteOnTermination")(deleteOnTermination.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (deviceIndex != null) __obj.updateDynamic("deviceIndex")(deviceIndex.asInstanceOf[js.Any])
    if (ipv4AddressCount != null) __obj.updateDynamic("ipv4AddressCount")(ipv4AddressCount.asInstanceOf[js.Any])
    if (ipv4Addresses != null) __obj.updateDynamic("ipv4Addresses")(ipv4Addresses.asInstanceOf[js.Any])
    if (ipv6AddressCount != null) __obj.updateDynamic("ipv6AddressCount")(ipv6AddressCount.asInstanceOf[js.Any])
    if (ipv6Addresses != null) __obj.updateDynamic("ipv6Addresses")(ipv6Addresses.asInstanceOf[js.Any])
    if (networkInterfaceId != null) __obj.updateDynamic("networkInterfaceId")(networkInterfaceId.asInstanceOf[js.Any])
    if (privateIpAddress != null) __obj.updateDynamic("privateIpAddress")(privateIpAddress.asInstanceOf[js.Any])
    if (securityGroups != null) __obj.updateDynamic("securityGroups")(securityGroups.asInstanceOf[js.Any])
    if (subnetId != null) __obj.updateDynamic("subnetId")(subnetId.asInstanceOf[js.Any])
    __obj.asInstanceOf[LaunchTemplateNetworkInterface]
  }
}

