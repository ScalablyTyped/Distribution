package typings.reactDashRouterDashDom.reactDashRouterDashDomMod

import typings.history.historyMod.Location
import typings.react.reactMod.CSSProperties
import typings.reactDashRouter.reactDashRouterMod.`match`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NavLinkProps[S] extends LinkProps[S] {
  var activeClassName: js.UndefOr[String] = js.undefined
  var activeStyle: js.UndefOr[CSSProperties] = js.undefined
  var exact: js.UndefOr[Boolean] = js.undefined
  var isActive: js.UndefOr[js.Function2[/* match */ `match`[_], /* location */ Location[S], Boolean]] = js.undefined
  var location: js.UndefOr[Location[S]] = js.undefined
  var strict: js.UndefOr[Boolean] = js.undefined
}

object NavLinkProps {
  @scala.inline
  def apply[S](
    LinkProps: LinkProps[S] = null,
    activeClassName: String = null,
    activeStyle: CSSProperties = null,
    exact: js.UndefOr[Boolean] = js.undefined,
    isActive: (/* match */ `match`[_], /* location */ Location[S]) => Boolean = null,
    location: Location[S] = null,
    strict: js.UndefOr[Boolean] = js.undefined
  ): NavLinkProps[S] = {
    val __obj = js.Dynamic.literal()
    if (__obj != null) js.Dynamic.global.Object.assign(__obj, LinkProps)
    if (activeClassName != null) __obj.updateDynamic("activeClassName")(activeClassName)
    if (activeStyle != null) __obj.updateDynamic("activeStyle")(activeStyle)
    if (!js.isUndefined(exact)) __obj.updateDynamic("exact")(exact)
    if (isActive != null) __obj.updateDynamic("isActive")(js.Any.fromFunction2(isActive))
    if (location != null) __obj.updateDynamic("location")(location)
    if (!js.isUndefined(strict)) __obj.updateDynamic("strict")(strict)
    __obj.asInstanceOf[NavLinkProps[S]]
  }
}

