package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AttachmentId extends js.Object {
  var attachmentId: java.lang.String
  var deviceIndex: scala.Double
  var instanceId: java.lang.String
  var instanceOwnerId: java.lang.String
}

object Anon_AttachmentId {
  @scala.inline
  def apply(
    attachmentId: java.lang.String,
    deviceIndex: scala.Double,
    instanceId: java.lang.String,
    instanceOwnerId: java.lang.String
  ): Anon_AttachmentId = {
    val __obj = js.Dynamic.literal(attachmentId = attachmentId, deviceIndex = deviceIndex, instanceId = instanceId, instanceOwnerId = instanceOwnerId)
  
    __obj.asInstanceOf[Anon_AttachmentId]
  }
}

