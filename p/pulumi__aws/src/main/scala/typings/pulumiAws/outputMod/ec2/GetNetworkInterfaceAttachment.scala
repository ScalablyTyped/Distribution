package typings.pulumiAws.outputMod.ec2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetNetworkInterfaceAttachment extends js.Object {
  
  var attachmentId: String = js.native
  
  var deviceIndex: Double = js.native
  
  var instanceId: String = js.native
  
  var instanceOwnerId: String = js.native
}
object GetNetworkInterfaceAttachment {
  
  @scala.inline
  def apply(attachmentId: String, deviceIndex: Double, instanceId: String, instanceOwnerId: String): GetNetworkInterfaceAttachment = {
    val __obj = js.Dynamic.literal(attachmentId = attachmentId.asInstanceOf[js.Any], deviceIndex = deviceIndex.asInstanceOf[js.Any], instanceId = instanceId.asInstanceOf[js.Any], instanceOwnerId = instanceOwnerId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetNetworkInterfaceAttachment]
  }
  
  @scala.inline
  implicit class GetNetworkInterfaceAttachmentOps[Self <: GetNetworkInterfaceAttachment] (val x: Self) extends AnyVal {
    
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
    def setAttachmentId(value: String): Self = this.set("attachmentId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeviceIndex(value: Double): Self = this.set("deviceIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceId(value: String): Self = this.set("instanceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceOwnerId(value: String): Self = this.set("instanceOwnerId", value.asInstanceOf[js.Any])
  }
}
