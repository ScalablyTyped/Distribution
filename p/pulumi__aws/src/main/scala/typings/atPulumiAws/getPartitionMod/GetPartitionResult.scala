package typings.atPulumiAws.getPartitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetPartitionResult extends js.Object {
  /**
    * id is the provider-assigned unique ID for this managed resource.
    */
  val id: String
  val partition: String
}

object GetPartitionResult {
  @scala.inline
  def apply(id: String, partition: String): GetPartitionResult = {
    val __obj = js.Dynamic.literal(id = id, partition = partition)
  
    __obj.asInstanceOf[GetPartitionResult]
  }
}

