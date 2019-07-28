package typings.atPulumiAws

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AssociatePublicIpAddress extends js.Object {
  var associatePublicIpAddress: Boolean
  var deleteOnTermination: Boolean
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

object Anon_AssociatePublicIpAddress {
  @scala.inline
  def apply(
    associatePublicIpAddress: Boolean,
    deleteOnTermination: Boolean,
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
  ): Anon_AssociatePublicIpAddress = {
    val __obj = js.Dynamic.literal(associatePublicIpAddress = associatePublicIpAddress, deleteOnTermination = deleteOnTermination, description = description, deviceIndex = deviceIndex, ipv4AddressCount = ipv4AddressCount, ipv4Addresses = ipv4Addresses, ipv6AddressCount = ipv6AddressCount, ipv6Addresses = ipv6Addresses, networkInterfaceId = networkInterfaceId, privateIpAddress = privateIpAddress, securityGroups = securityGroups, subnetId = subnetId)
  
    __obj.asInstanceOf[Anon_AssociatePublicIpAddress]
  }
}

