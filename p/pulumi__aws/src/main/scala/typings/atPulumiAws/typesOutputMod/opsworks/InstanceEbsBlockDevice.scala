package typings.atPulumiAws.typesOutputMod.opsworks

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InstanceEbsBlockDevice extends js.Object {
  var deleteOnTermination: js.UndefOr[Boolean] = js.undefined
  var deviceName: String
  var iops: Double
  var snapshotId: String
  var volumeSize: Double
  var volumeType: String
}

object InstanceEbsBlockDevice {
  @scala.inline
  def apply(
    deviceName: String,
    iops: Double,
    snapshotId: String,
    volumeSize: Double,
    volumeType: String,
    deleteOnTermination: js.UndefOr[Boolean] = js.undefined
  ): InstanceEbsBlockDevice = {
    val __obj = js.Dynamic.literal(deviceName = deviceName, iops = iops, snapshotId = snapshotId, volumeSize = volumeSize, volumeType = volumeType)
    if (!js.isUndefined(deleteOnTermination)) __obj.updateDynamic("deleteOnTermination")(deleteOnTermination)
    __obj.asInstanceOf[InstanceEbsBlockDevice]
  }
}

