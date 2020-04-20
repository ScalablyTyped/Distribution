package typings.pubnub.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SetStateResponse extends js.Object {
  var state: js.Any
}

object SetStateResponse {
  @scala.inline
  def apply(state: js.Any): SetStateResponse = {
    val __obj = js.Dynamic.literal(state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetStateResponse]
  }
}

