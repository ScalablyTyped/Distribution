package typings.pulumiAws.inputMod.opsworks

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InstanceEbsBlockDevice extends js.Object {
  var deleteOnTermination: js.UndefOr[Input[Boolean]] = js.native
  var deviceName: Input[String] = js.native
  var iops: js.UndefOr[Input[Double]] = js.native
  var snapshotId: js.UndefOr[Input[String]] = js.native
  var volumeSize: js.UndefOr[Input[Double]] = js.native
  var volumeType: js.UndefOr[Input[String]] = js.native
}

object InstanceEbsBlockDevice {
  @scala.inline
  def apply(deviceName: Input[String]): InstanceEbsBlockDevice = {
    val __obj = js.Dynamic.literal(deviceName = deviceName.asInstanceOf[js.Any])
    __obj.asInstanceOf[InstanceEbsBlockDevice]
  }
  @scala.inline
  implicit class InstanceEbsBlockDeviceOps[Self <: InstanceEbsBlockDevice] (val x: Self) extends AnyVal {
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
    def setDeviceName(value: Input[String]): Self = this.set("deviceName", value.asInstanceOf[js.Any])
    @scala.inline
    def setDeleteOnTermination(value: Input[Boolean]): Self = this.set("deleteOnTermination", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeleteOnTermination: Self = this.set("deleteOnTermination", js.undefined)
    @scala.inline
    def setIops(value: Input[Double]): Self = this.set("iops", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIops: Self = this.set("iops", js.undefined)
    @scala.inline
    def setSnapshotId(value: Input[String]): Self = this.set("snapshotId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSnapshotId: Self = this.set("snapshotId", js.undefined)
    @scala.inline
    def setVolumeSize(value: Input[Double]): Self = this.set("volumeSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVolumeSize: Self = this.set("volumeSize", js.undefined)
    @scala.inline
    def setVolumeType(value: Input[String]): Self = this.set("volumeType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVolumeType: Self = this.set("volumeType", js.undefined)
  }
  
}

