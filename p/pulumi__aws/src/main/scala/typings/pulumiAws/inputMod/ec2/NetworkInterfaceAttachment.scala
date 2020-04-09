package typings.pulumiAws.inputMod.ec2

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NetworkInterfaceAttachment extends js.Object {
  var attachmentId: js.UndefOr[Input[String]] = js.native
  /**
    * Integer to define the devices index.
    */
  var deviceIndex: Input[Double] = js.native
  /**
    * ID of the instance to attach to.
    */
  var instance: Input[String] = js.native
}

object NetworkInterfaceAttachment {
  @scala.inline
  def apply(deviceIndex: Input[Double], instance: Input[String], attachmentId: Input[String] = null): NetworkInterfaceAttachment = {
    val __obj = js.Dynamic.literal(deviceIndex = deviceIndex.asInstanceOf[js.Any], instance = instance.asInstanceOf[js.Any])
    if (attachmentId != null) __obj.updateDynamic("attachmentId")(attachmentId.asInstanceOf[js.Any])
    __obj.asInstanceOf[NetworkInterfaceAttachment]
  }
}

