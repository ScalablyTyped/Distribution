package typings.pubnub.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetUsersResponse extends js.Object {
  var data: js.Array[UserData]
  var status: Double
}

object GetUsersResponse {
  @scala.inline
  def apply(data: js.Array[UserData], status: Double): GetUsersResponse = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetUsersResponse]
  }
}

