package typings.atPulumiAws

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DeleteOnTerminationIopsVolumeSize extends js.Object {
  var deleteOnTermination: Boolean
  var iops: Double
  var volumeSize: Double
  var volumeType: String
}

object Anon_DeleteOnTerminationIopsVolumeSize {
  @scala.inline
  def apply(deleteOnTermination: Boolean, iops: Double, volumeSize: Double, volumeType: String): Anon_DeleteOnTerminationIopsVolumeSize = {
    val __obj = js.Dynamic.literal(deleteOnTermination = deleteOnTermination, iops = iops, volumeSize = volumeSize, volumeType = volumeType)
  
    __obj.asInstanceOf[Anon_DeleteOnTerminationIopsVolumeSize]
  }
}

