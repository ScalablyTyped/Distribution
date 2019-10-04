package typings.atPulumiAws.typesInputMod.ec2Ns

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NetworkInterfaceAttachment extends js.Object {
  var attachmentId: js.UndefOr[Input[String]] = js.undefined
  var deviceIndex: Input[Double]
  var instance: Input[String]
}

object NetworkInterfaceAttachment {
  @scala.inline
  def apply(deviceIndex: Input[Double], instance: Input[String], attachmentId: Input[String] = null): NetworkInterfaceAttachment = {
    val __obj = js.Dynamic.literal(deviceIndex = deviceIndex.asInstanceOf[js.Any], instance = instance.asInstanceOf[js.Any])
    if (attachmentId != null) __obj.updateDynamic("attachmentId")(attachmentId.asInstanceOf[js.Any])
    __obj.asInstanceOf[NetworkInterfaceAttachment]
  }
}

