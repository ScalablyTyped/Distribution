package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DeleteOnTerminationEncryptedIops extends js.Object {
  var deleteOnTermination: js.UndefOr[java.lang.String] = js.undefined
  var encrypted: js.UndefOr[java.lang.String] = js.undefined
  var iops: scala.Double
  var kmsKeyId: js.UndefOr[java.lang.String] = js.undefined
  var snapshotId: js.UndefOr[java.lang.String] = js.undefined
  var volumeSize: scala.Double
  var volumeType: java.lang.String
}

object Anon_DeleteOnTerminationEncryptedIops {
  @scala.inline
  def apply(
    iops: scala.Double,
    volumeSize: scala.Double,
    volumeType: java.lang.String,
    deleteOnTermination: java.lang.String = null,
    encrypted: java.lang.String = null,
    kmsKeyId: java.lang.String = null,
    snapshotId: java.lang.String = null
  ): Anon_DeleteOnTerminationEncryptedIops = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("iops")(iops)
    __obj.updateDynamic("volumeSize")(volumeSize)
    __obj.updateDynamic("volumeType")(volumeType)
    if (deleteOnTermination != null) __obj.updateDynamic("deleteOnTermination")(deleteOnTermination)
    if (encrypted != null) __obj.updateDynamic("encrypted")(encrypted)
    if (kmsKeyId != null) __obj.updateDynamic("kmsKeyId")(kmsKeyId)
    if (snapshotId != null) __obj.updateDynamic("snapshotId")(snapshotId)
    __obj.asInstanceOf[Anon_DeleteOnTerminationEncryptedIops]
  }
}

