package typings.pulumiAws.getReplicationGroupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetReplicationGroupArgs extends js.Object {
  
  /**
    * The identifier for the replication group.
    */
  val replicationGroupId: String = js.native
}
object GetReplicationGroupArgs {
  
  @scala.inline
  def apply(replicationGroupId: String): GetReplicationGroupArgs = {
    val __obj = js.Dynamic.literal(replicationGroupId = replicationGroupId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetReplicationGroupArgs]
  }
  
  @scala.inline
  implicit class GetReplicationGroupArgsOps[Self <: GetReplicationGroupArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setReplicationGroupId(value: String): Self = this.set("replicationGroupId", value.asInstanceOf[js.Any])
  }
}
