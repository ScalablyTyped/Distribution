package typings.reachRouter

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonState extends js.Object {
  var state: js.UndefOr[js.Any] = js.undefined
}

object AnonState {
  @scala.inline
  def apply(state: js.Any = null): AnonState = {
    val __obj = js.Dynamic.literal()
    if (state != null) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonState]
  }
}

