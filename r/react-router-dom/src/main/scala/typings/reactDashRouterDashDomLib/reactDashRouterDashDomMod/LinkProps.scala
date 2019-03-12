package typings
package reactDashRouterDashDomLib.reactDashRouterDashDomMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LinkProps
  extends reactLib.reactMod.ReactNs.AnchorHTMLAttributes[stdLib.HTMLAnchorElement] {
  var innerRef: js.UndefOr[js.Function1[/* node */ stdLib.HTMLAnchorElement | scala.Null, scala.Unit]] = js.undefined
  var replace: js.UndefOr[scala.Boolean] = js.undefined
  var to: historyLib.historyMod.LocationDescriptor[historyLib.historyMod.LocationState]
}

object LinkProps {
  @scala.inline
  def apply(
    to: historyLib.historyMod.LocationDescriptor[historyLib.historyMod.LocationState],
    AnchorHTMLAttributes: reactLib.reactMod.ReactNs.AnchorHTMLAttributes[stdLib.HTMLAnchorElement] = null,
    innerRef: /* node */ stdLib.HTMLAnchorElement | scala.Null => scala.Unit = null,
    replace: js.UndefOr[scala.Boolean] = js.undefined
  ): LinkProps = {
    val __obj = js.Dynamic.literal(to = to.asInstanceOf[js.Any])
    js.Dynamic.global.Object.assign(__obj, AnchorHTMLAttributes)
    if (innerRef != null) __obj.updateDynamic("innerRef")(js.Any.fromFunction1(innerRef))
    if (!js.isUndefined(replace)) __obj.updateDynamic("replace")(replace)
    __obj.asInstanceOf[LinkProps]
  }
}

