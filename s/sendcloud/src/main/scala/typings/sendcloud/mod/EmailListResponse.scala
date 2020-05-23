package typings.sendcloud.mod

import typings.sendcloud.anon.Address
import typings.sendcloud.sendcloudStrings.success
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EmailListResponse extends js.Object {
  var count: Double
  var lists: js.Array[Address]
  var message: success
}

object EmailListResponse {
  @scala.inline
  def apply(count: Double, lists: js.Array[Address], message: success): EmailListResponse = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], lists = lists.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[EmailListResponse]
  }
}

