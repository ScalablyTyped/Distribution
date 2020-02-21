package typings.redisInfo.mod

import typings.redisInfo.redisInfoStrings.slave
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseReplicationReplicaInfo extends js.Object {
  var connected_slaves: String
  var master_host: String
  var master_last_io_seconds_ago: String
  var master_port: String
  var min_slaves_good_slaves: String
  var role: slave
  var slave_priority: String
  var slave_read_only: Flag
  var slave_repl_offset: String
}

object BaseReplicationReplicaInfo {
  @scala.inline
  def apply(
    connected_slaves: String,
    master_host: String,
    master_last_io_seconds_ago: String,
    master_port: String,
    min_slaves_good_slaves: String,
    role: slave,
    slave_priority: String,
    slave_read_only: Flag,
    slave_repl_offset: String
  ): BaseReplicationReplicaInfo = {
    val __obj = js.Dynamic.literal(connected_slaves = connected_slaves.asInstanceOf[js.Any], master_host = master_host.asInstanceOf[js.Any], master_last_io_seconds_ago = master_last_io_seconds_ago.asInstanceOf[js.Any], master_port = master_port.asInstanceOf[js.Any], min_slaves_good_slaves = min_slaves_good_slaves.asInstanceOf[js.Any], role = role.asInstanceOf[js.Any], slave_priority = slave_priority.asInstanceOf[js.Any], slave_read_only = slave_read_only.asInstanceOf[js.Any], slave_repl_offset = slave_repl_offset.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[BaseReplicationReplicaInfo]
  }
}

