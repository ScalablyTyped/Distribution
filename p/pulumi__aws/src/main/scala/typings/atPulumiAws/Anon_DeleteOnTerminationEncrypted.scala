package typings.atPulumiAws

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DeleteOnTerminationEncrypted extends js.Object {
  var deleteOnTermination: Boolean
  var encrypted: Boolean
  var iops: Double
  var kmsKeyId: String
  var volumeId: String
  var volumeSize: Double
  var volumeType: String
}

object Anon_DeleteOnTerminationEncrypted {
  @scala.inline
  def apply(
    deleteOnTermination: Boolean,
    encrypted: Boolean,
    iops: Double,
    kmsKeyId: String,
    volumeId: String,
    volumeSize: Double,
    volumeType: String
  ): Anon_DeleteOnTerminationEncrypted = {
    val __obj = js.Dynamic.literal(deleteOnTermination = deleteOnTermination, encrypted = encrypted, iops = iops, kmsKeyId = kmsKeyId, volumeId = volumeId, volumeSize = volumeSize, volumeType = volumeType)
  
    __obj.asInstanceOf[Anon_DeleteOnTerminationEncrypted]
  }
}

