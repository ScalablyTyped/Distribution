package typings.pulumiAws.outputMod.ec2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LaunchTemplateBlockDeviceMappingEbs extends js.Object {
  var deleteOnTermination: js.UndefOr[String] = js.native
  var encrypted: js.UndefOr[String] = js.native
  var iops: Double = js.native
  var kmsKeyId: js.UndefOr[String] = js.native
  var snapshotId: js.UndefOr[String] = js.native
  var volumeSize: Double = js.native
  var volumeType: String = js.native
}

object LaunchTemplateBlockDeviceMappingEbs {
  @scala.inline
  def apply(
    iops: Double,
    volumeSize: Double,
    volumeType: String,
    deleteOnTermination: String = null,
    encrypted: String = null,
    kmsKeyId: String = null,
    snapshotId: String = null
  ): LaunchTemplateBlockDeviceMappingEbs = {
    val __obj = js.Dynamic.literal(iops = iops.asInstanceOf[js.Any], volumeSize = volumeSize.asInstanceOf[js.Any], volumeType = volumeType.asInstanceOf[js.Any])
    if (deleteOnTermination != null) __obj.updateDynamic("deleteOnTermination")(deleteOnTermination.asInstanceOf[js.Any])
    if (encrypted != null) __obj.updateDynamic("encrypted")(encrypted.asInstanceOf[js.Any])
    if (kmsKeyId != null) __obj.updateDynamic("kmsKeyId")(kmsKeyId.asInstanceOf[js.Any])
    if (snapshotId != null) __obj.updateDynamic("snapshotId")(snapshotId.asInstanceOf[js.Any])
    __obj.asInstanceOf[LaunchTemplateBlockDeviceMappingEbs]
  }
}

