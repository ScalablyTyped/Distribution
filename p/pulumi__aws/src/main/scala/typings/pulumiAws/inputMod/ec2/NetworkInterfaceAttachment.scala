package typings.pulumiAws.inputMod.ec2

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NetworkInterfaceAttachment extends StObject {
  
  var attachmentId: js.UndefOr[Input[String]] = js.undefined
  
  /**
    * Integer to define the devices index.
    */
  var deviceIndex: Input[Double]
  
  /**
    * ID of the instance to attach to.
    */
  var instance: Input[String]
}
object NetworkInterfaceAttachment {
  
  @scala.inline
  def apply(deviceIndex: Input[Double], instance: Input[String]): NetworkInterfaceAttachment = {
    val __obj = js.Dynamic.literal(deviceIndex = deviceIndex.asInstanceOf[js.Any], instance = instance.asInstanceOf[js.Any])
    __obj.asInstanceOf[NetworkInterfaceAttachment]
  }
  
  @scala.inline
  implicit class NetworkInterfaceAttachmentMutableBuilder[Self <: NetworkInterfaceAttachment] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttachmentId(value: Input[String]): Self = StObject.set(x, "attachmentId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttachmentIdUndefined: Self = StObject.set(x, "attachmentId", js.undefined)
    
    @scala.inline
    def setDeviceIndex(value: Input[Double]): Self = StObject.set(x, "deviceIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstance(value: Input[String]): Self = StObject.set(x, "instance", value.asInstanceOf[js.Any])
  }
}
