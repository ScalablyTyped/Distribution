package typings.pubnub.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetUserResponse extends js.Object {
  var data: UserData
  var status: Double
}

object GetUserResponse {
  @scala.inline
  def apply(data: UserData, status: Double): GetUserResponse = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetUserResponse]
  }
}

