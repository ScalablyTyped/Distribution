package typings.sendcloud.mod

import typings.sendcloud.anon.Modifyat
import typings.sendcloud.sendcloudStrings.success
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListMemberListResponse extends js.Object {
  var members: js.Array[Modifyat]
  var message: success
  var total_count: Double
}

object ListMemberListResponse {
  @scala.inline
  def apply(members: js.Array[Modifyat], message: success, total_count: Double): ListMemberListResponse = {
    val __obj = js.Dynamic.literal(members = members.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], total_count = total_count.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListMemberListResponse]
  }
}

