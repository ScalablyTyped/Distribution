package typings.atPulumiAws

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DeleteOnTerminationIopsVolumeSizeVolumeType extends js.Object {
  var deleteOnTermination: js.UndefOr[Boolean] = js.undefined
  var iops: Double
  var volumeSize: Double
  var volumeType: String
}

object Anon_DeleteOnTerminationIopsVolumeSizeVolumeType {
  @scala.inline
  def apply(
    iops: Double,
    volumeSize: Double,
    volumeType: String,
    deleteOnTermination: js.UndefOr[Boolean] = js.undefined
  ): Anon_DeleteOnTerminationIopsVolumeSizeVolumeType = {
    val __obj = js.Dynamic.literal(iops = iops, volumeSize = volumeSize, volumeType = volumeType)
    if (!js.isUndefined(deleteOnTermination)) __obj.updateDynamic("deleteOnTermination")(deleteOnTermination)
    __obj.asInstanceOf[Anon_DeleteOnTerminationIopsVolumeSizeVolumeType]
  }
}

