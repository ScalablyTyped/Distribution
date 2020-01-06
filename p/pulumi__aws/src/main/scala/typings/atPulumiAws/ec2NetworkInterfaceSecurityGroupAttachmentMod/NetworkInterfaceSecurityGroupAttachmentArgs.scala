package typings.atPulumiAws.ec2NetworkInterfaceSecurityGroupAttachmentMod

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NetworkInterfaceSecurityGroupAttachmentArgs extends js.Object {
  /**
    * The ID of the network interface to attach to.
    */
  val networkInterfaceId: Input[String] = js.native
  /**
    * The ID of the security group.
    */
  val securityGroupId: Input[String] = js.native
}

object NetworkInterfaceSecurityGroupAttachmentArgs {
  @scala.inline
  def apply(networkInterfaceId: Input[String], securityGroupId: Input[String]): NetworkInterfaceSecurityGroupAttachmentArgs = {
    val __obj = js.Dynamic.literal(networkInterfaceId = networkInterfaceId.asInstanceOf[js.Any], securityGroupId = securityGroupId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[NetworkInterfaceSecurityGroupAttachmentArgs]
  }
}

