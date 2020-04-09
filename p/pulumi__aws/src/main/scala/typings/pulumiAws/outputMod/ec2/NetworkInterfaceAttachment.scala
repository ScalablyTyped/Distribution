package typings.pulumiAws.outputMod.ec2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NetworkInterfaceAttachment extends js.Object {
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
}

