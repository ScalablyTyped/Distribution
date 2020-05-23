package typings.reachRouter.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait State extends js.Object {
  var state: js.UndefOr[js.Any] = js.undefined
}

object State {
  @scala.inline
  def apply(state: js.Any = null): State = {
    val __obj = js.Dynamic.literal()
    if (state != null) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    __obj.asInstanceOf[State]
  }
}

