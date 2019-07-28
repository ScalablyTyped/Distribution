package typings.pubnub

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_State extends js.Object {
  var state: js.UndefOr[js.Any] = js.undefined
  var uuid: String
}

object Anon_State {
  @scala.inline
  def apply(uuid: String, state: js.Any = null): Anon_State = {
    val __obj = js.Dynamic.literal(uuid = uuid)
    if (state != null) __obj.updateDynamic("state")(state)
    __obj.asInstanceOf[Anon_State]
  }
}

