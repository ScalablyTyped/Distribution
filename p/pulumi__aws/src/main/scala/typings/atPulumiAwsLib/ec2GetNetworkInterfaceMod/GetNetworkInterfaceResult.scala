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

