package typings.pulumiAws.uploadBufferMod

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UploadBufferArgs extends js.Object {
  /**
    * Local disk identifier. For example, `pci-0000:03:00.0-scsi-0:0:0:0`.
    */
  val diskId: Input[String] = js.native
  /**
    * The Amazon Resource Name (ARN) of the gateway.
    */
  val gatewayArn: Input[String] = js.native
}

object UploadBufferArgs {
  @scala.inline
  def apply(diskId: Input[String], gatewayArn: Input[String]): UploadBufferArgs = {
    val __obj = js.Dynamic.literal(diskId = diskId.asInstanceOf[js.Any], gatewayArn = gatewayArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[UploadBufferArgs]
  }
  @scala.inline
  implicit class UploadBufferArgsOps[Self <: UploadBufferArgs] (val x: Self) extends AnyVal {
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
    def setDiskId(value: Input[String]): Self = this.set("diskId", value.asInstanceOf[js.Any])
    @scala.inline
    def setGatewayArn(value: Input[String]): Self = this.set("gatewayArn", value.asInstanceOf[js.Any])
  }
  
}

