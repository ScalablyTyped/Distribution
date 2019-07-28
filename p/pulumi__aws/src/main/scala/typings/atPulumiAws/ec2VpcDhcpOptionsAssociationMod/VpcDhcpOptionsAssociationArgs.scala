package typings.atPulumiAws.ec2VpcDhcpOptionsAssociationMod

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VpcDhcpOptionsAssociationArgs extends js.Object {
  /**
    * The ID of the DHCP Options Set to associate to the VPC.
    */
  val dhcpOptionsId: Input[String]
  /**
    * The ID of the VPC to which we would like to associate a DHCP Options Set.
    */
  val vpcId: Input[String]
}

object VpcDhcpOptionsAssociationArgs {
  @scala.inline
  def apply(dhcpOptionsId: Input[String], vpcId: Input[String]): VpcDhcpOptionsAssociationArgs = {
    val __obj = js.Dynamic.literal(dhcpOptionsId = dhcpOptionsId.asInstanceOf[js.Any], vpcId = vpcId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[VpcDhcpOptionsAssociationArgs]
  }
}

