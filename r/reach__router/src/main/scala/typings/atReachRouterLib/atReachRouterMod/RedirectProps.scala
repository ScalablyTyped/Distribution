package typings
package atReachRouterLib.atReachRouterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RedirectProps[TState] extends js.Object {
  var from: js.UndefOr[java.lang.String] = js.undefined
  var noThrow: js.UndefOr[scala.Boolean] = js.undefined
  var replace: js.UndefOr[scala.Boolean] = js.undefined
  var state: js.UndefOr[TState] = js.undefined
  var to: java.lang.String
}

object RedirectProps {
  @scala.inline
  def apply[TState](
    to: java.lang.String,
    from: java.lang.String = null,
    noThrow: js.UndefOr[scala.Boolean] = js.undefined,
    replace: js.UndefOr[scala.Boolean] = js.undefined,
    state: TState = null
  ): RedirectProps[TState] = {
    val __obj = js.Dynamic.literal(to = to)
    if (from != null) __obj.updateDynamic("from")(from)
    if (!js.isUndefined(noThrow)) __obj.updateDynamic("noThrow")(noThrow)
    if (!js.isUndefined(replace)) __obj.updateDynamic("replace")(replace)
    if (state != null) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    __obj.asInstanceOf[RedirectProps[TState]]
  }
}

