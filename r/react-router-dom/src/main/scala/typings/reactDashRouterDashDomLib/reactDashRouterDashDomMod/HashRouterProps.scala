package typings
package reactDashRouterDashDomLib.reactDashRouterDashDomMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait HashRouterProps extends js.Object {
  var basename: js.UndefOr[java.lang.String] = js.undefined
  var getUserConfirmation: js.UndefOr[
    js.Function2[
      /* message */ java.lang.String, 
      /* callback */ js.Function1[/* ok */ scala.Boolean, scala.Unit], 
      scala.Unit
    ]
  ] = js.undefined
  var hashType: js.UndefOr[
    reactDashRouterDashDomLib.reactDashRouterDashDomLibStrings.slash | reactDashRouterDashDomLib.reactDashRouterDashDomLibStrings.noslash | reactDashRouterDashDomLib.reactDashRouterDashDomLibStrings.hashbang
  ] = js.undefined
}

