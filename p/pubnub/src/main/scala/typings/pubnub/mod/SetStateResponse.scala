package typings.pubnub.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SetStateResponse extends js.Object {
  var state: js.Any = js.native
}

object SetStateResponse {
  @scala.inline
  def apply(state: js.Any): SetStateResponse = {
    val __obj = js.Dynamic.literal(state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetStateResponse]
  }
  @scala.inline
  implicit class SetStateResponseOps[Self <: SetStateResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setState(value: js.Any): Self = this.set("state", value.asInstanceOf[js.Any])
  }
  
}

