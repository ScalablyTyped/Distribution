package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DeleteOnTerminationIops extends js.Object {
  var deleteOnTermination: scala.Boolean
  var iops: scala.Double
  var volumeId: java.lang.String
  var volumeSize: scala.Double
  var volumeType: java.lang.String
}

object Anon_DeleteOnTerminationIops {
  @scala.inline
  def apply(
    deleteOnTermination: scala.Boolean,
    iops: scala.Double,
    volumeId: java.lang.String,
    volumeSize: scala.Double,
    volumeType: java.lang.String
  ): Anon_DeleteOnTerminationIops = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("deleteOnTermination")(deleteOnTermination)
    __obj.updateDynamic("iops")(iops)
    __obj.updateDynamic("volumeId")(volumeId)
    __obj.updateDynamic("volumeSize")(volumeSize)
    __obj.updateDynamic("volumeType")(volumeType)
    __obj.asInstanceOf[Anon_DeleteOnTerminationIops]
  }
}

