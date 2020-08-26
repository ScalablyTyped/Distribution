package typings.sendcloud.mod

import typings.sendcloud.anon.Modifyat
import typings.sendcloud.sendcloudStrings.success
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListMemberListResponse extends js.Object {
  var members: js.Array[Modifyat] = js.native
  var message: success = js.native
  var total_count: Double = js.native
}

object ListMemberListResponse {
  @scala.inline
  def apply(members: js.Array[Modifyat], message: success, total_count: Double): ListMemberListResponse = {
    val __obj = js.Dynamic.literal(members = members.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], total_count = total_count.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListMemberListResponse]
  }
  @scala.inline
  implicit class ListMemberListResponseOps[Self <: ListMemberListResponse] (val x: Self) extends AnyVal {
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
    def setMembersVarargs(value: Modifyat*): Self = this.set("members", js.Array(value :_*))
    @scala.inline
    def setMembers(value: js.Array[Modifyat]): Self = this.set("members", value.asInstanceOf[js.Any])
    @scala.inline
    def setMessage(value: success): Self = this.set("message", value.asInstanceOf[js.Any])
    @scala.inline
    def setTotal_count(value: Double): Self = this.set("total_count", value.asInstanceOf[js.Any])
  }
  
}

