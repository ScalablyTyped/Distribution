package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DeleteOnTermination extends js.Object {
  var deleteOnTermination: js.UndefOr[scala.Boolean] = js.undefined
  var deviceName: java.lang.String
  var encrypted: js.UndefOr[scala.Boolean] = js.undefined
  var iops: js.UndefOr[scala.Double] = js.undefined
  var snapshotId: js.UndefOr[java.lang.String] = js.undefined
  var volumeSize: scala.Double
  var volumeType: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_DeleteOnTermination {
  @scala.inline
  def apply(
    deviceName: java.lang.String,
    volumeSize: scala.Double,
    deleteOnTermination: js.UndefOr[scala.Boolean] = js.undefined,
    encrypted: js.UndefOr[scala.Boolean] = js.undefined,
    iops: scala.Int | scala.Double = null,
    snapshotId: java.lang.String = null,
    volumeType: java.lang.String = null
  ): Anon_DeleteOnTermination = {
    val __obj = js.Dynamic.literal(deviceName = deviceName, volumeSize = volumeSize)
    if (!js.isUndefined(deleteOnTermination)) __obj.updateDynamic("deleteOnTermination")(deleteOnTermination)
    if (!js.isUndefined(encrypted)) __obj.updateDynamic("encrypted")(encrypted)
    if (iops != null) __obj.updateDynamic("iops")(iops.asInstanceOf[js.Any])
    if (snapshotId != null) __obj.updateDynamic("snapshotId")(snapshotId)
    if (volumeType != null) __obj.updateDynamic("volumeType")(volumeType)
    __obj.asInstanceOf[Anon_DeleteOnTermination]
  }
}

