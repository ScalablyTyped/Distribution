package typings
package atPulumiAwsLib.ec2NetworkInterfaceSecurityGroupAttachmentMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NetworkInterfaceSecurityGroupAttachmentState extends js.Object {
  /**
    * The ID of the network interface to attach to.
    */
  val networkInterfaceId: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The ID of the security group.
    */
  val securityGroupId: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
}

object NetworkInterfaceSecurityGroupAttachmentState {
  @scala.inline
  def apply(
    networkInterfaceId: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    securityGroupId: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null
  ): NetworkInterfaceSecurityGroupAttachmentState = {
    val __obj = js.Dynamic.literal()
    if (networkInterfaceId != null) __obj.updateDynamic("networkInterfaceId")(networkInterfaceId.asInstanceOf[js.Any])
    if (securityGroupId != null) __obj.updateDynamic("securityGroupId")(securityGroupId.asInstanceOf[js.Any])
    __obj.asInstanceOf[NetworkInterfaceSecurityGroupAttachmentState]
  }
}

