package typings
package reactDashRouterDashDomLib.reactDashRouterDashDomMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BrowserRouterProps extends js.Object {
  var basename: js.UndefOr[java.lang.String] = js.undefined
  var forceRefresh: js.UndefOr[scala.Boolean] = js.undefined
  var getUserConfirmation: js.UndefOr[
    js.Function2[
      /* message */ java.lang.String, 
      /* callback */ js.Function1[/* ok */ scala.Boolean, scala.Unit], 
      scala.Unit
    ]
  ] = js.undefined
  var keyLength: js.UndefOr[scala.Double] = js.undefined
}

object BrowserRouterProps {
  @scala.inline
  def apply(
    basename: java.lang.String = null,
    forceRefresh: js.UndefOr[scala.Boolean] = js.undefined,
    getUserConfirmation: (/* message */ java.lang.String, /* callback */ js.Function1[/* ok */ scala.Boolean, scala.Unit]) => scala.Unit = null,
    keyLength: scala.Int | scala.Double = null
  ): BrowserRouterProps = {
    val __obj = js.Dynamic.literal()
    if (basename != null) __obj.updateDynamic("basename")(basename)
    if (!js.isUndefined(forceRefresh)) __obj.updateDynamic("forceRefresh")(forceRefresh)
    if (getUserConfirmation != null) __obj.updateDynamic("getUserConfirmation")(js.Any.fromFunction2(getUserConfirmation))
    if (keyLength != null) __obj.updateDynamic("keyLength")(keyLength.asInstanceOf[js.Any])
    __obj.asInstanceOf[BrowserRouterProps]
  }
}

