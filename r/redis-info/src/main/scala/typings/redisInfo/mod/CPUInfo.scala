package typings.redisInfo.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CPUInfo extends js.Object {
  var used_cpu_sys: String
  var used_cpu_sys_children: String
  var used_cpu_user: String
  var used_cpu_user_children: String
}

object CPUInfo {
  @scala.inline
  def apply(
    used_cpu_sys: String,
    used_cpu_sys_children: String,
    used_cpu_user: String,
    used_cpu_user_children: String
  ): CPUInfo = {
    val __obj = js.Dynamic.literal(used_cpu_sys = used_cpu_sys.asInstanceOf[js.Any], used_cpu_sys_children = used_cpu_sys_children.asInstanceOf[js.Any], used_cpu_user = used_cpu_user.asInstanceOf[js.Any], used_cpu_user_children = used_cpu_user_children.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CPUInfo]
  }
}

