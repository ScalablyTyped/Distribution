package typings.atPulumiAws.ec2NetworkInterfaceSecurityGroupAttachmentMod

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NetworkInterfaceSecurityGroupAttachmentArgs extends js.Object {
  /**
    * The ID of the network interface to attach to.
    */
  val networkInterfaceId: Input[String]
  /**
    * The ID of the security group.
    */
  val securityGroupId: Input[String]
}

object NetworkInterfaceSecurityGroupAttachmentArgs {
  @scala.inline
  def apply(networkInterfaceId: Input[String], securityGroupId: Input[String]): NetworkInterfaceSecurityGroupAttachmentArgs = {
    val __obj = js.Dynamic.literal(networkInterfaceId = networkInterfaceId.asInstanceOf[js.Any], securityGroupId = securityGroupId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[NetworkInterfaceSecurityGroupAttachmentArgs]
  }
}

