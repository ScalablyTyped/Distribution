package typings
package atPulumiAwsLib.getPartitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetPartitionResult extends js.Object {
  /**
    * id is the provider-assigned unique ID for this managed resource.
    */
  val id: java.lang.String
  val partition: java.lang.String
}

object GetPartitionResult {
  @scala.inline
  def apply(id: java.lang.String, partition: java.lang.String): GetPartitionResult = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("partition")(partition)
    __obj.asInstanceOf[GetPartitionResult]
  }
}

