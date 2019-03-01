package typings
package atPulumiAwsLib.ec2VpcDhcpOptionsAssociationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VpcDhcpOptionsAssociationState extends js.Object {
  /**
    * The ID of the DHCP Options Set to associate to the VPC.
    */
  val dhcpOptionsId: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The ID of the VPC to which we would like to associate a DHCP Options Set.
    */
  val vpcId: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
}

object VpcDhcpOptionsAssociationState {
  @scala.inline
  def apply(
    dhcpOptionsId: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    vpcId: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null
  ): VpcDhcpOptionsAssociationState = {
    val __obj = js.Dynamic.literal()
    if (dhcpOptionsId != null) __obj.updateDynamic("dhcpOptionsId")(dhcpOptionsId.asInstanceOf[js.Any])
    if (vpcId != null) __obj.updateDynamic("vpcId")(vpcId.asInstanceOf[js.Any])
    __obj.asInstanceOf[VpcDhcpOptionsAssociationState]
  }
}

