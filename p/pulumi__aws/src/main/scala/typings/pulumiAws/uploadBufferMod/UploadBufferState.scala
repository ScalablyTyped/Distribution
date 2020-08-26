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
  def apply(): UploadBufferState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UploadBufferState]
  }
  @scala.inline
  implicit class UploadBufferStateOps[Self <: UploadBufferState] (val x: Self) extends AnyVal {
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
    def deleteDiskId: Self = this.set("diskId", js.undefined)
    @scala.inline
    def setGatewayArn(value: Input[String]): Self = this.set("gatewayArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGatewayArn: Self = this.set("gatewayArn", js.undefined)
  }
  
}

