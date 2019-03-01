package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AttachmentIdDeviceIndex extends js.Object {
  var attachmentId: java.lang.String
  var deviceIndex: scala.Double
  var instance: java.lang.String
}

object Anon_AttachmentIdDeviceIndex {
  @scala.inline
  def apply(attachmentId: java.lang.String, deviceIndex: scala.Double, instance: java.lang.String): Anon_AttachmentIdDeviceIndex = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("attachmentId")(attachmentId)
    __obj.updateDynamic("deviceIndex")(deviceIndex)
    __obj.updateDynamic("instance")(instance)
    __obj.asInstanceOf[Anon_AttachmentIdDeviceIndex]
  }
}

