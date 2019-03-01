package typings
package reduxDashFirstDashRouterDashLinkLib.reduxDashFirstDashRouterDashLinkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NavLinkProps extends LinkProps {
  var activeClassName: js.UndefOr[java.lang.String] = js.undefined
  var activeStyle: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
  var ariaCurrent: js.UndefOr[java.lang.String] = js.undefined
  var exact: js.UndefOr[scala.Boolean] = js.undefined
  var isActive: js.UndefOr[
    js.Function2[
      /* match */ Match[js.Object], 
      /* location */ reduxDashFirstDashRouterLib.reduxDashFirstDashRouterMod.Location, 
      scala.Boolean
    ]
  ] = js.undefined
  var strict: js.UndefOr[scala.Boolean] = js.undefined
}

object NavLinkProps {
  @scala.inline
  def apply(
    LinkProps: LinkProps = null,
    activeClassName: java.lang.String = null,
    activeStyle: reactLib.reactMod.ReactNs.CSSProperties = null,
    ariaCurrent: java.lang.String = null,
    exact: js.UndefOr[scala.Boolean] = js.undefined,
    isActive: js.Function2[
      /* match */ Match[js.Object], 
      /* location */ reduxDashFirstDashRouterLib.reduxDashFirstDashRouterMod.Location, 
      scala.Boolean
    ] = null,
    strict: js.UndefOr[scala.Boolean] = js.undefined
  ): NavLinkProps = {
    val __obj = js.Dynamic.literal()
    if (__obj != null) js.Dynamic.global.Object.assign(__obj, LinkProps)
    if (activeClassName != null) __obj.updateDynamic("activeClassName")(activeClassName)
    if (activeStyle != null) __obj.updateDynamic("activeStyle")(activeStyle)
    if (ariaCurrent != null) __obj.updateDynamic("ariaCurrent")(ariaCurrent)
    if (!js.isUndefined(exact)) __obj.updateDynamic("exact")(exact)
    if (isActive != null) __obj.updateDynamic("isActive")(isActive)
    if (!js.isUndefined(strict)) __obj.updateDynamic("strict")(strict)
    __obj.asInstanceOf[NavLinkProps]
  }
}

