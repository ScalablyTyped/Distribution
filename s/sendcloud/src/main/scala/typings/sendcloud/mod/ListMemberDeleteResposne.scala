package typings.sendcloud.mod

import typings.sendcloud.sendcloudStrings.success
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListMemberDeleteResposne extends js.Object {
  var del_count: Double
  var message: success
}

object ListMemberDeleteResposne {
  @scala.inline
  def apply(del_count: Double, message: success): ListMemberDeleteResposne = {
    val __obj = js.Dynamic.literal(del_count = del_count.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListMemberDeleteResposne]
  }
}

