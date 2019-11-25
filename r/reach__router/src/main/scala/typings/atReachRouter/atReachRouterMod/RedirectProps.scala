package typings.atReachRouter.atReachRouterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RedirectProps[TState] extends js.Object {
  var from: js.UndefOr[String] = js.undefined
  var noThrow: js.UndefOr[Boolean] = js.undefined
  var replace: js.UndefOr[Boolean] = js.undefined
  var state: js.UndefOr[TState] = js.undefined
  var to: String
}

object RedirectProps {
  @scala.inline
  def apply[TState](
    to: String,
    from: String = null,
    noThrow: js.UndefOr[Boolean] = js.undefined,
    replace: js.UndefOr[Boolean] = js.undefined,
    state: TState = null
  ): RedirectProps[TState] = {
    val __obj = js.Dynamic.literal(to = to.asInstanceOf[js.Any])
    if (from != null) __obj.updateDynamic("from")(from.asInstanceOf[js.Any])
    if (!js.isUndefined(noThrow)) __obj.updateDynamic("noThrow")(noThrow.asInstanceOf[js.Any])
    if (!js.isUndefined(replace)) __obj.updateDynamic("replace")(replace.asInstanceOf[js.Any])
    if (state != null) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    __obj.asInstanceOf[RedirectProps[TState]]
  }
}

