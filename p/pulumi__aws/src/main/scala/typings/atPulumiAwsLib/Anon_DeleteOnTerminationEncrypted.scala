package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DeleteOnTerminationEncrypted extends js.Object {
  var deleteOnTermination: java.lang.String
  var encrypted: java.lang.String
  var iops: scala.Double
  var kmsKeyId: java.lang.String
  var snapshotId: java.lang.String
  var volumeSize: scala.Double
  var volumeType: java.lang.String
}

object Anon_DeleteOnTerminationEncrypted {
  @scala.inline
  def apply(
    deleteOnTermination: java.lang.String,
    encrypted: java.lang.String,
    iops: scala.Double,
    kmsKeyId: java.lang.String,
    snapshotId: java.lang.String,
    volumeSize: scala.Double,
    volumeType: java.lang.String
  ): Anon_DeleteOnTerminationEncrypted = {
    val __obj = js.Dynamic.literal(deleteOnTermination = deleteOnTermination, encrypted = encrypted, iops = iops, kmsKeyId = kmsKeyId, snapshotId = snapshotId, volumeSize = volumeSize, volumeType = volumeType)
  
    __obj.asInstanceOf[Anon_DeleteOnTerminationEncrypted]
  }
}

