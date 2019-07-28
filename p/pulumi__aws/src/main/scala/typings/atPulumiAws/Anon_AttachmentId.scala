package typings.atPulumiAws

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AttachmentId extends js.Object {
  var attachmentId: String
  var deviceIndex: Double
  var instanceId: String
  var instanceOwnerId: String
}

object Anon_AttachmentId {
  @scala.inline
  def apply(attachmentId: String, deviceIndex: Double, instanceId: String, instanceOwnerId: String): Anon_AttachmentId = {
    val __obj = js.Dynamic.literal(attachmentId = attachmentId, deviceIndex = deviceIndex, instanceId = instanceId, instanceOwnerId = instanceOwnerId)
  
    __obj.asInstanceOf[Anon_AttachmentId]
  }
}

