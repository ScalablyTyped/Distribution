package typings.pulumiAws.networkInterfaceAttachmentMod

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NetworkInterfaceAttachmentState extends js.Object {
  
  /**
    * The ENI Attachment ID.
    */
  val attachmentId: js.UndefOr[Input[String]] = js.native
  
  /**
    * Network interface index (int).
    */
  val deviceIndex: js.UndefOr[Input[Double]] = js.native
  
  /**
    * Instance ID to attach.
    */
  val instanceId: js.UndefOr[Input[String]] = js.native
  
  /**
    * ENI ID to attach.
    */
  val networkInterfaceId: js.UndefOr[Input[String]] = js.native
  
  /**
    * The status of the Network Interface Attachment.
    */
  val status: js.UndefOr[Input[String]] = js.native
}
object NetworkInterfaceAttachmentState {
  
  @scala.inline
  def apply(): NetworkInterfaceAttachmentState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NetworkInterfaceAttachmentState]
  }
  
  @scala.inline
  implicit class NetworkInterfaceAttachmentStateOps[Self <: NetworkInterfaceAttachmentState] (val x: Self) extends AnyVal {
    
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
    def setAttachmentId(value: Input[String]): Self = this.set("attachmentId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAttachmentId: Self = this.set("attachmentId", js.undefined)
    
    @scala.inline
    def setDeviceIndex(value: Input[Double]): Self = this.set("deviceIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeviceIndex: Self = this.set("deviceIndex", js.undefined)
    
    @scala.inline
    def setInstanceId(value: Input[String]): Self = this.set("instanceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInstanceId: Self = this.set("instanceId", js.undefined)
    
    @scala.inline
    def setNetworkInterfaceId(value: Input[String]): Self = this.set("networkInterfaceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNetworkInterfaceId: Self = this.set("networkInterfaceId", js.undefined)
    
    @scala.inline
    def setStatus(value: Input[String]): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
  }
}
