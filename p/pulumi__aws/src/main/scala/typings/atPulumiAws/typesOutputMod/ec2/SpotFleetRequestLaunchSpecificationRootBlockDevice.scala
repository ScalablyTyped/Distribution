package typings.atPulumiAws.typesOutputMod.ec2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SpotFleetRequestLaunchSpecificationRootBlockDevice extends js.Object {
  var deleteOnTermination: js.UndefOr[Boolean] = js.undefined
  var encrypted: Boolean
  var iops: Double
  var kmsKeyId: String
  var volumeSize: Double
  var volumeType: String
}

object SpotFleetRequestLaunchSpecificationRootBlockDevice {
  @scala.inline
  def apply(
    encrypted: Boolean,
    iops: Double,
    kmsKeyId: String,
    volumeSize: Double,
    volumeType: String,
    deleteOnTermination: js.UndefOr[Boolean] = js.undefined
  ): SpotFleetRequestLaunchSpecificationRootBlockDevice = {
    val __obj = js.Dynamic.literal(encrypted = encrypted, iops = iops, kmsKeyId = kmsKeyId, volumeSize = volumeSize, volumeType = volumeType)
    if (!js.isUndefined(deleteOnTermination)) __obj.updateDynamic("deleteOnTermination")(deleteOnTermination)
    __obj.asInstanceOf[SpotFleetRequestLaunchSpecificationRootBlockDevice]
  }
}

