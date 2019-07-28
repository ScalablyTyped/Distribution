package typings.atPulumiAws

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AttachmentIdDeviceIndexInstance extends js.Object {
  var attachmentId: js.UndefOr[Input[String]] = js.undefined
  var deviceIndex: Input[Double]
  var instance: Input[String]
}

object Anon_AttachmentIdDeviceIndexInstance {
  @scala.inline
  def apply(deviceIndex: Input[Double], instance: Input[String], attachmentId: Input[String] = null): Anon_AttachmentIdDeviceIndexInstance = {
    val __obj = js.Dynamic.literal(deviceIndex = deviceIndex.asInstanceOf[js.Any], instance = instance.asInstanceOf[js.Any])
    if (attachmentId != null) __obj.updateDynamic("attachmentId")(attachmentId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_AttachmentIdDeviceIndexInstance]
  }
}

