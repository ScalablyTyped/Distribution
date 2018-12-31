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

