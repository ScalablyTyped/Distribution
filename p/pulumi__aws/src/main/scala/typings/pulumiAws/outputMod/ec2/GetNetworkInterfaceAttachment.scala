package typings.pulumiAws.outputMod.ec2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetNetworkInterfaceAttachment extends StObject {
  
  var attachmentId: String
  
  var deviceIndex: Double
  
  var instanceId: String
  
  var instanceOwnerId: String
}
object GetNetworkInterfaceAttachment {
  
  inline def apply(attachmentId: String, deviceIndex: Double, instanceId: String, instanceOwnerId: String): GetNetworkInterfaceAttachment = {
    val __obj = js.Dynamic.literal(attachmentId = attachmentId.asInstanceOf[js.Any], deviceIndex = deviceIndex.asInstanceOf[js.Any], instanceId = instanceId.asInstanceOf[js.Any], instanceOwnerId = instanceOwnerId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetNetworkInterfaceAttachment]
  }
  
  extension [Self <: GetNetworkInterfaceAttachment](x: Self) {
    
    inline def setAttachmentId(value: String): Self = StObject.set(x, "attachmentId", value.asInstanceOf[js.Any])
    
    inline def setDeviceIndex(value: Double): Self = StObject.set(x, "deviceIndex", value.asInstanceOf[js.Any])
    
    inline def setInstanceId(value: String): Self = StObject.set(x, "instanceId", value.asInstanceOf[js.Any])
    
    inline def setInstanceOwnerId(value: String): Self = StObject.set(x, "instanceOwnerId", value.asInstanceOf[js.Any])
  }
}
