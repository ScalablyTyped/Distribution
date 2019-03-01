package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AssociatePublicIpAddressDeleteOnTermination extends js.Object {
  var associatePublicIpAddress: js.UndefOr[scala.Boolean] = js.undefined
  var deleteOnTermination: js.UndefOr[scala.Boolean] = js.undefined
  var description: js.UndefOr[java.lang.String] = js.undefined
  var deviceIndex: js.UndefOr[scala.Double] = js.undefined
  var ipv4AddressCount: js.UndefOr[scala.Double] = js.undefined
  var ipv4Addresses: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var ipv6AddressCount: js.UndefOr[scala.Double] = js.undefined
  var ipv6Addresses: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var networkInterfaceId: js.UndefOr[java.lang.String] = js.undefined
  var privateIpAddress: js.UndefOr[java.lang.String] = js.undefined
  var securityGroups: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var subnetId: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_AssociatePublicIpAddressDeleteOnTermination {
  @scala.inline
  def apply(
    associatePublicIpAddress: js.UndefOr[scala.Boolean] = js.undefined,
    deleteOnTermination: js.UndefOr[scala.Boolean] = js.undefined,
    description: java.lang.String = null,
    deviceIndex: scala.Int | scala.Double = null,
    ipv4AddressCount: scala.Int | scala.Double = null,
    ipv4Addresses: js.Array[java.lang.String] = null,
    ipv6AddressCount: scala.Int | scala.Double = null,
    ipv6Addresses: js.Array[java.lang.String] = null,
    networkInterfaceId: java.lang.String = null,
    privateIpAddress: java.lang.String = null,
    securityGroups: js.Array[java.lang.String] = null,
    subnetId: java.lang.String = null
  ): Anon_AssociatePublicIpAddressDeleteOnTermination = {
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
    __obj.asInstanceOf[Anon_AssociatePublicIpAddressDeleteOnTermination]
  }
}

