package typings.pulumiAws.getLocalDiskMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetLocalDiskResult extends js.Object {
  /**
    * The disk identifier. e.g. `pci-0000:03:00.0-scsi-0:0:0:0`
    */
  val diskId: String = js.native
  val diskNode: js.UndefOr[String] = js.native
  val diskPath: js.UndefOr[String] = js.native
  val gatewayArn: String = js.native
  /**
    * The provider-assigned unique ID for this managed resource.
    */
  val id: String = js.native
}

object GetLocalDiskResult {
  @scala.inline
  def apply(diskId: String, gatewayArn: String, id: String): GetLocalDiskResult = {
    val __obj = js.Dynamic.literal(diskId = diskId.asInstanceOf[js.Any], gatewayArn = gatewayArn.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetLocalDiskResult]
  }
  @scala.inline
  implicit class GetLocalDiskResultOps[Self <: GetLocalDiskResult] (val x: Self) extends AnyVal {
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
    def setDiskId(value: String): Self = this.set("diskId", value.asInstanceOf[js.Any])
    @scala.inline
    def setGatewayArn(value: String): Self = this.set("gatewayArn", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setDiskNode(value: String): Self = this.set("diskNode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDiskNode: Self = this.set("diskNode", js.undefined)
    @scala.inline
    def setDiskPath(value: String): Self = this.set("diskPath", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDiskPath: Self = this.set("diskPath", js.undefined)
  }
  
}

