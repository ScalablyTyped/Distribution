package typings
package atPulumiAwsLib.ec2GetNetworkInterfaceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetNetworkInterfaceResult extends js.Object {
  /**
    * The association information for an Elastic IP address (IPv4) associated with the network interface. See supported fields below.
    */
  val associations: js.Array[atPulumiAwsLib.Anon_AllocationIdAssociationId]
  val attachments: js.Array[atPulumiAwsLib.Anon_AttachmentId]
  /**
    * The Availability Zone.
    */
  val availabilityZone: java.lang.String
  /**
    * Description of the network interface.
    */
  val description: java.lang.String
  val filters: js.UndefOr[js.Array[atPulumiAwsLib.Anon_NameValues]] = js.undefined
  val id: java.lang.String
  /**
    * The type of interface.
    */
  val interfaceType: java.lang.String
  /**
    * List of IPv6 addresses to assign to the ENI.
    */
  val ipv6Addresses: js.Array[java.lang.String]
  /**
    * The MAC address.
    */
  val macAddress: java.lang.String
  /**
    * The AWS account ID of the owner of the network interface.
    */
  val ownerId: java.lang.String
  /**
    * The private DNS name.
    */
  val privateDnsName: java.lang.String
  /**
    * The private IPv4 address of the network interface within the subnet.
    */
  val privateIp: java.lang.String
  /**
    * The private IPv4 addresses associated with the network interface.
    */
  val privateIps: js.Array[java.lang.String]
  /**
    * The ID of the entity that launched the instance on your behalf.
    */
  val requesterId: java.lang.String
  /**
    * The list of security groups for the network interface.
    */
  val securityGroups: js.Array[java.lang.String]
  /**
    * The ID of the subnet.
    */
  val subnetId: java.lang.String
  /**
    * Any tags assigned to the network interface.
    */
  val tags: org.scalablytyped.runtime.StringDictionary[js.Any]
  /**
    * The ID of the VPC.
    */
  val vpcId: java.lang.String
}

object GetNetworkInterfaceResult {
  @scala.inline
  def apply(
    associations: js.Array[atPulumiAwsLib.Anon_AllocationIdAssociationId],
    attachments: js.Array[atPulumiAwsLib.Anon_AttachmentId],
    availabilityZone: java.lang.String,
    description: java.lang.String,
    id: java.lang.String,
    interfaceType: java.lang.String,
    ipv6Addresses: js.Array[java.lang.String],
    macAddress: java.lang.String,
    ownerId: java.lang.String,
    privateDnsName: java.lang.String,
    privateIp: java.lang.String,
    privateIps: js.Array[java.lang.String],
    requesterId: java.lang.String,
    securityGroups: js.Array[java.lang.String],
    subnetId: java.lang.String,
    tags: org.scalablytyped.runtime.StringDictionary[js.Any],
    vpcId: java.lang.String,
    filters: js.Array[atPulumiAwsLib.Anon_NameValues] = null
  ): GetNetworkInterfaceResult = {
    val __obj = js.Dynamic.literal(associations = associations, attachments = attachments, availabilityZone = availabilityZone, description = description, id = id, interfaceType = interfaceType, ipv6Addresses = ipv6Addresses, macAddress = macAddress, ownerId = ownerId, privateDnsName = privateDnsName, privateIp = privateIp, privateIps = privateIps, requesterId = requesterId, securityGroups = securityGroups, subnetId = subnetId, tags = tags, vpcId = vpcId)
    if (filters != null) __obj.updateDynamic("filters")(filters)
    __obj.asInstanceOf[GetNetworkInterfaceResult]
  }
}

