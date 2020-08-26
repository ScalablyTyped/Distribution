package typings.pulumiAws.outputMod.ec2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetInstanceRootBlockDevice extends js.Object {
  /**
    * If the root block device will be deleted on termination.
    */
  var deleteOnTermination: Boolean = js.native
  /**
    * The physical name of the device.
    */
  var deviceName: String = js.native
  /**
    * If the EBS volume is encrypted.
    */
  var encrypted: Boolean = js.native
  /**
    * `0` If the volume is not a provisioned IOPS image, otherwise the supported IOPS count.
    */
  var iops: Double = js.native
  var kmsKeyId: String = js.native
  var volumeId: String = js.native
  /**
    * The size of the volume, in GiB.
    */
  var volumeSize: Double = js.native
  /**
    * The type of the volume.
    */
  var volumeType: String = js.native
}

object GetInstanceRootBlockDevice {
  @scala.inline
  def apply(
    deleteOnTermination: Boolean,
    deviceName: String,
    encrypted: Boolean,
    iops: Double,
    kmsKeyId: String,
    volumeId: String,
    volumeSize: Double,
    volumeType: String
  ): GetInstanceRootBlockDevice = {
    val __obj = js.Dynamic.literal(deleteOnTermination = deleteOnTermination.asInstanceOf[js.Any], deviceName = deviceName.asInstanceOf[js.Any], encrypted = encrypted.asInstanceOf[js.Any], iops = iops.asInstanceOf[js.Any], kmsKeyId = kmsKeyId.asInstanceOf[js.Any], volumeId = volumeId.asInstanceOf[js.Any], volumeSize = volumeSize.asInstanceOf[js.Any], volumeType = volumeType.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetInstanceRootBlockDevice]
  }
  @scala.inline
  implicit class GetInstanceRootBlockDeviceOps[Self <: GetInstanceRootBlockDevice] (val x: Self) extends AnyVal {
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
    def setDeleteOnTermination(value: Boolean): Self = this.set("deleteOnTermination", value.asInstanceOf[js.Any])
    @scala.inline
    def setDeviceName(value: String): Self = this.set("deviceName", value.asInstanceOf[js.Any])
    @scala.inline
    def setEncrypted(value: Boolean): Self = this.set("encrypted", value.asInstanceOf[js.Any])
    @scala.inline
    def setIops(value: Double): Self = this.set("iops", value.asInstanceOf[js.Any])
    @scala.inline
    def setKmsKeyId(value: String): Self = this.set("kmsKeyId", value.asInstanceOf[js.Any])
    @scala.inline
    def setVolumeId(value: String): Self = this.set("volumeId", value.asInstanceOf[js.Any])
    @scala.inline
    def setVolumeSize(value: Double): Self = this.set("volumeSize", value.asInstanceOf[js.Any])
    @scala.inline
    def setVolumeType(value: String): Self = this.set("volumeType", value.asInstanceOf[js.Any])
  }
  
}

