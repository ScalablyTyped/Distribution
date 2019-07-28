package typings.atPulumiAws

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DeleteOnTerminationDeviceNameIops extends js.Object {
  var deleteOnTermination: js.UndefOr[Boolean] = js.undefined
  var deviceName: String
  var iops: Double
  var snapshotId: String
  var volumeSize: Double
  var volumeType: String
}

object Anon_DeleteOnTerminationDeviceNameIops {
  @scala.inline
  def apply(
    deviceName: String,
    iops: Double,
    snapshotId: String,
    volumeSize: Double,
    volumeType: String,
    deleteOnTermination: js.UndefOr[Boolean] = js.undefined
  ): Anon_DeleteOnTerminationDeviceNameIops = {
    val __obj = js.Dynamic.literal(deviceName = deviceName, iops = iops, snapshotId = snapshotId, volumeSize = volumeSize, volumeType = volumeType)
    if (!js.isUndefined(deleteOnTermination)) __obj.updateDynamic("deleteOnTermination")(deleteOnTermination)
    __obj.asInstanceOf[Anon_DeleteOnTerminationDeviceNameIops]
  }
}

