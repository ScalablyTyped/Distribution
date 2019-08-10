package typings.atPulumiAws

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DeleteOnTerminationEncryptedIopsVolumeSize extends js.Object {
  var deleteOnTermination: js.UndefOr[Boolean] = js.undefined
  var encrypted: Boolean
  var iops: Double
  var volumeSize: Double
  var volumeType: String
}

object Anon_DeleteOnTerminationEncryptedIopsVolumeSize {
  @scala.inline
  def apply(
    encrypted: Boolean,
    iops: Double,
    volumeSize: Double,
    volumeType: String,
    deleteOnTermination: js.UndefOr[Boolean] = js.undefined
  ): Anon_DeleteOnTerminationEncryptedIopsVolumeSize = {
    val __obj = js.Dynamic.literal(encrypted = encrypted, iops = iops, volumeSize = volumeSize, volumeType = volumeType)
    if (!js.isUndefined(deleteOnTermination)) __obj.updateDynamic("deleteOnTermination")(deleteOnTermination)
    __obj.asInstanceOf[Anon_DeleteOnTerminationEncryptedIopsVolumeSize]
  }
}

