package typings.atPulumiAws.typesOutputMod.ec2Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AmiEbsBlockDevice extends js.Object {
  var deleteOnTermination: js.UndefOr[Boolean] = js.undefined
  var deviceName: String
  var encrypted: js.UndefOr[Boolean] = js.undefined
  var iops: js.UndefOr[Double] = js.undefined
  var snapshotId: js.UndefOr[String] = js.undefined
  var volumeSize: Double
  var volumeType: js.UndefOr[String] = js.undefined
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
    val __obj = js.Dynamic.literal(deviceName = deviceName, volumeSize = volumeSize)
    if (!js.isUndefined(deleteOnTermination)) __obj.updateDynamic("deleteOnTermination")(deleteOnTermination)
    if (!js.isUndefined(encrypted)) __obj.updateDynamic("encrypted")(encrypted)
    if (iops != null) __obj.updateDynamic("iops")(iops.asInstanceOf[js.Any])
    if (snapshotId != null) __obj.updateDynamic("snapshotId")(snapshotId)
    if (volumeType != null) __obj.updateDynamic("volumeType")(volumeType)
    __obj.asInstanceOf[AmiEbsBlockDevice]
  }
}

