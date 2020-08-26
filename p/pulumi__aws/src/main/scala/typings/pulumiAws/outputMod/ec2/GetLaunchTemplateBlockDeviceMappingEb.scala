package typings.pulumiAws.outputMod.ec2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetLaunchTemplateBlockDeviceMappingEb extends js.Object {
  var deleteOnTermination: String = js.native
  var encrypted: String = js.native
  var iops: Double = js.native
  var kmsKeyId: String = js.native
  var snapshotId: String = js.native
  var volumeSize: Double = js.native
  var volumeType: String = js.native
}

object GetLaunchTemplateBlockDeviceMappingEb {
  @scala.inline
  def apply(
    deleteOnTermination: String,
    encrypted: String,
    iops: Double,
    kmsKeyId: String,
    snapshotId: String,
    volumeSize: Double,
    volumeType: String
  ): GetLaunchTemplateBlockDeviceMappingEb = {
    val __obj = js.Dynamic.literal(deleteOnTermination = deleteOnTermination.asInstanceOf[js.Any], encrypted = encrypted.asInstanceOf[js.Any], iops = iops.asInstanceOf[js.Any], kmsKeyId = kmsKeyId.asInstanceOf[js.Any], snapshotId = snapshotId.asInstanceOf[js.Any], volumeSize = volumeSize.asInstanceOf[js.Any], volumeType = volumeType.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetLaunchTemplateBlockDeviceMappingEb]
  }
  @scala.inline
  implicit class GetLaunchTemplateBlockDeviceMappingEbOps[Self <: GetLaunchTemplateBlockDeviceMappingEb] (val x: Self) extends AnyVal {
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
    def setDeleteOnTermination(value: String): Self = this.set("deleteOnTermination", value.asInstanceOf[js.Any])
    @scala.inline
    def setEncrypted(value: String): Self = this.set("encrypted", value.asInstanceOf[js.Any])
    @scala.inline
    def setIops(value: Double): Self = this.set("iops", value.asInstanceOf[js.Any])
    @scala.inline
    def setKmsKeyId(value: String): Self = this.set("kmsKeyId", value.asInstanceOf[js.Any])
    @scala.inline
    def setSnapshotId(value: String): Self = this.set("snapshotId", value.asInstanceOf[js.Any])
    @scala.inline
    def setVolumeSize(value: Double): Self = this.set("volumeSize", value.asInstanceOf[js.Any])
    @scala.inline
    def setVolumeType(value: String): Self = this.set("volumeType", value.asInstanceOf[js.Any])
  }
  
}

