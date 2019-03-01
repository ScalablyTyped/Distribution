package typings
package atPulumiAwsLib.elasticacheGetReplicationGroupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetReplicationGroupArgs extends js.Object {
  /**
    * The identifier for the replication group.
    */
  val replicationGroupId: java.lang.String
}

object GetReplicationGroupArgs {
  @scala.inline
  def apply(replicationGroupId: java.lang.String): GetReplicationGroupArgs = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("replicationGroupId")(replicationGroupId)
    __obj.asInstanceOf[GetReplicationGroupArgs]
  }
}

