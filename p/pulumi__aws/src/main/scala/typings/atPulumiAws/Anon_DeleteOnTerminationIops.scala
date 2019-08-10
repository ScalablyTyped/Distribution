package typings.atPulumiAws

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DeleteOnTerminationIops extends js.Object {
  var deleteOnTermination: js.UndefOr[Boolean] = js.undefined
  var iops: Double
  var volumeSize: Double
  var volumeType: String
}

object Anon_DeleteOnTerminationIops {
  @scala.inline
  def apply(
    iops: Double,
    volumeSize: Double,
    volumeType: String,
    deleteOnTermination: js.UndefOr[Boolean] = js.undefined
  ): Anon_DeleteOnTerminationIops = {
    val __obj = js.Dynamic.literal(iops = iops, volumeSize = volumeSize, volumeType = volumeType)
    if (!js.isUndefined(deleteOnTermination)) __obj.updateDynamic("deleteOnTermination")(deleteOnTermination)
    __obj.asInstanceOf[Anon_DeleteOnTerminationIops]
  }
}

