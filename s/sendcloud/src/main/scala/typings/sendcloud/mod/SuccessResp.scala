package typings.sendcloud.mod

import typings.sendcloud.sendcloudStrings.success
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SuccessResp extends js.Object {
  var email_id_list: js.Array[String]
  var message: success
}

object SuccessResp {
  @scala.inline
  def apply(email_id_list: js.Array[String], message: success): SuccessResp = {
    val __obj = js.Dynamic.literal(email_id_list = email_id_list.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[SuccessResp]
  }
}

