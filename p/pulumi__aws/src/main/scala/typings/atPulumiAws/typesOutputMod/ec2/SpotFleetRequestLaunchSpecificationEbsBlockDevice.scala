package typings.atPulumiAws.typesOutputMod.ec2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SpotFleetRequestLaunchSpecificationEbsBlockDevice extends js.Object {
  var deleteOnTermination: js.UndefOr[Boolean] = js.undefined
  var deviceName: String
  var encrypted: Boolean
  var iops: Double
  var kmsKeyId: String
  var snapshotId: String
  var volumeSize: Double
  var volumeType: String
}

object SpotFleetRequestLaunchSpecificationEbsBlockDevice {
  @scala.inline
  def apply(
    deviceName: String,
    encrypted: Boolean,
    iops: Double,
    kmsKeyId: String,
    snapshotId: String,
    volumeSize: Double,
    volumeType: String,
    deleteOnTermination: js.UndefOr[Boolean] = js.undefined
  ): SpotFleetRequestLaunchSpecificationEbsBlockDevice = {
    val __obj = js.Dynamic.literal(deviceName = deviceName, encrypted = encrypted, iops = iops, kmsKeyId = kmsKeyId, snapshotId = snapshotId, volumeSize = volumeSize, volumeType = volumeType)
    if (!js.isUndefined(deleteOnTermination)) __obj.updateDynamic("deleteOnTermination")(deleteOnTermination)
    __obj.asInstanceOf[SpotFleetRequestLaunchSpecificationEbsBlockDevice]
  }
}

