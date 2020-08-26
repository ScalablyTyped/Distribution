package typings.redisInfo.mod

import typings.redisInfo.redisInfoStrings.`32`
import typings.redisInfo.redisInfoStrings.`64`
import typings.redisInfo.redisInfoStrings.cluster
import typings.redisInfo.redisInfoStrings.sentinel
import typings.redisInfo.redisInfoStrings.standalone
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ServerInfo extends js.Object {
  var arch_bits: `32` | `64` = js.native
  var atomicvar_api: String = js.native
  var config_file: String = js.native
  var executable: String = js.native
  var gcc_version: String = js.native
  var hz: String = js.native
  var lru_clock: String = js.native
  var multiplexing_api: String = js.native
  var os: String = js.native
  var process_id: String = js.native
  var redis_build_id: String = js.native
  var redis_git_dirty: Flag = js.native
  var redis_git_sha1: String = js.native
  var redis_mode: standalone | sentinel | cluster = js.native
  var redis_version: String = js.native
  var run_id: String = js.native
  var tcp_port: String = js.native
  var uptime_in_days: String = js.native
  var uptime_in_seconds: String = js.native
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
  @scala.inline
  implicit class ServerInfoOps[Self <: ServerInfo] (val x: Self) extends AnyVal {
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
    def setArch_bits(value: `32` | `64`): Self = this.set("arch_bits", value.asInstanceOf[js.Any])
    @scala.inline
    def setAtomicvar_api(value: String): Self = this.set("atomicvar_api", value.asInstanceOf[js.Any])
    @scala.inline
    def setConfig_file(value: String): Self = this.set("config_file", value.asInstanceOf[js.Any])
    @scala.inline
    def setExecutable(value: String): Self = this.set("executable", value.asInstanceOf[js.Any])
    @scala.inline
    def setGcc_version(value: String): Self = this.set("gcc_version", value.asInstanceOf[js.Any])
    @scala.inline
    def setHz(value: String): Self = this.set("hz", value.asInstanceOf[js.Any])
    @scala.inline
    def setLru_clock(value: String): Self = this.set("lru_clock", value.asInstanceOf[js.Any])
    @scala.inline
    def setMultiplexing_api(value: String): Self = this.set("multiplexing_api", value.asInstanceOf[js.Any])
    @scala.inline
    def setOs(value: String): Self = this.set("os", value.asInstanceOf[js.Any])
    @scala.inline
    def setProcess_id(value: String): Self = this.set("process_id", value.asInstanceOf[js.Any])
    @scala.inline
    def setRedis_build_id(value: String): Self = this.set("redis_build_id", value.asInstanceOf[js.Any])
    @scala.inline
    def setRedis_git_dirty(value: Flag): Self = this.set("redis_git_dirty", value.asInstanceOf[js.Any])
    @scala.inline
    def setRedis_git_sha1(value: String): Self = this.set("redis_git_sha1", value.asInstanceOf[js.Any])
    @scala.inline
    def setRedis_mode(value: standalone | sentinel | cluster): Self = this.set("redis_mode", value.asInstanceOf[js.Any])
    @scala.inline
    def setRedis_version(value: String): Self = this.set("redis_version", value.asInstanceOf[js.Any])
    @scala.inline
    def setRun_id(value: String): Self = this.set("run_id", value.asInstanceOf[js.Any])
    @scala.inline
    def setTcp_port(value: String): Self = this.set("tcp_port", value.asInstanceOf[js.Any])
    @scala.inline
    def setUptime_in_days(value: String): Self = this.set("uptime_in_days", value.asInstanceOf[js.Any])
    @scala.inline
    def setUptime_in_seconds(value: String): Self = this.set("uptime_in_seconds", value.asInstanceOf[js.Any])
  }
  
}

