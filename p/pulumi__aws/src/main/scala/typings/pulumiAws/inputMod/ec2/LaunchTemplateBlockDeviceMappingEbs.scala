package typings.pulumiAws.inputMod.ec2

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LaunchTemplateBlockDeviceMappingEbs extends js.Object {
  var deleteOnTermination: js.UndefOr[Input[String]] = js.native
  var encrypted: js.UndefOr[Input[String]] = js.native
  var iops: js.UndefOr[Input[Double]] = js.native
  var kmsKeyId: js.UndefOr[Input[String]] = js.native
  var snapshotId: js.UndefOr[Input[String]] = js.native
  var volumeSize: js.UndefOr[Input[Double]] = js.native
  var volumeType: js.UndefOr[Input[String]] = js.native
}

object LaunchTemplateBlockDeviceMappingEbs {
  @scala.inline
  def apply(
    deleteOnTermination: Input[String] = null,
    encrypted: Input[String] = null,
    iops: Input[Double] = null,
    kmsKeyId: Input[String] = null,
    snapshotId: Input[String] = null,
    volumeSize: Input[Double] = null,
    volumeType: Input[String] = null
  ): LaunchTemplateBlockDeviceMappingEbs = {
    val __obj = js.Dynamic.literal()
    if (deleteOnTermination != null) __obj.updateDynamic("deleteOnTermination")(deleteOnTermination.asInstanceOf[js.Any])
    if (encrypted != null) __obj.updateDynamic("encrypted")(encrypted.asInstanceOf[js.Any])
    if (iops != null) __obj.updateDynamic("iops")(iops.asInstanceOf[js.Any])
    if (kmsKeyId != null) __obj.updateDynamic("kmsKeyId")(kmsKeyId.asInstanceOf[js.Any])
    if (snapshotId != null) __obj.updateDynamic("snapshotId")(snapshotId.asInstanceOf[js.Any])
    if (volumeSize != null) __obj.updateDynamic("volumeSize")(volumeSize.asInstanceOf[js.Any])
    if (volumeType != null) __obj.updateDynamic("volumeType")(volumeType.asInstanceOf[js.Any])
    __obj.asInstanceOf[LaunchTemplateBlockDeviceMappingEbs]
  }
}

