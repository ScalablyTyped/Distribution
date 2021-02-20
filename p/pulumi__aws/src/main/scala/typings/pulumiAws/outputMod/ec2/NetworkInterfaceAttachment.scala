package typings.pulumiAws.outputMod.ec2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NetworkInterfaceAttachment extends StObject {
  
  var attachmentId: String = js.native
  
  /**
    * Integer to define the devices index.
    */
  var deviceIndex: Double = js.native
  
  /**
    * ID of the instance to attach to.
    */
  var instance: String = js.native
}
object NetworkInterfaceAttachment {
  
  @scala.inline
  def apply(attachmentId: String, deviceIndex: Double, instance: String): NetworkInterfaceAttachment = {
    val __obj = js.Dynamic.literal(attachmentId = attachmentId.asInstanceOf[js.Any], deviceIndex = deviceIndex.asInstanceOf[js.Any], instance = instance.asInstanceOf[js.Any])
    __obj.asInstanceOf[NetworkInterfaceAttachment]
  }
  
  @scala.inline
  implicit class NetworkInterfaceAttachmentMutableBuilder[Self <: NetworkInterfaceAttachment] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttachmentId(value: String): Self = StObject.set(x, "attachmentId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeviceIndex(value: Double): Self = StObject.set(x, "deviceIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstance(value: String): Self = StObject.set(x, "instance", value.asInstanceOf[js.Any])
  }
}
