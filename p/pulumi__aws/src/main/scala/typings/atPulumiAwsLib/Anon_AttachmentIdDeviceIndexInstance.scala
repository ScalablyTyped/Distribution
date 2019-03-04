package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AttachmentIdDeviceIndexInstance extends js.Object {
  var attachmentId: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  var deviceIndex: atPulumiPulumiLib.outputMod.Input[scala.Double]
  var instance: atPulumiPulumiLib.outputMod.Input[java.lang.String]
}

object Anon_AttachmentIdDeviceIndexInstance {
  @scala.inline
  def apply(
    deviceIndex: atPulumiPulumiLib.outputMod.Input[scala.Double],
    instance: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    attachmentId: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null
  ): Anon_AttachmentIdDeviceIndexInstance = {
    val __obj = js.Dynamic.literal(deviceIndex = deviceIndex.asInstanceOf[js.Any], instance = instance.asInstanceOf[js.Any])
    if (attachmentId != null) __obj.updateDynamic("attachmentId")(attachmentId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_AttachmentIdDeviceIndexInstance]
  }
}

