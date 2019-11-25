package typings.atReachRouter

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_State extends js.Object {
  var state: js.UndefOr[js.Any] = js.undefined
}

object Anon_State {
  @scala.inline
  def apply(state: js.Any = null): Anon_State = {
    val __obj = js.Dynamic.literal()
    if (state != null) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_State]
  }
}

