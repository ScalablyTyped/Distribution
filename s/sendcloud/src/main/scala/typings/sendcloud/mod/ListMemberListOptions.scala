package typings.sendcloud.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListMemberListOptions extends js.Object {
  var api_key: String = js.native
  var api_user: String = js.native
  var end: js.UndefOr[Double] = js.native
  var mail_list_addr: js.UndefOr[String] = js.native
  var member_addr: js.UndefOr[String] = js.native
  var start: js.UndefOr[Double] = js.native
}

object ListMemberListOptions {
  @scala.inline
  def apply(api_key: String, api_user: String): ListMemberListOptions = {
    val __obj = js.Dynamic.literal(api_key = api_key.asInstanceOf[js.Any], api_user = api_user.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListMemberListOptions]
  }
  @scala.inline
  implicit class ListMemberListOptionsOps[Self <: ListMemberListOptions] (val x: Self) extends AnyVal {
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
    def setApi_key(value: String): Self = this.set("api_key", value.asInstanceOf[js.Any])
    @scala.inline
    def setApi_user(value: String): Self = this.set("api_user", value.asInstanceOf[js.Any])
    @scala.inline
    def setEnd(value: Double): Self = this.set("end", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnd: Self = this.set("end", js.undefined)
    @scala.inline
    def setMail_list_addr(value: String): Self = this.set("mail_list_addr", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMail_list_addr: Self = this.set("mail_list_addr", js.undefined)
    @scala.inline
    def setMember_addr(value: String): Self = this.set("member_addr", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMember_addr: Self = this.set("member_addr", js.undefined)
    @scala.inline
    def setStart(value: Double): Self = this.set("start", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStart: Self = this.set("start", js.undefined)
  }
  
}

