package typings.atPulumiAws.typesOutputMod.ec2Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LaunchTemplateNetworkInterface extends js.Object {
  var associatePublicIpAddress: js.UndefOr[Boolean] = js.undefined
  var deleteOnTermination: js.UndefOr[Boolean] = js.undefined
  /**
    * Description of the launch template.
    */
  var description: js.UndefOr[String] = js.undefined
  var deviceIndex: js.UndefOr[Double] = js.undefined
  var ipv4AddressCount: js.UndefOr[Double] = js.undefined
  var ipv4Addresses: js.UndefOr[js.Array[String]] = js.undefined
  var ipv6AddressCount: js.UndefOr[Double] = js.undefined
  var ipv6Addresses: js.UndefOr[js.Array[String]] = js.undefined
  var networkInterfaceId: js.UndefOr[String] = js.undefined
  var privateIpAddress: js.UndefOr[String] = js.undefined
  var securityGroups: js.UndefOr[js.Array[String]] = js.undefined
  var subnetId: js.UndefOr[String] = js.undefined
}

object LaunchTemplateNetworkInterface {
  @scala.inline
  def apply(
    associatePublicIpAddress: js.UndefOr[Boolean] = js.undefined,
    deleteOnTermination: js.UndefOr[Boolean] = js.undefined,
    description: String = null,
    deviceIndex: Int | Double = null,
    ipv4AddressCount: Int | Double = null,
    ipv4Addresses: js.Array[String] = null,
    ipv6AddressCount: Int | Double = null,
    ipv6Addresses: js.Array[String] = null,
    networkInterfaceId: String = null,
    privateIpAddress: String = null,
    securityGroups: js.Array[String] = null,
    subnetId: String = null
  ): LaunchTemplateNetworkInterface = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(associatePublicIpAddress)) __obj.updateDynamic("associatePublicIpAddress")(associatePublicIpAddress)
    if (!js.isUndefined(deleteOnTermination)) __obj.updateDynamic("deleteOnTermination")(deleteOnTermination)
    if (description != null) __obj.updateDynamic("description")(description)
    if (deviceIndex != null) __obj.updateDynamic("deviceIndex")(deviceIndex.asInstanceOf[js.Any])
    if (ipv4AddressCount != null) __obj.updateDynamic("ipv4AddressCount")(ipv4AddressCount.asInstanceOf[js.Any])
    if (ipv4Addresses != null) __obj.updateDynamic("ipv4Addresses")(ipv4Addresses)
    if (ipv6AddressCount != null) __obj.updateDynamic("ipv6AddressCount")(ipv6AddressCount.asInstanceOf[js.Any])
    if (ipv6Addresses != null) __obj.updateDynamic("ipv6Addresses")(ipv6Addresses)
    if (networkInterfaceId != null) __obj.updateDynamic("networkInterfaceId")(networkInterfaceId)
    if (privateIpAddress != null) __obj.updateDynamic("privateIpAddress")(privateIpAddress)
    if (securityGroups != null) __obj.updateDynamic("securityGroups")(securityGroups)
    if (subnetId != null) __obj.updateDynamic("subnetId")(subnetId)
    __obj.asInstanceOf[LaunchTemplateNetworkInterface]
  }
}

