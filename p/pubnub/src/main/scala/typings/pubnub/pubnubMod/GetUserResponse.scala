package typings.pubnub.pubnubMod

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
    val __obj = js.Dynamic.literal(data = data, status = status)
  
    __obj.asInstanceOf[GetUserResponse]
  }
}

