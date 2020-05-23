package typings.sendcloud.mod

import typings.sendcloud.anon.Description
import typings.sendcloud.sendcloudStrings.success
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EmailListUpdateResponse extends js.Object {
  var list: Description
  var message: success
}

object EmailListUpdateResponse {
  @scala.inline
  def apply(list: Description, message: success): EmailListUpdateResponse = {
    val __obj = js.Dynamic.literal(list = list.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[EmailListUpdateResponse]
  }
}

