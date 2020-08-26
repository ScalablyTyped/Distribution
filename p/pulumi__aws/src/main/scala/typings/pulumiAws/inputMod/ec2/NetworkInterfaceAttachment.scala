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
  def apply(deviceIndex: Input[Double], instance: Input[String]): NetworkInterfaceAttachment = {
    val __obj = js.Dynamic.literal(deviceIndex = deviceIndex.asInstanceOf[js.Any], instance = instance.asInstanceOf[js.Any])
    __obj.asInstanceOf[NetworkInterfaceAttachment]
  }
  @scala.inline
  implicit class NetworkInterfaceAttachmentOps[Self <: NetworkInterfaceAttachment] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDeviceIndex(value: Input[Double]): Self = this.set("deviceIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def setInstance(value: Input[String]): Self = this.set("instance", value.asInstanceOf[js.Any])
    @scala.inline
    def setAttachmentId(value: Input[String]): Self = this.set("attachmentId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAttachmentId: Self = this.set("attachmentId", js.undefined)
  }
  
}

