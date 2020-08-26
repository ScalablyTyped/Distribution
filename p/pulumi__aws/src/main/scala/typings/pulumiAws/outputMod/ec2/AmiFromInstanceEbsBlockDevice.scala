package typings.pulumiAws.outputMod.ec2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AmiFromInstanceEbsBlockDevice extends js.Object {
  /**
    * Boolean controlling whether the EBS volumes created to
    * support each created instance will be deleted once that instance is terminated.
    */
  var deleteOnTermination: Boolean = js.native
  /**
    * The path at which the device is exposed to created instances.
    */
  var deviceName: String = js.native
  /**
    * Boolean controlling whether the created EBS volumes will be encrypted. Can't be used with `snapshotId`.
    */
  var encrypted: Boolean = js.native
  /**
    * Number of I/O operations per second the
    * created volumes will support.
    */
  var iops: Double = js.native
  /**
    * The id of an EBS snapshot that will be used to initialize the created
    * EBS volumes. If set, the `volumeSize` attribute must be at least as large as the referenced
    * snapshot.
    */
  var snapshotId: String = js.native
  /**
    * The size of created volumes in GiB.
    * If `snapshotId` is set and `volumeSize` is omitted then the volume will have the same size
    * as the selected snapshot.
    */
  var volumeSize: Double = js.native
  /**
    * The type of EBS volume to create. Can be one of "standard" (the
    * default), "io1" or "gp2".
    */
  var volumeType: String = js.native
}

object AmiFromInstanceEbsBlockDevice {
  @scala.inline
  def apply(
    deleteOnTermination: Boolean,
    deviceName: String,
    encrypted: Boolean,
    iops: Double,
    snapshotId: String,
    volumeSize: Double,
    volumeType: String
  ): AmiFromInstanceEbsBlockDevice = {
    val __obj = js.Dynamic.literal(deleteOnTermination = deleteOnTermination.asInstanceOf[js.Any], deviceName = deviceName.asInstanceOf[js.Any], encrypted = encrypted.asInstanceOf[js.Any], iops = iops.asInstanceOf[js.Any], snapshotId = snapshotId.asInstanceOf[js.Any], volumeSize = volumeSize.asInstanceOf[js.Any], volumeType = volumeType.asInstanceOf[js.Any])
    __obj.asInstanceOf[AmiFromInstanceEbsBlockDevice]
  }
  @scala.inline
  implicit class AmiFromInstanceEbsBlockDeviceOps[Self <: AmiFromInstanceEbsBlockDevice] (val x: Self) extends AnyVal {
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
    def setSnapshotId(value: String): Self = this.set("snapshotId", value.asInstanceOf[js.Any])
    @scala.inline
    def setVolumeSize(value: Double): Self = this.set("volumeSize", value.asInstanceOf[js.Any])
    @scala.inline
    def setVolumeType(value: String): Self = this.set("volumeType", value.asInstanceOf[js.Any])
  }
  
}

