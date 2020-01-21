package typings.pulumiAws.outputMod.ec2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AmiEbsBlockDevice extends js.Object {
  var deleteOnTermination: js.UndefOr[Boolean] = js.native
  var deviceName: String = js.native
  var encrypted: js.UndefOr[Boolean] = js.native
  var iops: js.UndefOr[Double] = js.native
  var snapshotId: js.UndefOr[String] = js.native
  var volumeSize: Double = js.native
  var volumeType: js.UndefOr[String] = js.native
}

object AmiEbsBlockDevice {
  @scala.inline
  def apply(
    deviceName: String,
    volumeSize: Double,
    deleteOnTermination: js.UndefOr[Boolean] = js.undefined,
    encrypted: js.UndefOr[Boolean] = js.undefined,
    iops: Int | Double = null,
    snapshotId: String = null,
    volumeType: String = null
  ): AmiEbsBlockDevice = {
    val __obj = js.Dynamic.literal(deviceName = deviceName.asInstanceOf[js.Any], volumeSize = volumeSize.asInstanceOf[js.Any])
    if (!js.isUndefined(deleteOnTermination)) __obj.updateDynamic("deleteOnTermination")(deleteOnTermination.asInstanceOf[js.Any])
    if (!js.isUndefined(encrypted)) __obj.updateDynamic("encrypted")(encrypted.asInstanceOf[js.Any])
    if (iops != null) __obj.updateDynamic("iops")(iops.asInstanceOf[js.Any])
    if (snapshotId != null) __obj.updateDynamic("snapshotId")(snapshotId.asInstanceOf[js.Any])
    if (volumeType != null) __obj.updateDynamic("volumeType")(volumeType.asInstanceOf[js.Any])
    __obj.asInstanceOf[AmiEbsBlockDevice]
  }
}

