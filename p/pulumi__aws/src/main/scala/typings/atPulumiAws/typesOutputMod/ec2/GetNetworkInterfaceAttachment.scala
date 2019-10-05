package typings.atPulumiAws.typesOutputMod.ec2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetNetworkInterfaceAttachment extends js.Object {
  var attachmentId: String
  var deviceIndex: Double
  var instanceId: String
  var instanceOwnerId: String
}

object GetNetworkInterfaceAttachment {
  @scala.inline
  def apply(attachmentId: String, deviceIndex: Double, instanceId: String, instanceOwnerId: String): GetNetworkInterfaceAttachment = {
    val __obj = js.Dynamic.literal(attachmentId = attachmentId, deviceIndex = deviceIndex, instanceId = instanceId, instanceOwnerId = instanceOwnerId)
  
    __obj.asInstanceOf[GetNetworkInterfaceAttachment]
  }
}

