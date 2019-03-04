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
    val __obj = js.Dynamic.literal(associatePublicIpAddress = associatePublicIpAddress, deleteOnTermination = deleteOnTermination, description = description, deviceIndex = deviceIndex, ipv4AddressCount = ipv4AddressCount, ipv4Addresses = ipv4Addresses, ipv6AddressCount = ipv6AddressCount, ipv6Addresses = ipv6Addresses, networkInterfaceId = networkInterfaceId, privateIpAddress = privateIpAddress, securityGroups = securityGroups, subnetId = subnetId)
  
    __obj.asInstanceOf[Anon_AssociatePublicIpAddress]
  }
}

