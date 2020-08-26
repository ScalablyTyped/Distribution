package typings.pulumiAws.outputMod.ec2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LaunchConfigurationEbsBlockDevice extends js.Object {
  var deleteOnTermination: js.UndefOr[Boolean] = js.native
  var deviceName: String = js.native
  var encrypted: Boolean = js.native
  var iops: Double = js.native
  var noDevice: js.UndefOr[Boolean] = js.native
  var snapshotId: String = js.native
  var volumeSize: Double = js.native
  var volumeType: String = js.native
}

object LaunchConfigurationEbsBlockDevice {
  @scala.inline
  def apply(
    deviceName: String,
    encrypted: Boolean,
    iops: Double,
    snapshotId: String,
    volumeSize: Double,
    volumeType: String
  ): LaunchConfigurationEbsBlockDevice = {
    val __obj = js.Dynamic.literal(deviceName = deviceName.asInstanceOf[js.Any], encrypted = encrypted.asInstanceOf[js.Any], iops = iops.asInstanceOf[js.Any], snapshotId = snapshotId.asInstanceOf[js.Any], volumeSize = volumeSize.asInstanceOf[js.Any], volumeType = volumeType.asInstanceOf[js.Any])
    __obj.asInstanceOf[LaunchConfigurationEbsBlockDevice]
  }
  @scala.inline
  implicit class LaunchConfigurationEbsBlockDeviceOps[Self <: LaunchConfigurationEbsBlockDevice] (val x: Self) extends AnyVal {
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
    def setDeviceName(value: String): Self = this.set("deviceName", value.asInstanceOf[js.Any])
    @scala.inline
    def setEncrypted(value: Boolean): Self = this.set("encrypted", value.asInstanceOf[js.Any])
    @scala.inline
    def setIops(value: Double): Self = this.set("iops", value.asInstanceOf[js.Any])
    @scala.inline
    def setSnapshotId(value: String): Self = this.set("snapshotId", value.asInstanceOf[js.Any])
    @scala.inline
    def setVolumeSize(value: Double): Self = this.set("volumeSize", value.asInstanceOf[js.Any])
    @scala.inline
    def setVolumeType(value: String): Self = this.set("volumeType", value.asInstanceOf[js.Any])
    @scala.inline
    def setDeleteOnTermination(value: Boolean): Self = this.set("deleteOnTermination", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeleteOnTermination: Self = this.set("deleteOnTermination", js.undefined)
    @scala.inline
    def setNoDevice(value: Boolean): Self = this.set("noDevice", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNoDevice: Self = this.set("noDevice", js.undefined)
  }
  
}

