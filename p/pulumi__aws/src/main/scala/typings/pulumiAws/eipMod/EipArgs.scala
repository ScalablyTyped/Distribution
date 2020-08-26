package typings.pulumiAws.eipMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EipArgs extends js.Object {
  /**
    * A user specified primary or secondary private IP address to
    * associate with the Elastic IP address. If no private IP address is specified,
    * the Elastic IP address is associated with the primary private IP address.
    */
  val associateWithPrivateIp: js.UndefOr[Input[String]] = js.native
  /**
    * The  ID  of a customer-owned address pool. For more on customer owned IP addressed check out [Customer-owned IP addresses guide](https://docs.aws.amazon.com/outposts/latest/userguide/outposts-networking-components.html#ip-addressing)
    */
  val customerOwnedIpv4Pool: js.UndefOr[Input[String]] = js.native
  /**
    * EC2 instance ID.
    */
  val instance: js.UndefOr[Input[String]] = js.native
  /**
    * Network interface ID to associate with.
    */
  val networkInterface: js.UndefOr[Input[String]] = js.native
  /**
    * EC2 IPv4 address pool identifier or `amazon`. This option is only available for VPC EIPs.
    */
  val publicIpv4Pool: js.UndefOr[Input[String]] = js.native
  /**
    * A map of tags to assign to the resource.
    */
  val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
  /**
    * Boolean if the EIP is in a VPC or not.
    */
  val vpc: js.UndefOr[Input[Boolean]] = js.native
}

object EipArgs {
  @scala.inline
  def apply(): EipArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EipArgs]
  }
  @scala.inline
  implicit class EipArgsOps[Self <: EipArgs] (val x: Self) extends AnyVal {
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
    def setAssociateWithPrivateIp(value: Input[String]): Self = this.set("associateWithPrivateIp", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAssociateWithPrivateIp: Self = this.set("associateWithPrivateIp", js.undefined)
    @scala.inline
    def setCustomerOwnedIpv4Pool(value: Input[String]): Self = this.set("customerOwnedIpv4Pool", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCustomerOwnedIpv4Pool: Self = this.set("customerOwnedIpv4Pool", js.undefined)
    @scala.inline
    def setInstance(value: Input[String]): Self = this.set("instance", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInstance: Self = this.set("instance", js.undefined)
    @scala.inline
    def setNetworkInterface(value: Input[String]): Self = this.set("networkInterface", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNetworkInterface: Self = this.set("networkInterface", js.undefined)
    @scala.inline
    def setPublicIpv4Pool(value: Input[String]): Self = this.set("publicIpv4Pool", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePublicIpv4Pool: Self = this.set("publicIpv4Pool", js.undefined)
    @scala.inline
    def setTags(value: Input[StringDictionary[Input[String]]]): Self = this.set("tags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
    @scala.inline
    def setVpc(value: Input[Boolean]): Self = this.set("vpc", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVpc: Self = this.set("vpc", js.undefined)
  }
  
}

