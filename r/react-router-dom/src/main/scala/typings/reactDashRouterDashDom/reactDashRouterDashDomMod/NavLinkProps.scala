package typings.reactDashRouterDashDom.reactDashRouterDashDomMod

import typings.history.historyMod.Location
import typings.history.historyMod.LocationState
import typings.react.reactMod.CSSProperties
import typings.reactDashRouter.reactDashRouterMod.`match`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NavLinkProps extends LinkProps {
  var activeClassName: js.UndefOr[String] = js.undefined
  var activeStyle: js.UndefOr[CSSProperties] = js.undefined
  var exact: js.UndefOr[Boolean] = js.undefined
  var isActive: js.UndefOr[
    js.Function2[/* match */ `match`[_], /* location */ Location[LocationState], Boolean]
  ] = js.undefined
  var location: js.UndefOr[Location[LocationState]] = js.undefined
  var strict: js.UndefOr[Boolean] = js.undefined
}

object NavLinkProps {
  @scala.inline
  def apply(
    LinkProps: LinkProps = null,
    activeClassName: String = null,
    activeStyle: CSSProperties = null,
    exact: js.UndefOr[Boolean] = js.undefined,
    isActive: (/* match */ `match`[_], /* location */ Location[LocationState]) => Boolean = null,
    location: Location[LocationState] = null,
    strict: js.UndefOr[Boolean] = js.undefined
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

