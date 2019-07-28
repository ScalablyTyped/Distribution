package typings.atPulumiAws

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DeleteOnTerminationIops extends js.Object {
  var deleteOnTermination: Boolean
  var iops: Double
  var volumeId: String
  var volumeSize: Double
  var volumeType: String
}

object Anon_DeleteOnTerminationIops {
  @scala.inline
  def apply(
    deleteOnTermination: Boolean,
    iops: Double,
    volumeId: String,
    volumeSize: Double,
    volumeType: String
  ): Anon_DeleteOnTerminationIops = {
    val __obj = js.Dynamic.literal(deleteOnTermination = deleteOnTermination, iops = iops, volumeId = volumeId, volumeSize = volumeSize, volumeType = volumeType)
  
    __obj.asInstanceOf[Anon_DeleteOnTerminationIops]
  }
}

