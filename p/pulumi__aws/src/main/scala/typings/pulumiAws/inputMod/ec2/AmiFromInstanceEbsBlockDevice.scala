package typings.pulumiAws.inputMod.ec2

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AmiFromInstanceEbsBlockDevice extends js.Object {
  /**
    * Boolean controlling whether the EBS volumes created to
    * support each created instance will be deleted once that instance is terminated.
    */
  var deleteOnTermination: js.UndefOr[Input[Boolean]] = js.native
  /**
    * The path at which the device is exposed to created instances.
    */
  var deviceName: js.UndefOr[Input[String]] = js.native
  /**
    * Boolean controlling whether the created EBS volumes will be encrypted. Can't be used with `snapshotId`.
    */
  var encrypted: js.UndefOr[Input[Boolean]] = js.native
  /**
    * Number of I/O operations per second the
    * created volumes will support.
    */
  var iops: js.UndefOr[Input[Double]] = js.native
  /**
    * The id of an EBS snapshot that will be used to initialize the created
    * EBS volumes. If set, the `volumeSize` attribute must be at least as large as the referenced
    * snapshot.
    */
  var snapshotId: js.UndefOr[Input[String]] = js.native
  /**
    * The size of created volumes in GiB.
    * If `snapshotId` is set and `volumeSize` is omitted then the volume will have the same size
    * as the selected snapshot.
    */
  var volumeSize: js.UndefOr[Input[Double]] = js.native
  /**
    * The type of EBS volume to create. Can be one of "standard" (the
    * default), "io1" or "gp2".
    */
  var volumeType: js.UndefOr[Input[String]] = js.native
}

object AmiFromInstanceEbsBlockDevice {
  @scala.inline
  def apply(): AmiFromInstanceEbsBlockDevice = {
    val __obj = js.Dynamic.literal()
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
    def setDeleteOnTermination(value: Input[Boolean]): Self = this.set("deleteOnTermination", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeleteOnTermination: Self = this.set("deleteOnTermination", js.undefined)
    @scala.inline
    def setDeviceName(value: Input[String]): Self = this.set("deviceName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeviceName: Self = this.set("deviceName", js.undefined)
    @scala.inline
    def setEncrypted(value: Input[Boolean]): Self = this.set("encrypted", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEncrypted: Self = this.set("encrypted", js.undefined)
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

