package typings.pubnub

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonState extends js.Object {
  var state: js.UndefOr[js.Any] = js.undefined
  var uuid: String
}

object AnonState {
  @scala.inline
  def apply(uuid: String, state: js.Any = null): AnonState = {
    val __obj = js.Dynamic.literal(uuid = uuid.asInstanceOf[js.Any])
    if (state != null) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonState]
  }
}

