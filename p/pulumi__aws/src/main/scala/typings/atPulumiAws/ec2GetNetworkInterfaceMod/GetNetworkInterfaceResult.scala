package typings.atPulumiAws.ec2GetNetworkInterfaceMod

import org.scalablytyped.runtime.StringDictionary
import typings.atPulumiAws.typesOutputMod.ec2.GetNetworkInterfaceAssociation
import typings.atPulumiAws.typesOutputMod.ec2.GetNetworkInterfaceAttachment
import typings.atPulumiAws.typesOutputMod.ec2.GetNetworkInterfaceFilter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetNetworkInterfaceResult extends js.Object {
  /**
    * The association information for an Elastic IP address (IPv4) associated with the network interface. See supported fields below.
    */
  val associations: js.Array[GetNetworkInterfaceAssociation] = js.native
  val attachments: js.Array[GetNetworkInterfaceAttachment] = js.native
  /**
    * The Availability Zone.
    */
  val availabilityZone: String = js.native
  /**
    * Description of the network interface.
    */
  val description: String = js.native
  val filters: js.UndefOr[js.Array[GetNetworkInterfaceFilter]] = js.native
  val id: String = js.native
  /**
    * The type of interface.
    */
  val interfaceType: String = js.native
  /**
    * List of IPv6 addresses to assign to the ENI.
    */
  val ipv6Addresses: js.Array[String] = js.native
  /**
    * The MAC address.
    */
  val macAddress: String = js.native
  /**
    * The AWS account ID of the owner of the network interface.
    */
  val ownerId: String = js.native
  /**
    * The private DNS name.
    */
  val privateDnsName: String = js.native
  /**
    * The private IPv4 address of the network interface within the subnet.
    */
  val privateIp: String = js.native
  /**
    * The private IPv4 addresses associated with the network interface.
    */
  val privateIps: js.Array[String] = js.native
  /**
    * The ID of the entity that launched the instance on your behalf.
    */
  val requesterId: String = js.native
  /**
    * The list of security groups for the network interface.
    */
  val securityGroups: js.Array[String] = js.native
  /**
    * The ID of the subnet.
    */
  val subnetId: String = js.native
  /**
    * Any tags assigned to the network interface.
    */
  val tags: StringDictionary[js.Any] = js.native
  /**
    * The ID of the VPC.
    */
  val vpcId: String = js.native
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
    val __obj = js.Dynamic.literal(associations = associations.asInstanceOf[js.Any], attachments = attachments.asInstanceOf[js.Any], availabilityZone = availabilityZone.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], interfaceType = interfaceType.asInstanceOf[js.Any], ipv6Addresses = ipv6Addresses.asInstanceOf[js.Any], macAddress = macAddress.asInstanceOf[js.Any], ownerId = ownerId.asInstanceOf[js.Any], privateDnsName = privateDnsName.asInstanceOf[js.Any], privateIp = privateIp.asInstanceOf[js.Any], privateIps = privateIps.asInstanceOf[js.Any], requesterId = requesterId.asInstanceOf[js.Any], securityGroups = securityGroups.asInstanceOf[js.Any], subnetId = subnetId.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any], vpcId = vpcId.asInstanceOf[js.Any])
    if (filters != null) __obj.updateDynamic("filters")(filters.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetNetworkInterfaceResult]
  }
}

