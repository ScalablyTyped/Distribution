package typings.pulumiAws.inputMod.ec2

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SpotInstanceRequestEbsBlockDevice extends js.Object {
  
  /**
    * Whether the volume should be destroyed
    * on instance termination (Default: `true`).
    */
  var deleteOnTermination: js.UndefOr[Input[Boolean]] = js.native
  
  /**
    * The name of the device to mount.
    */
  var deviceName: Input[String] = js.native
  
  /**
    * Enables [EBS
    * encryption](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSEncryption.html)
    * on the volume (Default: `false`). Cannot be used with `snapshotId`. Must be configured to perform drift detection.
    */
  var encrypted: js.UndefOr[Input[Boolean]] = js.native
  
  /**
    * The amount of provisioned
    * [IOPS](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ebs-io-characteristics.html).
    * This must be set with a `volumeType` of `"io1/io2"`.
    */
  var iops: js.UndefOr[Input[Double]] = js.native
  
  /**
    * Amazon Resource Name (ARN) of the KMS Key to use when encrypting the volume. Must be configured to perform drift detection.
    */
  var kmsKeyId: js.UndefOr[Input[String]] = js.native
  
  /**
    * The Snapshot ID to mount.
    */
  var snapshotId: js.UndefOr[Input[String]] = js.native
  
  var volumeId: js.UndefOr[Input[String]] = js.native
  
  /**
    * The size of the volume in gibibytes (GiB).
    */
  var volumeSize: js.UndefOr[Input[Double]] = js.native
  
  /**
    * The type of volume. Can be `"standard"`, `"gp2"`, `"io1"`
    * or `"io2"`. (Default: `"gp2"`).
    */
  var volumeType: js.UndefOr[Input[String]] = js.native
}
object SpotInstanceRequestEbsBlockDevice {
  
  @scala.inline
  def apply(deviceName: Input[String]): SpotInstanceRequestEbsBlockDevice = {
    val __obj = js.Dynamic.literal(deviceName = deviceName.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpotInstanceRequestEbsBlockDevice]
  }
  
  @scala.inline
  implicit class SpotInstanceRequestEbsBlockDeviceOps[Self <: SpotInstanceRequestEbsBlockDevice] (val x: Self) extends AnyVal {
    
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
    def setEncrypted(value: Input[Boolean]): Self = this.set("encrypted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEncrypted: Self = this.set("encrypted", js.undefined)
    
    @scala.inline
    def setIops(value: Input[Double]): Self = this.set("iops", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIops: Self = this.set("iops", js.undefined)
    
    @scala.inline
    def setKmsKeyId(value: Input[String]): Self = this.set("kmsKeyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKmsKeyId: Self = this.set("kmsKeyId", js.undefined)
    
    @scala.inline
    def setSnapshotId(value: Input[String]): Self = this.set("snapshotId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSnapshotId: Self = this.set("snapshotId", js.undefined)
    
    @scala.inline
    def setVolumeId(value: Input[String]): Self = this.set("volumeId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVolumeId: Self = this.set("volumeId", js.undefined)
    
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
