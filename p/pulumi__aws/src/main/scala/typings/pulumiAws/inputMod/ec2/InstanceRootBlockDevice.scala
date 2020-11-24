package typings.pulumiAws.inputMod.ec2

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InstanceRootBlockDevice extends js.Object {
  
  /**
    * Whether the volume should be destroyed
    * on instance termination (Default: `true`).
    */
  var deleteOnTermination: js.UndefOr[Input[Boolean]] = js.native
  
  /**
    * The name of the device to mount.
    */
  var deviceName: js.UndefOr[Input[String]] = js.native
  
  /**
    * Enable volume encryption. (Default: `false`). Must be configured to perform drift detection.
    */
  var encrypted: js.UndefOr[Input[Boolean]] = js.native
  
  /**
    * The amount of provisioned
    * [IOPS](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ebs-io-characteristics.html).
    * This is only valid for `volumeType` of `"io1/io2"`, and must be specified if
    * using that type
    */
  var iops: js.UndefOr[Input[Double]] = js.native
  
  /**
    * Amazon Resource Name (ARN) of the KMS Key to use when encrypting the volume. Must be configured to perform drift detection.
    */
  var kmsKeyId: js.UndefOr[Input[String]] = js.native
  
  var volumeId: js.UndefOr[Input[String]] = js.native
  
  /**
    * The size of the volume in gibibytes (GiB).
    */
  var volumeSize: js.UndefOr[Input[Double]] = js.native
  
  /**
    * The type of volume. Can be `"standard"`, `"gp2"`, `"io1"`, `"io2"`, `"sc1"`, or `"st1"`. (Default: `"gp2"`).
    */
  var volumeType: js.UndefOr[Input[String]] = js.native
}
object InstanceRootBlockDevice {
  
  @scala.inline
  def apply(): InstanceRootBlockDevice = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InstanceRootBlockDevice]
  }
  
  @scala.inline
  implicit class InstanceRootBlockDeviceOps[Self <: InstanceRootBlockDevice] (val x: Self) extends AnyVal {
    
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
    def setKmsKeyId(value: Input[String]): Self = this.set("kmsKeyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKmsKeyId: Self = this.set("kmsKeyId", js.undefined)
    
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
