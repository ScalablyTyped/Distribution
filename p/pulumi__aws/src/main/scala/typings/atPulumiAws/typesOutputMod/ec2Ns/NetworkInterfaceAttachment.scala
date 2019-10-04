package typings.atPulumiAws.typesOutputMod.ec2Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NetworkInterfaceAttachment extends js.Object {
  var attachmentId: String
  var deviceIndex: Double
  var instance: String
}

object NetworkInterfaceAttachment {
  @scala.inline
  def apply(attachmentId: String, deviceIndex: Double, instance: String): NetworkInterfaceAttachment = {
    val __obj = js.Dynamic.literal(attachmentId = attachmentId, deviceIndex = deviceIndex, instance = instance)
  
    __obj.asInstanceOf[NetworkInterfaceAttachment]
  }
}

