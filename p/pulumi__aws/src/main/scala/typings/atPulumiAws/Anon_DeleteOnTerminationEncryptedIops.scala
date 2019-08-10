package typings.atPulumiAws

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DeleteOnTerminationEncryptedIops extends js.Object {
  var deleteOnTermination: Boolean
  var encrypted: Boolean
  var iops: Double
  var volumeSize: Double
  var volumeType: String
}

object Anon_DeleteOnTerminationEncryptedIops {
  @scala.inline
  def apply(
    deleteOnTermination: Boolean,
    encrypted: Boolean,
    iops: Double,
    volumeSize: Double,
    volumeType: String
  ): Anon_DeleteOnTerminationEncryptedIops = {
    val __obj = js.Dynamic.literal(deleteOnTermination = deleteOnTermination, encrypted = encrypted, iops = iops, volumeSize = volumeSize, volumeType = volumeType)
  
    __obj.asInstanceOf[Anon_DeleteOnTerminationEncryptedIops]
  }
}

