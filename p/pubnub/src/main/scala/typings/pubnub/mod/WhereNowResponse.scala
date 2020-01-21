package typings.pubnub.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WhereNowResponse extends js.Object {
  var channels: js.Array[String]
}

object WhereNowResponse {
  @scala.inline
  def apply(channels: js.Array[String]): WhereNowResponse = {
    val __obj = js.Dynamic.literal(channels = channels.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[WhereNowResponse]
  }
}

