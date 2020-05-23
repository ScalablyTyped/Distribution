package typings.sendcloud.mod

import typings.sendcloud.sendcloudStrings.success
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListMemberAddResposne extends js.Object {
  var message: success
  var total_counts: Double
}

object ListMemberAddResposne {
  @scala.inline
  def apply(message: success, total_counts: Double): ListMemberAddResposne = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], total_counts = total_counts.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListMemberAddResposne]
  }
}

