package typings.pubnub.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait State extends js.Object {
  var state: js.UndefOr[js.Any] = js.undefined
  var uuid: String
}

object State {
  @scala.inline
  def apply(uuid: String, state: js.Any = null): State = {
    val __obj = js.Dynamic.literal(uuid = uuid.asInstanceOf[js.Any])
    if (state != null) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    __obj.asInstanceOf[State]
  }
}

