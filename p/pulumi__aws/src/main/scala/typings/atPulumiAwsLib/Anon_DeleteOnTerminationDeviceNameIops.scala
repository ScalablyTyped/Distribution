package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DeleteOnTerminationDeviceNameIops extends js.Object {
  var deleteOnTermination: js.UndefOr[scala.Boolean] = js.undefined
  var deviceName: java.lang.String
  var iops: scala.Double
  var snapshotId: java.lang.String
  var volumeSize: scala.Double
  var volumeType: java.lang.String
}

object Anon_DeleteOnTerminationDeviceNameIops {
  @scala.inline
  def apply(
    deviceName: java.lang.String,
    iops: scala.Double,
    snapshotId: java.lang.String,
    volumeSize: scala.Double,
    volumeType: java.lang.String,
    deleteOnTermination: js.UndefOr[scala.Boolean] = js.undefined
  ): Anon_DeleteOnTerminationDeviceNameIops = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("deviceName")(deviceName)
    __obj.updateDynamic("iops")(iops)
    __obj.updateDynamic("snapshotId")(snapshotId)
    __obj.updateDynamic("volumeSize")(volumeSize)
    __obj.updateDynamic("volumeType")(volumeType)
    if (!js.isUndefined(deleteOnTermination)) __obj.updateDynamic("deleteOnTermination")(deleteOnTermination)
    __obj.asInstanceOf[Anon_DeleteOnTerminationDeviceNameIops]
  }
}

