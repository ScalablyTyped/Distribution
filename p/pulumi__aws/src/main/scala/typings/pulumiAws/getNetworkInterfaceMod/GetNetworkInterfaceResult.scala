package typings.pulumiAws.getNetworkInterfaceMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.outputMod.ec2.GetNetworkInterfaceAssociation
import typings.pulumiAws.outputMod.ec2.GetNetworkInterfaceAttachment
import typings.pulumiAws.outputMod.ec2.GetNetworkInterfaceFilter
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
    * The Amazon Resource Name (ARN) of the Outpost.
    */
  val outpostArn: String = js.native
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
  val tags: StringDictionary[String] = js.native
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
    outpostArn: String,
    ownerId: String,
    privateDnsName: String,
    privateIp: String,
    privateIps: js.Array[String],
    requesterId: String,
    securityGroups: js.Array[String],
    subnetId: String,
    tags: StringDictionary[String],
    vpcId: String
  ): GetNetworkInterfaceResult = {
    val __obj = js.Dynamic.literal(associations = associations.asInstanceOf[js.Any], attachments = attachments.asInstanceOf[js.Any], availabilityZone = availabilityZone.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], interfaceType = interfaceType.asInstanceOf[js.Any], ipv6Addresses = ipv6Addresses.asInstanceOf[js.Any], macAddress = macAddress.asInstanceOf[js.Any], outpostArn = outpostArn.asInstanceOf[js.Any], ownerId = ownerId.asInstanceOf[js.Any], privateDnsName = privateDnsName.asInstanceOf[js.Any], privateIp = privateIp.asInstanceOf[js.Any], privateIps = privateIps.asInstanceOf[js.Any], requesterId = requesterId.asInstanceOf[js.Any], securityGroups = securityGroups.asInstanceOf[js.Any], subnetId = subnetId.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any], vpcId = vpcId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetNetworkInterfaceResult]
  }
  @scala.inline
  implicit class GetNetworkInterfaceResultOps[Self <: GetNetworkInterfaceResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAssociationsVarargs(value: GetNetworkInterfaceAssociation*): Self = this.set("associations", js.Array(value :_*))
    @scala.inline
    def setAssociations(value: js.Array[GetNetworkInterfaceAssociation]): Self = this.set("associations", value.asInstanceOf[js.Any])
    @scala.inline
    def setAttachmentsVarargs(value: GetNetworkInterfaceAttachment*): Self = this.set("attachments", js.Array(value :_*))
    @scala.inline
    def setAttachments(value: js.Array[GetNetworkInterfaceAttachment]): Self = this.set("attachments", value.asInstanceOf[js.Any])
    @scala.inline
    def setAvailabilityZone(value: String): Self = this.set("availabilityZone", value.asInstanceOf[js.Any])
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setInterfaceType(value: String): Self = this.set("interfaceType", value.asInstanceOf[js.Any])
    @scala.inline
    def setIpv6AddressesVarargs(value: String*): Self = this.set("ipv6Addresses", js.Array(value :_*))
    @scala.inline
    def setIpv6Addresses(value: js.Array[String]): Self = this.set("ipv6Addresses", value.asInstanceOf[js.Any])
    @scala.inline
    def setMacAddress(value: String): Self = this.set("macAddress", value.asInstanceOf[js.Any])
    @scala.inline
    def setOutpostArn(value: String): Self = this.set("outpostArn", value.asInstanceOf[js.Any])
    @scala.inline
    def setOwnerId(value: String): Self = this.set("ownerId", value.asInstanceOf[js.Any])
    @scala.inline
    def setPrivateDnsName(value: String): Self = this.set("privateDnsName", value.asInstanceOf[js.Any])
    @scala.inline
    def setPrivateIp(value: String): Self = this.set("privateIp", value.asInstanceOf[js.Any])
    @scala.inline
    def setPrivateIpsVarargs(value: String*): Self = this.set("privateIps", js.Array(value :_*))
    @scala.inline
    def setPrivateIps(value: js.Array[String]): Self = this.set("privateIps", value.asInstanceOf[js.Any])
    @scala.inline
    def setRequesterId(value: String): Self = this.set("requesterId", value.asInstanceOf[js.Any])
    @scala.inline
    def setSecurityGroupsVarargs(value: String*): Self = this.set("securityGroups", js.Array(value :_*))
    @scala.inline
    def setSecurityGroups(value: js.Array[String]): Self = this.set("securityGroups", value.asInstanceOf[js.Any])
    @scala.inline
    def setSubnetId(value: String): Self = this.set("subnetId", value.asInstanceOf[js.Any])
    @scala.inline
    def setTags(value: StringDictionary[String]): Self = this.set("tags", value.asInstanceOf[js.Any])
    @scala.inline
    def setVpcId(value: String): Self = this.set("vpcId", value.asInstanceOf[js.Any])
    @scala.inline
    def setFiltersVarargs(value: GetNetworkInterfaceFilter*): Self = this.set("filters", js.Array(value :_*))
    @scala.inline
    def setFilters(value: js.Array[GetNetworkInterfaceFilter]): Self = this.set("filters", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilters: Self = this.set("filters", js.undefined)
  }
  
}

