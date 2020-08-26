package typings.redisInfo.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CPUInfo extends js.Object {
  var used_cpu_sys: String = js.native
  var used_cpu_sys_children: String = js.native
  var used_cpu_user: String = js.native
  var used_cpu_user_children: String = js.native
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
  @scala.inline
  implicit class CPUInfoOps[Self <: CPUInfo] (val x: Self) extends AnyVal {
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
    def setUsed_cpu_sys(value: String): Self = this.set("used_cpu_sys", value.asInstanceOf[js.Any])
    @scala.inline
    def setUsed_cpu_sys_children(value: String): Self = this.set("used_cpu_sys_children", value.asInstanceOf[js.Any])
    @scala.inline
    def setUsed_cpu_user(value: String): Self = this.set("used_cpu_user", value.asInstanceOf[js.Any])
    @scala.inline
    def setUsed_cpu_user_children(value: String): Self = this.set("used_cpu_user_children", value.asInstanceOf[js.Any])
  }
  
}

