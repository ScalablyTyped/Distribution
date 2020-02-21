package typings.redisInfo.mod

import typings.redisInfo.redisInfoStrings.`32`
import typings.redisInfo.redisInfoStrings.`64`
import typings.redisInfo.redisInfoStrings.cluster
import typings.redisInfo.redisInfoStrings.sentinel
import typings.redisInfo.redisInfoStrings.standalone
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ServerInfo extends js.Object {
  var arch_bits: `32` | `64`
  var atomicvar_api: String
  var config_file: String
  var executable: String
  var gcc_version: String
  var hz: String
  var lru_clock: String
  var multiplexing_api: String
  var os: String
  var process_id: String
  var redis_build_id: String
  var redis_git_dirty: Flag
  var redis_git_sha1: String
  var redis_mode: standalone | sentinel | cluster
  var redis_version: String
  var run_id: String
  var tcp_port: String
  var uptime_in_days: String
  var uptime_in_seconds: String
}

object ServerInfo {
  @scala.inline
  def apply(
    arch_bits: `32` | `64`,
    atomicvar_api: String,
    config_file: String,
    executable: String,
    gcc_version: String,
    hz: String,
    lru_clock: String,
    multiplexing_api: String,
    os: String,
    process_id: String,
    redis_build_id: String,
    redis_git_dirty: Flag,
    redis_git_sha1: String,
    redis_mode: standalone | sentinel | cluster,
    redis_version: String,
    run_id: String,
    tcp_port: String,
    uptime_in_days: String,
    uptime_in_seconds: String
  ): ServerInfo = {
    val __obj = js.Dynamic.literal(arch_bits = arch_bits.asInstanceOf[js.Any], atomicvar_api = atomicvar_api.asInstanceOf[js.Any], config_file = config_file.asInstanceOf[js.Any], executable = executable.asInstanceOf[js.Any], gcc_version = gcc_version.asInstanceOf[js.Any], hz = hz.asInstanceOf[js.Any], lru_clock = lru_clock.asInstanceOf[js.Any], multiplexing_api = multiplexing_api.asInstanceOf[js.Any], os = os.asInstanceOf[js.Any], process_id = process_id.asInstanceOf[js.Any], redis_build_id = redis_build_id.asInstanceOf[js.Any], redis_git_dirty = redis_git_dirty.asInstanceOf[js.Any], redis_git_sha1 = redis_git_sha1.asInstanceOf[js.Any], redis_mode = redis_mode.asInstanceOf[js.Any], redis_version = redis_version.asInstanceOf[js.Any], run_id = run_id.asInstanceOf[js.Any], tcp_port = tcp_port.asInstanceOf[js.Any], uptime_in_days = uptime_in_days.asInstanceOf[js.Any], uptime_in_seconds = uptime_in_seconds.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ServerInfo]
  }
}

