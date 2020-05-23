package typings.sendcloud.mod

import typings.sendcloud.anon.Createdat
import typings.sendcloud.sendcloudStrings.success
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EmailListCreateResponse extends js.Object {
  var list: Createdat
  var message: success
}

object EmailListCreateResponse {
  @scala.inline
  def apply(list: Createdat, message: success): EmailListCreateResponse = {
    val __obj = js.Dynamic.literal(list = list.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[EmailListCreateResponse]
  }
}

