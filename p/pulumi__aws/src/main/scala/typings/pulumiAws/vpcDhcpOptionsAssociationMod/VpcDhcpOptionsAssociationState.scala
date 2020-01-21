package typings.pulumiAws.vpcDhcpOptionsAssociationMod

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VpcDhcpOptionsAssociationState extends js.Object {
  /**
    * The ID of the DHCP Options Set to associate to the VPC.
    */
  val dhcpOptionsId: js.UndefOr[Input[String]] = js.native
  /**
    * The ID of the VPC to which we would like to associate a DHCP Options Set.
    */
  val vpcId: js.UndefOr[Input[String]] = js.native
}

object VpcDhcpOptionsAssociationState {
  @scala.inline
  def apply(dhcpOptionsId: Input[String] = null, vpcId: Input[String] = null): VpcDhcpOptionsAssociationState = {
    val __obj = js.Dynamic.literal()
    if (dhcpOptionsId != null) __obj.updateDynamic("dhcpOptionsId")(dhcpOptionsId.asInstanceOf[js.Any])
    if (vpcId != null) __obj.updateDynamic("vpcId")(vpcId.asInstanceOf[js.Any])
    __obj.asInstanceOf[VpcDhcpOptionsAssociationState]
  }
}

