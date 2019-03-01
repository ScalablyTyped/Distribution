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

object HashRouterProps {
  @scala.inline
  def apply(
    basename: java.lang.String = null,
    getUserConfirmation: js.Function2[
      /* message */ java.lang.String, 
      /* callback */ js.Function1[/* ok */ scala.Boolean, scala.Unit], 
      scala.Unit
    ] = null,
    hashType: reactDashRouterDashDomLib.reactDashRouterDashDomLibStrings.slash | reactDashRouterDashDomLib.reactDashRouterDashDomLibStrings.noslash | reactDashRouterDashDomLib.reactDashRouterDashDomLibStrings.hashbang = null
  ): HashRouterProps = {
    val __obj = js.Dynamic.literal()
    if (basename != null) __obj.updateDynamic("basename")(basename)
    if (getUserConfirmation != null) __obj.updateDynamic("getUserConfirmation")(getUserConfirmation)
    if (hashType != null) __obj.updateDynamic("hashType")(hashType.asInstanceOf[js.Any])
    __obj.asInstanceOf[HashRouterProps]
  }
}

