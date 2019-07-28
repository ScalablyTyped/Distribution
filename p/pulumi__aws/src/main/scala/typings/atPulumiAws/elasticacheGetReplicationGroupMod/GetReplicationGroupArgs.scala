package typings.atPulumiAws.elasticacheGetReplicationGroupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetReplicationGroupArgs extends js.Object {
  /**
    * The identifier for the replication group.
    */
  val replicationGroupId: String
}

object GetReplicationGroupArgs {
  @scala.inline
  def apply(replicationGroupId: String): GetReplicationGroupArgs = {
    val __obj = js.Dynamic.literal(replicationGroupId = replicationGroupId)
  
    __obj.asInstanceOf[GetReplicationGroupArgs]
  }
}

