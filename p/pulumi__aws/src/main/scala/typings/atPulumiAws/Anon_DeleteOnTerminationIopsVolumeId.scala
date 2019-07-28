package typings.atPulumiAws

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DeleteOnTerminationIopsVolumeId extends js.Object {
  var deleteOnTermination: js.UndefOr[Boolean] = js.undefined
  var iops: Double
  var volumeId: String
  var volumeSize: Double
  var volumeType: String
}

object Anon_DeleteOnTerminationIopsVolumeId {
  @scala.inline
  def apply(
    iops: Double,
    volumeId: String,
    volumeSize: Double,
    volumeType: String,
    deleteOnTermination: js.UndefOr[Boolean] = js.undefined
  ): Anon_DeleteOnTerminationIopsVolumeId = {
    val __obj = js.Dynamic.literal(iops = iops, volumeId = volumeId, volumeSize = volumeSize, volumeType = volumeType)
    if (!js.isUndefined(deleteOnTermination)) __obj.updateDynamic("deleteOnTermination")(deleteOnTermination)
    __obj.asInstanceOf[Anon_DeleteOnTerminationIopsVolumeId]
  }
}

