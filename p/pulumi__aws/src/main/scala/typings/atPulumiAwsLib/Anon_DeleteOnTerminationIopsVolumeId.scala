package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DeleteOnTerminationIopsVolumeId extends js.Object {
  var deleteOnTermination: js.UndefOr[scala.Boolean] = js.undefined
  var iops: scala.Double
  var volumeId: java.lang.String
  var volumeSize: scala.Double
  var volumeType: java.lang.String
}

object Anon_DeleteOnTerminationIopsVolumeId {
  @scala.inline
  def apply(
    iops: scala.Double,
    volumeId: java.lang.String,
    volumeSize: scala.Double,
    volumeType: java.lang.String,
    deleteOnTermination: js.UndefOr[scala.Boolean] = js.undefined
  ): Anon_DeleteOnTerminationIopsVolumeId = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("iops")(iops)
    __obj.updateDynamic("volumeId")(volumeId)
    __obj.updateDynamic("volumeSize")(volumeSize)
    __obj.updateDynamic("volumeType")(volumeType)
    if (!js.isUndefined(deleteOnTermination)) __obj.updateDynamic("deleteOnTermination")(deleteOnTermination)
    __obj.asInstanceOf[Anon_DeleteOnTerminationIopsVolumeId]
  }
}

