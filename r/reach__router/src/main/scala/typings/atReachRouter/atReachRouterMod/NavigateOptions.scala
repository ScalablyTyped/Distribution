package typings.atReachRouter.atReachRouterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NavigateOptions[TState] extends js.Object {
  var replace: js.UndefOr[Boolean] = js.undefined
  var state: js.UndefOr[TState] = js.undefined
}

object NavigateOptions {
  @scala.inline
  def apply[TState](replace: js.UndefOr[Boolean] = js.undefined, state: TState = null): NavigateOptions[TState] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(replace)) __obj.updateDynamic("replace")(replace)
    if (state != null) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavigateOptions[TState]]
  }
}

