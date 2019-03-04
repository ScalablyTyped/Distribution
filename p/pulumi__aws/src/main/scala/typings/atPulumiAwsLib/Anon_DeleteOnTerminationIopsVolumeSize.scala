package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DeleteOnTerminationIopsVolumeSize extends js.Object {
  var deleteOnTermination: scala.Boolean
  var iops: scala.Double
  var volumeSize: scala.Double
  var volumeType: java.lang.String
}

object Anon_DeleteOnTerminationIopsVolumeSize {
  @scala.inline
  def apply(
    deleteOnTermination: scala.Boolean,
    iops: scala.Double,
    volumeSize: scala.Double,
    volumeType: java.lang.String
  ): Anon_DeleteOnTerminationIopsVolumeSize = {
    val __obj = js.Dynamic.literal(deleteOnTermination = deleteOnTermination, iops = iops, volumeSize = volumeSize, volumeType = volumeType)
  
    __obj.asInstanceOf[Anon_DeleteOnTerminationIopsVolumeSize]
  }
}

