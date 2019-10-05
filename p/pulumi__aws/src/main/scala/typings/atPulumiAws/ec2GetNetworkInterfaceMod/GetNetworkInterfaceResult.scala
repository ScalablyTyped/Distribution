package typings.atPulumiAws.ec2GetNetworkInterfaceMod

import org.scalablytyped.runtime.StringDictionary
import typings.atPulumiAws.typesOutputMod.ec2.GetNetworkInterfaceAssociation
import typings.atPulumiAws.typesOutputMod.ec2.GetNetworkInterfaceAttachment
import typings.atPulumiAws.typesOutputMod.ec2.GetNetworkInterfaceFilter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetNetworkInterfaceResult extends js.Object {
  /**
    * The association information for an Elastic IP address (IPv4) associated with the network interface. See supported fields below.
    */
  val associations: js.Array[GetNetworkInterfaceAssociation]
  val attachments: js.Array[GetNetworkInterfaceAttachment]
  /**
    * The Availability Zone.
    */
  val availabilityZone: String
  /**
    * Description of the network interface.
    */
  val description: String
  val filters: js.UndefOr[js.Array[GetNetworkInterfaceFilter]] = js.undefined
  val id: String
  /**
    * The type of interface.
    */
  val interfaceType: String
  /**
    * List of IPv6 addresses to assign to the ENI.
    */
  val ipv6Addresses: js.Array[String]
  /**
    * The MAC address.
    */
  val macAddress: String
  /**
    * The AWS account ID of the owner of the network interface.
    */
  val ownerId: String
  /**
    * The private DNS name.
    */
  val privateDnsName: String
  /**
    * The private IPv4 address of the network interface within the subnet.
    */
  val privateIp: String
  /**
    * The private IPv4 addresses associated with the network interface.
    */
  val privateIps: js.Array[String]
  /**
    * The ID of the entity that launched the instance on your behalf.
    */
  val requesterId: String
  /**
    * The list of security groups for the network interface.
    */
  val securityGroups: js.Array[String]
  /**
    * The ID of the subnet.
    */
  val subnetId: String
  /**
    * Any tags assigned to the network interface.
    */
  val tags: StringDictionary[js.Any]
  /**
    * The ID of the VPC.
    */
  val vpcId: String
}

object GetNetworkInterfaceResult {
  @scala.inline
  def apply(
    associations: js.Array[GetNetworkInterfaceAssociation],
    attachments: js.Array[GetNetworkInterfaceAttachment],
    availabilityZone: String,
    description: String,
    id: String,
    interfaceType: String,
    ipv6Addresses: js.Array[String],
    macAddress: String,
    ownerId: String,
    privateDnsName: String,
    privateIp: String,
    privateIps: js.Array[String],
    requesterId: String,
    securityGroups: js.Array[String],
    subnetId: String,
    tags: StringDictionary[js.Any],
    vpcId: String,
    filters: js.Array[GetNetworkInterfaceFilter] = null
  ): GetNetworkInterfaceResult = {
    val __obj = js.Dynamic.literal(associations = associations, attachments = attachments, availabilityZone = availabilityZone, description = description, id = id, interfaceType = interfaceType, ipv6Addresses = ipv6Addresses, macAddress = macAddress, ownerId = ownerId, privateDnsName = privateDnsName, privateIp = privateIp, privateIps = privateIps, requesterId = requesterId, securityGroups = securityGroups, subnetId = subnetId, tags = tags, vpcId = vpcId)
    if (filters != null) __obj.updateDynamic("filters")(filters)
    __obj.asInstanceOf[GetNetworkInterfaceResult]
  }
}

