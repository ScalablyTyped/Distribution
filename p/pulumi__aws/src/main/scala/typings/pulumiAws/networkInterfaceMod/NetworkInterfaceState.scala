package typings.pulumiAws.networkInterfaceMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.inputMod.ec2.NetworkInterfaceAttachment
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NetworkInterfaceState extends js.Object {
  /**
    * Block to define the attachment of the ENI. Documented below.
    */
  val attachments: js.UndefOr[Input[js.Array[Input[NetworkInterfaceAttachment]]]] = js.native
  /**
    * A description for the network interface.
    */
  val description: js.UndefOr[Input[String]] = js.native
  /**
    * The MAC address of the network interface.
    */
  val macAddress: js.UndefOr[Input[String]] = js.native
  val outpostArn: js.UndefOr[Input[String]] = js.native
  /**
    * The private DNS name of the network interface (IPv4).
    */
  val privateDnsName: js.UndefOr[Input[String]] = js.native
  val privateIp: js.UndefOr[Input[String]] = js.native
  /**
    * List of private IPs to assign to the ENI.
    */
  val privateIps: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  /**
    * Number of secondary private IPs to assign to the ENI. The total number of private IPs will be 1 + private_ips_count, as a primary private IP will be assiged to an ENI by default.
    */
  val privateIpsCount: js.UndefOr[Input[Double]] = js.native
  /**
    * List of security group IDs to assign to the ENI.
    */
  val securityGroups: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  /**
    * Whether to enable source destination checking for the ENI. Default true.
    */
  val sourceDestCheck: js.UndefOr[Input[Boolean]] = js.native
  /**
    * Subnet ID to create the ENI in.
    */
  val subnetId: js.UndefOr[Input[String]] = js.native
  /**
    * A map of tags to assign to the resource.
    */
  val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
}

object NetworkInterfaceState {
  @scala.inline
  def apply(): NetworkInterfaceState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NetworkInterfaceState]
  }
  @scala.inline
  implicit class NetworkInterfaceStateOps[Self <: NetworkInterfaceState] (val x: Self) extends AnyVal {
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
    def setAttachmentsVarargs(value: Input[NetworkInterfaceAttachment]*): Self = this.set("attachments", js.Array(value :_*))
    @scala.inline
    def setAttachments(value: Input[js.Array[Input[NetworkInterfaceAttachment]]]): Self = this.set("attachments", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAttachments: Self = this.set("attachments", js.undefined)
    @scala.inline
    def setDescription(value: Input[String]): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setMacAddress(value: Input[String]): Self = this.set("macAddress", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMacAddress: Self = this.set("macAddress", js.undefined)
    @scala.inline
    def setOutpostArn(value: Input[String]): Self = this.set("outpostArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOutpostArn: Self = this.set("outpostArn", js.undefined)
    @scala.inline
    def setPrivateDnsName(value: Input[String]): Self = this.set("privateDnsName", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrivateDnsName: Self = this.set("privateDnsName", js.undefined)
    @scala.inline
    def setPrivateIp(value: Input[String]): Self = this.set("privateIp", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrivateIp: Self = this.set("privateIp", js.undefined)
    @scala.inline
    def setPrivateIpsVarargs(value: Input[String]*): Self = this.set("privateIps", js.Array(value :_*))
    @scala.inline
    def setPrivateIps(value: Input[js.Array[Input[String]]]): Self = this.set("privateIps", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrivateIps: Self = this.set("privateIps", js.undefined)
    @scala.inline
    def setPrivateIpsCount(value: Input[Double]): Self = this.set("privateIpsCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrivateIpsCount: Self = this.set("privateIpsCount", js.undefined)
    @scala.inline
    def setSecurityGroupsVarargs(value: Input[String]*): Self = this.set("securityGroups", js.Array(value :_*))
    @scala.inline
    def setSecurityGroups(value: Input[js.Array[Input[String]]]): Self = this.set("securityGroups", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSecurityGroups: Self = this.set("securityGroups", js.undefined)
    @scala.inline
    def setSourceDestCheck(value: Input[Boolean]): Self = this.set("sourceDestCheck", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSourceDestCheck: Self = this.set("sourceDestCheck", js.undefined)
    @scala.inline
    def setSubnetId(value: Input[String]): Self = this.set("subnetId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSubnetId: Self = this.set("subnetId", js.undefined)
    @scala.inline
    def setTags(value: Input[StringDictionary[Input[String]]]): Self = this.set("tags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
  }
  
}

