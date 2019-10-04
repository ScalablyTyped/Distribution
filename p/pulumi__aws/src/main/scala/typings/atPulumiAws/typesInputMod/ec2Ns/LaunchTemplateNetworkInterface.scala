package typings.atPulumiAws.typesInputMod.ec2Ns

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LaunchTemplateNetworkInterface extends js.Object {
  var associatePublicIpAddress: js.UndefOr[Input[Boolean]] = js.undefined
  var deleteOnTermination: js.UndefOr[Input[Boolean]] = js.undefined
  /**
    * Description of the launch template.
    */
  var description: js.UndefOr[Input[String]] = js.undefined
  var deviceIndex: js.UndefOr[Input[Double]] = js.undefined
  var ipv4AddressCount: js.UndefOr[Input[Double]] = js.undefined
  var ipv4Addresses: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
  var ipv6AddressCount: js.UndefOr[Input[Double]] = js.undefined
  var ipv6Addresses: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
  var networkInterfaceId: js.UndefOr[Input[String]] = js.undefined
  var privateIpAddress: js.UndefOr[Input[String]] = js.undefined
  var securityGroups: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
  var subnetId: js.UndefOr[Input[String]] = js.undefined
}

object LaunchTemplateNetworkInterface {
  @scala.inline
  def apply(
    associatePublicIpAddress: Input[Boolean] = null,
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

