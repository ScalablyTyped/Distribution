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
}

