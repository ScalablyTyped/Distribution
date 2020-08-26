package typings.pulumiAws.eipAssociationMod

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EipAssociationArgs extends js.Object {
  /**
    * The allocation ID. This is required for EC2-VPC.
    */
  val allocationId: js.UndefOr[Input[String]] = js.native
  /**
    * Whether to allow an Elastic IP to
    * be re-associated. Defaults to `true` in VPC.
    */
  val allowReassociation: js.UndefOr[Input[Boolean]] = js.native
  /**
    * The ID of the instance. This is required for
    * EC2-Classic. For EC2-VPC, you can specify either the instance ID or the
    * network interface ID, but not both. The operation fails if you specify an
    * instance ID unless exactly one network interface is attached.
    */
  val instanceId: js.UndefOr[Input[String]] = js.native
  /**
    * The ID of the network interface. If the
    * instance has more than one network interface, you must specify a network
    * interface ID.
    */
  val networkInterfaceId: js.UndefOr[Input[String]] = js.native
  /**
    * The primary or secondary private IP address
    * to associate with the Elastic IP address. If no private IP address is
    * specified, the Elastic IP address is associated with the primary private IP
    * address.
    */
  val privateIpAddress: js.UndefOr[Input[String]] = js.native
  /**
    * The Elastic IP address. This is required for EC2-Classic.
    */
  val publicIp: js.UndefOr[Input[String]] = js.native
}

object EipAssociationArgs {
  @scala.inline
  def apply(): EipAssociationArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EipAssociationArgs]
  }
  @scala.inline
  implicit class EipAssociationArgsOps[Self <: EipAssociationArgs] (val x: Self) extends AnyVal {
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
    def setAllocationId(value: Input[String]): Self = this.set("allocationId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllocationId: Self = this.set("allocationId", js.undefined)
    @scala.inline
    def setAllowReassociation(value: Input[Boolean]): Self = this.set("allowReassociation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowReassociation: Self = this.set("allowReassociation", js.undefined)
    @scala.inline
    def setInstanceId(value: Input[String]): Self = this.set("instanceId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInstanceId: Self = this.set("instanceId", js.undefined)
    @scala.inline
    def setNetworkInterfaceId(value: Input[String]): Self = this.set("networkInterfaceId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNetworkInterfaceId: Self = this.set("networkInterfaceId", js.undefined)
    @scala.inline
    def setPrivateIpAddress(value: Input[String]): Self = this.set("privateIpAddress", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrivateIpAddress: Self = this.set("privateIpAddress", js.undefined)
    @scala.inline
    def setPublicIp(value: Input[String]): Self = this.set("publicIp", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePublicIp: Self = this.set("publicIp", js.undefined)
  }
  
}

