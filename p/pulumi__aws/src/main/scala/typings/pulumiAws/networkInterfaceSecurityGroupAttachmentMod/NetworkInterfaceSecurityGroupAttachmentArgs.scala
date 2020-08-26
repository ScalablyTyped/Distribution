package typings.pulumiAws.networkInterfaceSecurityGroupAttachmentMod

import typings.pulumiPulumi.outputMod.Input
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
  @scala.inline
  implicit class NetworkInterfaceSecurityGroupAttachmentArgsOps[Self <: NetworkInterfaceSecurityGroupAttachmentArgs] (val x: Self) extends AnyVal {
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
    def setNetworkInterfaceId(value: Input[String]): Self = this.set("networkInterfaceId", value.asInstanceOf[js.Any])
    @scala.inline
    def setSecurityGroupId(value: Input[String]): Self = this.set("securityGroupId", value.asInstanceOf[js.Any])
  }
  
}

