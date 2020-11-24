package typings.redisInfo.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BaseReplicationInfo extends js.Object {
  
  var connected_slaves: String = js.native
  
  var master_repl_offset: String = js.native
  
  var master_replid: String = js.native
  
  var master_replid2: String = js.native
  
  var repl_backlog_active: Flag = js.native
  
  var repl_backlog_first_byte_offset: String = js.native
  
  var repl_backlog_histlen: String = js.native
  
  var repl_backlog_size: String = js.native
  
  var second_repl_offset: String = js.native
}
object BaseReplicationInfo {
  
  @scala.inline
  def apply(
    connected_slaves: String,
    master_repl_offset: String,
    master_replid: String,
    master_replid2: String,
    repl_backlog_active: Flag,
    repl_backlog_first_byte_offset: String,
    repl_backlog_histlen: String,
    repl_backlog_size: String,
    second_repl_offset: String
  ): BaseReplicationInfo = {
    val __obj = js.Dynamic.literal(connected_slaves = connected_slaves.asInstanceOf[js.Any], master_repl_offset = master_repl_offset.asInstanceOf[js.Any], master_replid = master_replid.asInstanceOf[js.Any], master_replid2 = master_replid2.asInstanceOf[js.Any], repl_backlog_active = repl_backlog_active.asInstanceOf[js.Any], repl_backlog_first_byte_offset = repl_backlog_first_byte_offset.asInstanceOf[js.Any], repl_backlog_histlen = repl_backlog_histlen.asInstanceOf[js.Any], repl_backlog_size = repl_backlog_size.asInstanceOf[js.Any], second_repl_offset = second_repl_offset.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseReplicationInfo]
  }
  
  @scala.inline
  implicit class BaseReplicationInfoOps[Self <: BaseReplicationInfo] (val x: Self) extends AnyVal {
    
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
    def setConnected_slaves(value: String): Self = this.set("connected_slaves", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaster_repl_offset(value: String): Self = this.set("master_repl_offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaster_replid(value: String): Self = this.set("master_replid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaster_replid2(value: String): Self = this.set("master_replid2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepl_backlog_active(value: Flag): Self = this.set("repl_backlog_active", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepl_backlog_first_byte_offset(value: String): Self = this.set("repl_backlog_first_byte_offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepl_backlog_histlen(value: String): Self = this.set("repl_backlog_histlen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepl_backlog_size(value: String): Self = this.set("repl_backlog_size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecond_repl_offset(value: String): Self = this.set("second_repl_offset", value.asInstanceOf[js.Any])
  }
}
