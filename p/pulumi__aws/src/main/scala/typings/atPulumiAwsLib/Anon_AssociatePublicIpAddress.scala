package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AssociatePublicIpAddress extends js.Object {
  var associatePublicIpAddress: scala.Boolean
  var deleteOnTermination: scala.Boolean
  var description: java.lang.String
  var deviceIndex: scala.Double
  var ipv4AddressCount: scala.Double
  var ipv4Addresses: js.Array[java.lang.String]
  var ipv6AddressCount: scala.Double
  var ipv6Addresses: js.Array[java.lang.String]
  var networkInterfaceId: java.lang.String
  var privateIpAddress: java.lang.String
  var securityGroups: js.Array[java.lang.String]
  var subnetId: java.lang.String
}

object Anon_AssociatePublicIpAddress {
  @scala.inline
  def apply(
    associatePublicIpAddress: scala.Boolean,
    deleteOnTermination: scala.Boolean,
    description: java.lang.String,
    deviceIndex: scala.Double,
    ipv4AddressCount: scala.Double,
    ipv4Addresses: js.Array[java.lang.String],
    ipv6AddressCount: scala.Double,
    ipv6Addresses: js.Array[java.lang.String],
    networkInterfaceId: java.lang.String,
    privateIpAddress: java.lang.String,
    securityGroups: js.Array[java.lang.String],
    subnetId: java.lang.String
  ): Anon_AssociatePublicIpAddress = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("associatePublicIpAddress")(associatePublicIpAddress)
    __obj.updateDynamic("deleteOnTermination")(deleteOnTermination)
    __obj.updateDynamic("description")(description)
    __obj.updateDynamic("deviceIndex")(deviceIndex)
    __obj.updateDynamic("ipv4AddressCount")(ipv4AddressCount)
    __obj.updateDynamic("ipv4Addresses")(ipv4Addresses)
    __obj.updateDynamic("ipv6AddressCount")(ipv6AddressCount)
    __obj.updateDynamic("ipv6Addresses")(ipv6Addresses)
    __obj.updateDynamic("networkInterfaceId")(networkInterfaceId)
    __obj.updateDynamic("privateIpAddress")(privateIpAddress)
    __obj.updateDynamic("securityGroups")(securityGroups)
    __obj.updateDynamic("subnetId")(subnetId)
    __obj.asInstanceOf[Anon_AssociatePublicIpAddress]
  }
}

