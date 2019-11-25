package typings.reactDashRouterDashDom.reactDashRouterDashDomMod

import typings.reactDashRouterDashDom.reactDashRouterDashDomStrings.hashbang
import typings.reactDashRouterDashDom.reactDashRouterDashDomStrings.noslash
import typings.reactDashRouterDashDom.reactDashRouterDashDomStrings.slash
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HashRouterProps extends js.Object {
  var basename: js.UndefOr[String] = js.undefined
  var getUserConfirmation: js.UndefOr[
    js.Function2[/* message */ String, /* callback */ js.Function1[/* ok */ Boolean, Unit], Unit]
  ] = js.undefined
  var hashType: js.UndefOr[slash | noslash | hashbang] = js.undefined
}

object HashRouterProps {
  @scala.inline
  def apply(
    basename: String = null,
    getUserConfirmation: (/* message */ String, /* callback */ js.Function1[/* ok */ Boolean, Unit]) => Unit = null,
    hashType: slash | noslash | hashbang = null
  ): HashRouterProps = {
    val __obj = js.Dynamic.literal()
    if (basename != null) __obj.updateDynamic("basename")(basename.asInstanceOf[js.Any])
    if (getUserConfirmation != null) __obj.updateDynamic("getUserConfirmation")(js.Any.fromFunction2(getUserConfirmation))
    if (hashType != null) __obj.updateDynamic("hashType")(hashType.asInstanceOf[js.Any])
    __obj.asInstanceOf[HashRouterProps]
  }
}

