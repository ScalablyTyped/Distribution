package typings.redisInfo.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseReplicationInfo extends js.Object {
  var connected_slaves: String
  var master_repl_offset: String
  var master_replid: String
  var master_replid2: String
  var repl_backlog_active: Flag
  var repl_backlog_first_byte_offset: String
  var repl_backlog_histlen: String
  var repl_backlog_size: String
  var second_repl_offset: String
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
}

