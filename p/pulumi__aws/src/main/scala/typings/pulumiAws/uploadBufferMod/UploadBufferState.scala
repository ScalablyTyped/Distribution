package typings.pulumiAws.uploadBufferMod

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UploadBufferState extends js.Object {
  /**
    * Local disk identifier. For example, `pci-0000:03:00.0-scsi-0:0:0:0`.
    */
  val diskId: js.UndefOr[Input[String]] = js.native
  /**
    * The Amazon Resource Name (ARN) of the gateway.
    */
  val gatewayArn: js.UndefOr[Input[String]] = js.native
}

object UploadBufferState {
  @scala.inline
  def apply(diskId: Input[String] = null, gatewayArn: Input[String] = null): UploadBufferState = {
    val __obj = js.Dynamic.literal()
    if (diskId != null) __obj.updateDynamic("diskId")(diskId.asInstanceOf[js.Any])
    if (gatewayArn != null) __obj.updateDynamic("gatewayArn")(gatewayArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[UploadBufferState]
  }
}

