package typings.sendcloud.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListMemberListOptions extends js.Object {
  var api_key: String
  var api_user: String
  var end: js.UndefOr[Double] = js.undefined
  var mail_list_addr: js.UndefOr[String] = js.undefined
  var member_addr: js.UndefOr[String] = js.undefined
  var start: js.UndefOr[Double] = js.undefined
}

object ListMemberListOptions {
  @scala.inline
  def apply(
    api_key: String,
    api_user: String,
    end: js.UndefOr[Double] = js.undefined,
    mail_list_addr: String = null,
    member_addr: String = null,
    start: js.UndefOr[Double] = js.undefined
  ): ListMemberListOptions = {
    val __obj = js.Dynamic.literal(api_key = api_key.asInstanceOf[js.Any], api_user = api_user.asInstanceOf[js.Any])
    if (!js.isUndefined(end)) __obj.updateDynamic("end")(end.get.asInstanceOf[js.Any])
    if (mail_list_addr != null) __obj.updateDynamic("mail_list_addr")(mail_list_addr.asInstanceOf[js.Any])
    if (member_addr != null) __obj.updateDynamic("member_addr")(member_addr.asInstanceOf[js.Any])
    if (!js.isUndefined(start)) __obj.updateDynamic("start")(start.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListMemberListOptions]
  }
}

