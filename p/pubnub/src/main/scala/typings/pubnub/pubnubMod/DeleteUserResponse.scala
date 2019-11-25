package typings.pubnub.pubnubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteUserResponse extends js.Object {
  var data: Null
  var status: Double
}

object DeleteUserResponse {
  @scala.inline
  def apply(data: Null, status: Double): DeleteUserResponse = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DeleteUserResponse]
  }
}

