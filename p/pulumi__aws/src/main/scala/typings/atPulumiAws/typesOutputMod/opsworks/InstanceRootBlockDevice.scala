package typings.atPulumiAws.typesOutputMod.opsworks

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InstanceRootBlockDevice extends js.Object {
  var deleteOnTermination: js.UndefOr[Boolean] = js.undefined
  var iops: Double
  var volumeSize: Double
  var volumeType: String
}

object InstanceRootBlockDevice {
  @scala.inline
  def apply(
    iops: Double,
    volumeSize: Double,
    volumeType: String,
    deleteOnTermination: js.UndefOr[Boolean] = js.undefined
  ): InstanceRootBlockDevice = {
    val __obj = js.Dynamic.literal(iops = iops, volumeSize = volumeSize, volumeType = volumeType)
    if (!js.isUndefined(deleteOnTermination)) __obj.updateDynamic("deleteOnTermination")(deleteOnTermination)
    __obj.asInstanceOf[InstanceRootBlockDevice]
  }
}

