package typings.pulumiAws.getPartitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetPartitionResult extends js.Object {
  val dnsSuffix: String = js.native
  /**
    * id is the provider-assigned unique ID for this managed resource.
    */
  val id: String = js.native
  val partition: String = js.native
}

object GetPartitionResult {
  @scala.inline
  def apply(dnsSuffix: String, id: String, partition: String): GetPartitionResult = {
    val __obj = js.Dynamic.literal(dnsSuffix = dnsSuffix.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], partition = partition.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetPartitionResult]
  }
}

