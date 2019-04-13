package typings
package reactDashRouterDashDomLib.reactDashRouterDashDomMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NavLinkProps extends LinkProps {
  var activeClassName: js.UndefOr[java.lang.String] = js.undefined
  var activeStyle: js.UndefOr[reactLib.reactMod.CSSProperties] = js.undefined
  var exact: js.UndefOr[scala.Boolean] = js.undefined
  var isActive: js.UndefOr[
    js.Function2[
      /* match */ reactDashRouterLib.reactDashRouterMod.`match`[_], 
      /* location */ historyLib.historyMod.Location[historyLib.historyMod.LocationState], 
      scala.Boolean
    ]
  ] = js.undefined
  var location: js.UndefOr[historyLib.historyMod.Location[historyLib.historyMod.LocationState]] = js.undefined
  var strict: js.UndefOr[scala.Boolean] = js.undefined
}

object NavLinkProps {
  @scala.inline
  def apply(
    LinkProps: LinkProps = null,
    activeClassName: java.lang.String = null,
    activeStyle: reactLib.reactMod.CSSProperties = null,
    exact: js.UndefOr[scala.Boolean] = js.undefined,
    isActive: (/* match */ reactDashRouterLib.reactDashRouterMod.`match`[_], /* location */ historyLib.historyMod.Location[historyLib.historyMod.LocationState]) => scala.Boolean = null,
    location: historyLib.historyMod.Location[historyLib.historyMod.LocationState] = null,
    strict: js.UndefOr[scala.Boolean] = js.undefined
  ): NavLinkProps = {
    val __obj = js.Dynamic.literal()
    if (__obj != null) js.Dynamic.global.Object.assign(__obj, LinkProps)
    if (activeClassName != null) __obj.updateDynamic("activeClassName")(activeClassName)
    if (activeStyle != null) __obj.updateDynamic("activeStyle")(activeStyle)
    if (!js.isUndefined(exact)) __obj.updateDynamic("exact")(exact)
    if (isActive != null) __obj.updateDynamic("isActive")(js.Any.fromFunction2(isActive))
    if (location != null) __obj.updateDynamic("location")(location)
    if (!js.isUndefined(strict)) __obj.updateDynamic("strict")(strict)
    __obj.asInstanceOf[NavLinkProps]
  }
}

