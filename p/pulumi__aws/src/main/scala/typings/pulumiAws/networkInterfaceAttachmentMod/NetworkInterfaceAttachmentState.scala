package typings.pulumiAws.networkInterfaceAttachmentMod

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NetworkInterfaceAttachmentState extends js.Object {
  /**
    * The ENI Attachment ID.
    */
  val attachmentId: js.UndefOr[Input[String]] = js.native
  /**
    * Network interface index (int).
    */
  val deviceIndex: js.UndefOr[Input[Double]] = js.native
  /**
    * Instance ID to attach.
    */
  val instanceId: js.UndefOr[Input[String]] = js.native
  /**
    * ENI ID to attach.
    */
  val networkInterfaceId: js.UndefOr[Input[String]] = js.native
  /**
    * The status of the Network Interface Attachment.
    */
  val status: js.UndefOr[Input[String]] = js.native
}

object NetworkInterfaceAttachmentState {
  @scala.inline
  def apply(
    attachmentId: Input[String] = null,
    deviceIndex: Input[Double] = null,
    instanceId: Input[String] = null,
    networkInterfaceId: Input[String] = null,
    status: Input[String] = null
  ): NetworkInterfaceAttachmentState = {
    val __obj = js.Dynamic.literal()
    if (attachmentId != null) __obj.updateDynamic("attachmentId")(attachmentId.asInstanceOf[js.Any])
    if (deviceIndex != null) __obj.updateDynamic("deviceIndex")(deviceIndex.asInstanceOf[js.Any])
    if (instanceId != null) __obj.updateDynamic("instanceId")(instanceId.asInstanceOf[js.Any])
    if (networkInterfaceId != null) __obj.updateDynamic("networkInterfaceId")(networkInterfaceId.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    __obj.asInstanceOf[NetworkInterfaceAttachmentState]
  }
}

