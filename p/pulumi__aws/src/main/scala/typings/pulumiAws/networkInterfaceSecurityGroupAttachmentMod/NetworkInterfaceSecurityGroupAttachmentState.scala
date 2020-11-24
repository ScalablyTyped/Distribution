package typings.pulumiAws.networkInterfaceSecurityGroupAttachmentMod

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  def apply(): NetworkInterfaceSecurityGroupAttachmentState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NetworkInterfaceSecurityGroupAttachmentState]
  }
  
  @scala.inline
  implicit class NetworkInterfaceSecurityGroupAttachmentStateOps[Self <: NetworkInterfaceSecurityGroupAttachmentState] (val x: Self) extends AnyVal {
    
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
    def deleteNetworkInterfaceId: Self = this.set("networkInterfaceId", js.undefined)
    
    @scala.inline
    def setSecurityGroupId(value: Input[String]): Self = this.set("securityGroupId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSecurityGroupId: Self = this.set("securityGroupId", js.undefined)
  }
}
