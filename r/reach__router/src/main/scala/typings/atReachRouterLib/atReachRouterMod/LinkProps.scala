package typings
package atReachRouterLib.atReachRouterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof react.react.React.DetailedHTMLProps<react.react.React.AnchorHTMLAttributes<std.HTMLAnchorElement>, std.HTMLAnchorElement>, 'href'> ]: react.react.React.DetailedHTMLProps<react.react.React.AnchorHTMLAttributes<std.HTMLAnchorElement>, std.HTMLAnchorElement>[P]} */ trait LinkProps[TState] extends js.Object {
  var getProps: js.UndefOr[js.Function1[/* props */ LinkGetProps, js.Object]] = js.undefined
  var replace: js.UndefOr[scala.Boolean] = js.undefined
  var state: js.UndefOr[TState] = js.undefined
  var to: js.UndefOr[java.lang.String] = js.undefined
}

object LinkProps {
  @scala.inline
  def apply[TState](
    getProps: /* props */ LinkGetProps => js.Object = null,
    replace: js.UndefOr[scala.Boolean] = js.undefined,
    state: TState = null,
    to: java.lang.String = null
  ): LinkProps[TState] = {
    val __obj = js.Dynamic.literal()
    if (getProps != null) __obj.updateDynamic("getProps")(js.Any.fromFunction1(getProps))
    if (!js.isUndefined(replace)) __obj.updateDynamic("replace")(replace)
    if (state != null) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    if (to != null) __obj.updateDynamic("to")(to)
    __obj.asInstanceOf[LinkProps[TState]]
  }
}

