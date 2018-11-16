package typings
package reactDashRouterDashDomLib.reactDashRouterDashDomMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait NavLinkProps extends LinkProps {
  var activeClassName: js.UndefOr[java.lang.String] = js.undefined
  var activeStyle: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
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

