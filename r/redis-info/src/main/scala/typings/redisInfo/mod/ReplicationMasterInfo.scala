package typings.redisInfo.mod

import typings.redisInfo.redisInfoStrings.master
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReplicationMasterInfo extends js.Object {
  
  var role: master = js.native
}
object ReplicationMasterInfo {
  
  @scala.inline
  def apply(role: master): ReplicationMasterInfo = {
    val __obj = js.Dynamic.literal(role = role.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReplicationMasterInfo]
  }
  
  @scala.inline
  implicit class ReplicationMasterInfoOps[Self <: ReplicationMasterInfo] (val x: Self) extends AnyVal {
    
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
    def setRole(value: master): Self = this.set("role", value.asInstanceOf[js.Any])
  }
}
