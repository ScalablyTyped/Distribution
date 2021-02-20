package typings.pulumiAws.outputMod.ec2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetNetworkInterfaceAttachment extends StObject {
  
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
  implicit class GetNetworkInterfaceAttachmentMutableBuilder[Self <: GetNetworkInterfaceAttachment] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttachmentId(value: String): Self = StObject.set(x, "attachmentId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeviceIndex(value: Double): Self = StObject.set(x, "deviceIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceId(value: String): Self = StObject.set(x, "instanceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceOwnerId(value: String): Self = StObject.set(x, "instanceOwnerId", value.asInstanceOf[js.Any])
  }
}
