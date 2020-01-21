package typings.pulumiAws.networkInterfaceSecurityGroupAttachmentMod

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NetworkInterfaceSecurityGroupAttachmentState extends js.Object {
  /**
    * The ID of the network interface to attach to.
    */
  val networkInterfaceId: js.UndefOr[Input[String]] = js.native
  /**
    * The ID of the security group.
    */
  val securityGroupId: js.UndefOr[Input[String]] = js.native
}

object NetworkInterfaceSecurityGroupAttachmentState {
  @scala.inline
  def apply(networkInterfaceId: Input[String] = null, securityGroupId: Input[String] = null): NetworkInterfaceSecurityGroupAttachmentState = {
    val __obj = js.Dynamic.literal()
    if (networkInterfaceId != null) __obj.updateDynamic("networkInterfaceId")(networkInterfaceId.asInstanceOf[js.Any])
    if (securityGroupId != null) __obj.updateDynamic("securityGroupId")(securityGroupId.asInstanceOf[js.Any])
    __obj.asInstanceOf[NetworkInterfaceSecurityGroupAttachmentState]
  }
}

