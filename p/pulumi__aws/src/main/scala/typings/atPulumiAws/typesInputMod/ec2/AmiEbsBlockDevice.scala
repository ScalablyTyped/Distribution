package typings.atPulumiAws.typesInputMod.ec2

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AmiEbsBlockDevice extends js.Object {
  var deleteOnTermination: js.UndefOr[Input[Boolean]] = js.undefined
  var deviceName: Input[String]
  var encrypted: js.UndefOr[Input[Boolean]] = js.undefined
  var iops: js.UndefOr[Input[Double]] = js.undefined
  var snapshotId: js.UndefOr[Input[String]] = js.undefined
  var volumeSize: js.UndefOr[Input[Double]] = js.undefined
  var volumeType: js.UndefOr[Input[String]] = js.undefined
}

object AmiEbsBlockDevice {
  @scala.inline
  def apply(
    deviceName: Input[String],
    deleteOnTermination: Input[Boolean] = null,
    encrypted: Input[Boolean] = null,
    iops: Input[Double] = null,
    snapshotId: Input[String] = null,
    volumeSize: Input[Double] = null,
    volumeType: Input[String] = null
  ): AmiEbsBlockDevice = {
    val __obj = js.Dynamic.literal(deviceName = deviceName.asInstanceOf[js.Any])
    if (deleteOnTermination != null) __obj.updateDynamic("deleteOnTermination")(deleteOnTermination.asInstanceOf[js.Any])
    if (encrypted != null) __obj.updateDynamic("encrypted")(encrypted.asInstanceOf[js.Any])
    if (iops != null) __obj.updateDynamic("iops")(iops.asInstanceOf[js.Any])
    if (snapshotId != null) __obj.updateDynamic("snapshotId")(snapshotId.asInstanceOf[js.Any])
    if (volumeSize != null) __obj.updateDynamic("volumeSize")(volumeSize.asInstanceOf[js.Any])
    if (volumeType != null) __obj.updateDynamic("volumeType")(volumeType.asInstanceOf[js.Any])
    __obj.asInstanceOf[AmiEbsBlockDevice]
  }
}

